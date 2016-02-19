// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.transscript.antlr.TermParserListener;
import org.transscript.parser.TransScriptMetaLexer;
import org.transscript.parser.TransScriptMetaParser;

/**
 * Collection of utility methods related to parsing 
 * 
 * @author Lionel Villard
 */
public class ParsingUtils
{
	/** 
	 * Parse crsx4 terms and send result to sink 
	 */
	static public void parseTerm(Sink sink, String inputname) throws IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader(inputname)))
		{
			CharStream stream = new ANTLRInputStream(br);

			TokenSource source = new TransScriptMetaLexer(stream);
			TokenStream input = new CommonTokenStream(source);

			TransScriptMetaParser parser = new TransScriptMetaParser(input);
			parser.setBuildParseTree(false);
			parser.setTrace(true);

			parser.addErrorListener(new DiagnosticErrorListener(true));
			parser.addParseListener(new TermParserListener(sink));
			parser.term_EOF();
		}

	}
}
