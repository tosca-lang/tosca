/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.runtime.Context;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.Sink;
import org.transscript.runtime.StringUtils;
import org.transscript.runtime.Term;
import org.transscript.runtime.v2.StringTerm;

public class LanguageExtern
{

	public static StringTerm ToJavaClassName(Context context, StringTerm x_19)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static StringTerm ToJavaTypeParameter(Context context, StringTerm x_30)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static StringTerm ToJavaMethodName(Context context, StringTerm x_41)
	{
		// TODO Auto-generated method stub
		return null;
	}

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
