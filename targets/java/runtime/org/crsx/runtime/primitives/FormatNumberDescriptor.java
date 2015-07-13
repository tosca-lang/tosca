// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.Construction;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
 
/**
 * $[FormatNumber, #number] is a string representing the number. 
 *	
 *  @author Lionel Villard
 */
public class FormatNumberDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "FormatNumber";
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
		assert term.arity() == 2 : "$[FormatNumber, #number] : missing argument.";

		final Context context = sink.context();
		Term str1 = forceSub(context, term, 1);
		
		if (!Construction.isConstant(str1))
			throw new RuntimeException("Invalid argument in FormatNumber");
		
	    sink.literal(str1.symbol());
		    	
		term.release();
		return true;
	}

}