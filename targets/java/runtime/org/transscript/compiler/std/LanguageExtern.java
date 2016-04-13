/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.runtime.Normalizer;
import org.transscript.runtime.Sink;
import org.transscript.runtime.StringUtils;
import org.transscript.runtime.Term;

public class LanguageExtern
{

	final public static boolean _M_ToJavaClassName(Sink sink, Term str)
	{
		str = Normalizer.normalize(sink.context(), str);
		sink.literal(StringUtils.mangle2(str.symbol()));
		return true;
	}

	final public static boolean _M_ToJavaTypeParameter(Sink sink, Term str)
	{
		str = Normalizer.normalize(sink.context(), str);
		sink.literal(StringUtils.mangle2(str.symbol()));
		return true;
	}

	final public static boolean _M_ToJavaMethodName(Sink sink, Term str)
	{
		str = Normalizer.normalize(sink.context(), str);
		sink.literal(StringUtils.mangle2(str.symbol()));
		return true;
	}

}
