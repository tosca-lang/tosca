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
import java.util.Map;

import org.transscript.compiler.text.Printer;
import org.transscript.compiler.text.Text4.Text4_xtext_xsort;
import org.transscript.runtime.Context;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.Term;

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

	/** Print term to given output */
	public static void printTerm(Context context, String category, Term result, String outputName, Appendable output)
	{
		try
		{
			if (result instanceof Text4_xtext_xsort && (category == null || category.equals("text")))
			{
				result = Printer.PrintText(context, (Text4_xtext_xsort) result);
				result = Normalizer.force(context, result);
			}

			new TermPrinter().print(result, output);
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
}
