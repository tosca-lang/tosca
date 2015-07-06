// Copyright (c) 2014 IBM Corporation.
package org.crsx.runtime;

import java.util.Map;

/**
 * A variable use.
 * 
 * @author villardl
 */
public class VariableUse extends Term
{

	/** The variable being used */
	protected Variable variable;

	/**
	 * Construct a new use of the given variable.
	 * 
	 * @param variable
	 */
	protected VariableUse(Variable variable)
	{
		this.variable = variable;
	}

	@Override
	public boolean isVariableUse()
	{
		return true;
	}

	@Override
	public Kind kind()
	{
		return Kind.VARIABLE_USE;
	}

	
	@Override
	protected void substituteTo(Sink sink, Map<Variable, Term> substitutes)
	{
		Term substitute = substitutes.get(variable);
		if (substitute != null)
		{
			sink.copy(substitute.ref());
			
			release(); 
			return;
		}
		
		// This is a free variable: just echo
		sink.copy(this); // Transfer reference
	}

	@Override
	public void free()
	{
		variable.unuse(this);
		
		super.free();
	}

	@Override
	public String toString()
	{
		return variable.toString();
	}

}
