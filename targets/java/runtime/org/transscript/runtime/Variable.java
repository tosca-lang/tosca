// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

/**
 * Generic syntactic variable
 * @author Lionel Villard
 */
public class Variable extends RefImpl implements Ref
{

	/** Global unique name (within a {@link Context} */
	String name;

	/** Count the number of {@link VariableUse} using this variable */
	int uses;

	/** 
	 * Create a variable of given unique name
	 */
	protected Variable(String name)
	{
		this.name = name;
	}

	/**
	 * @return The globally unique variable name.
	 */
	public String name()
	{
		return name;
	}

	/**
	 * @return a new use of this variable
	 */
	public Variable ref()
	{
		return (Variable) super.ref();
	}

	/**
	 * @return a new use of this variable
	 */
	public VariableUse use()
	{
		uses++;
		return newVarUse();
	}

	/**
	 * Unuse variable use.
	 * 
	 * @param use
	 * @return
	 */
	public void unuse(VariableUse use)
	{
		//use.variable = null;
		uses--;
	}

	/**
	 * Creates a new variable use
	 */
	protected VariableUse newVarUse()
	{
		return new VariableUse(this);
	}

	/**
	 * Make a new variable of the same type as this one.
	 */
	public Variable make(Context ctx, String hint)
	{
		return new Variable(ctx.makeGlobalName(hint));
	}

	@Override
	public String toString()
	{
		return name;
	}

}
