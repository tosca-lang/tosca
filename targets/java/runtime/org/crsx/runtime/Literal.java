// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.util.Map;

/**
 * An untyped literal.
 * 
 * <p>A Literal is a special construction with no argument.
 * 
 * @author villardl
 */
public class Literal extends Construction
{
	// Static
	
	/** Make a literal */
	public static Literal make(Object literal)
	{
		return new Literal(literal);
	}

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
		return ConstructionDescriptor.LiteralDescriptor.singleton;
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

}
