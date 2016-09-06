// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

/**
 * Built-in Tosca appendable type.
 * 
 * @author Lionel Villard
 */
public interface AppendableTerm extends Term
{

	/**
	 * @param str
	 * @return new appendable term reference
	 */
	static AppendableTerm appendableTerm(Appendable str)
	{
		return new _AppendableTerm(str);
	}

	/**
	 * Create a new variable of type Appendable
	 * @param context
	 * @param hint
	 * @return
	 */
	static VarAppendableTerm varAppendableTerm(Context context, String hint)
	{
		return new VarAppendableTerm(context.makeGlobalName(hint));
	}
	  

	/**
	 * @return the primitive string value
	 * @throws RuntimeException is called on an unevaluated string.
	 */
	default Appendable unbox()
	{
		throw new RuntimeException("Fatal error: cannot access unevaluated string value.");
	}

	@Override
	default AppendableTerm eval(Context c)
	{
		return (AppendableTerm) Term.super.eval(c);
	}

	/** @return the variable if this term is a variable use, othewise null */
	default VarAppendableTerm variable()
	{
		return null;
	}
	
	/**
	 * The actual string term.
	 */
	static class _AppendableTerm implements AppendableTerm
	{
		// State

		/** The value */
		protected Appendable value;

		// Constructor

		/** Constructs a literal term */
		public _AppendableTerm(Appendable str)
		{
			this.value = str;
		}

		@Override
		public Term copy(Context c)
		{
			return new _AppendableTerm(value);
		}

		@Override
		public Appendable unbox()
		{
			return value;
		}

		@Override
		public String toString()
		{
			return value.toString();
		}

		@Override
		public int hashCode()
		{
			return value.hashCode();
		}

		public boolean equals(_AppendableTerm other)
		{
			return value.equals(other.value);
		}

		@Override
		public boolean equals(Object obj)
		{
			return (obj instanceof _AppendableTerm) ? equals((_AppendableTerm) obj) : false;
		}

	}

	/**
	 * Syntactic variable of type string
	 */
	public static class VarAppendableTerm extends Variable
	{

		protected VarAppendableTerm(String name)
		{
			super(name);
		}

		@Override
		protected VariableUse newVarUse()
		{
			return new VarAppendableTermUse(this);
		}

		@Override
		public VarAppendableTermUse use()
		{
			return (VarAppendableTermUse) super.use();
		}

		@Override
		public Variable make(Context ctx, String hint)
		{
			return new VarAppendableTerm(ctx.makeGlobalName(hint));
		}
	}

	/**
	 * Syntactic variable use of type string
	 */
	class VarAppendableTermUse extends VariableUse implements AppendableTerm
	{

		protected VarAppendableTermUse(Variable variable)
		{
			super(variable);
		}
		
		@Override
		public VarAppendableTerm variable()
		{
			return (VarAppendableTerm) super.variable();
		}			
	}

}
