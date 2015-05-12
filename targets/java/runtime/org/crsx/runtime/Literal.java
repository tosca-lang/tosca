// Copyright (c) 2014 IBM Corporation.
package org.crsx.runtime;

import java.util.Map;

/**
 * A Untyped literal
 * 
 * @author villardl
 */
public class Literal extends Term
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
		this.value = literal;
	}

	@Override
	public String symbol()
	{
		return value.toString();
	}
	 
	@Override
	protected void substituteTo(Sink sink, Map<Variable, Term> substitutes)
	{
		sink.copy(this); // Transfer reference
	}

	@Override
	public String toString()
	{
		return value.toString();
	}

	

}
