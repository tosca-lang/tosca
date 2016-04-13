
package org.transscript.compiler.std;

import org.transscript.runtime.Context;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.Sink;
import org.transscript.runtime.Term; 

public class NumExtern
{
	
//	final public static DoubleTerm Plus(Context context, DoubleTerm left, DoubleTerm right)
//	{
//		DoubleTerm eleft = left.eval(context);
//		DoubleTerm eright = right.eval(context);
//
//		if (eleft.data() && eright.data())
//		{
//			// Ok can evaluate
//			return DoubleTerm.newDoubleTerm(eleft.unbox() + eright.unbox());
//		}
//
//		// Delay
//		return DoubleTerm.newLazyDoubleTerm(c -> Plus(c, eleft, eright));
//	}
//
//	public static Bool NumberGreaterThan(Context context, DoubleTerm x_133, DoubleTerm x_137)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static DoubleTerm Minus(Context context, DoubleTerm x_254, DoubleTerm x_258)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static Bool NumberLessThan(Context context, DoubleTerm x_26, DoubleTerm x_30)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	
	
	
	
	
	
	
	final public static boolean _M_Plus(Sink sink, Term term1, Term term2)
	{
		final Context context = sink.context();

		term1 = Normalizer.normalize(context, term1);
		term2 = Normalizer.normalize(context, term2);

		int v1 = Integer.parseInt(term1.symbol());
		int v2 = Integer.parseInt(term2.symbol());

		sink.literal(Integer.toString(v1 + v2));

		term1.release();
		term2.release();
		return false;
	}

	final public static boolean _M_Minus(Sink sink, Term term1, Term term2)
	{
		final Context context = sink.context();

		term1 = Normalizer.normalize(context, term1);
		term2 = Normalizer.normalize(context, term2);

		int v1 = Integer.parseInt(term1.symbol());
		int v2 = Integer.parseInt(term2.symbol());

		sink.literal(Integer.toString(v1 - v2));

		term1.release();
		term2.release();
		return false;

	}

	final public static boolean _M_NumberLessThan(Sink sink, Term term1, Term term2)
	{
		final Context context = sink.context();

		term1 = Normalizer.normalize(context, term1);
		term2 = Normalizer.normalize(context, term2);

		int v1 = Integer.parseInt(term1.symbol());
		int v2 = Integer.parseInt(term2.symbol());

		if (v1 < v2)
			sink.start(Core._M_TRUE).end();
		else
			sink.start(Core._M_FALSE).end();

		term1.release();
		term2.release();
		return false;

	}
}
