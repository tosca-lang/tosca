// Copyright (c) 2015 IBM Corporation.

package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;

/**
 *  $[Error, #value]: print error and then interrupt execution 
 *	
 *  @author Lionel Villard
 */
public class ErrorDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "Error";
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
		assert term.arity() == 2 : "$[Error, #message]: missing argument.";

		Term msg = forceSub(sink.context(), term, 1);

		System.err.println(msg);
		throw new RuntimeException();
	}

}