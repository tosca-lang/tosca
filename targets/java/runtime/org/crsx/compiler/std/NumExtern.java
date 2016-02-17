
package org.crsx.compiler.std;

import org.crsx.runtime.Context;
import org.crsx.runtime.Normalizer;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;

public class NumExtern
{
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
}
