// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.util.Map;

/**
 * Meta-application implementation. 
 * 
 * <p>Used by meta-compiler.
 * 
 * @author Lionel Villard
 */
public class MetaApplication extends Term
{
	// State.

	/** Symbol. */
	final String metaVariable;

	/** Sub terms */
	public Term[] subs;

	// Constructor

	public MetaApplication(String meta)
	{
		this.metaVariable = meta;
	}

	// Overrides

	@Override
	public Kind kind()
	{
		return Kind.META_APPLICATION;
	}

	@Override
	protected void substituteTo(Sink sink, Map<Variable, Term> substitutes)
	{
		throw new UnsupportedOperationException();
	}

	// Debugging

	@Override
	public String toString()
	{
		return metaVariable;
	}

}
