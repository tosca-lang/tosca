package org.transscript.runtime;

import java.util.function.Function;

/**
 * Memoizable {@link Function}
 * @author Lionel Villard
 *
 * @param <T>
 */
public abstract class MemoFunction<T> extends RefImpl 
{

	Function<Context, T> f; // the unevaluated value.

	T value; // the evaluated value.

	public MemoFunction(Function<Context, T> f)
	{
		this.f = f;
	}
	
	
	final public T apply(Context c)
	{
		if (value == null)
		{
			value = f.apply(c); // Acquire ref.
			f = null; 
			
			if (value instanceof MemoFunction)
			{
				// Might be a cookie of stack exhaustion
				throw new RuntimeException("Missing case!");
			}
		}
		return value;
	}
	
}
