// Copyright (c) 2016 IBM Corporation.

package org.transscript.tool;

import org.transscript.runtime.utils.Pair;

/**
 * Simple triple utility class
 * @author Lionel Villard
 *
 */
public class Triple<A, B, C> extends Pair<A, B>
{
	public C thd;

	public Triple(A fst, B snd, C thd)
	{
		super(fst, snd);
		this.thd = thd;
	}

}
