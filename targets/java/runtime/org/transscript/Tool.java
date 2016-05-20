// Copyright (c) 2015 IBM Corporation.

package org.transscript;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
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

import org.transscript.compiler.parser.TransScript;
import org.transscript.parser.TransScriptMetaParser;
import org.transscript.runtime.BufferSink;
import org.transscript.runtime.Context;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.utils.Scoping;
import org.transscript.tool.ToolContext;
import org.transscript.tool.Utils;

/**
 * TransScript command line.
 * 
 * @author Lionel Villard
 */
public class Tool
{
	static HashMap<String, Consumer<Map<String, String>>> commands = new HashMap<>();
	static HashMap<String, Runnable> helps = new HashMap<>();

	static
	{
		addCommand("run", Tool::run, Tool::helpRun);
		addCommand("build", Tool::build, Tool::helpBuild);
		addCommand("test", Tool::test, Tool::helpTest);
		addCommand("parse", Tool::parse, Tool::helpParse);

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
		System.out.println("Usage: java -jar <tosca.jar> <command> [<args>]");
		System.out.println("\nThe commands are:");
		System.out.println("  build         Build a Tosca program");
		System.out.println("  run           Run a Tosca program. Build it if necessary");
		System.out.println("  test          Run the tests defined in the Tosca program");
		System.out.println("  parse         Parse a Tosca program");
		System.out.println("\nFor additional help, type java -jar tosca.jar command help.");
		System.exit(0);
	}

	/**
	 * Print common options
	 */
	static void helpCommon()
	{
		System.out.println("  rules=<filename>          the Tosca program filename. Cannot be used with option class");
		System.out.println(
				"  class=<classname>         the name of the compiled Tosca program to run. Cannot be used with option rules");
		System.out.println("  build-dir=<directory>     where to store the intermediate files. Default is current directory");
		System.out.println("  javabasepackage=<name>    Java base package name of generated Java files");
		System.out.println("  javapackage=<name>        Java sub package name of generated Java files");
		System.out.println("  parsers=<classnames>      Comma separated list of parsers classname");
		System.out.println("  cpp                       Set target language to C++");
		System.out.println("  java                      Set target language to Java (default)");
		System.out.println("  bootparserpath=<name>     where to look for builtin parsers. Only used for bootstrapping Tosca");
		System.out.println("  stacktrace                print Java stack trace when an error occur");

	}

	static void helpRun()
	{
		System.out.println("Usage: java -jar <tosca.jar> run [<args>]");
		System.out.println("Compile and run Tosca program");
		System.out.println("where <args> must be at least either rules or class");
		System.out.println("\n<args> are:");
		helpCommon();
		System.out.println("  main=<name>               the main method to execute. Default is Main");
		System.out.println("  arg=<value>               argument given to the main method. Can occur multiple times.");

		System.exit(0);
	}

	/** Build and run a Tosca system */
	static void run(Map<String, String> env)
	{
		if (env.containsKey("cpp"))
			runCpp(env);
		else
			runJava(env);
	}

	/** Build and run a Java Tosca system */
	static void runJava(Map<String, String> env)
	{
		String clazz = env.get("class");
		String rules = env.get("rules");
		ClassLoader classLoader = null;

		if (clazz == null && rules == null)
			helpRun();
		if (clazz != null && rules != null)
			helpRun();

		int result = 0;
		if (rules != null)
		{
			String buildir = env.get("build-dir");
			String javabasepackage = env.get("javabasepackage");
			String javapackage = env.get("javapackage");

			// Configure builder
			Map<String, String> buildEnv = new HashMap<>();

			buildEnv.put("rules", rules);
			buildEnv.put("build-dir", buildir);
			buildEnv.put("verbose", env.get("verbose"));
			if (javabasepackage != null)
				buildEnv.put("javabasepackage", javabasepackage);
			if (javapackage != null)
				buildEnv.put("javapackage", javapackage);

			result = build(buildEnv);

			clazz = targetClassFilename(rules, javabasepackage, javapackage);
			classLoader = classLoader(rules, buildir);
		}

		if (result != -1)
		{
			// Second: run
			Map<String, Object> runEnv = new HashMap<>();

			if (classLoader != null)
				runEnv.put("classloader", classLoader);

			env.put("class", clazz);
			rewrite(env, runEnv);
		}
	}

	/** Build and run a C++ Tosca system */
	private static void runCpp(Map<String, String> env)
	{
		String rules = env.get("rules");

		if (rules == null)
			helpRun();

		String buildir = env.get("build-dir");

		// Configure builder
		Map<String, String> buildEnv = new HashMap<>();

		buildEnv.put("rules", rules);
		buildEnv.put("build-dir", buildir);
		buildEnv.put("verbose", env.get("verbose"));
		buildEnv.put("cpp", "1");

		int result = build(buildEnv);

		if (result != -1)
		{
			String dest = resolveBuildDir(rules, buildir);
			String name = Utils.getBaseName(rules);

			String execdir = Paths.get(dest, "build", "exe", name).toString();

			Utils.exec(execdir, false, Paths.get(".", name).toString());
		}
	}

	public static void helpBuild()
	{
		System.out.println("Usage: java -jar <tosca.jar> build [<args>]");
		System.out.println("\n<args> are:");
		helpCommon();
		System.out.println("  only-source               only produce source file, no executable.");

		System.exit(0);
	}

	/* Build a Tosca program targeting multiple languages */
	static int build(Map<String, String> env)
	{
		// TODO: extract target language specific option in helper methods

		// Input rules to compile
		String rules = env.get("rules");
		if (rules == null)
			Utils.fatal("Missing rules filename. Add rules=<filename>", null);

		final File rulesFile = new File(rules);
		if (!rulesFile.exists())
			Utils.fatal("Input file not found: " + rules, null);

		String target = env.get("cpp") != null ? "cpp" : "java";

		// For java target get base package and sub package name.
		String javabasepackage = env.get("javabasepackage");
		String javapackage = env.get("javapackage");
		String dest = resolveBuildDir(rules, env.get("build-dir"));
		String output = target.equals("java")
				? targetJavaFilename(rules, dest, javabasepackage, javapackage, true)
				: targetCppFilename(rules, dest, true);

		String parsers = "org.transscript.core.CoreMetaParser,org.transscript.parser.TransScriptMetaParser,org.transscript.text.Text4MetaParser";
		if (env.get("parsers") != null)
			parsers += "," + env.get("parsers");

		Map<String, String> buildEnv = new HashMap<>(env);

		// First: Produce source file.

		buildEnv.put("class", "org.transscript.compiler.Crsx");
		buildEnv.put("main", "Compile");
		if (target.equals("cpp"))
		{
			System.setProperty("cpp", "1");
			System.setProperty("headerfile", output.replace(".cpp", ".h"));
		}

		// TODO: this shouldn't be needed.
		buildEnv.put("grammar", parsers); // Temporary.
		buildEnv.put("sink", "org.transscript.runtime.text.TextSink");
		buildEnv.put("arg", rules);
		buildEnv.put("output", output);

		if (javabasepackage != null)
			System.setProperty("javabasepackage", javabasepackage);
		if (javapackage != null)
			System.setProperty("javapackage", javapackage);

		if (env.get("tocore") != null)
			System.setProperty("to-core", "1");

		buildEnv.put("bootparserpath", env.get("bootparserpath"));
		buildEnv.put("verbose", env.get("verbose"));

		rewrite(buildEnv, null);

		// Second: Compile 
		if (env.get("java") != null)
			return compileJava(env, output);
		else if (env.get("cpp") != null)
			return compileCpp(env, rules, dest);
		return -1;
	}

	/* Compile generated cpp files */
	static int compileCpp(Map<String, String> env, String input, String buildir)
	{

		final String root = toscaPath();
		final String cppRoot = root + File.separator + "targets" + File.separator + "cpp";
		final String name = Utils.getBaseName(input);

		// Instantiate templates
		String gradleBuild = Utils.getCppGradleTemplate(root);
		gradleBuild = gradleBuild.replace("%NAME%", name);
		gradleBuild = gradleBuild.replace("%CPPROOT%", cppRoot);

		try (FileWriter writer = new FileWriter(buildir + File.separator + "build.gradle"))
		{
			writer.write(gradleBuild);
		}
		catch (IOException e)
		{
			Utils.fatal("An error occured while writing build.gradle", e);
			return -1;
		}

		String gradleSettings = Utils.getCppSettingsGradleTemplate(root);
		gradleSettings = gradleSettings.replace("%NAME%", name);
		gradleSettings = gradleSettings.replace("%CPPROOT%", cppRoot);

		try (FileWriter writer = new FileWriter(buildir + File.separator + "settings.gradle"))
		{
			writer.write(gradleSettings);
		}
		catch (IOException e)
		{
			Utils.fatal("An error occured while writing build.gradle", e);
			return -1;
		}

		// Copy gradle wrapper
		Utils.copyFile(Paths.get(root, "targets", "cpp", "resources", "gradlew"), Paths.get(buildir, "gradlew"));

		Path wrapperPath = Paths.get(buildir, "gradle", "wrapper");
		Utils.copyFile(
				Paths.get(root, "targets", "cpp", "resources", "gradle", "wrapper", "gradle-wrapper.jar"),
				wrapperPath.resolve(Paths.get("gradle-wrapper.jar")));
		Utils.copyFile(
				Paths.get(root, "targets", "cpp", "resources", "gradle", "wrapper", "gradle-wrapper.properties"),
				wrapperPath.resolve(Paths.get("gradle-wrapper.properties")));

		// Can now invoke gradlew to compile the code
		return Utils.exec(buildir, env.containsKey("quiet"), "./gradlew");
	}

	public static void helpTest()
	{
		System.out.println("Usage: java -jar <tosca.jar> test [<args>]");
		System.out.println("\n<args> are:");
		helpCommon();

		System.exit(0);
	}

	/** Test Tosca program */
	static void test(Map<String, String> env)
	{
		env.put("main", "Tests");
		run(env);
	}

	static void helpParse()
	{
		System.out.println("Usage: java -jar <tosca.jar> parse [<args>] <rules=file.tsc>");
		System.out.println("Parse Tosca program.");
		System.out.println("\n<args> are:");
		helpCommon();
		System.out.println("  quiet               does not print the parsed program as term.");
		System.exit(0);
	}

	/** Just parse Tosca program */
	static void parse(Map<String, String> env)
	{
		String inputname = env.get("rules");
		if (inputname == null)
			helpParse();

		ToolContext context = new ToolContext();
		addGrammars(context, env.get("grammars"));
		addGrammars(context, TransScriptMetaParser.class.getName());

		setBootParserPath(context, env.get("bootparserpath"));
		boolean quiet = env.get("quiet") != null;

		// Register builtin transscript descriptors
		TransScript.init(context);

		try (FileReader reader = new FileReader(inputname))
		{

			TransScriptMetaParser parser = new TransScriptMetaParser();

			BufferSink buffer = context.makeBuffer();
			parser.parse(buffer, "transscript", reader, inputname, 1, 1, new Scoping(), new Scoping());
			if (!quiet)
				Utils.printTerm(context, null, ((BufferSink) buffer).term(), "sysout", System.out);

		}
		catch (FileNotFoundException e)
		{
			Utils.fatal("File not found: " + inputname, e);
		}
		catch (IOException e)
		{
			Utils.fatal("", e);
		}
	}

	/** 
	 * Get the absolute name of the target java file
	 * The file name is of the form {dest}/{javabasepackage}/{javapackage}/{input}.java
	 *
	 * @param input Tosca file
	 * @param dest target directory
	 * @param makeDirs whether to make destination directories.
	 */
	static String targetJavaFilename(String input, String dest, String basepackage, String pkg, boolean makeDirs)
	{
		final File inputFile = new File(input);

		// Offset destination considering package
		if (basepackage != null)
			dest += File.separator + basepackage.replace('.', File.separatorChar);
		if (pkg != null)
			dest += File.separator + pkg.replace('.', File.separatorChar);

		if (makeDirs)
		{
			File destFile = new File(dest);
			destFile.mkdirs();
		}

		// Compute output java filename
		String output = inputFile.getName().replace(".crsc", ".java").replace(".crs4", ".java").replace(".tsc", ".java");
		output = Character.toUpperCase(output.charAt(0)) + output.substring(1); // First character must be upper case.

		output = dest + File.separator + output; // dest / output.java

		return output;
	}

	/**
	 * Get the relative name of the target class file
	 * @param input input Tosca file
	 * @param dest target directory
	 * @param makeDirs whether to make destination directories.
	 */
	static String targetClassFilename(String input, String basepackage, String pkg)
	{
		final File inputFile = new File(input);

		String name = "";
		// Offset destination considering package
		if (basepackage != null)
			name += basepackage;
		if (pkg != null)
		{
			if (!name.equals(""))
				name += ".";
			name += pkg;
		}

		// Compute output java filename
		String output = inputFile.getName().replace(".crsc", "").replace(".crs4", "").replace(".crs", "").replace(".tsc", "");
		output = Character.toUpperCase(output.charAt(0)) + output.substring(1); // First character must be upper case.

		name += "." + output; // dest / Output

		return name;
	}

	/** 
	 * Get the absolute name of the target cpp file
	 * @param input Tosca file
	 * @param dest target directory
	 * @param makeDirs whether to make destination directories.
	 */
	static String targetCppFilename(String input, String dest, boolean makeDirs)
	{
		final File inputFile = new File(input);

		dest += File.separator + "src";

		if (makeDirs)
		{
			File destFile = new File(dest);
			destFile.mkdirs();
		}

		// Compute output java filename
		String output = inputFile.getName().replace(".crs4", ".cpp").replace(".tsc", ".cpp");

		output = dest + File.separator + output; // dest / src / output.cpp
		return output;
	}

	/**
	 * Resolve build directory. If not provided, resolve as follows:
	 * {absolute(parent(input))}/build  
	 * @return the resolved root directory where to store generated files
	 */
	static String resolveBuildDir(String input, String dest)
	{
		if (dest == null)
			dest = new File(input).getAbsoluteFile().getParentFile().getAbsolutePath() + "/build";
		else
			dest = new File(dest).getAbsolutePath();
		return dest;
	}

	/** 
	 * Get the classloader needed to compile and run the given Tosca file.
	 * 
	 * @param input input Tosca file
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
				{destFile.getAbsoluteFile().toURI().toURL(), new File(toscaPath()).toURI().toURL()});
		}
		catch (MalformedURLException e)
		{
			Utils.fatal("Invalid destination", e); // shouldn't occur anyway
			return null;
		}
	}

	/** Compile the list of java files */
	static int compileJava(Map<String, String> env, String output)
	{
		if (env.get("only-source") != null)
		{
			List<File> filesToCompile = Arrays.asList(new File(output));

			List<String> optionList = new ArrayList<String>();

			// Need the Tosca runtime and the generated parser on the classpath
			optionList.add("-classpath");
			optionList.add(toscaPath());

			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

			StandardJavaFileManager stdFileManager = compiler.getStandardFileManager(null, null, null);
			Iterable<? extends JavaFileObject> fileObjects = stdFileManager.getJavaFileObjectsFromFiles(filesToCompile);

			CompilationTask task = compiler.getTask(null, stdFileManager, null, optionList, null, fileObjects);

			Boolean result = task.call();
			try
			{
				stdFileManager.close();
			}
			catch (IOException e)
			{
				Utils.fatal("Error while closing Java compiler tool file manager", e);
				return -1;
			}
			return result ? 0 : -1;
		}
		return -1;
	}

	/** Cached tosca path */
	static String toscaPath;

	/** 
	 * @return the tosca installation absolute root directory. 
	 */
	static String toscaPath()
	{
		if (toscaPath == null)
		{
			URL url = Tool.class.getResource("/org/transscript/Tool.class");

			if (url == null || url.getProtocol() == null)
				return Utils.fatal("Couldn't determine Tosca root location", null);

			if (url.getProtocol().equals("file"))
			{
				// should be in targets/java/build

				toscaPath = url.getPath().replace("targets/java/build/org/transscript/Tool.class", "");
			}
			else if (url.getProtocol().equals("jar"))
			{
				String path = url.getPath();
				toscaPath = path.replace("file:", "").replace("!/org/transscript/Tool.class", "");
			}
			else
				return Utils.fatal("Couldn't determine Tosca root location (unsupported protocol)", null);
		}
		return toscaPath;
	}

	/** Gets the init method or throw exception */
	static Method getInitMethod(Class<?> clss)
	{
		return Utils.getMethod(clss, "init", Context.class);
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
	 * Gets internal typed property value.
	 */
	@SuppressWarnings("unchecked")
	static <T> T getInternalProperty(Map<String, Object> internal, String name)
	{
		return internal == null ? null : (T) internal.get(name);
	}

	/**
	 * Generic rewriter extracting configuration from the given environment.
	 */
	static void rewrite(Map<String, String> env, Map<String, Object> internal)
	{
		Context context = new Context();

		context.verbose = Utils.GetIntProperty(env, "verbose", 0);
		setBootParserPath(context, env.get("bootparserpath"));

		String name = env.get("class");

		if (name == null)
		{
			System.out.println("missing class option");
			printUsage();
		}

		ClassLoader loader = getInternalProperty(internal, "classloader");
		if (loader == null)
			loader = Tool.class.getClassLoader();

		Class<?> clss = Utils.loadClass(name, loader);

		// Initialize system.
		Method init = getInitMethod(clss);
		try
		{
			init.invoke(null, context);
		}
		catch (Exception e)
		{
			Utils.fatal("problem occurred while initializing the Tosca system", e);
		}

		// Add grammars
		String grammars = env.get("grammar");
		addGrammars(context, grammars);

		// Look at arguments
		String arg = env.get("arg");
		String[] args = arg == null ? null : arg.split(" ");
		StringTerm[] argsTerm;
		Class<?>[] argTypes;
		if (args == null)
		{
			argTypes = new Class<?>[]
				{Context.class};
			argsTerm = null;
		}
		else
		{
			argTypes = new Class<?>[1 + args.length];
			argsTerm = new StringTerm[args.length];
			argTypes[0] = Context.class;
			for (int i = 0; i < args.length; i++)
			{
				argTypes[i + 1] = StringTerm.class;
				argsTerm[i] = StringTerm.stringTerm(args[i].trim());
			}
		}

		// Look top-level method to invoke
		String mainMethod = env.get("main");
		mainMethod = mainMethod == null ? "Main" : mainMethod;
		Method main = Utils.getMethod(clss, mainMethod, argTypes);

		Term result;
		try
		{
			result = Normalizer.force(context, main, argsTerm);
		}
		catch (Exception e)
		{
			result = null;
			Utils.fatal("problem occurred while running the Tosca system", e);
		}

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
				Utils.fatal("error while opening the output " + outputEntry, e);
			}
		}

		Utils.printTerm(context, null, result, outputEntry, output);

		if (output instanceof Closeable && output != System.out)

		{
			try
			{
				((Closeable) output).close();
			}
			catch (IOException e)
			{
				Utils.fatal("error while closing the output", e);
			}
		}

	}

	// Registers grammar(s) to context.
	private static void addGrammars(Context context, String grammar)
	{
		if (grammar != null)
		{
			grammar = grammar.trim();
			// Support crsx3 format
			if (grammar.charAt(0) == '(')
				grammar = grammar.replace("(", "").replace(")", "").replace("\'", "").replace(';', ',');
			String[] array = grammar.split(",");
			for (int i = 0; i < array.length; i++)
			{
				context.registerParser(array[i].trim());
			}
		}
	}

	/* Set Tosca parsers classpath */
	private static void setBootParserPath(Context context, String paths)
	{
		if (paths != null)
		{
			context.registerBootParsers(Arrays.asList(paths.split(",")).stream().map(path -> {
				try
				{
					return new URL(path);
				}
				catch (Exception e)
				{
					Utils.fatal("Invalid URL specified in bootparserpath: " + path, e);
					return null;
				}
			}).toArray(URL[]::new));
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
			}

			if (environment.get(option) != null)
				value = environment.get(option) + " " + value;

			environment.put(option, value);
		}

		if (environment.containsKey("help"))
			helps.get(command).run();
		else
		{
			// Set default target language to Java if not set
			if (environment.get("cpp") == null)
				environment.put("java", "1");

			if (environment.get("stacktrace") != null)
				System.setProperty("stacktrace", "1");

			fun.accept(environment);
		}
	}

}
