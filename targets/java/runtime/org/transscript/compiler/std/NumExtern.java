/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.runtime.StringTerm.stringTerm;
import static org.transscript.runtime.DoubleTerm.doubleTerm;
import static org.transscript.runtime.Term.force;

import org.transscript.compiler.std.Core.Bool;
import org.transscript.runtime.Context;
import org.transscript.runtime.DoubleTerm;
import org.transscript.runtime.StringTerm;

public class NumExtern
{

	final public static DoubleTerm Plus(Context context, DoubleTerm left, DoubleTerm right)
	{
		DoubleTerm eleft = left.eval(context);
		DoubleTerm eright = right.eval(context);

		DoubleTerm r = DoubleTerm.doubleTerm(eleft.unbox() + eright.unbox());
		eleft.release();
		eright.release();
		return r;
	}

	public static Bool GreaterThan(Context context, DoubleTerm left, DoubleTerm right)
	{
		DoubleTerm eleft = left.eval(context);
		DoubleTerm eright = right.eval(context);

		Bool r = eleft.unbox() > eright.unbox() ? Core.TRUE(context) : Core.FALSE(context);
		eleft.release();
		eright.release();
		return r;
	}

	public static DoubleTerm Minus(Context context, DoubleTerm left, DoubleTerm right)
	{

		DoubleTerm eleft = left.eval(context);
		DoubleTerm eright = right.eval(context);

		DoubleTerm r = DoubleTerm.doubleTerm(eleft.unbox() - eright.unbox());
		eleft.release();
		eright.release();
		return r;
	}

	public static Bool LessThan(Context context, DoubleTerm left, DoubleTerm right)
	{
		DoubleTerm eleft = left.eval(context);
		DoubleTerm eright = right.eval(context);

		Bool r = eleft.unbox() < eright.unbox() ? Core.TRUE(context) : Core.FALSE(context);
		eleft.release();
		eright.release();
		return r;
	}
	

	/**
	 * 
	 * @param context
	 * @param num
	 * @return
	 */
	public static StringTerm FormatNumber(Context context, DoubleTerm num)
	{
		DoubleTerm evnum = force(context, num);

		// FIXME
		StringTerm result = stringTerm(Integer.toString((int) evnum.unbox()));
		evnum.release();

		return result;
	}

	public static StringTerm FormatDecimal(Context context, DoubleTerm value_1396)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static StringTerm FormatInteger(Context context, DoubleTerm num)
	{
		StringTerm result = stringTerm(Integer.toString((int) num.unbox()));
		num.release();
		return result;
	}

	public static DoubleTerm Hex(Context context, StringTerm value_1242)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static DoubleTerm ToInteger(Context context, StringTerm string)
	{
		DoubleTerm d = doubleTerm(Integer.parseInt(string.unbox()));
		string.release();
		return d;
	}

	public static DoubleTerm Times(Context context, DoubleTerm value_16555, DoubleTerm value_16556)
	{
		// FIXME
		return null;
	}

	public static DoubleTerm Divide(Context context, DoubleTerm value_16564, DoubleTerm value_16565)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static DoubleTerm Modulo(Context context, DoubleTerm value_16574, DoubleTerm value_16575)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static DoubleTerm ToDecimal(Context context, StringTerm value_16572)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
