// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.util.Map;

/**
 * A Untyped literal
 * 
 * @author villardl
 */
public class Literal extends Construction
{
	/** Make a literal */
	public static Literal make(Object literal)
	{
		return new Literal(literal);
	}

	/** The value */
	protected Object value;

	/** Constructs a literal term */
	public Literal(Object literal)
	{
		super(LiteralDescriptor.singleton, null);
		this.value = literal;
	}

	@Override
	public String symbol()
	{
		return value.toString();
	}
	
	@Override
	public boolean isLiteral()
	{
		return true;
	}
	
	@Override
	public void copy(Sink sink, boolean discard)
	{
		if (properties != null)
			properties.ref().copy(sink, discard);

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
		return '"' + value.toString() + '"';
	}

	/**
	 * Represent a literal construction.
	 */
	protected static class LiteralDescriptor extends ConstructionDescriptor
	{
		protected static LiteralDescriptor singleton = new LiteralDescriptor();

		private LiteralDescriptor()
		{}

		@Override
		public String symbol()
		{
			return "$Literal";
		}

		@Override
		public boolean isFunction()
		{
			return false;
		}


		@Override
		public boolean step(Sink sink, Term data)
		{
			throw new RuntimeException("Literals do not  have step function");
		}
	}

}
