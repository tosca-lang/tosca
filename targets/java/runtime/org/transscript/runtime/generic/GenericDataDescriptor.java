// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime.generic;

import org.transscript.runtime.ConstructionDescriptor;

/**
 * Generic data construction descriptor 
 * 
 * @author Lionel Villard
 */
public class GenericDataDescriptor implements ConstructionDescriptor
{

	/** Construction symbol */
	protected String symbol;

	/**
	 * Construct descriptor with the given symbol
	 * @param symbol
	 */
	public GenericDataDescriptor(String symbol)
	{
		this.symbol = symbol;
	}

	@Override
	public Construction make()
	{
		return new Construction(this);
	}

	@Override
	public String symbol()
	{
		return symbol;
	}

}
