// Copyright (c) 2015 IBM Corporation.

package org.crsx.antlr;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import org.crsx.runtime.Parser;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Variable;

/**
 * Crsx4 parser backed-by a Crsx3 parser
 * 
 * @author Lionel Villard
 */
class Crsx4ParserAdapter implements Parser
{

	/** The real parser */
	protected Crsx3Parser parser;

	Crsx4ParserAdapter(Crsx3Parser parser)
	{
		this.parser = parser;
	}

	@Override
	public Iterable<String> categories()
	{
		return parser.categories();
	}

	@Override
	public Parser parser()
	{
		return new Crsx4ParserAdapter((Crsx3Parser) parser.parser(parser.factory));
	}

	@Override
	public Sink parse(Sink sink, String category, Reader reader, String unit, int line, int column, Map<String, org.crsx.runtime.Variable> bounds)
	{
		category = parser.supportCategory(category);
		if (category == null)
			throw new RuntimeException(getClass().getCanonicalName() + " parser cannot handle the category " + category);

		try
		{
			parser.setupInput(reader, line, column);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		
		SinkAntlrListener listener = new SinkAntlrListener(sink, parser._prefix(), parser._metachar(), parser, bounds);
		//setTrace(true);
		parser.addParseListener(listener);

		// Retrieve method to call.
		parser.realParse(category);

		if (parser.error)
			throw new RuntimeException("Parse error");
		return sink;
	}

	@Override
	public void setParserVerbose(boolean verbose)
	{
		parser.setParserVerbose(verbose);

	}

	@Override
	public void setParserLocation(boolean captureLocations)
	{
		parser.setParserLocation(captureLocations);
	}

}
