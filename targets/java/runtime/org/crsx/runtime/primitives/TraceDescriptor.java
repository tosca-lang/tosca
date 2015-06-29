// Copyright (c) 2015 IBM Corporation.

package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;

/**
 *  $[Trace, #message, #value]: first argument is echoed (unevaluated, to stderr!) second argument is then contracted... 
 *  $[Trace, #value]: print value and then contract.. 
 *	
 *  @author Lionel Villard
 */
public class TraceDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "Trace";
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
		assert term.arity() >= 2 : "$[Trace[, #message], #value]: missing argument.";

		if (term.arity() == 3)
			forceSub(sink.context(), term, 1);
		Term msg = term.sub(1);
		
		System.out.println(msg);
		sink.copy(term.sub(term.arity() - 1).ref());

		term.release();
		return true;
	}

}