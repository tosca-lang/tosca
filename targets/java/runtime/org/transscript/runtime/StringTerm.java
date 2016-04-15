// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.function.Function;

/**
 * 
 * @author Lionel Villard
 */
public interface StringTerm extends Term
{
	static StringTerm newStringTerm(String str)
	{
		return new StringValue(str);
	}

	static StringTerm newLazyStringTerm(Function<Context, StringTerm> f)
	{
		return new LazyStringTerm(f);
	}

	static class StringValue implements StringTerm
	{
		// State

		/** The value */
		protected String value;

		// Constructor

		/** Constructs a literal term */
		public StringValue(String str)
		{
			this.value = str;
		}

		@Override
		public Term copy(Context c)
		{
			return new StringValue(value);
		}

		@Override
		public String toString()
		{
			return value;
		}

	}
	
	public static class VarStringTerm extends VariableUse implements StringTerm
	{

		public VarStringTerm(Variable variable)
		{
			super(variable);
		}

		@Override
		public Term copy(Context c)
		{
			// TODO Auto-generated method stub
			return null;
		}
		
	}

	static class LazyStringTerm extends LazyTerm<StringTerm>implements StringTerm
	{

		public LazyStringTerm(Function<Context, StringTerm> f)
		{
			super(f);
		}

		@Override
		public Term copy(Context c)
		{
			return new LazyStringTerm(f);
		}

	}

}
