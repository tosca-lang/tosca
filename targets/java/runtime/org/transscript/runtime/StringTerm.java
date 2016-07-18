// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.function.Function;

import org.transscript.runtime.Functions.ThunkMaker;

/**
 * Built-in TS string.
 * 
 * @author Lionel Villard
 */
public interface StringTerm extends Term
{

	/**
	 * @param str
	 * @return new string term reference
	 */
	static StringTerm stringTerm(String str)
	{
		return new _StringTerm(str);
	}

	/**
	 * Create a new variable of type String
	 * @param context
	 * @param hint
	 * @return
	 */
	static VarStringTerm varStringTerm(Context context, String hint)
	{
		return new VarStringTerm(context.makeGlobalName(hint));
	}

	/**
	 * Create an unevaluated string.
	 * @param f the function producing a string
	 * @return new string term reference
	 */
	static StringTerm lazyStringTerm(Function<Context, StringTerm> f)
	{
		return new LazyStringTerm(f);
	}

	/**
	 * @return string thunk maker.
	 */
	static ThunkMaker<StringTerm> lazyStringTermMaker()
	{
		return StringTerm::lazyStringTerm;
	}

	/**
	 * @return the primitive string value
	 * @throws RuntimeException is called on an unevaluated string.
	 */
	default String unbox()
	{
		throw new RuntimeException("Fatal error: cannot access unevaluated string value.");
	}

	@Override
	default StringTerm eval(Context c)
	{
		return (StringTerm) Term.super.eval(c);
	}

	/** @return the variable if this term is a variable use, othewise null */
	default VarStringTerm variable()
	{
		return null;
	}
	
	/**
	 * The actual string term.
	 */
	static class _StringTerm implements StringTerm
	{
		// State

		/** The value */
		protected String value;

		// Constructor

		/** Constructs a literal term */
		public _StringTerm(String str)
		{
			this.value = str;
		}

		@Override
		public Term copy(Context c)
		{
			return new _StringTerm(value);
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

		public boolean equals(_StringTerm other)
		{
			return value.equals(other.value);
		}

		@Override
		public boolean equals(Object obj)
		{
			return (obj instanceof _StringTerm) ? equals((_StringTerm) obj) : false;
		}

	}

	/**
	 * Syntactic variable of type string
	 */
	public static class VarStringTerm extends Variable
	{

		protected VarStringTerm(String name)
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

		@Override
		public Variable make(Context ctx, String hint)
		{
			return new VarStringTerm(ctx.makeGlobalName(hint));
		}
	}

	/**
	 * Syntactic variable use of type string
	 */
	class VarStringTermUse extends VariableUse implements StringTerm
	{

		protected VarStringTermUse(Variable variable)
		{
			super(variable);
		}

		@Override
		public String unbox()
		{
			return variable.toString();
		}
		
		@Override
		public VarStringTerm variable()
		{
			return (VarStringTerm) super.variable();
		}			
	}

	/**
	 * Unevaluated string value
	 *
	 */
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
