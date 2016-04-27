// Copyright (c) 2016 IBM Corporation.
package org.transscript.tool;

/**
 * Just an mutable int.
 * @author Lionel Villard
 */
public class MutableInt
{
	/** General purpose marker */
	public static MutableInt MARKER = new MutableInt(-1);
	
	public int v;

	public MutableInt(int v)
	{
		this.v = v;
	}
}