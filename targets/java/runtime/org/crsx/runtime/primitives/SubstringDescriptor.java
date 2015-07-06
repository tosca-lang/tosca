// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.Construction;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
 
/**
 * $[Substring, #1, #2[, #3]] corresponds to substring of constant #1 starting at #2 
 * ending before #3 (defaults to the end) in the constructor symbol (0-indexed). 
 *	
 * @author Lionel Villard
 */
public class SubstringDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "Substring";
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
		assert term.arity() == 3 || term.arity() == 4 : "$[String, #1, #2, #3] : missing argument.";

		final Context context = sink.context();
		Term string = forceSub(context, term, 1);
		Term start = forceSub(context, term, 2);
		
		if (!Construction.isConstant(string) || !Construction.isConstant(start))
			throw new RuntimeException("Invalid argument in Substring");
	
		Term end = null;
		if (term.arity() == 4)
		{
			end = forceSub(context, term, 3);
			if (!Construction.isConstant(end))
				throw new RuntimeException("Invalid argument in Substring");
		}
			
		String pre = string.symbol();
		int s = Integer.parseInt(start.symbol());
		int e = end == null ? pre.length() : Integer.parseInt(end.symbol());
		
		sink.literal(s < e ? pre.substring(s, e) : "");
		
		term.release();
		return true;
	}

}