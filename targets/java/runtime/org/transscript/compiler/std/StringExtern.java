/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.compiler.std.Core.FALSE;
import static org.transscript.compiler.std.Core.TRUE;
import static org.transscript.runtime.StringTerm.stringTerm;
import static org.transscript.runtime.DoubleTerm.doubleTerm;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.transscript.compiler.parser.TransScript.TransScript_xterm_xsort;
import org.transscript.compiler.std.Core.Bool;
import org.transscript.runtime.BufferSink;
import org.transscript.runtime.Context;
import org.transscript.runtime.DoubleTerm;
import org.transscript.runtime.Parser;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.StringUtils;
import org.transscript.runtime.Term;
import org.transscript.runtime.Functions.ThunkMaker;

/**
 * String standard library external functions.
 * 
 * @author Lionel Villard
 */
public class StringExtern
{

	public static StringTerm Rescape(Context context, StringTerm x_634)
	{
		throw new RuntimeException();
	}

	public static StringTerm AfterFirst(Context context, StringTerm str, StringTerm first)
	{
		StringTerm result;
		int index = str.unbox().indexOf(first.unbox());
		if (index == -1)
			result = stringTerm("");
		else
			result = stringTerm(str.unbox().substring(index + first.unbox().length()));

		str.release();
		first.release();
		return result;
	}

	public static StringTerm Mangle(Context context, StringTerm x_661)
	{
		throw new RuntimeException();
	}

	public static Bool StartsWith(Context context, StringTerm x_679, StringTerm x_683)
	{
		throw new RuntimeException();
	}

	public static <a extends Term> a ParseText(Context context, ThunkMaker<a> tma, StringTerm x_695, StringTerm x_700)
	{
		throw new RuntimeException();
	}

	/**
	 * 
	 * @param context
	 * @param str
	 * @param first
	 * @return
	 */
	public static StringTerm BeforeFirst(Context context, StringTerm str, StringTerm first)
	{
		StringTerm result;
		int index = str.unbox().indexOf(first.unbox());
		if (index == -1)
			result = stringTerm("");
		else
			result = stringTerm(str.unbox().substring(0, index));

		str.release();
		first.release();
		return result;
	}

	/**
	 * 
	 * @param context
	 * @param category
	 * @param filename
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <a extends Term> a ParseResource(Context context, ThunkMaker<a> tma, StringTerm category, StringTerm filename)
	{
		if (!category.data() || !filename.data())
			throw new RuntimeException("Invalid argument in EndsWith");

		Parser parser = context.getParser(category.unbox(), false);
		if (parser == null)
			throw new RuntimeException("Fatal error: no parser found for category " + category);

		BufferSink buffer = context.makeBuffer();
		try
		{
			parser.parse(buffer, category.unbox(), new FileReader(filename.unbox()), null, 0, 0, null);
		}
		catch (FileNotFoundException e)
		{
			throw new RuntimeException("Fatal error: file not found " + filename);
		}
		finally
		{
			category.release();
			filename.release();
		}

		Term result = buffer.term();

		return (a) result;
	}

	/**
	 * 
	 * @param context
	 * @param str
	 * @return
	 */
	public static StringTerm UpCase(Context context, StringTerm str)
	{
		StringTerm result = stringTerm(str.unbox().toUpperCase());
		str.release();
		return result;
	}

	/**
	 * 
	 * @param context
	 * @param str
	 * @return
	 */
	public static StringTerm DownCase(Context context, StringTerm str)
	{
		StringTerm result = stringTerm(str.unbox().toLowerCase());
		str.release();
		return result;
	}

	/**
	 * 
	 * @param context
	 * @param str
	 * @param start
	 * @param end
	 * @return
	 */
	public static StringTerm Substring(Context context, StringTerm str, DoubleTerm start, DoubleTerm end)
	{
		java.lang.String pre = str.unbox();
		int s = (int) start.unbox();
		int e = (int) (end == null ? pre.length() : end.unbox());

		StringTerm result = stringTerm(s < e ? pre.substring(s, e) : "");

		str.release();
		start.release();
		if (end != null)
			end.release();
		return result;
	}

	/**
	 * 
	 * @param context
	 * @param str
	 * @return
	 */
	public static StringTerm Escape(Context context, StringTerm str)
	{
		StringTerm result = stringTerm(StringUtils.quoteJava(str.unbox()));
		str.release();
		return result;
	}

	public static StringTerm Replace(Context context, StringTerm x_1341, StringTerm x_1346, StringTerm x_1351)
	{
		throw new RuntimeException();
	}

	/**
	 * 
	 * @param context
	 * @param str
	 * @return
	 */
	public static StringTerm Trim(Context context, StringTerm str)
	{
		StringTerm result = stringTerm(str.unbox().trim());
		str.release();
		return result;
	}

	/**
	 * 
	 * @param context
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static StringTerm ConcatString(Context context, StringTerm str1, StringTerm str2)
	{
		StringTerm result = stringTerm(str1.unbox() + str2.unbox());
		str1.release();
		str2.release();
		return result;
	}


	public static <a extends Term> a ParseTerm(Context context, ThunkMaker<a> tma, StringTerm x_2730)
	{
		throw new RuntimeException();
	}

	public static DoubleTerm Length(Context context, StringTerm str)
	{
		DoubleTerm result = doubleTerm(str.unbox().length());

		str.release();
		return result;
	}

	/**
	 * 
	 * @param context
	 * @param num
	 * @return
	 */
	public static StringTerm FormatNumber(Context context, DoubleTerm num)
	{
		DoubleTerm evalnum = num.eval(context);
		if (evalnum.data())
		{
			
			// FIXME
			StringTerm result = stringTerm(Integer.toString((int) evalnum.unbox()));
			evalnum.release();

			return result;

		}
		return StringTerm.lazyStringTerm(c -> FormatNumber(c, evalnum));
	}

	/**
	 * 
	 * @param context
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static Bool StringEqual(Context context, StringTerm str1, StringTerm str2)
	{
		final boolean result = str1.unbox().equals(str2.unbox());
		str1.release();
		str2.release();
		return result ? TRUE(context) : FALSE(context);
	}

	public static Bool Contains(Context context, StringTerm string, StringTerm search)
	{
		string.eval(context).release();
		search.eval(context).release();

		if (string.data() && search.data())
		{
			final boolean result = string.unbox().contains(search.unbox());
			string.release();
			search.release();
			return result ? TRUE(context) : FALSE(context);
		}

		return Core.lazyBool(c -> Contains(c, string, search));
	}

	/**
	 * 
	 * @param context
	 * @param string
	 * @param suffix
	 * @return
	 */
	public static Bool EndsWith(Context context, StringTerm string, StringTerm suffix)
	{
		if (!string.data() || !suffix.data())
			throw new RuntimeException("Invalid argument in EndsWith");

		final Bool b = string.unbox().endsWith(suffix.unbox()) ? TRUE(context) : FALSE(context);

		string.release();
		suffix.release();
		return b;
	}

	public static TransScript_xterm_xsort ParseToMetaTerm(Context context, StringTerm x_1280, StringTerm x_1285)
	{
		throw new RuntimeException();
	}

}
