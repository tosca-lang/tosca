/* Copyright (c) 2016 IBM Corporation. */

package org.crsx.compiler.std;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.Context;
import org.crsx.runtime.MapTerm;
import org.crsx.runtime.Normalizer;
import org.crsx.runtime.Properties;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;

public class CoreExtern
{

	final public static boolean _M_IfDef(Sink sink, Term map, Term key, Term t, Term f)
	{
		final Context context = sink.context();

		map = Normalizer.normalize(context, map);
		key = Normalizer.normalize(context, key);

		if (map instanceof MapTerm)
		{
			if (((MapTerm) map).lookup(key) != null)
			{
				sink.copy(t);
				f.release();
			}
			else
			{
				sink.copy(f);
				t.release();
			}
		}

		map.release();
		return false;
	}

	final public static boolean _M_GetEnv(Sink sink, Term key, Term def)
	{
		final Context context = sink.context();

		key = Normalizer.normalize(context, key);

		java.lang.String value = System.getProperty(key.symbol());
		sink.literal(value == null ? "" : value);

		key.release();
		def.release();

		return false;
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
