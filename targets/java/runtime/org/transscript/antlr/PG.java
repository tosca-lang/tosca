// Copyright (c) 2015 IBM Corporation.

package org.transscript.antlr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;

import net.sf.crsx.Variable;
import net.sf.crsx.generic.GenericFactory;
import net.sf.crsx.generic.GenericTerm;
import net.sf.crsx.util.Buffer;
import net.sf.crsx.util.FormattingAppendable;

/**
 * Simple utility to invoke ANTLR-based Parser Generator from the command line.
 * 
 * <p>
 * Uses CRSX3 internals.
 * 
 * @author villardl
 */
public class PG
{

	/**
	 * Print usage to the console and exit.
	 */
	public static void usage(String explanation)
	{
		System.out.println(explanation);
		System.out.println("java org.crsx.antlr.PG input.g4 output.term");
		System.exit(-1);
	}

	/**
	 * Print error to the console and exit
	 */
	public static void fatal(String explanation)
	{
		System.out.print("error: ");
		System.out.println(explanation);
		System.exit(-1);
	}

	/** 
	 * Parse and validate command line arguments 
	 */
	public static Params parseArgs(String[] args)
	{
		if (args.length != 2)
			usage("Missing input and/or output filenames.");

		Params params = new Params();
		params.inputname = args[0];
		params.outputname = args[1];

		if (!new File(params.inputname).exists())
			fatal("Input file missing.");

		return params;
	}

	public static void main(String[] args)
	{
		Params params = parseArgs(args);

		try
		{
			// Produces initialize term file.
			CharStream stream = new ANTLRInputStream(new FileReader(params.inputname));

			TokenSource source = new ANTLRTermLexer(stream);
			TokenStream input = new CommonTokenStream(source);

			ANTLRTerm parser = new ANTLRTerm(input);
			parser.setBuildParseTree(false);

			// parser.setTrace(true);
			GenericFactory factory = new GenericFactory();
			Buffer buffer = new Buffer(factory);
			SinkAntlrListener listener = new SinkAntlrListener(factory, buffer.sink(), "ANTLR_", "#", parser, null);

			parser.addParseListener(listener);
			parser.grammarSpec();

			GenericTerm term = (GenericTerm) buffer.term(true);

			File outfile = new File(params.outputname);
			if (outfile.getParentFile() != null)
				outfile.getParentFile().mkdirs();

			FileWriter w = new FileWriter(params.outputname);
			FormattingAppendable f = FormattingAppendable.format(w, 120, 0, Integer.MAX_VALUE);
			Map<Variable, String> variableNames = new HashMap<Variable, String>();
			term.appendTermTo(
					f, variableNames, factory.defined(GenericFactory.NO_LINEAR_VARIABLES), Integer.MAX_VALUE, false, false, false,
					false, new HashSet<Variable>(), false);

			w.close();

			// Normalize term
			//			Map<String, String> options = new HashMap<>();
			//			options.put("grammar", "('net.sf.crsx.text.Text';'org.crsx.pg.ANTLRMeta';)");
			//			options.put("rules", "src/pg/normalizer.crs");
			//			options.put("input", "src/parser/Crsx.term");
			//			options.put("wrapper", "Normalize");
			//			options.put("output", "src/parser/Crsx.nterm");
			//
			//			new Crsx().realMain(options);

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		//		catch (CRSException e)
		//		{
		//			e.printStackTrace();
		//		}
	}

	/** Represent parsed command line arguments */
	static class Params
	{
		String inputname;
		String outputname;
	}
}
