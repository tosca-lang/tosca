// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime.generic;

import java.util.ArrayList;

/**
 * Two dimensional array
 * @author Lionel Villard
 *
 */
public class Array2D<T>
{
	/* The resizable array */
	protected ArrayList<ArrayList<T>> array;

	/**
	 * Gets value at index i/j
	 * @param i
	 * @param j
	 * @return the value or null if none at the given indexes
	 */
	public T get(int i, int j)
	{
		if (array != null && array.size() > i)
		{
			ArrayList<T> sub = array.get(i);
			if (sub != null && sub.size() > j)
				return sub.get(j);
		}
		return null;
	}

	/**
	 * Set value at given indexes. Grow array as needed and fill gaps with null values.
	 * @param i
	 * @param j
	 * @param val
	 */
	public void set(int i, int j, T val)
	{
		if (array == null || i >= array.size())
			array = Utils.growToSize(array, i + 4);

		ArrayList<T> sub = array.get(i);
		if (sub == null || j >= sub.size())
		{
			sub = Utils.growToSize(sub, j + 4);
			array.set(i, sub);
		}
		sub.set(j, val);
	}

}
