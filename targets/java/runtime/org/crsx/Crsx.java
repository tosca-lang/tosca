// Copyright (c) 2015 IBM Corporation.

package org.crsx;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.crsx.runtime.BufferSink;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.CrsxLexer;
import org.crsx.runtime.Normalizer;
import org.crsx.runtime.Sink;
import org.crsx.runtime.StringUtils;
import org.crsx.runtime.Term;

/**
 * CRSX command line.
 * 
 * @author Lionel Villard
 */
public class Crsx
{
	static HashMap<String, Consumer<Map<String, String>>> commands = new HashMap<>();
	static HashMap<String, Runnable> helps = new HashMap<>();

	static
	{
		addCommand("run", Crsx::run, Crsx::helpRun);
		addCommand("build", Crsx::build, Crsx::helpBuild);
	}

	static void addCommand(String name, Consumer<Map<String, String>> command, Runnable help)
	{
		commands.put(name, command);
		helps.put(name, help);
	}

	/**
	 * Prints out usage and exit.
	 */
	public static void printUsage()
	{
		System.out.println("Usage: java -jar <crsx.jar> <command> [<args>]");
		System.out.println("\nThe commands are:");
		System.out.println("  build         Build a crsx system.");
		System.out.println("  run           Run a crsx system.");
		System.out.println("\nFor additional help, type java -jar crsx4.jar command help.");
		System.exit(0);
	}

	public static void helpRun()
	{
		System.out.println("Usage: java -jar <crsx.jar> run [<args>]");
		System.out.println("\n<args> are:");
		System.out.println("  term=<term>               the input term");
		System.out.println("  rules=<filename>          the name of the crsx file to compile and run.");
		System.out.println("  output=<filename>         the name of the crsx file to compile and run.");
		System.out.println("  build-dir=<directory>     where to store the build files.");

		System.exit(0);
	}

	/* Build and run a crsx system */
	static void run(Map<String, String> env)
	{
		Map<String, String> buildEnv = new HashMap<>(env);

		String rules = env.get("rules");
		String buildir = env.get("build-dir");

		buildEnv.put("rules", rules);
		buildEnv.put("build-dir", buildir);
		build(buildEnv);

		// Compute output class name

		String output = targetJavaFilename(rules, buildir, false);
		File outputClassFile = new File(output);
		output = outputClassFile.getName().replace(".java", ""); // TODO package

		// For testing only
		output = "tests." + output;
		
		Map<String, Object> internal = new HashMap<>();

		// Compute classloader
		ClassLoader classLoader = classLoader(rules, buildir);
		if (classLoader != null)
			internal.put("classloader", classLoader);

		env.put("class", output);
		env.put("wrapper", "Main");

		rewrite(env, internal);
	}

	public static void helpBuild()
	{
		System.out.println("Usage: java -jar <crsx.jar> build [<args>]");
		System.out.println("\n<args> are:");
		System.out.println("  rules=<filename>          the name of the crsx file to compile.");
		System.out.println("  build-dir=<directory>     where to store the resulting files.");

		System.exit(0);
	}

	/* Build a crsx system */
	static void build(Map<String, String> env)
	{
		String rules = env.get("rules");
		if (rules == null)
			fatal("Missing rules filename. Add rules=<filename>", null);

		final File rulesFile = new File(rules);
		if (!rulesFile.exists())
			fatal("Input file not found", null);

		String dest = env.get("build-dir");
		String output = targetJavaFilename(rules, dest, true);

		Map<String, String> buildEnv = new HashMap<>(env);

		// Produce java source file.
		buildEnv.put("class", "org.crsx.compiler.Crsx");
		buildEnv.put("wrapper", "Compile");

		buildEnv.put("grammar", "org.crsx.parser.CrsxMetaParser"); // Temporary.
		buildEnv.put("grammar", "org.crsx.core.CoreMetaParser"); // Temporary.
		buildEnv.put("sink", "org.crsx.runtime.text.TextSink");

		buildEnv.put("term", "\"" + rules + "\"");
		buildEnv.put("output", output);

		// TODO: generic solution
		String javabasepackage = env.get("javabasepackage");
		if (javabasepackage != null)
			System.setProperty("javabasepackage", javabasepackage);
		
		rewrite(buildEnv, null);

		// Can compile now.
		compileJava(Arrays.asList(new File(output)));
	}

	/* 
	 * Get the name of the target java file
	 * @param input input crsx file
	 * @param dest target directory
	 * @param makeDirs whether to make destination directories.
	 */
	static String targetJavaFilename(String input, String dest, boolean makeDirs)
	{
		final File inputFile = new File(input);

		if (dest == null)
			dest = inputFile.getAbsoluteFile().getParentFile().getAbsolutePath();

		if (makeDirs)
		{
			File destFile = new File(dest);
			destFile.mkdirs();
		}

		// Compute output java filename
		String output = inputFile.getName().replace(".crsc", ".java").replace(".crs", ".java");
		output = Character.toUpperCase(output.charAt(0)) + output.substring(1); // First character must be upper case.
		output = dest + File.separator + output; // dest / output.java
		return output;
	}

	/* 
	 * Get the classloader needed to compile and run the given crsx file.
	 * 
	 * @param input input crsx file
	 * @param dest target directory
	 */
	static ClassLoader classLoader(String input, String dest)
	{
		if (dest == null)
		{
			final File inputFile = new File(input);
			dest = inputFile.getAbsoluteFile().getParentFile().getAbsolutePath();
		}

		final File destFile = new File(dest);

		try
		{
			return new URLClassLoader(new URL[]
				{destFile.getAbsoluteFile().toURI().toURL()});
		}
		catch (MalformedURLException e)
		{
			fatal("Invalid destination", e); // shouldn't occur anyway
			return null;
		}
	}

	/** Compile the list of java files */
	static void compileJava(List<File> filesToCompile)
	{
		List<String> optionList = new ArrayList<String>();
		optionList.addAll(Arrays.asList("-classpath", System.getProperty("java.class.path")));

		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

		StandardJavaFileManager stdFileManager = compiler.getStandardFileManager(null, null, null);
		Iterable<? extends JavaFileObject> fileObjects = stdFileManager.getJavaFileObjectsFromFiles(filesToCompile);

		CompilationTask task = compiler.getTask(null, stdFileManager, null, optionList, null, fileObjects);

		Boolean result = task.call();
		if (!result)
			System.exit(0);
	}

	/** 
	 * Load class or throw exception 
	 * @param loader 
	 */
	static Class<?> loadClass(String name, ClassLoader loader)
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

	/** Gets the init method or throw exception */
	static Method getInitMethod(Class<?> clss)
	{
		try
		{
			return clss.getMethod("init", Context.class);
		}
		catch (Exception e)
		{
			fatal("Error while initializing the CRSX system.", e);
			return null;
		}
	}

	/** 
	 * Copy all properties starting with the given prefix over to
	 * the given other property map, with the prefix trimmed off.
	 */
	static void copyPrefixedProps(String prefix, Map<String, String> from, Map<String, String> to)
	{
		from.forEach((key, value) -> {
			if (key.startsWith(prefix))
				to.put(key.substring(prefix.length()), value);
		});
	}

	/**
	 * Gets internal property value.
	 */
	@SuppressWarnings("unchecked")
	static <T> T getInternalProperty(Map<String, Object> internal, String name)
	{
		return internal == null ? null : (T) internal.get(name);
	}

	/** Print fatal error and exit. */
	static void fatal(String message, Exception e)
	{
		System.out.println(message);
		if (e != null)
			e.printStackTrace();
		System.exit(0);
	}

	/** Print warning */
	static void warning(String message)
	{
		System.out.println(message);
	}

	/**
	 * Generic rewriter extracting configuration from the given environment.
	 */
	static void rewrite(Map<String, String> env, Map<String, Object> internal)
	{
		Context context = new Context();

		setProperty(context, "verbose", env);

		// load compiled CRSX
		String name = env.get("class");

		if (name == null)
		{
			System.out.println("missing class option");
			printUsage();
		}

		ClassLoader loader = getInternalProperty(internal, "classloader");
		if (loader == null)
			loader = Crsx.class.getClassLoader();

		Class<?> clss = loadClass(name, loader);

		// Initialize system.
		Method init = getInitMethod(clss);
		try
		{
			init.invoke(null, context);
		}
		catch (Exception e)
		{
			System.out.println("Error while initializing the CRSX system.");
			e.printStackTrace();
			System.exit(0);
		}

		// Wrap input term (if specified)
		ConstructionDescriptor wrapper = null;
		String wrapperName = env.get("wrapper");
		if (wrapperName != null)
		{
			wrapper = context.lookupDescriptor(wrapperName);
			if (wrapper == null)
				System.out.println("Warning: wrapper " + wrapperName + " not found.");

		}

		BufferSink buffer = context.makeBuffer();

		if (wrapper != null)
			buffer.start(wrapper);

		// Parse term (if any)
		String inputTerm = env.get("term");
		if (inputTerm != null)
		{
			inputTerm = inputTerm.trim();
			if (inputTerm.length() > 0)
			{
				char c = inputTerm.charAt(0);
				if (c == '"')
				{
					buffer.literal(StringUtils.unquoteJava(inputTerm));
				}
				else if (Character.isDigit(c) || c == '-' || c == '+')
				{
					buffer.literal(inputTerm);
				}
				else
				{
					try (Reader reader = new StringReader(inputTerm))
					{
						new CrsxLexer(reader).scanTerm(buffer, reader);
					}
					catch (IOException e)
					{
						printUsage();
					}
				}
			}
		}
		else
		{
			// Parse input (if any)
			String input = env.get("input");
			if (input != null)
			{
				// TODO: parser categories
				try (Reader reader = new BufferedReader(new FileReader(input)))
				{
					new CrsxLexer(reader).scanTerm(buffer, reader);
				}
				catch (IOException e)
				{
					printUsage();
				}
			}
		}

		if (wrapper != null)
			buffer.end();

		// Add grammars
		String grammars = env.get("grammar");
		if (grammars != null)
		{
			grammars = grammars.trim();
			// Support crsx3 format
			if (grammars.charAt(0) == '(')
				grammars = grammars.replace("(", "").replace(")", "").replace("\'", "").replace(';', ',');
			String[] array = grammars.split(",");
			for (int i = 0; i < array.length; i++)
			{
				context.registerParser(array[i]);
			}
		}

		// Normalize!!
		Term top = buffer.term();
		Term result = Normalizer.normalize(context, top);

		// initialize output
		String outputEntry = env.get("output");
		Appendable output = System.out;

		if (outputEntry != null)
		{
			try
			{
				output = new FileWriter(outputEntry);
			}
			catch (IOException e)
			{
				System.out.println("Error while opening the output.");
				e.printStackTrace();
				System.exit(0);
			}
		}

		String sinkName = env.get("sink");
		if (sinkName != null)
		{
			@SuppressWarnings("unchecked")
			Class<? extends Sink> sinkClss = (Class<? extends Sink>) loadClass(sinkName, loader);

			try
			{
				Sink sink = sinkClss.getConstructor(Context.class, Appendable.class).newInstance(context, output);
				result.copy(sink, true);
			}
			catch (Exception e)
			{
				System.out.println("Error while initializing the sink.");
				e.printStackTrace();
				System.exit(0);
			}
		}
		else
		{
			try
			{
				output.append(result.toString());
			}
			catch (IOException e)
			{
				System.out.println("Error while appending the result to the output.");
				e.printStackTrace();
				System.exit(0);
			}
		}

		if (output instanceof Closeable && output != System.out)
			try
			{
				((Closeable) output).close();
			}
			catch (IOException e)
			{
				System.out.println("Error while closing the output.");
				e.printStackTrace();
				System.exit(0);
			}
	}

	/** Set context field value to what the corresponding value in the environment */
	static void setProperty(Context context, String name, Map<String, String> env)
	{
		String value = env.get(name);
		if (value != null)
		{
			try
			{
				Field field = context.getClass().getField(name);
				Class<?> type = field.getType();
				if (type == int.class)
				{
					try
					{
						int intvalue = Integer.parseInt(value);

						field.set(context, intvalue);
					}
					catch (NumberFormatException e)
					{
						warning("Expected a integer for " + name + ". Got: " + value);
					}
				}

			}
			catch (Exception e)
			{
				fatal("Internal error", e);
			}
		}
	}

	public static void main(String[] args)
	{
		if (args.length == 0)
			printUsage();

		String command = args[0];
		Consumer<Map<String, String>> fun = commands.get(command);
		if (fun == null)
			printUsage();

		Map<String, String> environment = new HashMap<>(System.getenv());

		// Option arguments.
		int first; // first non-option
		for (first = 1; first < args.length; ++first)
		{
			// Record option.
			String option = args[first];
			while (option.startsWith("-"))
				option = option.substring(1);

			String value = "1";
			int valueIndex = option.indexOf('=');
			if (valueIndex >= 0)
			{
				value = option.substring(valueIndex + 1);
				option = option.substring(0, valueIndex);
				environment.put(option, value);
			}
			else if (option.startsWith("no-"))
			{
				option = option.substring("no-".length());
				environment.remove(option);
			}
			else
			{
				environment.put(option, value);
			}
		}

		if (environment.containsKey("help"))
			helps.get(command).run();
		else
			fun.accept(environment);
	}

}
