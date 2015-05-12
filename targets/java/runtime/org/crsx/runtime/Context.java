// Copyright (c) 2014 IBM Corporation.
package org.crsx.runtime;

import java.util.HashMap;

import org.crsx.runtime.ConstructionDescriptor.Step;

/**
 * Context passed around during rewrite
 * 
 * @author villardl
 */
public class Context
{

	/**
	 * Timestamp.
	 */
	public long ts = 0;

	/**
	 * Stack depth.
	 */
	public long sd = 0;
	
	
	/**
	 * Construction descriptors, indexed by qualified name
	 */
	public HashMap<String, ConstructionDescriptor> descriptors;

	/**
	 * Construct a context
	 */
	public Context()
	{
		this.descriptors = new HashMap<>(2048);
	}

	/**
	 * Make new unique variable.
	 * 
	 * @param hint
	 * @return
	 */
	public Variable makeVariable(String hint)
	{
		return new Variable(makeVariableName(hint));
	}
	
	/**
	 * Make new unique variable name.
	 * 
	 * @param hint
	 * @return
	 */
	private String makeVariableName(String hint)
	{
		String base = hint;

		int idx = hint.indexOf("_");
		if (idx != -1) base = hint.substring(0, idx);

		return base + "_" + (++ts);
	}
	
	/**
	 * @return a new buffer
	 */
	public BufferSink makeBuffer()
	{
		return new BufferSink(this);
	}

	/**
	 * @return a new variable use
	 */
	public VariableUse makeVariableUse(Variable variable)
	{
		return new VariableUse(variable);
	}

	/**
	 * Lookup descriptor for symbol
	 * 
	 * @param string
	 * @return A descriptor. If no descriptor for the given symbol exist, create a data constructor
	 */
	public ConstructionDescriptor lookupDescriptor(String symbol)
	{
		ConstructionDescriptor desc = descriptors.get(symbol);
		return desc == null ? ConstructionDescriptor.makeData(symbol) : desc;
	}
	
	/**
	 * Register function term
	 * 
	 * @param symbol
	 * @param step
	 */
	public void register(String symbol, Step step)
	{
		descriptors.put(symbol, ConstructionDescriptor.makeFunction(symbol, step));
	}
	
	/**
	 * Register symbol
	 *  
	 * @param symbol
	 * @param desc
	 */
	public void register(ConstructionDescriptor desc)
	{
		descriptors.put(desc.symbol(), desc);
	}
}
