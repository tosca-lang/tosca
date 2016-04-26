// Copyright (c) 2014 IBM Corporation.
package org.transscript.runtime;

/**
 * Consumes simple term events.
 * 
 * <p>The simple term abstract syntax is defined by this grammar:
 * <pre>
 * term 
 *   : CONSTRUCTOR bterm*
 *   | VARIABLE
 *   | STRING
 *   | DOUBLE
 *   ;
 *   
 * bterms
 * 	 : term
 *   | VARIABLE bterms
 *   ;
 * </pre>
 * 
 * @author Lionel Villard
 */
public abstract class Sink
{

	/**
	 * Start of construction.
	 *
	 * The following events are the construction arguments, either terms or bound terms.
	 * 
	 * @param descriptor of the construction
	 * @return this sink
	 */
	public abstract Sink start(ConstructionDescriptor descriptor);

	/**
	 * End of construction.
	 * 
	 * @return this sink
	 */
	public abstract Sink end();

	/**
	 * Receives the declaration of a bound variable. 
	 * 
	 * @param binder to be bound here. The {@link Ref reference} is used by this method.
	 * @return this sink.
	 */
	public abstract Sink bind(Variable binder);
	
	/**
	 * Insert variable occurrence subterm.
	 * 
	 * @param variable to reference. The {@link Ref reference} is used by this method.
	 * @return this sink
	 */
	public abstract Sink use(Variable variable);

	/**
	 * Insert string literal subterm.
	 * 
	 * @param literal to add
	 * @return this sink
	 */
	public abstract Sink literal(String literal);
	
	/**
	 * Insert double literal subterm.
	 * 
	 * @param literal to add
	 * @return this sink
	 */
	public abstract Sink literal(double literal);
	
	/**
	 * @return the context
	 */
	public abstract Context context();

}
