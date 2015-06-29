// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.Construction;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Properties;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
 
/**
 *  $[:, #1, #2, ...] corresponds to the constant with constructor named as the concatenation of the string value of the arguments. 
 *  
 * @author Lionel Villard
 */
public class ColonDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return ":";
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
		
		final Context context = sink.context();
		
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < term.arity(); i++)
		{
			final Term string = forceSub(context, term, i);
			
			if (Construction.isConstant(string))
				builder.append(string.symbol());
			else
				throw new RuntimeException("Invalid concat argument: " + string);
		}
		sink.literal(builder.toString());
		term.release();
		return true;
	}

}