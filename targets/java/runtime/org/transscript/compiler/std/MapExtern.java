/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.runtime.MapTerm;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.Sink;
import org.transscript.runtime.Term;
import org.transscript.runtime.VariableUse;

public class MapExtern
{
	
//
//	public static  <a extends org.transscript.runtime.v2.Term, b extends org.transscript.runtime.v2.Term> org.transscript.runtime.v2.MapTerm MapPut(Context context, org.transscript.runtime.v2.MapTerm x_29, a x_33, b x_38)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static <a extends org.transscript.runtime.v2.Term, b extends org.transscript.runtime.v2.Term> Option<b> MapGetVar(Context context, org.transscript.runtime.v2.MapTerm x_56, a x_60)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static List MapKeys(Context context, org.transscript.runtime.v2.MapTerm x_77)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static org.transscript.runtime.v2.MapTerm MapNew(Context context)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static List MapValues(Context context, org.transscript.runtime.v2.MapTerm x_102)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//
	
	
	final public static boolean _M_MapNew(Sink sink)
	{
		sink.copy(new MapTerm());
		return true;
	}

	final public static boolean _M_MapGet(Sink sink, Term map, Term key)
	{
		map = Normalizer.normalize(sink.context(), map);
		key = Normalizer.normalize(sink.context(), key);
		if (map instanceof MapTerm)
		{
			Term value = ((MapTerm) map).lookup(key);
			if (value == null)
				sink.start(Core._M_NONE).end();
			else
				sink.start(Core._M_SOME).copy(value.ref()).end();

			return true;
		}

		return Normalizer.thunk(sink, Map._M_MapGet, map, key);
	}

	final public static boolean _M_MapPut(Sink sink, Term map, Term key, Term value)
	{
		map = Normalizer.normalize(sink.context(), map);
		key = Normalizer.normalize(sink.context(), key);
		if (map instanceof MapTerm)
		{
			if (map.refcount() > 1)
				map = ((MapTerm) map).extend();

			((MapTerm) map).addProperty(key, value);

			sink.copy(map);
			return true;
		}
		return Normalizer.thunk(sink, Map._M_MapPut, map, key, value);
	}

	final public static boolean _M_MapGetVar(Sink sink, Term map, Term key)
	{
		map = Normalizer.normalize(sink.context(), map);
		key = Normalizer.normalize(sink.context(), key);
		if (map instanceof MapTerm)
		{
			Term value = ((MapTerm) map).lookup(((VariableUse) key).variable());
			if (value == null)
				sink.start(Core._M_NONE).end();
			else
				sink.start(Core._M_SOME).copy(value.ref()).end();
			return true;
		}
		return Normalizer.thunk(sink, Map._M_MapGetVar, map, key);
	}

	final public static boolean _M_MapKeys(Sink sink, Term map)
	{
		map = Normalizer.normalize(sink.context(), map);
		return ((MapTerm) map).sendKeys(sink);
	}

	final public static boolean _M_MapValues(Sink sink, Term map)
	{
		map = Normalizer.normalize(sink.context(), map);
		return ((MapTerm) map).sendValues(sink);
	}

}
