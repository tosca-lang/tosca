// Copyright (c) 2016 IBM Corporation.
package org.crsx.runtime;

/**
 * Builtin map value.
 * 
 * @author Lionel Villard
 */
public class MapTerm extends Term
{

	@Override
	public Kind kind()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void copy(Sink sink, boolean discard)
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void substituteTo(Sink sink, java.util.Map<Variable, Term> substitutes)
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean deepEquals(Term other, java.util.Map<Variable, Variable> renamings)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
