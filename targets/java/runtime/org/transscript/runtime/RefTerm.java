// Copyright (c) 2014 IBM Corporation.
package org.transscript.runtime;

/**
 * Represent a reference to term
 * 
 * @author villardl
 */
public abstract class RefTerm extends RefImpl implements Term
{

	@Override
	public RefTerm ref()
	{
		return (RefTerm) super.ref();
	}	

}
