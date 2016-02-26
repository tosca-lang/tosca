// Copyright (c) 2015 IBM Corporation.

package org.transscript.runtime;

import java.util.Arrays;

/**
 * Generic construction with binders, subs and descriptor.
 * 
 * @author Lionel Villard
 */
public class GenericConstruction extends Construction
{
	// State

	/** Construction type */
	protected ConstructionDescriptor descriptor;

	/** Sub terms */
	public Term[] subs;

	/** Sub binders */
	public Variable[][] binders;

	// Constructors

	/**
	 * @param properties A properties reference used by this constructor
	 */
	protected GenericConstruction(ConstructionDescriptor descriptor, Properties properties)
	{
		this.descriptor = descriptor;
		this.properties = properties;

		// TODO: use arity
	}

	/** Gets construction descriptor */
	public ConstructionDescriptor descriptor()
	{
		return descriptor;
	}

	//  Overrides

	@Override
	public String symbol()
	{
		return descriptor.symbol();
	}

	@Override
	final public Term sub(int i)
	{
		return subs[i];
	}

	@Override
	public void setSub(int index, Term term)
	{
		// TODO: resizing should not be needed.
		if (subs == null)
			subs = new Term[index + 1];
		else if (subs.length <= index)
			subs = Arrays.copyOf(subs, index + 1);

		subs[index] = term;
	}

	@Override
	final public Variable[] binders(int i)
	{
		return binders == null || binders.length <= i ? null : binders[i];
	}

	@Override
	public void setBinder(int i, int j, Variable binder)
	{
		// TODO: resizing should not be needed.
		if (binders == null)
			binders = new Variable[i + 1][];
		else if (binders.length <= i)
			binders = Arrays.copyOf(binders, i + 1);

		if (binders[i] == null)
			binders[i] = new Variable[j + 1];
		else if (binders[i].length <= j)
			binders[i] = Arrays.copyOf(binders[i], j + 1);

		assert binders.length > i && binders[i].length > j;
		binders[i][j] = binder;
	}

	@Override
	final public int arity()
	{
		return subs == null ? 0 : subs.length;
	}

	@Override
	public void free()
	{
		if (properties != null)
			properties.release();

		if (subs != null)
		{
			for (int i = subs.length - 1; i >= 0; i--)
				subs[i].release();
		}

		super.free();
	}

}
