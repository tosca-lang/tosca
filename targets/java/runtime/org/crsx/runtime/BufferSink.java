// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;

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

	/** Construction stack */
	protected ArrayDeque<Construction> constructions;

	/** Subs stack */
	protected ArrayDeque<ArrayList<Term>> subs;

	/** Sub binders stack */
	protected ArrayDeque<ArrayList<Variable[]>> subbinders;

	/** Binders to use for next sub */
	protected Variable[] binders;

	/** Properties to use for next sub */
	protected Properties properties;

	/* */
	public BufferSink(Context context)
	{
		this.context = context;
		constructions = new ArrayDeque<Construction>();
		subs = new ArrayDeque<ArrayList<Term>>();
		subbinders = new ArrayDeque<ArrayList<Variable[]>>();
	}

	/**
	 * Close buffer and returned one reference to the constructed term
	 */
	public Term term()
	{
		assert term != null : "incomplete term construction";
		return term;
	}

	/** Add sub to current construction */
	protected void addSub(Term sub)
	{
		assert binders == null || !constructions.isEmpty() : "Top level term cannot have binders";

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
		Construction c = new Construction(desc, properties);
		addSub(c);
		properties = null;

		constructions.push(c);
		subs.push(new ArrayList<>(5));
		subbinders.push(new ArrayList<>(5));
		return this;
	}

	@Override
	public BufferSink end()
	{
		Construction c = constructions.pop();
		ArrayList<Term> subs = this.subs.pop();
		ArrayList<Variable[]> subbinders = this.subbinders.pop();

		if (subs.size() > 0)
		{
			assert subs.get(subs.size() - 1) != null : "binders term event must precede start term event";

			Term[] asub = new Term[subs.size()];
			c.subs = subs.toArray(asub);
			Variable[][] abinders = new Variable[subs.size()][];
			c.binders = subbinders.toArray(abinders);
		}

		if (constructions.isEmpty())
			term = c;

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
		return this;
	}

	@Override
	public BufferSink propertyNamed(String name, Term term)
	{
		if (properties == null)
			properties = new Properties(null);

		properties.addNamedProperty(name, term);
		return this;
	}

	@Override
	public BufferSink propertyVariable(Variable variable, Term term)
	{
		if (properties == null)
			properties = new Properties(null);

		properties.addVariableProperty(variable, term);
		return this;
	}

	@Override
	public BufferSink copy(Term term)
	{
		// If identical properties then just share!
		if (term.isVariableUse() || properties == term.properties())
		{
			if (properties != null)
			{
				properties.release();
				properties = null;
			}

			addSub(term); // transfer ref
			return this;
		}

		if (term.properties() != null && properties != null)
			throw new RuntimeException("Cannot merge properties, yet");

		// We have a construction with different properties so must update the root term.
		if (term.refcount() == 1)
		{
			// Reuse original term (with updated properties).
			if (properties != null)
			{
				assert term.properties() == null;
				((Construction) term).properties = properties; // transfer ref
				properties = null;
			}
		}
		else
		{
			// Have different properties and cannot update inplace. Really need to copy.
			IdentityHashMap<Variable, Term> map = new IdentityHashMap<>();
			term.substituteTo(this, map);
		}

		return this;
	}

	@Override
	public BufferSink substitute(Term term, Variable variable, Term substitute)
	{
		return (BufferSink) super.substitute(term, variable, substitute);
	}

	@Override
	public BufferSink substitute(Term term, Variable[] binders, Term[] substitutes)
	{
		assert binders.length == substitutes.length;

		// binders are all the original term binders
		// this.binders are the binders that have been renamed.

		IdentityHashMap<Variable, Term> map = new IdentityHashMap<>();
		for (int i = binders.length - 1; i >= 0; i--)
			map.put(binders[i], substitutes[i]);
		Term newterm = term.substitute(context, map); // uses term reference.
		term = newterm;

		copy(term);

		// Release substitute references
		for (int i = 0; i < substitutes.length; ++i)
			substitutes[i].release();

		return this;
	}
}