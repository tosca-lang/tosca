// Copyright (c) 2014-2016 IBM Corporation.

package org.transscript.runtime;

import java.util.Arrays;
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

	/** Meta variable type */
	Term type;

	/** Substitutions  */
	public Term[] subs;

	/** Applies  */
	public Term[] args;

	// Constructor

	public MetaApplication(String meta)
	{
		this.metaVariable = meta;
	}

	/** */
	public void setType(Term type)
	{
		this.type = type;
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
	public Term sub(int i)
	{
		return subs[i];
	}

	@Override
	public void setSub(int index, Term term)
	{
		if (subs == null)
			subs = new Term[index + 1];
		else if (subs.length <= index)
			subs = Arrays.copyOf(subs, index + 1);

		subs[index] = term;
	}

	@Override
	public void setArg(int index, Term term)
	{
		if (args == null)
			args = new Term[index + 1];
		else if (args.length <= index)
			args = Arrays.copyOf(args, index + 1);

		args[index] = term;
	}

	@Override
	public void copy(Sink sink, boolean discard)
	{
		sink.startMetaApplication(metaVariable);

		for (int i = 0; i < arity(); i++)
			subs[i].copy(sink, discard);

		sink.endMetaApplication();

		sink.startType();
		type.copy(sink, discard);
		sink.endType();

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
		StringBuilder builder = new StringBuilder();

		builder.append(metaVariable);
		final int arity = arity();
		if (arity > 0)
		{
			builder.append("[");
			for (int i = 0; i < arity; i++)
			{
				if (i != 0)
					builder.append(", ");

				Term sub = sub(i);
				builder.append(sub.toString());
			}
			builder.append("]");
		}

		if (type != null)
			builder.append(':').append(type);

		return builder.toString();
	}

	@Override
	public String toString4()
	{
		StringBuilder builder = new StringBuilder();

		builder.append(metaVariable);

		if (args != null && args.length > 0)
		{
			builder.append("(");
			for (int i = 0; i < args.length; i++)
			{
				if (i != 0)
					builder.append(", ");

				builder.append(args[i].toString4());
			}
			builder.append(")");
		}

		if (subs != null && subs.length > 0)
		{
			builder.append("[");
			for (int i = 0; i < subs.length; i++)
			{
				if (i != 0)
					builder.append(", ");

				builder.append(subs[i].toString4());
			}
			builder.append("]");
		}
		if (type != null)
			builder.append(':').append(type.toString4());

		return builder.toString();
	}

}
