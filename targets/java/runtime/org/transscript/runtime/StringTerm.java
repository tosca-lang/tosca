// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.function.Function;

import org.transscript.runtime.Functions.ThunkMaker;

/**
 * Term wrapper around a Java String
 * 
 * @author Lionel Villard
 */
public interface StringTerm extends Term
{

	static StringTerm stringTerm(String str)
	{
		return new StringValue(str);
	}

	@Deprecated
	static StringTerm newStringTerm(String str)
	{
		return new StringValue(str);
	}

	static StringTerm lazyStringTerm(Function<Context, StringTerm> f)
	{
		return new LazyStringTerm(f);
	}
	
	static ThunkMaker<StringTerm> lazyStringTermMaker()
	{
		return StringTerm::lazyStringTerm;
	}

	/**
	 * Gets primitive string value
	 * @return
	 */
	default String unbox()
	{
		throw new RuntimeException("Cannot access unevaluated string value.");
	}

	@Override
	default StringTerm eval(Context c)
	{
		return (StringTerm) Term.super.eval(c);
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
		public String unbox()
		{
			return value;
		}

		@Override
		public String toString()
		{
			return value;
		}

		@Override
		public int hashCode()
		{
			return value.hashCode();
		}

		@Override
		public boolean equals(Object obj)
		{
			if (obj instanceof StringValue)
				return value.equals(((StringValue) obj).value);
			return value.equals(obj);
		}

	}

	public static class VarStringTerm extends Variable
	{

		public VarStringTerm(String name)
		{
			super(name);
		}

		@Override
		protected VariableUse newVarUse()
		{
			return new VarStringTermUse(this);
		}

		@Override
		public VarStringTermUse use()
		{
			return (VarStringTermUse) super.use();
		}

	}

	class VarStringTermUse extends VariableUse implements StringTerm
	{

		protected VarStringTermUse(Variable variable)
		{
			super(variable);
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

		@Override
		public StringTerm eval(Context c)
		{
			return super.eval(c);
		}

		@Override
		public String unbox()
		{
			return value == null ? StringTerm.super.unbox() : ((StringTerm) value).unbox();
		}

	}

}
