/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.runtime.AppendableTerm.appendableTerm;
import static org.transscript.runtime.StringTerm.stringTerm;

import java.io.IOException;

import org.transscript.runtime.AppendableTerm;
import org.transscript.runtime.Context;
import org.transscript.runtime.StringTerm;

/**
 * Appendable external functions implementation
 * @author Lionel Villard
 */
public class AppendableExtern
{

	public static AppendableTerm AppendableAppend(Context context, AppendableTerm left, AppendableTerm right)
	{
		java.lang.Appendable uright = right.unbox();
		CharSequence cs = uright instanceof CharSequence ? (CharSequence) uright : uright.toString();

		try
		{
      // TODO: mutate only if reference count == 1
			return appendableTerm(left.unbox().append(cs));
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public static AppendableTerm StringToAppendable(Context context, StringTerm str)
	{
		return appendableTerm(new StringBuilder(str.unbox()));
	}

	public static StringTerm AppendableToString(Context context, AppendableTerm appendable)
	{
		return stringTerm(appendable.toString());
	}

}
