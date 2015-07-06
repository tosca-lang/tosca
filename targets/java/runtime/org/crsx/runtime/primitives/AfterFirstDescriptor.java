// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.Construction;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
 
/**
 * $[AfterFirst, #string, #separator[, fallback]] is the constructor named as #string except all characters up to the 
 * first occurrence of #separator are omitted.
 *	
 * Default falback is empty string
 *
 * @author Lionel Villard
 */
public class AfterFirstDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "AfterFirst";
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
		assert term.arity() == 3 || term.arity() == 4 : "$[AfterFirst, #string, #separator[, fallback]] : missing argument.";

		final Context context = sink.context();
		Term string = forceSub(context, term, 1);
		Term first = forceSub(context, term, 2);
		
		if (!Construction.isConstant(string) || !Construction.isConstant(first))
			throw new RuntimeException("Invalid argument in AfterFirst");
			
		int index = string.symbol().indexOf(first.symbol());
		if (index == -1)
		{
			if (term.arity() == 4)
				sink.copy(term.sub(3).ref());		
			else 
				sink.literal("");
		}
		else
			sink.literal(string.symbol().substring(index+first.symbol().length()));
		
		term.release();
		return true;
	}

}