/* Copyright (c) 2016 IBM Corporation. */

package org.crsx.compiler.std;

import org.crsx.runtime.MapTerm;
import org.crsx.runtime.Normalizer;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
import org.crsx.runtime.VariableUse;

public class MapExtern
{

	final public static boolean _M_MapNew(Sink sink)
	{
		sink.copy(new MapTerm());
		return true;
	}

	final public static boolean _M_MapGet(Sink sink, Term map, Term key)
	{
		map = Normalizer.normalize(sink.context(), map);
		key = Normalizer.normalize(sink.context(), key);
		Term value = ((MapTerm) map).lookup(key);
		if (value == null)
			sink.start(Core._M_NONE).end();
		else
			sink.start(Core._M_SOME).copy(value.ref()).end();

		return true;
	}

	final public static boolean _M_MapPut(Sink sink, Term map, Term key, Term value)
	{
		map = Normalizer.normalize(sink.context(), map);
		key = Normalizer.normalize(sink.context(), key);
		if (map.refcount() > 1)
			map = ((MapTerm) map).extend();

		((MapTerm) map).addProperty(key, value);

		sink.copy(map);
		return true;
	}

	final public static boolean _M_MapGetVar(Sink sink, Term map, Term key)
	{
		map = Normalizer.normalize(sink.context(), map);
		key = Normalizer.normalize(sink.context(), key);
		Term value = ((MapTerm) map).lookup(((VariableUse) key).variable());
		if (value == null)
			sink.start(Core._M_NONE).end();
		else
			sink.start(Core._M_SOME).copy(value.ref()).end();
		return true;
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
