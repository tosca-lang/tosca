// Copyright (c) 2015 IBM Corporation.

package org.crsx.runtime.primitives;

import static org.crsx.runtime.Normalizer.forceSub;

import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Primitives;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;

/**
 *  $[If, #test, #true, #false] with constant #test evaluates as either #true or #false depending on whether test is true or false
 *  (empty sequence/string, zero, $False).
 * 
 *  @author Lionel Villard
 */
public class IfDescriptor extends ConstructionDescriptor
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
//		assert term.sub(0).descriptor() == this;
//		assert term.arity() == 4 : "$[If, #test, #true, #false]: missing argument.";
//
//		final Context context = sink.context();
//		final Term test = forceSub(context, term, 1);
//	
//		if (test.descriptor() == Primitives._M__sTrue)
//		{
//			sink.copy(term.sub(2).ref());
//		}
//		else if (test.descriptor() == Primitives._M__sFalse)
//		{
//			sink.copy(term.sub(3).ref());
//		}
//		else
//			throw new RuntimeException("test expression in If does not evaluate to a boolean: " + test);
//
//		term.release();
		return true;
	}

}