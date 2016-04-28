// Copyright (c) 2014-2016 IBM Corporation.

package org.transscript.runtime;

/**
 * Represent a construction type.
 * 
 * @author Lionel Villard
 */
public interface ConstructionDescriptor
{
	/**
	 * @return A construction instance of this type.
	 */
	public Term make();

	/**
	 * @return Construction symbol.
	 */
	public String symbol();

	
}
