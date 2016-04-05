// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime.v2;

import java.util.function.Function;

import org.transscript.runtime.Context;

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
