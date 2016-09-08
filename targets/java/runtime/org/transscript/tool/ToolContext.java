/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.tool;

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

	/** Generic construction descriptor. */
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
			throw new RuntimeException("Cannot create instances from generic term descriptor");
		}

		@Override
		public String symbol()
		{
			return symbol;
		}

	}

//	/** Generic construction. */
//	static class GenericConstruction implements Term
//	{
//		protected GenericDesc desc;
//		protected ArrayList<Term> subs;
//		protected ArrayList<ArrayList<Variable>> binders;
//
//		public GenericConstruction(GenericDesc desc)
//		{
//			this.desc = desc;
//		}
//
//		@Override
//		public Term copy(Context c)
//		{
//			throw new RuntimeException("Generic construction copy not implemented");
//		}
//
//		@Override
//		public Term sub(int i)
//		{
//			return subs == null ? null : subs.get(i);
//		}
//
//		@Override
//		public void setSub(int i, Term sub)
//		{
//			if (subs == null)
//				subs = new ArrayList<>();
//			assert subs.size() == i;
//			subs.add(i, sub);
//		}
//
//		@Override
//		public Variable binder(int i, int j)
//		{
//			if (binders == null || binders.size() >= i)
//				return null;
//			ArrayList<Variable> subbinders = binders.get(i);
//			if (subbinders == null || subbinders.size() >= j)
//				return null;
//			return subbinders.get(j);
//		}
//
//		@Override
//		public void setBinder(int i, int j, Variable var)
//		{
//			if (binders == null)
//				binders = new ArrayList<>();
//			
//			while (binders.size() < i + 1)
//				binders.add(new ArrayList<>());
//			
//			ArrayList<Variable> subbinders = binders.get(i);
//			while (subbinders.size() < j + 1)
//				subbinders.add(null);
//				
//			subbinders.set(j, var);
//		}
//
//	}
}
