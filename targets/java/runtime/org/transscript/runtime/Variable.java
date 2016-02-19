// Copyright (c) 2014 IBM Corporation.
package org.transscript.runtime;

/**
 * A Variable. Either free, bound, or binder.
 * 
 * @author villardl
 */
public class Variable extends Reference
{
	/** Name */
	String name;

	/** Count the number of {@link VariableUse} using this variable */
	int uses;

	/** */
	public Variable(String name)
	{
		this.name = name;
	}

	/**
	 * @return The variable name.
	 */
	public String name()
	{
		return name;
	}

	/**
	 * @return a new use of this variable
	 */
	final public Variable ref()
	{
		return (Variable) super.ref();
	}

	/**
	 * @return a new use of this variable
	 */
	public VariableUse use()
	{
		uses++;
		return new VariableUse(this);
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

	@Override
	public String toString()
	{
		return name;
	}

}
