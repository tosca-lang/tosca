/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.compiler.std.Core.Bool;
import org.transscript.runtime.Context;
import org.transscript.runtime.DoubleTerm;

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

	public static Bool NumberGreaterThan(Context context, DoubleTerm left, DoubleTerm right)
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

	public static Bool NumberLessThan(Context context, DoubleTerm left, DoubleTerm right)
	{
		DoubleTerm eleft = left.eval(context);
		DoubleTerm eright = right.eval(context);

		Bool r = eleft.unbox() < eright.unbox() ? Core.TRUE(context) : Core.FALSE(context);
		eleft.release();
		eright.release();
		return r;
	}

}
