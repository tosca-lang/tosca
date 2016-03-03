// Copyright (c) 2014-2016 IBM Corporation.

package org.transscript.runtime;

import java.util.Map;

import org.transscript.runtime.ConstructionDescriptor.BaseDescriptor;

/**
 * An untyped literal.
 * 
 * @author Lionel Villard
 */
public class Literal extends Construction
{
	/** Unique global descriptor representing untyped literal */
	final public static ConstructionDescriptor LITERAL_DESC = new LiteralDescriptor();

	// State

	/** The value */
	protected Object value;

	// Constructor

	/** Constructs a literal term */
	public Literal(Object literal)
	{
		this.value = literal;
	}

	// Overrides

	@Override
	public String symbol()
	{
		return value.toString();
	}

	@Override
	public ConstructionDescriptor descriptor()
	{
		return LITERAL_DESC;
	}

	@Override
	public void copy(Sink sink, boolean discard)
	{
		sink.literal(value);

		if (discard)
			release();
	}

	@Override
	protected void substituteTo(Sink sink, Map<Variable, Term> substitutes)
	{
		sink.copy(this); // Transfer reference
	}

	@Override
	public String toString()
	{
		return StringUtils.quoteJava(value.toString());
	}

	@Override
	public String toString4()
	{
		return StringUtils.quoteJava(value.toString());
	}

	/** Untyped literal descriptor */
	static private class LiteralDescriptor extends BaseDescriptor
	{

		@Override
		public Construction make()
		{
			throw new RuntimeException("Literals cannot be construted through its descriptor");
		}

		@Override
		public boolean isFunction()
		{
			return false;
		}

		@Override
		public String symbol()
		{
			throw new RuntimeException("Literals do not have symbol");
		}

		@Override
		public int arity()
		{
			return 0;
		}
	}

}
