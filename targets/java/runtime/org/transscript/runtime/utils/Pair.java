// Copyright (c) 2016 IBM Corporation.
package org.transscript.runtime.utils;

/**
 * Simple pair utility class
 * @author Lionel Villard
 */
public class Pair<A, B>
{
	public A fst;
	public B snd;

	public Pair(A fst, B snd)
	{
		this.fst = fst;
		this.snd= snd;
	}
}
