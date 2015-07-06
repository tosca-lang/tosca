// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.Construction;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Primitives;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
 

/**
 *  $[StartsWith, #1, #2] returns whether constant #1 starts with the substring constant #2. 
 *	
 *  @author Lionel Villard
 */
public class StartsWithDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "StartsWith";
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
		assert term.arity() == 3 : "$[StartsWith, #string1, #string2] : missing argument.";

		final Context context = sink.context();
		Term str1 = forceSub(context, term, 1);
		Term str2 = forceSub(context, term, 2);
		
		if (!Construction.isConstant(str1) || !Construction.isConstant(str2))
			throw new RuntimeException("Invalid argument in StartsWith");
			
	    if (str1.symbol().startsWith(str2.symbol()))
	    	sink.start(Primitives._M__sTrue).end();
	    else
	     	sink.start(Primitives._M__sFalse).end();
		    	
		term.release();
		return true;
	}

}