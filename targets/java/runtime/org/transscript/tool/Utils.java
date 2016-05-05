// Copyright (c) 2016 IBM Corporation.

package org.transscript.tool;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

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
	public static void fatal(String message, Exception e)
	{
		System.out.println(message);
		if (e != null)
			e.printStackTrace();
		System.exit(0);
	}

	/** Print warning */
	public static void warning(String message)
	{
		System.out.println(message);
	}
	 
}
