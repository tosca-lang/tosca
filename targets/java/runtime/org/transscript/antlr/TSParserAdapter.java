// Copyright (c) 2015 IBM Corporation.

package org.transscript.antlr;

import java.io.IOException;
import java.io.Reader;

import org.transscript.runtime.Parser;
import org.transscript.runtime.Sink;
import org.transscript.runtime.utils.Scoping;

/**
 * TransScript parser backed-by a Crsx3 parser
 * 
 * @author Lionel Villard
 * @deprecated
 */
class TSParserAdapter implements Parser
{
	/** The real parser */
	protected Crsx3Parser parser;

	TSParserAdapter(Crsx3Parser parser)
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
		return new TSParserAdapter((Crsx3Parser) parser.parser(parser.factory));
	}

	@Override
	public Sink parse(Sink sink, String category, Reader reader, String unit, int line, int column, Scoping bounds, Scoping freshes)
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

		SinkAntlrListener listener = new SinkAntlrListener(sink, parser._prefix(), parser._metachar(), parser, null);
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
