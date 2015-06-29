// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Properties;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;

/**
 *  $[{#environment}IfDef, #name, #true, #false] 
 *  with constant #name evaluates as either #true or #false depending on whether name is defined in #environment. 
 * 
 *  @author Lionel Villard
 */
public class IfDefDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "IfDef";
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
		assert term.arity() == 4 : "$[{#environment}IfDef, #name, #true, #false]: missing argument.";

		final Context context = sink.context();
		final Term key = forceSub(context, term, 1);

		Properties env = term.sub(0).properties();
		if (env == null)
		{
			// Look in the global environment
			// TODO
			throw new RuntimeException("Global environment lookup not implemented yet");
		}
		else
		{
			if (env.lookup(key.symbol()) != null)
			{
				sink.copy(term.sub(2).ref());
			}
			else
			{
				sink.copy(term.sub(3).ref());
			}
			
		}
	
		term.release();
		return true;
	}

}