/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.runtime.Context;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.StringUtils;

/**
 * 
 * @author Lionel Villard
 *
 */
public class LanguageExtern
{
	/**
	 * 
	 * @param context
	 * @param str
	 * @return
	 */
	public static StringTerm ToJavaClassName(Context context, StringTerm str)
	{
		StringTerm estr = str.eval(context);
		str.release();

		if (estr.data())
		{
			StringTerm result = StringTerm.stringTerm(StringUtils.mangle2(estr.unbox()));
			estr.release();
			return result;
		}
		return StringTerm.lazyStringTerm(c -> ToJavaClassName(c, estr));
	}

	/**
	 * 
	 * @param context
	 * @param str
	 * @return
	 */
	public static StringTerm ToJavaTypeParameter(Context context, StringTerm str)
	{
		return ToJavaClassName(context, str);
	}

	/**
	 * 
	 * @param context
	 * @param str
	 * @return
	 */
	public static StringTerm ToJavaMethodName(Context context, StringTerm str)
	{
		return ToJavaClassName(context, str);
	}

}
