// Copyright (c) 2015 IBM Corporation.

package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Properties;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;

/**
 *  $[{#env}Get, name[, default]] return property or variable from the environment 
 *  (either the properties in #env on Get or the global one). 
 *	
 *  @author Lionel Villard
 */
public class GetDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "Get";
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
		assert term.arity() >= 2 : "$[{#env}Get, name[, default]]: missing argument.";

		final Context context = sink.context();
		final Term key = forceSub(context, term, 1);

		Properties env = term.sub(0).properties();
		if (env == null)
		{
			String value = System.getProperty("Crsx" + key.symbol());
			sink.literal(value == null ? "" : value);
		}
		else
		{
			Term value = env.lookup(key.symbol());
			if (value != null)
			{
				sink.copy(value.ref());
			}
			else
			{
				// Send default. If not default, error
				if (term.arity() == 3)
					sink.copy(term.sub(2).ref());
				else
					throw new RuntimeException("Missing value in local environment");
					
			}
		}
		
		term.release();
		return true;
	}

}