// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime.primitives;

import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;

/**
 * Dollar meta-primitive.
 * 
 * @author Lionel Villard
 */
public class DollarDescriptor extends ConstructionDescriptor
{
	@Override
	public String symbol()
	{
		return "$";
	}

	@Override
	public boolean isFunction()
	{
		return true;
	}

	@Override
	public boolean step(Sink sink, Term data)
	{
		// First argument is the primitive descriptor
		assert data.arity() >= 1 : "$ primitive must at least have one argument.";
		
		Term name = data.sub(0);
		ConstructionDescriptor desc = name.descriptor();
		System.out.println(desc.symbol());
		return desc.step(sink, data);
	}
}