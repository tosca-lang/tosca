// Copyright (c) 2015 IBM Corporation.

package org.transscript.runtime.generic;

import java.util.ArrayList;

import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.Context;
import org.transscript.runtime.Term;
import org.transscript.runtime.Variable;

/**
 * Generic construction with binders, subs and descriptor.
 * 
 * @author Lionel Villard
 */
public class Construction implements Term
{
	// Static utilities
	
	public ConstructionDescriptor makeGenericData(String symbol)
	{
		
	}
	
	// State

	/** Construction type */
	protected ConstructionDescriptor descriptor;

	/** Sub terms */
	public ArrayList<Term> subs;

	/** Sub binders */
	public Array2D<Variable> binders;

	/** Sub formal parameters */
	public Array2D<Variable> fparams;

	// Constructors

	/**
	 */
	protected Construction(ConstructionDescriptor descriptor)
	{
		this.descriptor = descriptor;
	}

	/** Gets construction descriptor */
	public ConstructionDescriptor descriptor()
	{
		return descriptor;
	}

	//  Overrides

	@Override
	final public Term sub(int i)
	{
		return subs != null && subs.size() > i ? subs.get(i) : null;
	}

	@Override
	public void setSub(int index, Term term)
	{
		subs = Utils.growToSize(subs, index + 1);

		subs.set(index, term);
	}

	@Override
	final public Variable binder(int i, int j)
	{
		return binders == null ? null : binders.get(i, j);
	}

	@Override
	public void setBinder(int i, int j, Variable binder)
	{
		if (binders == null)
			binders = new Array2D<>();

		binders.set(i, j, binder);
	}

	@Override
	public Variable param(int i, int j)
	{
		return fparams == null ? null : fparams.get(i, j);
	}

	@Override
	public void setParam(int i, int j, Variable param)
	{
		if (fparams == null)
			fparams = new Array2D<>();

		fparams.set(i, j, param);
	}

	@Override
	public Term copy(Context c)
	{
		// Only needed for "executable" terms
		throw new UnsupportedOperationException();
	}

}
