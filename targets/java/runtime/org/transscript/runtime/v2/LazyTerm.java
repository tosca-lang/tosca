// Copyright (c) 2016 IBM Corporation.
package org.transscript.runtime.v2;

import java.util.function.Function;

import org.transscript.runtime.Context;

/**
 * Unevaluated function (a thunk). 
 * 
 * The result of the function evaluation is cached.
 * 
 * @author Lionel Villard
 * @param <T>
 */
public abstract class LazyTerm<T extends Term> implements Term 
{

	protected Function<Context, T> f; // the unevaluated value.

	protected T value; // the evaluated value.

	public LazyTerm(Function<Context, T> f)
	{
		this.f = f;
	}

	protected LazyTerm(T value)
	{
		assert value != null;
		this.value = value;
	}
	
	@Override
	final public T eval(Context c)
	{
		if (value == null)
		{
			value = f.apply(c); // Acquire ref.
			f = null; 
			
			if (value instanceof LazyTerm)
			{
				// Might be a cookie or stack exhaustion
				throw new RuntimeException("Missing case!");
			}
		}
		return value;
	}

		
}
