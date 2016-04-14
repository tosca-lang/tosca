// Copyright (c) 2016 IBM Corporation.
package org.transscript.runtime;

import java.util.Map;
import java.util.function.Function;

/**
 * Memoizable {@link Function}
 * @author Lionel Villard
 *
 * @param <T>
 */
public abstract class MemoFunction<T extends Term> implements Term 
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
				// Might be a cookie or stack exhaustion
				throw new RuntimeException("Missing case!");
			}
		}
		return value;
	}

	@Override
	public Term sub(int i)
	{
		return value.sub(i);
	}


	@Override
	public void setSub(int i, Term sub)
	{
		// TODO Auto-generated method stub
		Term.super.setSub(i, sub);
	}


	@Override
	public void setBinder(int i, int j, Variable var)
	{
		// TODO Auto-generated method stub
		Term.super.setBinder(i, j, var);
	}


	@Override
	public Term substitute(Context c, Map<Variable, Term> substitutes)
	{
		// TODO Auto-generated method stub
		return Term.super.substitute(c, substitutes);
	}
	
	
	
}
