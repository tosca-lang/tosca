// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Primitives;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
 
/**
 *  $[DeepEqual, #term1, #term2] test equality of #term1, #term2. result is $Boolean. 
 *	
 *  @author Lionel Villard
 */
public class DeepEqualDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "DeepEqual";
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
//		assert term.arity() == 3 : "$[DeepEqual, #term1, #term2] : missing argument.";
//
//		Term term1 = term.sub(1);
//		Term term2 = term.sub(2);
//			
//	    sink.start(term1.deepEquals(term2) ? Primitives._M__sTrue : Primitives._M__sFalse).end();
//	        	
//		term.release();
		return true;
	}

}