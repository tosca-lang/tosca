// Copyright (c) 2014-2016 IBM Corporation.

package org.transscript.runtime.v2;

import org.transscript.runtime.Context;

/**
 * An untyped literal.
 * 
 * @author Lionel Villard
 */
public class StringLiteral implements Term
{

	// State

	/** The value */
	protected String value;

	// Constructor

	/** Constructs a literal term */
	public StringLiteral(String str)
	{
		this.value = str;
	}

	@Override
	public Term copy(Context c)
	{
		return new StringLiteral(value);
	}

}
