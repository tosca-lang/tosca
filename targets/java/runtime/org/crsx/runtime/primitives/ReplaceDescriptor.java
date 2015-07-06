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
 *  $[Replace, #1, #2, #3] corresponds to string #1 with all occurrences of #2 replaced by #3 in the string.corresponds to string #1 with all occurrences of #2 replaced by #3 in the string.
 *	
 *  @author Lionel Villard
 */
public class ReplaceDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "Replace";
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
		assert term.arity() == 4 : "$[Replace, #1, #2, #3]: missing argument.";

		final Context context = sink.context();
		Term str1 = forceSub(context, term, 1);
		Term str2 = forceSub(context, term, 2);
		Term str3 = forceSub(context, term, 3);
		
		if (!Construction.isConstant(str1) || !Construction.isConstant(str2) || !Construction.isConstant(str3))
			throw new RuntimeException("Invalid argument in Replace");
			
	    sink.literal(str1.symbol().replace(str2.symbol(), str3.symbol()));
		    	
		term.release();
		return true;
	}

}