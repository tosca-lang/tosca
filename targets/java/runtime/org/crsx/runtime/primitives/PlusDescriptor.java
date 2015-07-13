// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.Construction;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
 
/**
 * $[Plus, #number1, #number2] is the addition of 2 numbers. 
 *	
 *  @author Lionel Villard
 */
public class PlusDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "Plus";
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
		assert term.arity() == 3 : "$[Plus, #number1, #number2] : missing argument.";

		final Context context = sink.context();
		Term num1 = forceSub(context, term, 1);
		Term num2 = forceSub(context, term, 2);
		
		if (!Construction.isConstant(num1) ||  !Construction.isConstant(num2))
			throw new RuntimeException("Invalid argument in Plus");

		int n1 = Integer.parseInt(num1.symbol());
		int n2 = Integer.parseInt(num2.symbol());
		
	    sink.literal(n1 + n2);
		    	
		term.release();
		return true;
	}

}