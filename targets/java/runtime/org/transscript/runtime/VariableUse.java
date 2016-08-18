// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.Map;

/**
 * Base class for typed variable use.
 * 
 * Also serve as a generic implementation.
 * 
 * @author Lionel Villard
 */
public class VariableUse implements Term
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

	public Variable variable()
	{
		return variable;
	}

	@Override
	public VariableUse copy(Context c)
	{
		return variable.use();
	}

	@Override
	public Term substitute(Context c, Map<Variable, Term> substitutes)
	{
		Term substitute = substitutes.get(variable);
		if (substitute != null)
		{
			release();

			if (substitute instanceof VariableUse)
			{
				// TODO: find a better way.
				
				// Replacing variable use by another variable use. Make sure it's the right type!
				VariableUse copy = (VariableUse) copy(c);
				copy.variable = ((VariableUse) substitute).variable;
				return copy;
			}
			
			return substitute.ref();
		}

		// This is a free variable: just echo
		return this; // Transfer reference
	}

	@Override
	public String toString()
	{
		return variable.toString();
	}

	@Override
	public int hashCode()
	{
		return variable.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof VariableUse)
			return equals((VariableUse) obj);
		return false;
	}

	public boolean equals(VariableUse other)
	{
		return other.variable == variable;
	}
	
}
