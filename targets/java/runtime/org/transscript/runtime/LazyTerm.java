// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.function.Function;

/**
 * Unevaluated function (a thunk). 
 * 
 * The result of the function evaluation is cached.
 * 
 * @author Lionel Villard
 * @param <T>
 */
public class LazyTerm<T extends Term> extends RefTerm implements Term
{
 
	public static <T extends Term>  T lazyTerm(Function<Context, T> f)
	{
		throw new RuntimeException();
	}

	public static <T extends Term> LazyTerm<T> thunk(Function<Context, T> f)
	{
		return new LazyTerm<T>(f);
	}
	
	// the unevaluated value.
	protected Function<Context, T> f;

	// the evaluated value.
	protected T value;

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
	public boolean data()
	{
		return f == null ? value.data() : false;
	}

	@Override
	public T eval(Context c)
	{
		if (value == null)
		{
			value = f.apply(c); // Acquire ref.
			f = null;
		}
		T result = Ref.ref(value);
		release();
		return result;
	}
 
	
	@SuppressWarnings("unchecked")
	@Override
	public Term copy(Context c)
	{
		return f == null ? new LazyTerm<T>((T) value.ref()) : new LazyTerm<T>(f);
	}

}
