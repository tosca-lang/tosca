// Copyright (c) 2014-2016 IBM Corporation.

package org.transscript.runtime.generic;

import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.StringUtils;

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
		super(LITERAL_DESC);
		this.value = literal;
	}

	// Overrides
	@Override
	public String toString()
	{
		return StringUtils.quoteJava(value.toString());
	}

	/** Untyped literal descriptor */
	static private class LiteralDescriptor implements ConstructionDescriptor
	{

		@Override
		public Construction make()
		{
			throw new RuntimeException("Literals cannot be construted through its descriptor");
		}

		@Override
		public String symbol()
		{
			throw new RuntimeException("Literals do not have symbol");
		}

		
	}

}
