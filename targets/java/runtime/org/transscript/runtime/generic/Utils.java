// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime.generic;

import java.util.ArrayList;

/**
 * Collection of utility static methods
 *  
 * @author Lionel Villard
 */
public class Utils
{

	/** Grow given array to size by adding null values to it when needed */
	public static <T> ArrayList<T>  growToSize(ArrayList<T> array, int size)
	{
		assert size > 0;
		if (array == null)
			array = new ArrayList<T>(size + 2);
	
		while (array.size() < size)
			array.add(null);
		
		return array;
	}
}
