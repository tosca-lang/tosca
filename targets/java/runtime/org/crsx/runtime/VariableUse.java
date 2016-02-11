// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.util.Map;

/**
 * A variable use.
 * 
 * @author villardl
 */
final public class VariableUse extends Term
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
	public Kind kind()
	{
		return Kind.VARIABLE_USE;
	}

	@Override
	public void copy(Sink sink, boolean discard)
	{
		sink.use(variable); // use will call .use
		if (discard)
			release();
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
	protected void free()
	{
		variable.unuse(this);

		super.free();
	}

	@Override
	protected boolean deepEquals(Term other, Map<Variable, Variable> renamings)
	{
		if (other.kind() != Kind.VARIABLE_USE)
			return false;
		Variable mapped = renamings.get(variable);
		return (mapped != null ? mapped : variable).equals(((VariableUse) other).variable);
	}

	@Override
	public String toString()
	{
		return variable.toString();
	}

}
