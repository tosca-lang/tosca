// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.Construction;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Primitives;
import org.crsx.runtime.Sink;
import org.crsx.runtime.StringUtils;
import org.crsx.runtime.Term;
 
/**
 * $[Rescape, #1] interprets #1 as a string (including quotes) and returns internal version 
 * where quotes and escapes have been interpreted.
 *	
 * @author Lionel Villard
 */
public class RescapeDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "Trace";
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
		assert term.arity() == 2 : "$[Rescape, #1] : missing argument.";

		final Context context = sink.context();
		Term str1 = forceSub(context, term, 1);
		
		if (!Construction.isConstant(str1))
			throw new RuntimeException("Invalid argument in Rescape");
	
		sink.literal(StringUtils.unquoteJava(str1.symbol()));
		
		term.release();
		return true;
	}

}