// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.function.Function;

/**
 * Functional interfaces for fixed number of generic parameters
 *
 * @author Lionel Villard
 */
public class Functions
{

	@SuppressWarnings("unchecked")
	public static <T extends Term> T newLazyPoly(Function<Context, T> f){
		return (T) new LazyPoly<T>(f);
	}
	
	static class LazyPoly<T extends Term> extends LazyTerm<T> 
	{

		public LazyPoly(Function<Context, T> function)
		{
			super(function);
		}

		@SuppressWarnings("unchecked")
		@Override
		public T copy(Context c)
		{
			return (T) new LazyPoly<T>(f);
		}

	}
	
	
	public static <R extends Term, P1 extends Term> Closure1<R, P1> newClosure(Function1<R, P1> function, Term... captures)
	{
		return new Closure1<>(function, captures);
	}

	public static <R extends Term, P1 extends Term, P2 extends Term> Closure2<R, P1, P2> newClosure(Function2<R, P1, P2> function, Term... captures)
	{
		return new Closure2<>(function, captures);
	}
	
	static public class Closure1<R extends Term, P1 extends Term> implements Term
	{
		Function1<R, P1> function;
		Term[] captures;

		public Closure1(Function1<R, P1> function, Term[] captures)
		{
			this.function = function;
			this.captures = captures;
		}

		@Override
		public Term copy(Context c)
		{
			// TODO: ref counting for captured terms.
			return new Closure1<>(function, captures);
		}

		public R apply(Context context, P1 p1)
		{
			return function.apply(context, p1);
		}

	}
	

	static public class Closure2<R extends Term, P1 extends Term, P2 extends Term> implements Term
	{
		Function2<R, P1, P2> function;
		Term[] captures;

		public Closure2(Function2<R, P1, P2> function, Term[] captures)
		{
			this.function = function;
			this.captures = captures;
		}

		@Override
		public Term copy(Context c)
		{
			// TODO: ref counting for captured terms.
			return new Closure2<>(function, captures);
		}

		public R apply(Context context, P1 p1, P2 p2)
		{
			return function.apply(context, p1, p2);
		}

	}

	
	
	public interface Function1<R extends Term, P1 extends Term>
	{
		public R apply(Context context, P1 p1);
	}

	public interface Function2<R extends Term, P1 extends Term, P2 extends Term>  
	{
		public R apply(Context context, P1 p1, P2 p2);
	}
}
