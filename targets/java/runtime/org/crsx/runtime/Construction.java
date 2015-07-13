// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.util.Map;

/**
 * Base class for construction.
 *  
 * @author villardl
 */
public abstract class Construction extends Term
{
	// State

	/** Environment/Attributes */
	protected Properties properties; // TODO: to deprecate

	// Constructors

	/**
	 * @param properties A properties reference used by this constructor
	 */
	protected Construction()
	{}

	/** Gets construction descriptor */
	public abstract ConstructionDescriptor descriptor();

	//  Overrides

	@Override
	final public Kind kind()
	{
		return Kind.CONSTRUCTION;
	}
	
	@Override
	final public Properties properties()
	{
		return properties;
	}
	
	@Override
	public void copy(Sink sink, boolean discard)
	{
		if (properties() != null)
			properties().ref().copy(sink, discard);

		sink.start(descriptor());

		for (int i = 0; i < arity(); i++)
		{
			Variable[] subbinders = binders(i);
			if (subbinders != null)
				sink.binds(subbinders);

			sub(i).ref().copy(sink, discard);
		}

		sink.end();

		if (discard)
			release();
	}

	@Override
	protected void substituteTo(Sink sink, Map<Variable, Term> substitutes)
	{
		// Apply substitution to properties
		if (properties() != null)
			properties().ref().substituteTo(sink, substitutes);

		sink.start(descriptor());

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
	protected boolean deepEquals(Term other, Map<Variable, Variable> renamings)
	{
		if (other.kind() != Kind.CONSTRUCTION)
			return false;

		final int arity = arity();
		if (arity != other.arity())
			return false;

		if (!symbol().equals(other.symbol()))
			return false;

		for (int i = 0; i < arity; ++i)
		{
			final Variable[] thisBinders = binders(i);
			final Variable[] otherBinders = other.binders(i);

			if (thisBinders.length != otherBinders.length)
				return false;

			for (int b = 0; b < thisBinders.length; ++b)
				renamings.put(thisBinders[b], otherBinders[b]);

			if (!sub(i).deepEquals(other.sub(i), renamings))
				return false;

			for (int b = 0; b < thisBinders.length; ++b)
				renamings.remove(thisBinders[b]);
		}
		return true;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		if (properties() != null)
			builder.append(properties());
		builder.append(descriptor().symbol());
		final int arity = arity();
		if (arity > 0)
		{
			builder.append("[");
			for (int i = 0; i < arity; i++)
			{
				if (i != 0)
					builder.append(", ");

				Term sub = sub(i);
				Variable[] subbinders = binders(i);
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
