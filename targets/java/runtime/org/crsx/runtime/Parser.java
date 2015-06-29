/* Copyright © 2008,201 IBM Corporation. */

package org.crsx.runtime;

import java.io.Reader;

import net.sf.crsx.Factory;
 
/**
 * Instances permit creation of new CRSX terms from text.
 * Parsers must have a nullary constructor, and the first thing after construction is that the {@link #setFactory(Factory)} method is invoked.
 * 
 * @author Lionel Villard
 * @author Kristoffer Rose 
 */
public interface Parser
{

	/** The categories supported by this parser. May repeat categories and may not include null even if supported. */
	public Iterable<String> categories();

	/**
	 * All parsers for actual use must be retrieved by this method, providing a factory.
	 * Each parser retrieved in this way can be used once, and be aware that CRSX may keep several parsers running simultaneously.
	 */
	public Parser parser();
	
	/**
	 * Read complete term from text and send it to a sink. 
	 * 
	 * @param sink to send the term that is read to
	 * @param category to parse (or null for the default or "?xml" for CRSX/XML)
	 * @param reader with term to parse - left ready to read text after the term
	 * @param unit to identify the source of the compilation unit (null for none)
	 * @param line number of the first line (1-based)
	 * @param column of the first column (1- based)
	 * @param bound variables that are bound in the context (null allowed if none) TODO
	 * @return sink after it has been sent the read term
	 */
	public Sink parse(Sink sink, String category, Reader reader, String unit, int line, int column);

	/** Set verbosity of parser (to track down grammar errors). */
	public void setParserVerbose(boolean verbose);

	/** Set whether parser includes properties that track the extent of each constructor. */
	public void setParserLocation(boolean captureLocations);
}
