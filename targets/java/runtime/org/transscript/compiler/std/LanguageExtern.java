/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.runtime.Term.force;
import static org.transscript.runtime.StringTerm.stringTerm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.transscript.runtime.BufferSink;
import org.transscript.runtime.Context;
import org.transscript.runtime.Functions.ThunkMaker;
import org.transscript.runtime.Parser;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.utils.Scoping;
import org.transscript.runtime.utils.StringUtils;
import org.transscript.tool.Utils;

/**
 * Utility function related to programming languages
 * @author Lionel Villard
  */
public class LanguageExtern
{

	/**
	 * Parse program stored in file of given name, using the given language category.
	 * @param context
	 * @param category
	 * @param filename
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <a extends Term> a ParseResource(Context context, ThunkMaker<a> tma, StringTerm category, StringTerm filename)
	{
		StringTerm ecategory = force(context, category);
		StringTerm efilename = force(context, filename);
		//System.out.println(efilename);
		Parser parser = context.getParser(ecategory.unbox(), false);
		if (parser == null)
			throw new RuntimeException("Fatal error: no parser found for category " + category);

		BufferSink buffer = context.makeBuffer();
		try (Reader reader = new FileReader(efilename.unbox()))
		{
			parser.parse(buffer, ecategory.unbox(), reader, null, 0, 0, new Scoping(), new Scoping());
		}
		catch (FileNotFoundException e)
		{
			throw new RuntimeException("Fatal error: file not found " + efilename, e);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			ecategory.release();
			efilename.release();
		}

		Term result = buffer.term();
		return (a) result;
	}

	/**
	 * Save term to file of given name, using the serializer identified by the  given language category
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param category
	 * @param filename
	 * @param term
	 * @param result
	 * @return result.
	 */
	public static <a extends Term, b extends Term> b SaveResource(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, StringTerm category, StringTerm filename, a term, b result)
	{
		StringTerm ecategory = force(context, category);
		StringTerm efilename = force(context, filename);
		a eterm = force(context, term);

		Utils.saveTerm(context, ecategory.unbox(), eterm, efilename.unbox());

		ecategory.release();
		efilename.release();

		return result;
	}

	/**
	 * Print term.
	 * @param context
	 * @param tma
	 * @param category
	 * @param term
	 * @return the string representation of the printed term.
	 */
	public static <a extends Term> StringTerm PrintTerm(Context context, ThunkMaker<a> tma, StringTerm category, a term)
	{
		StringTerm ecategory = force(context, category);

		StringBuilder builder = new StringBuilder();
		Utils.printTerm(context, ecategory.unbox(), term, "<stringbuffer>", builder);

		ecategory.release();

		return stringTerm(builder.toString());
	}

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
			StringTerm result = StringTerm.stringTerm(StringUtils.mangle(estr.unbox()));
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
