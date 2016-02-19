
package org.transscript.compiler.std;

import org.transscript.runtime.Context;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.Sink;
import org.transscript.runtime.Term;

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
