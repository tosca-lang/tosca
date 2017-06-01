// Copyright (c) 2014 IBM Corporation.
package org.transscript.runtime;

/**
 * Consumes simple term events.
 * 
 * <p>The simple term abstract syntax is defined by this grammar:
 * <pre>
 * term 
 *   : {@link #start} CONSTRUCTOR bterm* {@link #end}
 *   | {@link #use} VARIABLE
 *   | {@link #literal(String)} STRING
 *   | {@link #literal(Double)} DOUBLE
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
	public Sink start(ConstructionDescriptor descriptor)
	{
		return this;
	}

	/**
	 * End of construction.
	 * 
	 * @return this sink
	 */
	public Sink end()
	{
		return this;
	}

	/**
	 * Receives the declaration of a bound variable. 
	 * 
	 * @param binder to be bound here. The {@link Ref reference} is used by this method.
	 * @return this sink.
	 */
	public Sink bind(Variable binder)
	{
		return this;
	}
	
	/**
	 * Insert variable occurrence subterm.
	 * 
	 * @param variable to reference. The {@link Ref reference} is used by this method.
	 * @return this sink
	 */
	public Sink use(Variable variable)
	{
		return this;
	}

	/**
	 * Insert string literal subterm.
	 * 
	 * @param literal to add
	 * @return this sink
	 */
	public Sink literal(String literal)
	{
		return this;
	}
	
	/**
	 * Insert double literal subterm.
	 * 
	 * @return this sink
	 */
	public Sink literal(double literal)
	{
		return this;
	}

	/**
	 * Copy given term
	 * @param term
	 */
	public Sink copy(Term term)
	{
		return this;
	}
	
	/**
	 * Receive location
	 * @param term
	 */
	public Sink loc(int line, int column)
	{
		return this;
	}
	
	
	/**
	 * @return the context
	 */
	public abstract Context context();

}
