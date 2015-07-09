// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;
import net.sf.crsx.util.Util;

import org.crsx.runtime.Construction;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Sink;
import org.crsx.runtime.StringUtils;
import org.crsx.runtime.Term;
 
/**
 * $[Escape, #string] returns #string as a string 
 * (quoted with "s and replacing internal "s with \" and special characters with \-escaped version). 
 *	
 * @author Lionel Villard
 */
public class EscapeDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "Escape";
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
		assert term.arity() == 2 : "$[Escape, #string] : missing argument.";

		final Context context = sink.context();
		Term str1 = forceSub(context, term, 1);
		
		if (!Construction.isConstant(str1))
			throw new RuntimeException("Invalid argument in Escape");
		
	    sink.literal(StringUtils.quoteJava(str1.symbol()));
		    	
		term.release();
		return true;
	}

}