// Copyright (c) 2014 IBM Corporation.

package org.transscript.runtime;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Supplier;

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
	 * Verbosity level
	 */
	public int verbose = 0;

	/**
	 * Construction descriptors, indexed by qualified name
	 */
	public HashMap<String, ConstructionDescriptor> descriptors;

	/**
	 * Registered parsers
	 */
	protected HashSet<String> parserNames;

	/**
	 * Parsers, indexed by category
	 */
	protected HashMap<String, Parser> parsers;

	/**
	 * Overloaded boot parsers, indexed by category
	 */
	protected HashMap<String, Parser> bootParsers;

	// --- Constructors

	/**
	 * Construct a context
	 */
	public Context()
	{
		this.descriptors = new HashMap<>(2048);
		this.parsers = new HashMap<>(128);
		this.parserNames = new HashSet<>();
	}

	/**
	 * Make new unique variable.
	 * 
	 * @param hint
	 * @return
	 */
	public Variable makeVariable(String hint)
	{
		return new Variable(makeGlobalName(hint));
	}

	/**
	 * Make new context-scoped unique name.
	 * 
	 * @param hint
	 * @return
	 */
	public String makeGlobalName(String hint)
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
	 * @return A descriptor. If no descriptor for the given symbol exist, create a generic data constructor
	 */
	public ConstructionDescriptor lookupDescriptor(String symbol)
	{
		return descriptors.get(symbol); 
	}

	/**
	 * Register symbol
	 *  
	 * @param symbol
	 * @param desc
	 */
	public void register(ConstructionDescriptor desc)
	{
		if (descriptors.get(desc.symbol()) != null)
			System.out.println("Warning: data symbol already registered: " + desc.symbol());
		descriptors.put(desc.symbol(), desc);
	}

	/**
	 * Register enumeration value
	 * @param symbol global identifier 
	 * @param maker function creating enumeration instances
	 */
	public void register(String symbol, Supplier<Term> maker)
	{
		register(new ConstructionDescriptor()
			{

				@Override
				public String symbol()
				{
					return symbol;
				}

				@Override
				public Term make()
				{
					return maker.get();
				}
			});
	}

	// --- Parser management

	/**
	 * Add the list of URLs to search for parser classes.
	 *  
	 */
	public void registerBootParsers(URL[] urls)
	{
		try (ChildURLClassLoader loader = new ChildURLClassLoader(urls, Context.class.getClassLoader()))
		{
			bootParsers = new HashMap<>();
			Class<?> parserClass = loader.loadClass("org.transscript.parser.TransScriptMetaParser");
			registerCategories(parserClass, bootParsers);
			parserClass = loader.loadClass("org.transscript.core.CoreMetaParser");
			registerCategories(parserClass, bootParsers);
			parserClass = loader.loadClass("org.transscript.text.Text4MetaParser");
			registerCategories(parserClass, bootParsers);
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException e)
		{
			System.out.println("Warning: parser " + e.getLocalizedMessage() + " cannot be loaded.");
			e.printStackTrace();
		}
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
			ClassLoader loader = Context.class.getClassLoader();
			try
			{
				Class<?> parserClass = loader.loadClass(parserClassname);
				registerCategories(parserClass, parsers);

				parserNames.add(parserClassname);
			}
			catch (ClassNotFoundException | InstantiationException | IllegalAccessException e)
			{
				System.out.println("Warning: parser " + e.getLocalizedMessage() + " cannot be loaded.");
				e.printStackTrace();
				return false;
			}

		}
		return true;
	}

	/* Load categories from parser */
	static protected void registerCategories(Class<?> parserClass, HashMap<String, Parser> categories)
			throws InstantiationException, IllegalAccessException
	{
		Parser parser;
		//		if (Crsx3Parser.class.isAssignableFrom(parserClass))
		//		{
		//			Crsx3Parser oldParser = (Crsx3Parser) parserClass.newInstance();
		//			parser = oldParser.asCrsx4Parser();
		//		}
		//		else 
		if (Parser.class.isAssignableFrom(parserClass))
		{
			parser = (Parser) parserClass.newInstance();
		}
		else
		{
			throw new RuntimeException(parserClass.getName() + " is not a valid parser.");
		}

		parser.categories().forEach(category -> {

			if (categories.get(category) != null)
			{
				// Temporary: just issue a warning until have proper parser scoping mechanism
				System.out.println("Warning:duplicate parser category: " + category);
				//	throw new RuntimeException("Error: duplicate parser category: " + category);
			}

			categories.put(category, parser);
		});
	}

	/**
	 * Gets the parser capable of parsing the given category
	 * @param category
	 * @param boot if true, try to get overloaded boot parser first.
	 * @return the parser or null if the no parser handle the given category
	 */
	final public Parser getParser(String category, boolean boot)
	{
		Parser parser = null;
		if (boot && bootParsers != null)
			parser = bootParsers.get(category);
		if (parser == null)
			parser = parsers.get(category);
		return parser == null ? null : parser.parser();
	}

	/**
	* This class delegates (child then parent) for the findClass method for a URLClassLoader.
	* We need this because findClass is protected in URLClassLoader
	*/
	private static class ChildURLClassLoader extends URLClassLoader
	{
		private ClassLoader realParent;

		public ChildURLClassLoader(URL[] urls, ClassLoader realParent)
		{
			super(urls, null);
			this.realParent = realParent;
		}

		@Override
		public Class<?> findClass(String name) throws ClassNotFoundException
		{
			if (name.startsWith("org.transscript."))
			{
				try
				{
					// first try to use the URLClassLoader findClass
					return super.findClass(name);
				}
				catch (ClassNotFoundException e)
				{
					// if that fails, we ask our real parent classloader to load the class (we give up)
					return realParent.loadClass(name);
				}
			}

			return realParent.loadClass(name);
		}
	}
 
}
