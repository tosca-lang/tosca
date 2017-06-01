// Copyright (c) 2014 IBM Corporation.

package org.transscript.runtime;

import java.util.ArrayDeque;

/**
 * Consume simple term events to construct in-memory term representation
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
	protected ArrayDeque<Integer> subIndex;

	/** binders current position stack */
	protected ArrayDeque<Integer> binderIndex;

	/** param current position stack */
	protected ArrayDeque<Integer> paramIndex;

	/** Saved term stack (when parsing type) */
	protected ArrayDeque<Term> savedTerms;

	/** Saved sub current position stack (when parsing type)  */
	protected ArrayDeque<Integer> savedSubs;

	/** Constructed type */
	protected Term type;

	/** Tells whether adding arguments or substitution to metavar */
	protected ArrayDeque<Boolean> substitutes;

	/* */
	public BufferSink(Context context)
	{
		this.context = context;
		terms = new ArrayDeque<>();
		subIndex = new ArrayDeque<>();
		binderIndex = new ArrayDeque<>();
		paramIndex = new ArrayDeque<>();
		substitutes = new ArrayDeque<>();
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

		if (subIndex.isEmpty())
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
			final int subindex = subIndex.pop();

			if (substitutes.peek())
				t.setSubstitute(subindex, sub);
			else
				t.setSub(subindex, sub);

			subIndex.push(subindex + 1); // ready to receive the next sub

			binderIndex.pop();
			binderIndex.push(0); // reset sub binder position.
			paramIndex.pop();
			paramIndex.push(0); // reset sub formal param position
		}
	}

	/** @return last produced term */
	protected Term lastTerm()
	{
		if (subIndex.isEmpty())
			return term;

		Term t = terms.peek();
		return t.sub(subIndex.peek() - 1);
	}

	@Override
	public Context context()
	{
		return context;
	}

	@Override
	public BufferSink start(ConstructionDescriptor desc)
	{
		Term c = desc.make();
		addSub(c);

		terms.push(c);
		subIndex.push(0);
		binderIndex.push(0);
		paramIndex.push(0);
		substitutes.push(false);
		return this;
	}

	@Override
	public BufferSink end()
	{
		Term c = terms.pop();
		subIndex.pop();
		binderIndex.pop();
		paramIndex.pop();
		substitutes.pop();

		if (terms.isEmpty())
			term = c;

		return this;
	}

	@Override
	public BufferSink bind(Variable binder)
	{
		final Term term = terms.peek();
		term.setBinder(subIndex.peek(), binderIndex.peek(), binder);

		binderIndex.push(binderIndex.pop() + 1);
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
	public BufferSink literal(String literal)
	{
		Term term = StringTerm.stringTerm(literal);
		addSub(term);
		return this;
	}

	@Override
	public BufferSink literal(double literal)
	{
		Term term = DoubleTerm.doubleTerm(literal);
		addSub(term);
		return this;
	}

	@Override
	public Sink copy(Term term)
	{
		addSub(term);
		return this;
	}
	
	@Override
	public Sink loc(int line, int column)
	{
		MapTerm<StringTerm, StringTerm> l = MapTerm.mapTerm();
		addSub(l);
		return this;
	}

}
