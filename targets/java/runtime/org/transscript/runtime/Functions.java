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

	public interface ThunkMaker<R extends Term> extends Function<Function<Context, R>, R>
	{}

	public static <R extends Term> Closure0<R> newClosure(Function0<R> function, Term... captures)
	{
		return new Closure0<>(function, captures);
	}

	public static <R extends Term, P1 extends Term> Closure1<R, P1> newClosure(Function1<R, P1> function, Term... captures)
	{
		return new Closure1<>(function, captures);
	}

	public static <R extends Term, P1 extends Term, P2 extends Term> Closure2<R, P1, P2> newClosure(Function2<R, P1, P2> function, Term... captures)
	{
		return new Closure2<>(function, captures);
	}

	public static <R extends Term, P1 extends Term, P2 extends Term, P3 extends Term> Closure3<R, P1, P2, P3> newClosure(Function3<R, P1, P2, P3> function, Term... captures)
	{
		return new Closure3<>(function, captures);
	}

	public static <R extends Term, P1 extends Term, P2 extends Term, P3 extends Term, P4 extends Term> Closure4<R, P1, P2, P3, P4> newClosure(Function4<R, P1, P2, P3, P4> function, Term... captures)
	{
		return new Closure4<>(function, captures);
	}

	static public class Closure0<R extends Term>
	{
		Function0<R> function;
		Term[] captures; // For reference counting

		public Closure0(Function0<R> function, Term[] captures)
		{
			this.function = function;
			this.captures = captures;
		}

		public R eval(Context context)
		{
			return function.apply(context);
		}
	}

	static public class Closure1<R extends Term, P1 extends Term>
	{
		Function1<R, P1> function;
		Term[] captures;

		public Closure1(Function1<R, P1> function, Term[] captures)
		{
			this.function = function;
			this.captures = captures;
		}

		//		@Override
		//		public Term copy(Context c)
		//		{
		//			// TODO: ref counting for captured terms.
		//			return new Closure1<>(function, captures);
		//		}

		public R eval(Context context, P1 p1)
		{
			return function.apply(context, p1);
		}

	}

	static public class Closure2<R extends Term, P1 extends Term, P2 extends Term>
	{
		Function2<R, P1, P2> function;
		Term[] captures;

		public Closure2(Function2<R, P1, P2> function, Term[] captures)
		{
			this.function = function;
			this.captures = captures;
		}
		//
		//		@Override
		//		public Term copy(Context c)
		//		{
		//			// TODO: ref counting for captured terms.
		//			return new Closure2<>(function, captures);
		//		}

		public R eval(Context context, P1 p1, P2 p2)
		{
			return function.apply(context, p1, p2);
		}

	}

	static public class Closure3<R extends Term, P1 extends Term, P2 extends Term, P3 extends Term>
	{
		Function3<R, P1, P2, P3> function;
		Term[] captures;

		public Closure3(Function3<R, P1, P2, P3> function, Term[] captures)
		{
			this.function = function;
			this.captures = captures;
		}

		//		@Override
		//		public Term copy(Context c)
		//		{
		//			// TODO: ref counting for captured terms.
		//			return new Closure3<>(function, captures);
		//		}

		public R eval(Context context, P1 p1, P2 p2, P3 p3)
		{
			return function.apply(context, p1, p2, p3);
		}

	}

	static public class Closure4<R extends Term, P1 extends Term, P2 extends Term, P3 extends Term, P4 extends Term>
	{
		Function4<R, P1, P2, P3, P4> function;
		Term[] captures;

		public Closure4(Function4<R, P1, P2, P3, P4> function, Term[] captures)
		{
			this.function = function;
			this.captures = captures;
		}
		//
		//		@Override
		//		public Term copy(Context c)
		//		{
		//			// TODO: ref counting for captured terms.
		//			return new Closure4<>(function, captures);
		//		}

		public R eval(Context context, P1 p1, P2 p2, P3 p3, P4 p4)
		{
			return function.apply(context, p1, p2, p3, p4);
		}

	}

	public interface Function0<R extends Term>
	{
		public R apply(Context context);
	}

	public interface Function1<R extends Term, P1 extends Term>
	{
		public R apply(Context context, P1 p1);
	}

	public interface Function2<R extends Term, P1 extends Term, P2 extends Term>
	{
		public R apply(Context context, P1 p1, P2 p2);
	}

	public interface Function3<R extends Term, P1 extends Term, P2 extends Term, P3 extends Term>
	{
		public R apply(Context context, P1 p1, P2 p2, P3 p3);
	}

	public interface Function4<R extends Term, P1 extends Term, P2 extends Term, P3 extends Term, P4 extends Term>
	{
		public R apply(Context context, P1 p1, P2 p2, P3 p3, P4 p4);
	}

}
