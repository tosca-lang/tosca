// Copyright (c) 2015 IBM Corporation.

package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.force;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Parser;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;

/**
 * ParseResource(#category : eager String, #name : eager String) 
 * 
 * Evaluates to the term obtained by getting and parsing the #name resource as a #category term.
 *	
 *  @author Lionel Villard
 */
public class ParseResourceDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "ParseResource";
	}

	@Override
	public boolean isFunction()
	{
		return true;
	}

	@Override
	public boolean step(Sink sink, Term term)
	{
		assert term.sub(0).descriptor() == this;
		assert term.arity() == 3 : "ParseResource(#category, #name) : missing arguments.";

		final Context context = sink.context();
		final String category = force(context, term.sub(1)).symbol();
		final String name = force(context, term.sub(2)).symbol();

		Parser parser = context.getParser(category);
		if (parser == null)
			throw new RuntimeException("Fatal error: no parser found for category " + category);
		
		try
		{
			parser.parse(sink, category, new FileReader(name) , null, 0, 0);
		}
		catch (FileNotFoundException e)
		{
			throw new RuntimeException("Fatal error: file not found " + name);
		}
		
		term.release();
		return true;
	}

}