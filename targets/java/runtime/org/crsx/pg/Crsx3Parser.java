// Copyright (c) 2015 IBM Corporation.

package org.crsx.pg;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.Stream;

import net.sf.crsx.CRSException;
import net.sf.crsx.Factory;
import net.sf.crsx.Sink;
import net.sf.crsx.Term;
import net.sf.crsx.Variable;
import net.sf.crsx.generic.GenericFactory;
import net.sf.crsx.util.ExtensibleMap;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 * CRSX4 PG to CRSX3 parser bridge.
 * 
 * @author villardl
 */
public class Crsx3Parser extends Parser implements net.sf.crsx.Parser, Cloneable, ANTLRErrorListener
{
	// State

	/** The CRSX 3 factory */
	protected GenericFactory factory;

	/** Had error? */
	protected boolean error; 
	
	// Constructor

	/** Constructor used by CRSX3 to gather information about categories */
	protected Crsx3Parser()
	{
		super(null);
	}

	protected Crsx3Parser(TokenStream input)
	{
		super(input);
	}

	// Local methods overriden by generated parser

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

	protected void initATN()
	{
		throw new UnsupportedOperationException();
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
			return result;
		});
		return s::iterator;
	}

	@Override
	public net.sf.crsx.Parser parser(Factory<? extends Term> factory)
	{
		try
		{
			Crsx3Parser parser = (Crsx3Parser) clone();
			parser.factory = (GenericFactory) factory;
			return parser;
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}

	@Override
	public Sink parse(Sink sink, String category, Reader reader, String unit, int line, int column, ExtensibleMap<String, Variable> bound)
			throws CRSException, IOException
	{
		int len = category.length();
		char last = category.charAt(len - 1);
		switch (last)
		{
			case '*' :
				category = category.substring(0, len - 1) + "_ZOM";
				break;
			case '?' :
				category = category.substring(0, len - 1)  + "_OPT";
				break;
			case '+' :
				category = category.substring(0, len - 1)  + "_OOM";
				break;
		}

		// Can it handle the category?
		int index = getRuleIndex(category);
		if (index == -1)
			throw new CRSException(getClass().getCanonicalName() + " parser cannot handle the category " + category);

		CharStream stream = new ANTLRInputStream(reader);
		
		Lexer source = newLexer(stream);
		source.setLine(line);
		source.setCharPositionInLine(column);
		TokenStream input = new CommonTokenStream(source);
		
		setInputStream(input);
		initATN();
		
		setBuildParseTree(false);
		SinkAntlrListener listener = new SinkAntlrListener(factory, sink, _prefix(), this);
		//setTrace(true);
		addParseListener(listener);
		addErrorListener(this);
		// Retrieve method to call.
		String cateof = category + "_EOF";
		try
		{
			Method method = getClass().getMethod(cateof);
			method.invoke(this);
		}
		catch (NoSuchMethodException e)
		{
			throw new CRSException("Parse error: couldn't find the category " + cateof);
		}
		catch (Exception e)
		{
			throw new CRSException(e);
		}
		
		if (error)
			throw new CRSException("Parse error");
		
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
	
	// Error listener

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
	{
		error = true;
	}

	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs)
	{
		//error = true;
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs)
	{
//		error = true;
	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs)
	{
	//	error = true;
	}

}
