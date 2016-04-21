/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.runtime.StringTerm.stringTerm;

import org.transscript.compiler.std.Core.Bool;
import org.transscript.runtime.Context;
import org.transscript.runtime.Functions.ThunkMaker;
import org.transscript.runtime.LazyTerm;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;

public class CoreExtern
{

	public static <a extends Term, b extends Term> Bool SameVariable(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, a x_343, b x_347)
	{
		throw new RuntimeException();
	}

	/**
	 * 
	 * @param context
	 * @param term1
	 * @param term2
	 * @return
	 */
	public static <a extends Term, b extends Term> Bool Equal(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, a term1, b term2)
	{
		final boolean result = term1.equals(term2);
		term1.release();
		term2.release();
		return result ? Core.TRUE(context) : Core.FALSE(context);
	}

	public static <a extends Term> a Error(Context context, ThunkMaker<a> tm, StringTerm x_359)
	{
		throw new RuntimeException();
	}

	public static <a extends Term> a Trace(Context context, ThunkMaker<a> tm, a x_432)
	{
		throw new RuntimeException();
	}

	public static StringTerm GetEnv(Context context, StringTerm key, StringTerm defaultValue)
	{
		java.lang.String value = System.getProperty(key.unbox());
		key.release();
		
		if (value == null)
			return defaultValue;
		
		defaultValue.release();
		
		return stringTerm(value);
	}

	public static <a extends Term> StringTerm Show(Context context, ThunkMaker<a> tma, a x_614)
	{
		throw new RuntimeException();
	}

	public static <a extends Term> a IfDef(Context context, ThunkMaker<a> tm, StringTerm key, LazyTerm<a> def, LazyTerm<a> notdef)
	{
		java.lang.String value = System.getProperty(key.unbox());
		key.release();
		if (value != null)
		{
			notdef.release();
			return def.eval(context);
		}

		def.release();
		return notdef.eval(context);
	}

}
