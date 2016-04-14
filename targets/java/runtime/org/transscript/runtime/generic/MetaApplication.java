// Copyright (c) 2014-2016 IBM Corporation.

package org.transscript.runtime.generic;

import java.util.ArrayList;

import org.transscript.runtime.Context;
import org.transscript.runtime.Term;

/**
 * Generic Meta-application implementation. 
 * 
 * @author Lionel Villard
 */
public class MetaApplication implements Term
{
	// State.

	/** Meta variable name */
	final String metaVariable;

	/** Meta variable type */
	Term type;

	/** Substitutions  */
	public ArrayList<Term> subs;

	/** Arguments */
	public ArrayList<Term> args;

	// Constructor

	public MetaApplication(String meta)
	{
		this.metaVariable = meta;
	}

	// Overrides

	@Override
	public Term sub(int i)
	{
		return args == null ? null : args.get(i);
	}

	@Override
	public void setSub(int index, Term term)
	{
		if (args == null)
			args = Utils.growToSize(args, index + 4);

		args.set(index, term);
	}

	@Override
	public void setSubstitute(int index, Term term)
	{
		if (subs == null)
			subs = Utils.growToSize(subs, index + 4);

		subs.set(index, term);
	}

	@Override
	public void setType(Term type)
	{
		this.type = type;
	}

	// Debugging

	@Override
	public String toString()
	{
		//		StringBuilder builder = new StringBuilder();
		//
		//		builder.append(metaVariable);
		//		final int arity = arity();
		//		if (arity > 0)
		//		{
		//			builder.append("[");
		//			for (int i = 0; i < arity; i++)
		//			{
		//				if (i != 0)
		//					builder.append(", ");
		//
		//				Term sub = sub(i);
		//				builder.append(sub.toString());
		//			}
		//			builder.append("]");
		//		}
		//
		//		if (type != null)
		//			builder.append(':').append(type);
		//
		//		return builder.toString();
		return null;
	}

	@Override
	public Term copy(Context c)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
