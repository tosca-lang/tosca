package org.transscript.tool;

import org.transscript.runtime.Sink;
import org.transscript.runtime.Variable;

/**
 * Extends {@link Sink} with meta events.
 * 
 * <p>The abstract grammar described by the events below is:
 * <pre>
 * term 
 *   : CONSTRUCTOR bterm*
 *   | VARIABLE
 *   | STRING
 *   | DOUBLE
 *   | METAPP term* term*
 *   ;
 *   
 * bterms
 * 	 : term
 *   | VARIABLE bterms
 *   | PARAM bterms
 *   ;
 * </pre>
 * 
 * @author Lionel Villard
 */
public abstract class MetaSink extends Sink
{

	/**
	 * Receives a formal parameter
	 * 
	 * @param param to be bound here   
	 * @return this sink 
	 */
	public abstract Sink param(Variable param);
	
	/**
	 * Start a meta-application.
	 * 
	 * Expect receiving apply arguments
	 * 
	 * @param name of meta-variable to use
	 * @return this sink 
	 */
	public abstract MetaSink startMetaApplication(String name);
 
	/**
	 * End of previously started meta-application subterm.
	 * @return this sink 
	 */
	public abstract MetaSink endMetaApplication();

	/**
	 * Start meta-application substitutes
	 * 
	 * @return this sink
	 */
	public abstract Sink startSubstitutes();
	
	/**
	 * Ends meta-application substitutes
	 * 
	 * @return this sink
	 */
	public abstract Sink endSubstitutes();

}
