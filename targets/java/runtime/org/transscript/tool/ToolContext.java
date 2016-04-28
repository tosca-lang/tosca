/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.tool;

import org.transscript.runtime.BufferSink;
import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.Context;
import org.transscript.runtime.Term;

/**
 * Context used by TS tool
 * 
 * @author Lionel Villard
 */
public class ToolContext extends Context
{

	// Overrides

	@Override
	public ConstructionDescriptor lookupDescriptor(String symbol)
	{
		ConstructionDescriptor desc = super.lookupDescriptor(symbol);
		return desc == null ? new GenericDesc(symbol) : desc;

	}

	/** Temporary generic construction descriptor. Only needed by tooling */
	static class GenericDesc implements ConstructionDescriptor
	{
		// the symbol
		final protected String symbol;

		public GenericDesc(String symbol)
		{
			this.symbol = symbol;
		}

		@Override
		public Term make()
		{
			throw new RuntimeException("Cannot make untyped term instances.");
		}

		@Override
		public String symbol()
		{
			return symbol;
		}

	}

}
