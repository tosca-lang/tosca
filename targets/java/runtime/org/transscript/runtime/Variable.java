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

	@Override
	public String toString()
	{
		return name;
	}

}
