// Copyright (c) 2016 IBM Corporation.

package org.transscript.tool;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.transscript.compiler.core.Core;
import org.transscript.compiler.core.Core.Core_csort_sort;
import org.transscript.compiler.core.Core.Core_cterm_sort;
import org.transscript.compiler.parser.TransScript;
import org.transscript.compiler.parser.TransScript.TransScript_term_sort;
import org.transscript.compiler.std.Listdef;
import org.transscript.compiler.std.text.Printer;
import org.transscript.compiler.std.text.Text4.Text4_text_sort;
import org.transscript.runtime.Context;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.utils.StringUtils;

/**
 * Collection of utility methods 
 * 
 * @author Lionel Villard
 */
public class Utils
{

	/** Save term to file of the given name */
	public static void saveTerm(Context context, String category, Term result, String filename)
	{
		try (Writer writer = new FileWriter(filename))
		{
			printTerm(context, category, result, filename, writer);
		}
		catch (IOException e)
		{
			fatal("Error while saving term to file " + filename, e);
		}
	}

	/** print term to console. Try using known serializer */
	public static void printTerm(Term term)
	{
		printTerm(new Context(), null, term, "sysout", System.out);
	}

	/** 
	 * Print term to given output 
	 * @param term to print. Reference is consumed
	 */
	public static void printTerm(Context context, String category, Term term, String outputName, Appendable output)
	{
		try
		{
			category = category == null ? "" : category;
			if (term instanceof Text4_text_sort && (category.equals("") || category.equals("text")))
			{
				term = Printer.PrintText(context, (Text4_text_sort) term);
				term = Normalizer.force(context, term);
				TermPrinter.print(term, output);
			}
			else if (term instanceof Core_cterm_sort && (category.equals("") || category.equals("cterm")))
			{
				printTerm(context, "text", Core.Core_Print_cterm(context, (Core_cterm_sort) term), outputName, output);
			}
			else if (term instanceof Core_csort_sort && (category.equals("") || category.equals("csort")))
			{
				printTerm(context, "text", Core.Core_Print_csort(context, (Core_csort_sort) term), outputName, output);
			}
			else if (term instanceof TransScript_term_sort && (category.equals("") || category.equals("term")))
			{
				printTerm(context, "text", TransScript.TransScript_Print_term(context, (TransScript_term_sort) term), outputName, output);
			}
			else
				TermPrinter.print(term, output);
		}
		catch (IOException e)
		{
			fatal("Error while writing to the output " + outputName, e);
		}
	}

	/** Print fatal error and exit. */
	public static <T> T fatal(String message, Exception e)
	{
		System.out.println(message);
		if (e != null && System.getProperty("stacktrace") != null)
			e.printStackTrace();
		System.exit(0);
		return (T) null;
	}

	/** Print warning */
	public static void warning(String message)
	{
		System.out.println(message);
	}

	/** Get property as integer value */
	public static int GetIntProperty(Map<String, String> env, String name, int defaul)
	{
		String value = env.get(name);
		if (value != null)
		{
			try
			{
				return Integer.parseInt(value);
			}
			catch (NumberFormatException e)
			{
				warning("Expected a integer for " + name + ". Got: " + value);
			}

		}
		return defaul;
	}

	/** 
	 * Load class or throw exception 
	 * @param loader 
	 */
	public static Class<?> loadClass(String name, ClassLoader loader)
	{
		try
		{
			return loader.loadClass(name);
		}
		catch (ClassNotFoundException e)
		{
			fatal("Class " + name + " not found.", e);
			return null;
		}
	}

	/** 
	 * Gets the given method or throw exception.  
	 * @throws NoSuchMethodException 
	 */
	public static Method getMethod(Class<?> clss, String name, Class<?>... params)
	{
		try
		{
			return clss.getMethod(name, params);
		}
		catch (NoSuchMethodException e)
		{
			fatal("Method " + name + " does not exist", e);
			return null;
		}
	}

	/** Cached templates */
	private static String gradleBuildTemplate;
	private static String settingsTemplate;

	/**
	 * @return the content on build.gradle.template
	 */
	public static String getCppGradleTemplate(String root)
	{
		if (gradleBuildTemplate == null)
			gradleBuildTemplate = loadFileContent(root, "targets/cpp/resources/build.gradle.template");
		return gradleBuildTemplate;
	}

	/**
	 * @return the content on settings.gradle.template
	 */
	public static String getCppSettingsGradleTemplate(String root)
	{
		if (settingsTemplate == null)
			settingsTemplate = loadFileContent(root, "targets/cpp/resources/settings.gradle.template");
		return settingsTemplate;
	}

	/** Load file content helper */
	public static String loadFileContent(String basedir, String filename)
	{
		Path filePath = Paths.get(basedir, filename);
		try
		{
			byte[] content = Files.readAllBytes(filePath);
			return new String(content, "UTF-8");
		}
		catch (IOException e)
		{
			fatal("Internal error: error while reading " + filename, e);
			return null;
		}
	}

	/** Load resource helper */
	public static String loadResource(String name)
	{
		URL resource = Utils.class.getClassLoader().getResource(name);
		if (resource == null)
			fatal("Internal error: missing " + name, null);

		try
		{
			byte[] content = Files.readAllBytes(Paths.get(resource.toURI()));
			return new String(content, "UTF-8");
		}
		catch (IOException | URISyntaxException e)
		{
			fatal("Internal error: error while reading " + name, e);
			return null;
		}
	}

	/** Gets file name base name */
	public static String getBaseName(String filename)
	{
		String base = new File(filename).getName();
		int idx = base.indexOf(".");
		return idx == -1 ? base : base.substring(0, idx);

	}

	/** Copy file */
	public static void copyFile(Path from, Path to)
	{
		try
		{
			to.getParent().toFile().mkdirs();
			Files.copy(from, to);
		}
		catch (FileAlreadyExistsException e)
		{}
		catch (IOException e)
		{
			fatal("An error occured while writing " + to.toString(), e);
			return;
		}
	}

	/** Execute command */
	public static int exec(String pwd, boolean quiet, String... command)
	{
		try
		{
			ProcessBuilder builder = new ProcessBuilder(command);
			builder = builder.directory(new File(pwd));
			if (!quiet)
				builder = builder.inheritIO();
			Process proc = builder.start();
			return proc.waitFor();
		}
		catch (IOException | InterruptedException e)
		{
			fatal("An error occured while running " + String.join(" ", command), e);
			return -1;
		}

	}

	/**
	 * Get the absolute name of the target java file
	 * The file name is of the form {dest}/{package}/{subpackage}/{input}.java
	 *  
	 * where {subpackage} is a function of {input} and {mainurl}
	 *  
	 * @param input Tosca file
	 * @param dest target directory
	 * @param pkg
	 * @param makeDirs whether to make destination directories.
	 */
	public static String targetJavaFilename(String input, String dest, String mainurl, String pkg, boolean makeDirs)
	{
		Path inputPath = Paths.get(input);

		// Offset destination considering package and subpackage
		if (pkg != null)
			dest += File.separator + pkg.replace('.', File.separatorChar);

		String subdir = relativePath(input, mainurl);
		dest = subdir.trim().equals("") ? dest : dest + File.separator + subdir;

		if (makeDirs)
		{
			File destFile = new File(dest);
			destFile.mkdirs();
		}

		// Compute output java filename
		String output = inputPath.getFileName().toString().replace(".crsc", "").replace(".crs4", "").replace(
				".tsc", "");
		
		output = StringUtils.mangle(Character.toUpperCase(output.charAt(0)) + output.substring(1)); // First character must be upper case.
		output = dest + File.separator + output + ".java"; // dest / output.java
		return output;
	}

	/** 
	 * Get the absolute name of the target cpp file
	 * @param input Tosca file
	 * @param dest target directory
	 * @param makeDirs whether to make destination directories.
	 * @param header whether to get the header target file name.
	 */
	public static String targetCppFilename(String input, String dest, boolean makeDirs, boolean header)
	{
		final File inputFile = new File(input);

		dest += File.separator + "src";

		if (makeDirs)
		{
			File destFile = new File(dest);
			destFile.mkdirs();
		}

		String ext = header ? ".h" : ".cpp";

		// Compute output java filename
		String output = StringUtils.mangle(inputFile.getName().replace(".crs4", "").replace(".tsc", ""));

		output = dest + File.separator + output + ext; // dest / src / output.cpp
		return output;
	}

	/**
	 * Compute sub directory of given input, relative to main module.
	 * @param input
	 * @param mainurl
	 * @return a relative path
	 */
	public static String relativePath(String input, String mainurl)
	{
		Path inputPath = Paths.get(input);
		Path rootPath = Paths.get(mainurl);

		Path relativize = rootPath.getParent().relativize(inputPath.getParent());
		return relativize.toString();
	}

	/**
	 * Gets internal typed property value.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getInternalProperty(Map<String, Object> internal, String name)
	{
		return internal == null ? null : (T) internal.get(name);
	}

	/** Converts list of StringTerm to Java list of string. */
	public static List<String> toJava(Context context, Listdef.List<StringTerm> list)
	{
		ArrayList<String> result = new ArrayList<>();
		list = Term.force(context, list);
		Listdef._Cons<StringTerm> cons = Term.force(context, list).asCons(context);

		while (cons != null)
		{
			result.add(cons.getField1(context, true).unbox());
			cons = cons.getField2(context, true).asCons(context);

		}
		return result;
	}

}
