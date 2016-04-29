/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.compiler.std.Core.FALSE;
import static org.transscript.compiler.std.Core.TRUE;
import static org.transscript.runtime.DoubleTerm.doubleTerm;
import static org.transscript.runtime.StringTerm.stringTerm;
import static org.transscript.runtime.Term.force;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.transscript.compiler.std.Core.Bool;
import org.transscript.runtime.BufferSink;
import org.transscript.runtime.Context;
import org.transscript.runtime.DoubleTerm;
import org.transscript.runtime.Functions.ThunkMaker;
import org.transscript.runtime.Parser;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.utils.Scoping;
import org.transscript.runtime.utils.StringUtils;

/**
 * String standard library external functions.
 * 
 * @author Lionel Villard
 */
public class StringExtern
{

	/**
	 * @param context
	 * @param string
	 * @param search
	 * @return TRUE if and only if the first given string contains the second given string
	 */
	public static Bool Contains(Context context, StringTerm string, StringTerm search)
	{
		string = force(context, string);
		search = force(context, search);

		final boolean result = string.unbox().contains(search.unbox());
		string.release();
		search.release();
		return result ? TRUE(context) : FALSE(context);
	}

	/**
	 * @param context
	 * @param str
	 * @return the length of the given string *
	 */
	public static DoubleTerm Length(Context context, StringTerm str)
	{
		str = force(context, str);
		DoubleTerm result = doubleTerm(str.unbox().length());
		str.release();
		return result;
	}

	/**
	 * Tests if the beginning of the given string starts with the specified prefix.
	 * @param context
	 * @param str
	 * @param prefix
	 * @return
	 */
	public static Bool StartsWith(Context context, StringTerm str, StringTerm prefix)
	{
		StringTerm estr = force(context, str);
		StringTerm eprefix = force(context, prefix);

		final Bool result = estr.unbox().startsWith(eprefix.unbox()) ? TRUE(context) : FALSE(context);
		estr.release();
		eprefix.release();
		return result;
	}

	/**
	 * Tests if the ending of the given string finishes with the specified suffix.
	 * @param context
	 * @param string
	 * @param suffix
	 * @return
	 */
	public static Bool EndsWith(Context context, StringTerm str, StringTerm suffix)
	{
		StringTerm estr = force(context, str);
		StringTerm esuffix = force(context, suffix);

		final Bool result = estr.unbox().endsWith(esuffix.unbox()) ? TRUE(context) : FALSE(context);

		estr.release();
		esuffix.release();
		return result;
	}

	/**
	 * @param context
	 * @param str1
	 * @param str2
	 * @return TRUE if and only if the given strings are equals.
	 */
	public static Bool StringEqual(Context context, StringTerm str1, StringTerm str2)
	{
		final StringTerm estr1 = force(context, str1);
		final StringTerm estr2 = force(context, str2);
		final Bool result = estr1.unbox().equals(estr2.unbox()) ? TRUE(context) : FALSE(context);
		estr1.release();
		estr2.release();
		return result;
	}

	/**
	 * @param context
	 * @param str
	 * @param first
	 * @return the string after the first occurrence of the given {@code first} string, or 
	 *         the empty string if there is no such occurrences
	 */
	public static StringTerm AfterFirst(Context context, StringTerm str, StringTerm first)
	{
		final StringTerm estr = force(context, str);
		final StringTerm efirst = force(context, first);

		StringTerm result;
		int index = estr.unbox().indexOf(efirst.unbox());
		if (index == -1)
			result = stringTerm("");
		else
			result = stringTerm(estr.unbox().substring(index + efirst.unbox().length()));

		estr.release();
		efirst.release();
		return result;
	}

	public static StringTerm Rescape(Context context, StringTerm x_634)
	{
		throw new RuntimeException();
	}

	public static StringTerm Mangle(Context context, StringTerm x_661)
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

	public static StringTerm Replace(Context context, StringTerm str, StringTerm old, StringTerm news)
	{
		StringTerm estr = Term.force(context, str);
		StringTerm eold = Term.force(context, old);
		StringTerm enew = Term.force(context, news);
		StringTerm result = stringTerm(estr.unbox().replace(eold.unbox(), enew.unbox()));
		estr.release();
		eold.release();
		enew.release();
		return result;
	}

	/**
	 * Trim leading and trailing spaces
	 * @param context
	 * @param str
	 * @return
	 */
	public static StringTerm Trim(Context context, StringTerm str)
	{
		StringTerm estr = Term.force(context, str);
		StringTerm result = stringTerm(estr.unbox().trim());
		estr.release();
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
		final StringTerm estr1 = force(context, str1);
		final StringTerm estr2 = force(context, str2);

		StringTerm result = stringTerm(estr1.unbox() + estr2.unbox());
		estr1.release();
		estr2.release();
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
		DoubleTerm evnum = force(context, num);

		// FIXME
		StringTerm result = stringTerm(Integer.toString((int) evnum.unbox()));
		evnum.release();

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
		try (Reader reader = new FileReader(filename.unbox()))
		{
			parser.parse(buffer, category.unbox(), reader, null, 0, 0, new Scoping(), new Scoping());
		}
		catch (FileNotFoundException e)
		{
			throw new RuntimeException("Fatal error: file not found " + filename, e);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			category.release();
			filename.release();
		}

		Term result = buffer.term();

		return (a) result;
	}

}
