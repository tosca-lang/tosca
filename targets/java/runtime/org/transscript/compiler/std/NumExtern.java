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

		if (eleft.data() && eright.data())
		{
			// Ok can evaluate
			return DoubleTerm.doubleTerm(eleft.unbox() + eright.unbox());
		}

		// Delay
		return DoubleTerm.newLazyDoubleTerm(c -> Plus(c, eleft, eright));
	}

	public static Bool NumberGreaterThan(Context context, DoubleTerm x_133, DoubleTerm x_137)
	{
		throw new RuntimeException();
	}

	public static DoubleTerm Minus(Context context, DoubleTerm x_254, DoubleTerm x_258)
	{
		throw new RuntimeException();
	}

	public static Bool NumberLessThan(Context context, DoubleTerm x_26, DoubleTerm x_30)
	{
		throw new RuntimeException();
	}
	
}
