/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import static org.transscript.runtime.Term.force;
import static org.transscript.runtime.StringTerm.stringTerm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.transscript.compiler.std.Core.Bool;
import org.transscript.runtime.BufferSink;
import org.transscript.runtime.Context;
import org.transscript.runtime.DoubleTerm;
import org.transscript.runtime.Functions.Closure0;
import org.transscript.runtime.Functions.ThunkMaker;
import org.transscript.runtime.Parser;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.MapTerm;
import org.transscript.runtime.utils.Scoping;
import org.transscript.runtime.utils.StringUtils;
import org.transscript.tool.Utils;

/**
 * Utility function related to programming languages
 * 
 * @author Lionel Villard
 */
public class LanguageExtern {

	/**
	 * Parse program stored in file of given name, using the given language
	 * category.
	 * 
	 * @param context
	 * @param category
	 * @param filename
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <a extends Term> a ParseResource(Context context, ThunkMaker<a> tma, StringTerm category,
			StringTerm filename) {
		StringTerm ecategory = force(context, category);
		StringTerm efilename = force(context, filename);
		// System.out.println(efilename);
		Parser parser = context.getParser(ecategory.unbox(), false);
		if (parser == null)
			throw new RuntimeException("Fatal error: no parser found for category " + category);

		if (efilename.unbox().endsWith("fix"))
			parser.enableLoc();
		BufferSink buffer = context.makeBuffer();
		try (Reader reader = new FileReader(efilename.unbox())) {
			parser.parse(buffer, ecategory.unbox(), reader, null, 0, 0, new Scoping(), new Scoping());
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal error: file not found " + efilename, e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			ecategory.release();
			efilename.release();
		}

		Term result = buffer.term();
		return (a) result;
	}

	/**
	 * Save term to file of given name, using the serializer identified by the
	 * given language category
	 * 
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param category
	 * @param filename
	 * @param result
	 * @return result.
	 */
	public static <a extends Term, b extends Term> b Save(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb,
			StringTerm category, StringTerm filename, a value, MapTerm<StringTerm, StringTerm> props,
			Closure0<b> result) {
		Utils.saveTerm(context, category.unbox(), value, filename.unbox());

		category.release();
		filename.release();

		return result.eval(context);
	}

	/**
	 * Print term.
	 * 
	 * @param context
	 * @param tma
	 * @param category
	 * @param term
	 * @return the string representation of the printed term.
	 */
	public static <a extends Term> StringTerm PrintTerm(Context context, ThunkMaker<a> tma, StringTerm category,
			a term) {
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
	public static StringTerm ToJavaClassName(Context context, StringTerm str) {
		StringTerm estr = str.eval(context);
		str.release();

		if (estr.data()) {
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
	public static StringTerm ToJavaTypeParameter(Context context, StringTerm str) {
		return ToJavaClassName(context, str);
	}

	/**
	 *
	 * @param context
	 * @param str
	 * @return
	 */
	public static StringTerm ToJavaMethodName(Context context, StringTerm str) {
		return ToJavaClassName(context, str);
	}

	@SuppressWarnings("unchecked")
	public static <a extends Term> a ParseText(Context context, ThunkMaker<a> tma, StringTerm category,
			StringTerm text) {
		Parser parser = context.getParser(category.unbox(), false);
		if (parser == null)
			throw new RuntimeException("Fatal error: no parser found for category " + category);

		BufferSink buffer = context.makeBuffer();
		try (Reader reader = new StringReader(text.unbox())) {
			parser.parse(buffer, category.unbox(), reader, null, 0, 0, new Scoping(), new Scoping());
		}  catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			category.release();
			text.release();
		}

		Term result = buffer.term();
		return (a) result;
	}

	/**
	 * @return the last time the given file located at the given location has
	 *         been modified
	 */
	public static DoubleTerm FileLastModified(Context context, StringTerm url) {
		File file = new File(url.unbox());
		return DoubleTerm.doubleTerm((double) file.lastModified());
	}

	/** @return TRUE if the two files are identical */
	public static Bool FileSame(Context context, StringTerm filename1, StringTerm filename2) {
		File file1 = new File(filename1.unbox());
		File file2 = new File(filename2.unbox());
		filename1.release();
		filename2.release();
		if (!file1.exists() || !file2.exists())
			return Core.FALSE(context);
		if (file1.length() != file2.length())
			return Core.FALSE(context);

		try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
				BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
			while (true) {
				java.lang.String line1 = reader1.readLine();
				java.lang.String line2 = reader2.readLine();

				if (line1 == null && line2 == null)
					return Core.TRUE(context);
				if (line1 == null || line2 == null)
					return Core.FALSE(context);
				if (line1 != line2)
					return Core.FALSE(context);
			}
		} catch (IOException e) {

		}
		return Core.FALSE(context);
	}

	public static Bool FileMoveTo(Context context, StringTerm src, StringTerm dst) {
		File file1 = new File(src.unbox());
		File file2 = new File(dst.unbox());
		Bool result = file1.renameTo(file2) ? Core.TRUE(context) : Core.FALSE(context);
		src.release();
		dst.release();
		return result;
	}

	public static Bool FileDelete(Context context, StringTerm filename) {
		File file = new File(filename.unbox());
		Bool result = file.delete() ? Core.TRUE(context) : Core.FALSE(context);
		filename.release();
		return result;
	}

	public static Bool FileExists(Context context, StringTerm filename) {
		File file = new File(filename.unbox());
		Bool result = file.exists() ? Core.TRUE(context) : Core.FALSE(context);
		filename.release();
		return result;
	}
}
