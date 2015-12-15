// Copyright (c) 2015 IBM Corporation.

package org.crsx.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;

/**
 * Simple utility to invoke the CRSX parser from the command line.
 * 
 * @author villardl
 */
public class CLCrsxParser
{

	public static void printUsage()
	{
		System.out.println("java org.crsx.parser.CLCrsxParser input.crs output.term");
		System.exit(-1);
	}

	public static void main(String[] args)
	{
		if (args.length != 2)
			printUsage();

		String inputname = args[0];

		try
		{
			CharStream stream = new ANTLRInputStream(new FileReader(inputname));

			TokenSource source = new CrsxTermLexer(stream);
			TokenStream input = new CommonTokenStream(source);

			CrsxTermParser parser = new CrsxTermParser(input);
			parser.setBuildParseTree(false);
			//parser.setTrace(true);
		
			parser.addErrorListener(new DiagnosticErrorListener(true));
			parser.crsx();
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
