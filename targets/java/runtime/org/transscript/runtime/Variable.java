// Copyright (c) 2016 IBM Corporation.
package org.transscript.runtime;

public class Variable implements Ref
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
	public Variable ref()
	{
		return (Variable) Ref.ref(this);
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
