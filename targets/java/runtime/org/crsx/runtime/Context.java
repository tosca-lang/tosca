// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.HashSet;

import org.crsx.pg.Crsx3Parser;
import org.crsx.runtime.ConstructionDescriptor.Step;

/**
 * Context passed around during rewrite
 * 
 * @author villardl
 */
final public class Context
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
	 * Verbosity level
	 */
	public int verbose = 0;

	
	/**
	 * Construction descriptors, indexed by qualified name
	 */
	public HashMap<String, ConstructionDescriptor> descriptors;

	/**
	 * Parser classloader
	 */
	protected URLClassLoader parserClassLoader;

	/**
	 * Registered parsers
	 */
	protected HashSet<String> parserNames;

	/**
	 * Parsers, indexed by category
	 */
	protected HashMap<String, Parser> parsers;

	// --- Constructors

	/**
	 * Construct a context
	 */
	public Context()
	{
		this.descriptors = new HashMap<>(2048);
		this.parsers = new HashMap<>(128);
		this.parserNames = new HashSet<>();

		Primitives.init(this);
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
		if (idx != -1)
			base = hint.substring(0, idx);

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

	// --- Parser management

	/**
	 * Add the list of URLs to search for parser classes.
	 *  
	 */
	public void addParserURLs(URL[] urls)
	{
		parserClassLoader = URLClassLoader.newInstance(urls);
	}

	/**
	 * Register parser.
	 * 
	 *  <p>This method is idempotent.
	 *  
	 * @param parserClassname
	 * @return whether the registration was successful.
	 */
	public boolean registerParser(String parserClassname)
	{
		if (!parserNames.contains(parserClassname))
		{
			ClassLoader loader = parserClassLoader == null ? ClassLoader.getSystemClassLoader() : parserClassLoader;
			try
			{
				Class<?> parserClass = loader.loadClass(parserClassname);

				Parser parser;
				if (Crsx3Parser.class.isAssignableFrom(parserClass))
				{
					Crsx3Parser oldParser = (Crsx3Parser) parserClass.newInstance();
					parser = oldParser.asCrsx4Parser();
				}
				else if (Parser.class.isAssignableFrom(parserClass))
				{
					parser = (Parser) parserClass.newInstance();
				}
				else
				{
					throw new RuntimeException(parserClassname + " is not a valid parser.");
				}

				parser.categories().forEach(category -> {
					if (parsers.get(category) != null)
						throw new RuntimeException("Error: duplicate parser category: " + category);
					parsers.put(category, parser);
				});
				
				parserNames.add(parserClassname);
			}
			catch (ClassNotFoundException | InstantiationException | IllegalAccessException e)
			{
				return false;
			}
		
		}
		return true;
	}

	/**
	 * Gets the parser capable of parsing the given category
	 * @param category
	 * @return the parser or null if the no parser handle the given category
	 */
	final public Parser getParser(String category)
	{
		Parser parser = parsers.get(category);
		return parser == null ? null : parser.parser();
	}
}
