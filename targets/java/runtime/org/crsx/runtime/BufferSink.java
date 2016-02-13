// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;

import org.crsx.runtime.Term.Kind;

/**
 * Dynamic term construction.
 * 
 * <p>Does not rely on construction description (yet).
 * 
 * @author villardl
 */
public class BufferSink extends Sink
{

	/** Context */
	protected Context context;

	/** Constructed term */
	protected Term term;

	/** Term stack */
	protected ArrayDeque<Term> terms;

	/** Subs stack */
	protected ArrayDeque<ArrayList<Term>> subs;

	/** Sub binders stack */
	protected ArrayDeque<ArrayList<Variable[]>> subbinders;

	/** Binders to use for next sub */
	protected Variable[] binders;

	/** Properties to use for next sub */
	protected Properties properties;

	/** Whether properties needs to be extended before mutation */
	protected boolean extend;

	/* */
	public BufferSink(Context context)
	{
		this.context = context;
		terms = new ArrayDeque<>();
		subs = new ArrayDeque<>();
		subbinders = new ArrayDeque<>();
	}

	/**
	 * Close buffer and returned one reference to the constructed term
	 */
	public Term term()
	{
		assert term != null : "incomplete term construction ";
		return term;
	}

	/** Add sub to current construction */
	protected void addSub(Term sub)
	{
		assert binders == null || !terms.isEmpty() : "Top level term cannot have binders";

		if (subs.isEmpty())
		{
			// Top-level
			term = sub;
		}
		else
		{
			subs.peek().add(sub);
			subbinders.peek().add(binders);

			binders = null;
		}
	}

	@Override
	public Context context()
	{
		return context;
	}

	@Override
	public BufferSink start(ConstructionDescriptor desc)
	{
		Construction c = new FixedConstruction(desc, properties);
		addSub(c);
		properties = null;

		terms.push(c);
		subs.push(new ArrayList<>(5));
		subbinders.push(new ArrayList<>(5));
		return this;
	}
	
	@Override
	public BufferSink end()
	{
		Term c = terms.pop();
		ArrayList<Term> subs = this.subs.pop();
		ArrayList<Variable[]> subbinders = this.subbinders.pop();

		if (subs.size() > 0)
		{
			assert c instanceof Construction;
			assert subs.get(subs.size() - 1) != null : "binders term event must precede start term event";

			Term[] asub = new Term[subs.size()];
			((FixedConstruction) c).subs = subs.toArray(asub);
			Variable[][] abinders = new Variable[subs.size()][];
			((FixedConstruction) c).binders = subbinders.toArray(abinders);
		
			// Basic type checking.
			assert !c.symbol().equals("Cons") || subs.size() == 2 : "Wrong number of subs for Cons";
		}

		if (terms.isEmpty())
			term = c;

		return this;
	}

	@Override
	public Sink startMetaApplication(String name)
	{
		assert properties == null;

		MetaApplication meta = new MetaApplication(name);
		addSub(meta);

		terms.push(meta);
		subs.push(new ArrayList<>(5));
		return this;
	}

	@Override
	public Sink endMetaApplication()
	{
		Term meta = terms.pop();
		ArrayList<Term> subs = this.subs.pop();

		if (subs.size() > 0)
		{
			assert meta instanceof MetaApplication;
			assert subs.get(subs.size() - 1) != null : "binders term event must precede start term event";

			Term[] asub = new Term[subs.size()];
			((MetaApplication) meta).subs = subs.toArray(asub);
		}

		if (terms.isEmpty())
			term = meta;

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
		assert this.binders == null : "binds already called";

		this.binders = binders;
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
		assert this.properties == null;
		this.properties = properties;
		extend = true; // To be safe for now.
		return this;
	}

	@Override
	public BufferSink propertyNamed(String name, Term term)
	{
		if (properties == null)
			properties = new Properties(null);
		else if (extend)
		{
			properties = properties.extend();
			extend = false;
		}

		properties.addNamedProperty(name, term);
		return this;
	}

	@Override
	public BufferSink propertyVariable(Variable variable, Term term)
	{
		if (properties == null)
			properties = new Properties(null);
		else if (extend)
		{
			properties = properties.extend();
			extend = false;
		}

		properties.addVariableProperty(variable, term);
		return this;
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
