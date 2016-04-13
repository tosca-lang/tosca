// Copyright (c) 2014 IBM Corporation.

package org.transscript.runtime;

import java.util.ArrayDeque;

import org.transscript.runtime.Term.Kind;

/**
 * Consume term events to construct in-memory term representation
 * 
 * @author Lionel Villard
 */
public class BufferSink extends Sink
{

	/** Context */
	protected Context context;

	/** Constructed term */
	protected Term term;

	/** Term stack */
	protected ArrayDeque<Term> terms;

	/** Sub current position stack */
	protected ArrayDeque<Integer> subs;

	/** Saved term stack (when parsing type) */
	protected ArrayDeque<Term> savedTerms;

	/** Saved sub current position stack (when parsing type)  */
	protected ArrayDeque<Integer> savedSubs;

	/** Constructed type */
	protected Term type;

	/** Tells whether adding arguments or substitition to metavar */
	protected ArrayDeque<Boolean> apply;

	/* */
	public BufferSink(Context context)
	{
		this.context = context;
		terms = new ArrayDeque<>();
		subs = new ArrayDeque<>();
		apply = new ArrayDeque<>();
	}

	/**
	 * Close buffer and returned one reference to the constructed term
	 */
	public Term term()
	{
		assert term != null : "incomplete term construction ";
		return term;
	}

	/** Add sub to current construction/meta-application */
	protected void addSub(Term sub)
	{
		//assert binders == null || !terms.isEmpty() : "Top level term cannot have binders";

		if (subs.isEmpty())
		{
			// Top-level or type
			if (savedTerms == null)
				term = sub;
			else
				type = sub;
		}
		else
		{
			Term t = terms.peek();
			final int subindex = subs.pop();

			if (t.kind() == Kind.META_APPLICATION && apply.peek())
				t.setArg(subindex, sub);
			else
				t.setSub(subindex, sub);
			subs.push(subindex + 1); // ready to receive the next sub
		}
	}

	/** @return last produced term */
	protected Term lastTerm()
	{
		if (subs.isEmpty())
			return term;

		Term t = terms.peek();
		return t.sub(subs.peek() - 1);
	}

	@Override
	public Context context()
	{
		return context;
	}

	@Override
	public BufferSink start(ConstructionDescriptor desc)
	{
		Construction c = desc.make();
		addSub(c);

		terms.push(c);
		subs.push(0);
		return this;
	}

	@Override
	public BufferSink end()
	{
		Term c = terms.pop();
		subs.pop();

		// Basic type checking.
		assert!c.symbol().equals("Cons") || c.arity() == 2 : "Wrong number of subs for Cons";

		if (terms.isEmpty())
			term = c;

		return this;
	}

	@Override
	public Sink startMetaApplication(String name)
	{
		return startMetaApplication(name, null);
	}

	@Override
	public Sink startMetaApplication(String name, String type)
	{
		MetaApplication meta = new MetaApplication(name);
		addSub(meta);

		terms.push(meta);
		subs.push(0);
		apply.push(false); // Substitution unless told otherwise
		return this;
	}

	@Override
	public Sink endMetaApplication()
	{
		Term meta = terms.pop();
		subs.pop();

		if (terms.isEmpty())
			term = meta;

		return this;
	}

	@Override
	public Sink startApply()
	{
		apply.pop();
		apply.push(true);
		return this;
	}

	@Override
	public Sink endApply()
	{
		apply.pop();
		apply.push(false);

		// Reset sub subindex
		subs.pop();
		subs.push(0);
		return this;
	}

	@Override
	public Sink startType()
	{	
		savedTerms = terms;
		savedSubs = subs;
		return this;
	}

	public Sink endType()
	{
		terms = savedTerms;
		savedTerms = null;
		subs = savedSubs;
		savedSubs = null;

		Term t = lastTerm();
		if (t.kind() == Kind.META_APPLICATION)
		{
			// TODO: remove cast
			((MetaApplication) t).setType(type);
		}

		type = null;
		return this;
	}

	@Override
	public BufferSink bind(Variable binder)
	{
		return (BufferSink) super.bind(binder);
	}

	@Override
	public BufferSink binds(Variable[] binders)
	{
		final int i = subs.peek();
		final Term term = terms.peek();
		for (int j = 0; j < binders.length; j++)
			term.setBinder(i, j, binders[j]);

		return this;
	}

	@Override
	public Sink param(Variable param)
	{
		final int i = subs.peek();
		final Term term = terms.peek();

		term.addParam(i, param);

		return this;
	}

	@Override
	public BufferSink use(Variable variable)
	{
		Term use = variable.use();
		addSub(use);
		return this;
	}

	@Override
	public BufferSink literal(Object literal)
	{
		Term term = new Literal(literal);
		addSub(term);
		return this;
	}

	@Override
	public BufferSink properties(Properties properties)
	{
		throw new RuntimeException(); // deprecated
	}

	@Override
	public BufferSink propertyNamed(String name, Term term)
	{
		throw new RuntimeException(); // deprecated
	}

	@Override
	public BufferSink propertyVariable(Variable variable, Term term)
	{
		throw new RuntimeException(); // deprecated
	}

	@Override
	public BufferSink copy(Term term)
	{
		addSub(term); // transfer ref
		return this;
	}

	@Override
	public BufferSink substitute(Term term, Variable variable, Term substitute)
	{
		return (BufferSink) super.substitute(term, variable, substitute);
	}

}
