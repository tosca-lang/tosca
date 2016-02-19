/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.runtime.Context;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.Sink;
import org.transscript.runtime.Term;

public class CoreExtern
{

	final public static boolean _M_IfDef(Sink sink, Term key, Term t, Term f)
	{
		final Context context = sink.context();

		key = Normalizer.normalize(context, key);
		java.lang.String value = System.getProperty(key.symbol());
		if (value != null)
		{

			sink.copy(t);
			f.release();
		}
		else
		{
			sink.copy(f);
			t.release();
		}

		key.release();
		return true;
	}

	final public static boolean _M_GetEnv(Sink sink, Term key, Term def)
	{
		final Context context = sink.context();

		key = Normalizer.normalize(context, key);

		java.lang.String value = System.getProperty(key.symbol());
		sink.literal(value == null ? "" : value);

		key.release();
		def.release();

		return true;
	}

	final public static boolean _M_Show(Sink sink, Term term)
	{
		final Context context = sink.context();
		term = Normalizer.normalize(context, term);

		sink.literal(term.toString());
		return true;
	}

	final public static boolean _M_Equal(Sink sink, Term term1, Term term2)
	{
		final Context context = sink.context();
		term1 = Normalizer.normalize(context, term1);
		term2 = Normalizer.normalize(context, term2);

		sink.start(term1.deepEquals(term2) ? Core._M_TRUE : Core._M_FALSE).end();
		term1.release();
		term2.release();
		return true;
	}

	final public static boolean _M_Trace(Sink sink, Term term)
	{
		final Context context = sink.context();
		term = Normalizer.normalize(context, term);
		System.out.println(term);
		sink.copy(term);
		return true;
	}

	final public static boolean _M_Error(Sink sink, Term str)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);
		System.err.println(str);
		System.exit(-1); // TODO: should be an exception
		return true;
	}

}
