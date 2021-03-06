// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.function.Function;

import org.transscript.runtime.Functions.ThunkMaker;

/**
 * 
 * @author Lionel Villard
 */
public interface DoubleTerm extends Term
{

	@Override
	default DoubleTerm eval(Context context)
	{
		return (DoubleTerm) Term.super.eval(context);
	}

	public double unbox();

	static DoubleTerm doubleTerm(double d)
	{
		return new DoubleValue(d);
	}

	/**
	 * Create a new variable of type Numeric
	 * @param context
	 * @param hint
	 * @return
	 */
	static VarDoubleTerm varDoubleTerm(Context context, String hint)
	{
		return new VarDoubleTerm(context.makeGlobalName(hint));
	}

	static DoubleTerm newLazyDoubleTerm(Function<Context, DoubleTerm> f)
	{
		return new LazyDoubleTerm(f);
	}

	static DoubleTerm lazyDoubleTerm(Function<Context, DoubleTerm> f)
	{
		return new LazyDoubleTerm(f);
	}

	static ThunkMaker<DoubleTerm> lazyDoubleTermMaker()
	{
		return DoubleTerm::lazyDoubleTerm;
	}

	static class DoubleValue extends RefTerm implements DoubleTerm
	{
		// State

		/** The value */
		protected double value;

		// Constructor

		/** Constructs a literal term */
		public DoubleValue(double str)
		{
			this.value = str;
		}

		@Override
		public String symbol()
		{
			// TODO: FIX BY ADDING INTEGERTERM
			return Integer.toString((int) value);
		}

		@Override
		public Term copy(Context c)
		{
			return new DoubleValue(value);
		}

		@Override
		public String toString()
		{
			// TODO: FIX BY ADDING INTEGERTERM
			return Integer.toString((int) value);
		}

		@Override
		public double unbox()
		{
			return value;
		}

		@Override
		public boolean equals(Object other)
		{
			if (other instanceof DoubleValue)
				return ((DoubleValue) other).unbox() == this.value;
			return false;
		}
	}

	public static class VarDoubleTerm extends Variable
	{

		public VarDoubleTerm(String name)
		{
			super(name);
		}

		@Override
		protected VariableUse newVarUse()
		{
			return new VarDoubleTermUse(this);
		}

		@Override
		public VarDoubleTermUse use()
		{
			return (VarDoubleTermUse) super.use();
		}

	}

	class VarDoubleTermUse extends VariableUse implements DoubleTerm
	{

		protected VarDoubleTermUse(Variable variable)
		{
			super(variable);
		}

		@Override
		public double unbox()
		{
			throw new RuntimeException("Variable of type double does not have a value");
		}

	}

	static class LazyDoubleTerm extends LazyTerm<DoubleTerm> implements DoubleTerm
	{

		public LazyDoubleTerm(Function<Context, DoubleTerm> f)
		{
			super(f);
		}

		@Override
		public Term copy(Context c)
		{
			return new LazyDoubleTerm(f);
		}

		@Override
		public DoubleTerm eval(Context context)
		{
			return super.eval(context);
		}

		@Override
		public double unbox()
		{
			throw new RuntimeException("Cannot access unevaluated double value.");
		}

	}

}
