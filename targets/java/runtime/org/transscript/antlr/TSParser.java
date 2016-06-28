// Copyright (c) 2015 IBM Corporation.

package org.transscript.antlr;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.Stream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.transscript.runtime.Parser;
import org.transscript.runtime.Sink;
import org.transscript.runtime.utils.Scoping;
import org.transscript.tool.Utils;

/**
 * Base class for meta and term parsers.
 * 
 * @author villardl
 */
public class TSParser extends org.antlr.v4.runtime.Parser implements Parser, Cloneable
{
	// Constructor

	/** Constructor used by TS to gather information about categories */
	protected TSParser()
	{
		super(null);
	}

	protected TSParser(TokenStream input)
	{
		super(input);
	}

	// Local methods overridden by generated parser

	/** Generated parser must override */
	protected Lexer newLexer(CharStream stream)
	{
		throw new UnsupportedOperationException();
	}

	/** Generated parser must override */
	protected String _prefix()
	{
		throw new UnsupportedOperationException();
	}
	
	/** Generated parser can override */
	protected String _catprefix()
	{
		return "";
	}

	/** Generated parser must override if not '#' */
	protected String _metachar()
	{
		return "#";
	}

	protected void initATN()
	{
		throw new UnsupportedOperationException();
	}

	/**
	 * Return Crsx4 compatible parser 
	 * @return
	 */
	public Parser asCrsx4Parser()
	{
		return this;
	}

	/**
	 * @return Non null category if supported
	 */
	protected String supportCategory(String category)
	{
		int len = category.length();
		char last = category.charAt(len - 1);
		switch (last)
		{
			case '*' :
				category = category.substring(0, len - 1) + "_ZOM";
				break;
			case '?' :
				category = category.substring(0, len - 1) + "_OPT";
				break;
			case '+' :
				category = category.substring(0, len - 1) + "_OOM";
				break;
		}
		category = category.substring(_catprefix().length());
		
		// Can it handle the category?
		return getRuleIndex(category) >= 0 ? category : null;
	}

	/**
	 * Setup input
	 * @throws IOException 
	 */
	protected void setupInput(Reader reader, int line, int column) throws IOException
	{
		CharStream stream = new ANTLRInputStream(reader);

		Lexer source = newLexer(stream);
		source.setLine(line);
		source.setCharPositionInLine(column);
		TokenStream input = new CommonTokenStream(source);

		setInputStream(input);
		initATN();

		setBuildParseTree(false);
	}

	/**
	 * Real parsing occurring after setup
	 */
	protected void realParse(String category)
	{
		// Retrieve method to call.
		String cateof = category + "_EOF";
		try
		{
			Method method = getClass().getMethod(cateof);
			method.invoke(this);
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	// Implements Parser

	@Override
	public Iterable<String> categories()
	{
		Stream<String> s = Arrays.stream(getRuleNames()).filter(v -> !v.endsWith("_EOF")).map(v -> {
			String result = v;
			final int len = v.length();
			if (len > 4)
			{
				String suffix = v.substring(len - 4, len);
				switch (suffix)
				{
					case "_ZOM" :
						result = v.substring(0, len - 4) + "*";
						break;
					case "_OPT" :
						result = v.substring(0, len - 4) + "?";
						break;
					case "_OOM" :
						result = v.substring(0, len - 4) + "+";
						break;
				}
			}
			
			return _catprefix() + result;
		});
		return s::iterator;
	}

	@Override
	public Parser parser()
	{
		try
		{
			TSParser parser = (TSParser) clone();
			parser.reset();
			return parser;
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}

	@Override
	public Sink parse(Sink sink, String category, Reader reader, String unit, int line, int column, Scoping bounds, Scoping freshes)
	{
		category = supportCategory(category);
		if (category == null)
			throw new RuntimeException(getClass().getCanonicalName() + " parser cannot handle the category " + category);

		try
		{
			setupInput(reader, line, column);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}

		ToSinkListener listener = new ToSinkListener(sink, _prefix(), _metachar(), this, bounds, freshes);
		//setTrace(true);
		addParseListener(listener);
		
		TSAntlrErrorListener errorListener = new TSAntlrErrorListener();
		addErrorListener(errorListener);
		//addErrorListener(new DiagnosticErrorListener(false));
		// Retrieve method to call.
		realParse(category);

		if (errorListener.error)
			Utils.fatal("Error(s) while parsing " + unit + ". Exiting.", null);  

		return sink;
	}

	@Override
	public void setParserVerbose(boolean verbose)
	{
		setTrace(verbose);
	}

	@Override
	public void setParserLocation(boolean captureLocations)
	{}

	// Overrides Parser

	@Override
	public String[] getTokenNames()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public String[] getRuleNames()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public String getGrammarFileName()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public ATN getATN()
	{
		throw new UnsupportedOperationException();
	}

	static class TSAntlrErrorListener extends ConsoleErrorListener
	{
		boolean error;
		
		
		// Error listener

		@Override
		public void reportAmbiguity(org.antlr.v4.runtime.Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs)
		{
			// TODO Auto-generated method stub
			super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
		}

		@Override
		public void reportAttemptingFullContext(org.antlr.v4.runtime.Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs)
		{
			// TODO Auto-generated method stub
			super.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
		}

		@Override
		public void reportContextSensitivity(org.antlr.v4.runtime.Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs)
		{
			// TODO Auto-generated method stub
			super.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
		}

		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
		{
			error = true;
			//super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
		}
 
	}

}
