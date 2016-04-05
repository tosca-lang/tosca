// Copyright (c) 2014 IBM Corporation.

package org.transscript.runtime.v2;

import java.util.Map;

import org.transscript.runtime.Context;

/**
 * A generic variable use.
 * 
 * @author villardl
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
	public Term copy(Context c)
	{
		return new VariableUse(variable);
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

}
