/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.runtime.StringTerm.stringTerm;
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

	public static StringTerm FormatInteger(Context context, DoubleTerm value_1402)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
