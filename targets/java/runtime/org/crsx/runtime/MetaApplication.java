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

	/** Meta variable name */
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
	public int arity()
	{
		return subs == null ? 0 : subs.length;
	}

	@Override
	public void copy(Sink sink, boolean discard)
	{
		sink.startMetaApplication(metaVariable);

		for (int i = 0; i < arity(); i++)
			subs[i].copy(sink, discard);

		sink.endMetaApplication();
		
		if (discard)
			release();
	}

	@Override
	protected void substituteTo(Sink sink, Map<Variable, Term> substitutes)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	protected boolean deepEquals(Term other, Map<Variable, Variable> renamings)
	{
		if (other.kind() == Kind.META_APPLICATION)
		{
			final MetaApplication meta = (MetaApplication) other;

			if (!meta.metaVariable.equals(metaVariable))
				return false;

			if (meta.arity() != arity())
				return false;

			for (int i = arity() - 1; i >= 0; i--)
				if (!meta.subs[i].deepEquals(subs[i], renamings))
					return false;

			return true;
		}
		return false;
	}

	@Override
	protected void free()
	{
		for (int i = 0; i < arity(); i++)
			subs[i].release();
	}

	// Debugging

	@Override
	public String toString()
	{
		return metaVariable;
	}

}
