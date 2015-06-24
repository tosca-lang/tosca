// Copyright (c) 2015 IBM Corporation.

package org.crsx.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import net.sf.crsx.Variable;
import net.sf.crsx.generic.GenericFactory;
import net.sf.crsx.generic.GenericTerm;
import net.sf.crsx.util.Buffer;
import net.sf.crsx.util.FormattingAppendable;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.crsx.pg.SinkAntlrListener;

/**
 * Simple utility to invoke the CRSX parser from the command line.
 * 
 * @author villardl
 */
public class CrsxParser
{

	public static void printUsage()
	{
		System.out.println("java org.crsx.parser.CrsxParser input.crs output.term");
		System.exit(-1);
	}

	public static void main(String[] args)
	{
		if (args.length != 2)
			printUsage();

		String inputname = args[0];
		String outputname = args[1];

		try
		{
			CharStream stream = new ANTLRInputStream(new FileReader(inputname));

			TokenSource source = new CrsxTermLexer(stream);
			TokenStream input = new CommonTokenStream(source);

			CrsxTermParser parser = new CrsxTermParser(input);
			parser.setBuildParseTree(false);
			parser.setTrace(true);
			GenericFactory factory = new GenericFactory();
			Buffer buffer = new Buffer(factory);
			SinkAntlrListener listener = new SinkAntlrListener(factory, buffer.sink(), "Crsx_", "##", parser);

			parser.addParseListener(listener);
			parser.crsx();
            //parser.freeTerm();
			GenericTerm term = (GenericTerm) buffer.term(true);

			FileWriter w = new FileWriter(outputname);
			FormattingAppendable f = FormattingAppendable.format(w, 120, 0, Integer.MAX_VALUE);
			Map<Variable, String> variableNames = new HashMap<Variable, String>();
			term.appendTermTo(
					f, variableNames, factory.defined(GenericFactory.NO_LINEAR_VARIABLES), Integer.MAX_VALUE, false, false, false,
					false, new HashSet<Variable>(), false);

			w.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
