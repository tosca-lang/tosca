// Copyright (c) 2014 IBM Corporation.

package org.transscript.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.transscript.compiler.std.Core.Bool;

/**
 * Rewrite engine.
 * 
 * @author villardl
 */
public class Normalizer
{

	/**
	 * Normalize term until top-level term is data
	 * 
	 * @param main returning an evaluated or partially evaluated term.
	 * @param args 
	 * @return a data term. Might contains non-evaluated sub functions.
	 * 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public static Term force(Method main, Object... args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
//		Object[] objs = new Object[1 + (args == null ? 0 : args.length)];
//		objs[0] = context;
//		if (args != null)
//			System.arraycopy(args, 0, objs, 1, args.length);
//		
		Term term = (Term) main.invoke(null, args);
		return force((Context) args[0], term);
	}

	/**
	 * Normalize term until top-level term is data
	 * 
	 * @param context
	 * @param term The reference is used by this method.
	 * @return a data term.
	 */
	public static Term force(Context context, Term term)
	{
		while (!term.data())
		{
			term = term.eval(context);
			if (context.sd <= 1)
			{
				// Could't make progress -> missing cases....
				break;
			}
			context.sd = 0;
		}
		return term;
	}
	
	/**
	 * Normalize term until top-level term is data
	 * 
	 * @param context
	 * @param term The reference is used by this method.
	 * @return normalized term.
	 */
	public static Term wforce(Context context, Term term)
	{
		if (!term.data())
			term = term.eval(context);
		return term;
	}
	
}
