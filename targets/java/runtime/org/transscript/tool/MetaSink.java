package org.transscript.tool;

import org.transscript.runtime.Sink;
import org.transscript.runtime.Variable;

/**
 * Extends {@link Sink} with meta events.
 * 
 * <p>The abstract grammar described by the events below is:
 * <pre>
 * term 
 *   : {type} {start} CONSTRUCTOR bterm* {end}
 *   | {var}VARIABLE
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
 *   
 * term 
 *   : {@link #start} CONSTRUCTOR bterm* {@link #end}
 *   | {@link #use} VARIABLE
 *   | {@link #literal(String)} STRING
 *   | {@link #literal(Double)} DOUBLE
 *   | {@link #startMetaApplication} METAPP term* {@link #startSubstitutes} term* {@link #endSubstitutes} {@link #endMetaApplication} 
 *   ;
 *   
 * bterms
 * 	 : term
 *   | {@link #bind} VARIABLE bterms
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
	public abstract Sink startMetaApplication(String name);
 
	/**
	 * End of previously started meta-application subterm.
	 * @return this sink 
	 */
	public abstract Sink endMetaApplication();

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

	/**
	 * Receive meta-application simple type or constructor qualifier
	 */
	public abstract Sink type(String type);

}
