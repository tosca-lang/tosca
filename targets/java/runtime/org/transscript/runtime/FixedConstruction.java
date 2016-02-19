// Copyright (c) 2015 IBM Corporation.

package org.transscript.runtime;


/**
 * Construction with properties and subs.
 * 
 * @author Lionel Villard
 */
public class FixedConstruction extends Construction
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
	protected FixedConstruction(ConstructionDescriptor descriptor, Properties properties)
	{
		this.descriptor = descriptor;
		this.properties = properties;
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
	final public Variable[] binders(int i)
	{
		return binders[i];
	}

	@Override
	public void setSub(int index, Term term)
	{
		subs[index] = term;
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
