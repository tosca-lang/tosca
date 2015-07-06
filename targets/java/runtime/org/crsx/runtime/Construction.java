// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.util.IdentityHashMap;
import java.util.Map;

import org.crsx.runtime.Term.Kind;

/**
 * A generic construction.
 * 
 * <p>
 * A construction is a term with 0 or more subterms, and properties
 * 
 * @author villardl
 */
public class Construction extends Term
{
	// State

	/** Construction type */
	protected ConstructionDescriptor descriptor;

	/** Sub terms */
	public Term[] subs;

	/** Sub binders */
	public Variable[][] binders;
	
	/** Environment/Attributes */
	protected Properties properties; // TODO: to deprecate

	// Constructors

	/**
	 * @param properties A properties reference used by this constructor
	 */
	protected Construction(ConstructionDescriptor descriptor, Properties properties)
	{
		this.descriptor = descriptor;
		this.properties = properties;
	}

	/** Gets construction descriptor */
	public ConstructionDescriptor descriptor()
	{
		return descriptor;
	}

	//  Overrides
	
	@Override
	public String symbol()
	{
		return descriptor.symbol();
	}

	@Override
	public Kind kind()
	{
		return Kind.CONSTRUCTION;
	}

	@Override
	final public Term sub(int i)
	{
		return subs[i];
	}

	@Override
	final public Variable[] binders(int i)
	{
		return binders[i];
	}

	@Override
	public Properties properties()
	{
		return properties;
	}

	@Override
	public void setSub(int index, Term term)
	{
		subs[index] = term;
	}

	@Override
	final public int arity()
	{
		return subs == null ? 0 : subs.length;
	}

	@Override
	final public boolean isConstruction()
	{
		return true;
	}

	@Override
	public boolean isFunction()
	{
		return descriptor.isFunction();
	}

	/**
	 * Copy this construction, sharing the subterms (if any).
	 * 
	 * @return A lone construction reference.
	 */
	public Construction copy(Context context)
	{
		Properties props = null;
		if (properties != null)
			props = properties.ref();

		Construction cons = new Construction(descriptor, props);

		if (subs != null)
		{
			Term[] newsubs = cons.subs = new Term[subs.length];
			Variable[][] newsubbinders = cons.binders = new Variable[subs.length][];

			for (int i = 0; i < subs.length; i++)
			{
				Term sub = subs[i];
				Variable[] subbinders = binders[i];
				
				if (subbinders == null)
				{
					newsubs[i] = sub.ref();
					newsubbinders[i] = null;
				}
				else
				{
					// REVISIT: is renaming needed?
					IdentityHashMap<Variable, Term> renamings = new IdentityHashMap<>();
					
					final Variable[] newbinders = newsubbinders[i] = new Variable[subbinders.length];

					for (int j = 0; j < subbinders.length; j++)
					{
						newbinders[j] = context.makeVariable(subbinders[j].name);
						renamings.put(subbinders[j], newbinders[j].use()); // renamings owns a reference of the new binders
					}

					newsubs[i]= sub.substitute(context, renamings);

					for (int j = 0; j < binders.length; j++)
							renamings.remove(binders[j]).release();  // release new binders reference
				}
			}
		}

		return cons;
	}

	@Override
	protected void substituteTo(Sink sink, Map<Variable, Term> substitutes)
	{
		// Apply substitution to properties
		if (properties != null)
			properties.ref().substituteTo(sink, substitutes);

		sink.start(descriptor);

		final Context context = sink.context();
		final int arity = arity();
		for (int i = 0; i < arity; i++)
		{
			Variable[] oldbinders = binders(i);
			if (oldbinders == null)
			{
				// --  i'th subterm with no binders: just continue copying.
				if (substitutes.isEmpty())
					sink.copy(sub(i).ref());
				else
					sub(i).ref().substituteTo(sink, substitutes);
			}
			else
			{
				// -- i'th subterm with binders, second and following copy: add new binders to substitution!
				
				// Create new subbinders
				Variable[] subbinders = new Variable[oldbinders.length];
				
				for (int j = 0; j < oldbinders.length; j++)
				{
					Variable oldbinder = oldbinders[j];
					Variable subbinder = context.makeVariable(oldbinder.name);
					substitutes.put(oldbinder, subbinder.use());
					subbinders[j] = subbinder;
				}
				
				// Send and substitute
				sink.binds(subbinders);
				
				sub(i).ref().substituteTo(sink, substitutes);
				
				// Cleanup
				for (int j = 0; j < oldbinders.length; j++)
					substitutes.remove(oldbinders[j]).release();
			}
		}

		sink.end();

		this.release();
	}

	@Override
	public void free()
	{
		if (subs != null)
		{
			for (int i = subs.length - 1; i >= 0; i--)
				subs[i].release();
		}
		if (properties != null)
			properties.release();

		super.free();
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		if (properties != null)
			builder.append(properties);
		builder.append(descriptor.symbol());
		if (subs != null && subs.length > 0)
		{
			builder.append("[");
			for (int i = 0; i < subs.length; i++)
			{
				if (i != 0)
					builder.append(", ");

				Term sub = subs[i];
				Variable[] subbinders = binders[i];
				if (subbinders != null)
				{
					boolean hasBinders = false;

					for (int j = 0; j < subbinders.length; j++)
					{
						if (hasBinders)
							builder.append(" ");
						builder.append(subbinders[j]);
						hasBinders = true;
					}
					if (hasBinders)
						builder.append(".");
				}
				builder.append(sub.toString());
			}
			builder.append("]");
		}
		return builder.toString();
	}

}
