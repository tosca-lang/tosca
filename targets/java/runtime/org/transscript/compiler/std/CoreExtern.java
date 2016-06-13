/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.runtime.StringTerm.stringTerm;

import org.transscript.compiler.std.Core.Bool;
import org.transscript.runtime.Context;
import org.transscript.runtime.Functions.ThunkMaker;
import org.transscript.runtime.LazyTerm;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;

/**
 * Standard library core functions.
 * 
 * @author Lionel Villard
 */
public class CoreExtern
{

	public static <a extends Term, b extends Term> Bool SameVariable(Context ctx, ThunkMaker<a> tma, ThunkMaker<b> tmb, a x_343, b x_347)
	{
		throw new RuntimeException();
	}

	/**
	 * 
	 * @param ctx
	 * @param term1
	 * @param term2
	 * @return
	 */
	public static <a extends Term, b extends Term> Bool Equal(Context ctx, ThunkMaker<a> tma, ThunkMaker<b> tmb, a term1, b term2)
	{
		final boolean result = term1.equals(term2);
		term1.release();
		term2.release();
		return result ? Core.TRUE(ctx) : Core.FALSE(ctx);
	}

	public static <a extends Term> a Error(Context ctx, ThunkMaker<a> tm, StringTerm msg)
	{
		StringTerm emsg = Term.force(ctx, msg);

		System.err.println(emsg);
		throw new RuntimeException(emsg.toString());
	}

	public static StringTerm GetEnv(Context ctx, StringTerm key, StringTerm defaultValue)
	{
		java.lang.String value = System.getProperty(key.unbox());
		key.release();

		if (value == null)
			return defaultValue;

		defaultValue.release();

		return stringTerm(value);
	}

	/**
	 * Print term to string.
	 * @param ctx
	 * @param tma
	 * @param term
	 * @return
	 */
	public static <a extends Term> StringTerm Show(Context ctx, ThunkMaker<a> tma, a term)
	{
		return stringTerm(term.toString());
	}

	public static <a extends Term> a IfDef(Context ctx, ThunkMaker<a> tm, StringTerm key, LazyTerm<a> def, LazyTerm<a> notdef)
	{
		java.lang.String value = System.getProperty(key.unbox());
		key.release();
		if (value != null)
		{
			notdef.release();
			return def.eval(ctx);
		}

		def.release();
		return notdef.eval(ctx);
	}

	/** 
	 * Print the given message to the console and return result
	 */
	public static <a extends Term> a Trace(Context context, ThunkMaker<a> tma, StringTerm msg, LazyTerm<a> result)
	{
		StringTerm emsg = Term.force(context, msg);
		System.out.println(emsg);
		emsg.release();
		return result.eval(context);
	}

}
