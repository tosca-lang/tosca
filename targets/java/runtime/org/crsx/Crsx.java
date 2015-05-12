// Copyright (c) 2015 IBM Corporation.

package org.crsx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.crsx.runtime.BufferSink;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.CrsxLexer;
import org.crsx.runtime.Normalizer;
import org.crsx.runtime.Term;

/**
 * CRSX command line.
 * 
 * NOTE: THIS IS TEMPORARY. Crsx.crs should implement this the day CRSX4 is stable enough
 *	
 * @author villardl
 */
public class Crsx
{
	/**
	 * Prints out usage and exit.
	 */
	public static void printUsage()
	{
		System.out.println("Usage: java org.crsx.Crsx [option[=value]]");
		System.out.println("\nWhere option is:");
		System.out.println("    input=filename    input file");
		System.out.println("    class=class       compiled CRSX program");
		System.exit(0);
	}

	/**
	 * Rewrites term until fully normalized.
	 */
	public static void rewrite(Map<String, String> env)
	{

		Context context = new Context();

		String name = env.get("class");
		Class<?> clss = null;

		if (name == null)
		{
			System.out.println("missing class  option");
			printUsage();
		}
		try
		{
			clss = Class.forName(name);
		}
		catch (ClassNotFoundException e1)
		{
			System.out.println("Class not found");
			System.exit(0);
		}
		// Initialize system.
		Method m;
		try
		{
			m = clss.getMethod("init", Context.class);
			m.invoke(null, context);
		}
		catch (Exception e)
		{
			System.out.println("Error while initializing the CRSX system.");
			e.printStackTrace();
			System.exit(0);
		}

		ConstructionDescriptor wrapper = context.lookupDescriptor("Main");

		BufferSink buffer = context.makeBuffer();

		if (wrapper != null)
			buffer.start(wrapper);

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

		if (wrapper != null)
			buffer.end();

		Term top = buffer.term();
		Term result = Normalizer.normalize(context, top);
		System.out.println(result.toString());
	}

	public static void main(String[] args)
	{
		if (args.length == 0)
			printUsage();

		Map<String, String> environment = new HashMap<>();

		// System properties.
		for (Map.Entry<Object, Object> e : System.getProperties().entrySet())
			environment.put(e.getKey().toString(), e.getValue().toString());

		// System context environment.
		for (final Map.Entry<String, String> e : System.getenv().entrySet())
		{
			String key = e.getKey(), value = e.getValue();
			if (key.startsWith("CRSX_"))
				key = key.substring("CRSX_".length()).toLowerCase().replace('_', '-');
			environment.put(key, value);
		}

		// Option arguments.
		int first; // first non-option
		for (first = 0; first < args.length; ++first)
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

		rewrite(environment);
	}
}
