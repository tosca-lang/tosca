/* Copyright © 2008,201 IBM Corporation. */

package org.transscript.runtime;

import java.io.Reader;
import java.util.Map;
 
/**
 * Instances permit creation of TransScript terms from text.
 * 
 * @author Lionel Villard
 */
public interface Parser
{

	/** The categories supported by this parser. May repeat categories and may not include null even if supported. */
	public Iterable<String> categories();

	/**
	 * All parsers for actual use must be retrieved by this method.
	 * Each parser retrieved in this way can be used once, 
	 * and be aware that TransScript may keep several parsers running simultaneously.
	 */
	public Parser parser();
	
	/**
	 * Read complete term from text and send it to a sink. 
	 * 
	 * @param sink to send the term that is read to
	 * @param category to parse (or null for the default)
	 * @param reader with term to parse - left ready to read text after the term
	 * @param unit to identify the source of the compilation unit (null for none)
	 * @param line number of the first line (1-based)
	 * @param column of the first column (1- based)
	 * @param map 
	 * @param bound variables that are bound in the context (null allowed if none) TODO
	 * @return sink after it has been sent the read term
	 */
	public Sink parse(Sink sink, String category, Reader reader, String unit, int line, int column, Map<String, Variable> bounds);

	/** Set verbosity of parser (to track down grammar errors). */
	public void setParserVerbose(boolean verbose);

	/** Set whether parser includes properties that track the extent of each constructor. */
	public void setParserLocation(boolean captureLocations);

}
