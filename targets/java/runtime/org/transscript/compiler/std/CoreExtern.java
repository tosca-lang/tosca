/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.runtime.StringTerm.stringTerm;

import org.transscript.compiler.std.Core.Bool;
import org.transscript.compiler.std.Listdef.List;
import org.transscript.runtime.Context;
import org.transscript.runtime.DoubleTerm;
import org.transscript.runtime.Functions.Closure0;
import org.transscript.runtime.Functions.ThunkMaker;
import org.transscript.runtime.LazyTerm;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.VariableUse;

/**
 * Standard library core functions.
 *
 * @author Lionel Villard
 */
public class CoreExtern
{

	public static <a extends Term> Bool SameVariable(Context ctx, ThunkMaker<a> tma, a var1, a var2)
	{
    Bool result;
		if (var1 instanceof VariableUse && var2 instanceof VariableUse)
			result = ((VariableUse) var1).variable().equals(((VariableUse) var2).variable()) ? Core.TRUE(ctx) : Core.FALSE(ctx);
		else
			result = Core.FALSE(ctx);

    var1.release();
    var2.release();
		return result;
	}

	/**
	 *
	 * @param ctx
	 * @param term1
	 * @param term2
	 * @return
	 */
	public static <a extends Term> Bool Equal(Context ctx, ThunkMaker<a> tma, a term1, a term2)
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

	public static <a extends Term> a IfDef(Context ctx, ThunkMaker<a> tm, StringTerm key, Closure0<a> def, Closure0<a> notdef)
	{
		java.lang.String value = System.getProperty(key.unbox());
		key.release();
		if (value != null)
		{
			return def.eval(ctx);
		}

		return notdef.eval(ctx);
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

	public static DoubleTerm BitOr(Context context, DoubleTerm value_1825, DoubleTerm value_1826)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static Bool BitSubSetEq(Context context, DoubleTerm value_1862, DoubleTerm value_1863)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static DoubleTerm BitAnd(Context context, DoubleTerm value_1870, DoubleTerm value_1871)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static DoubleTerm BitMinus(Context context, DoubleTerm value_1890, DoubleTerm value_1891)
	{
		// TODO Auto-generated method stub
		return null;
	}


	public static <a extends Term> a EventualError(Context context, ThunkMaker<a> tma, StringTerm value_12785, List<StringTerm> value_12786, Closure0<a> value_12787)
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	public static <a extends Term> a ForgivableError(Context context, ThunkMaker<a> tma, StringTerm value_1675, StringTerm value_1676, StringTerm value_1677, StringTerm value_1678, StringTerm value_1679, StringTerm value_1680, Closure0<a> value_1681)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Deprecated
	public static <a extends Term> a ForgivableError(Context context, ThunkMaker<a> tma, StringTerm value_1675, StringTerm value_1676, StringTerm value_1677, StringTerm value_1678, StringTerm value_1679, StringTerm value_1680, LazyTerm<a> value_1681)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static <a extends Term, b extends Term> List<b> FreeVariables(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, a value_1721)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static <a extends Term, b extends Term> b VariableNameIs(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, a value_1733, StringTerm value_1734, b value_1735)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static <a extends Term> List<a> IntersectVariables(Context context, ThunkMaker<a> tma, List<a> value_1730, List<a> value_1731)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static <a extends Term> a Debug(Context context, ThunkMaker<a> tma, StringTerm msg, Closure0<a> result)
	{
		StringTerm emsg = Term.force(context, msg);
		System.out.println(emsg);
		emsg.release();
		return result.eval(context);
	}

	public static <a extends Term> a Debug(Context context, ThunkMaker<a> tma, StringTerm value_1738, LazyTerm<a> value_1739)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static <a extends Term> List<a> ExceptVariables(Context context, ThunkMaker<a> tma, List<a> value_1726, List<a> value_1727)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static <a extends Term> Bool DeepEqual(Context context, ThunkMaker<a> tma, a value_1780, a value_1781)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static <a extends Term, b extends Term> b Location(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, a value_15168)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static <a extends Term> a CI_Exit(Context context, ThunkMaker<a> tma, DoubleTerm id, Closure0<a> result)
	{
		return result.eval(context);
	}

	public static <a extends Term> a CI_Enter(Context context, ThunkMaker<a> tma, DoubleTerm id, StringTerm name, Closure0<a> result)
	{
		return result.eval(context);
	}

	@SuppressWarnings("unchecked")
	public static  <a extends Term, b extends Term> b As(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, a value)
	{
		return (b) value;
	}

}
