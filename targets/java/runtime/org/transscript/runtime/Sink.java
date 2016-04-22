// Copyright (c) 2014 IBM Corporation.
package org.transscript.runtime;

/**
 * Consumes Term events.
 * 
 * @author Lionel Villard
 */
public abstract class Sink
{

	/**
	 * Start construction.
	 * 
	 * @param descriptor of the construction
	 * 
	 * @return continuation sink to use for subsequent operation
	 */
	public abstract Sink start(ConstructionDescriptor descriptor);

	/**
	 * End of constructor subterm
	 * 
	 * @return continuation sink to use for subsequent operation
	 */
	public abstract Sink end();

	/**
	 * Insert binder wrapper around current construction subterm.
	 * 
	 * @param binders to be bound here - <em>must</em> be fresh (not used in any
	 *            existing terms)
	 * @return continuation sink to use for subsequent operation (never null)
	 */
	public abstract Sink bind(Variable binder);

	/**
	 * Receives a formal parameter
	 * 
	 * @param  to be bound here - <em>must</em> be fresh (not used in any
	 *            existing terms). All variable references are used by this method
	 * @return continuation sink to use for subsequent operation (never null)
	 */
	public abstract Sink param(Variable param);
	
	/**
	 * Insert variable occurrence subterm.
	 * 
	 * @param variable to reference. The reference is *NOT* used by this method.
	 * @return continuation sink to use for subsequent operation
	 */
	public abstract Sink use(Variable variable);

	/**
	 * Insert string literal subterm.
	 * 
	 * @param literal to add
	 * @return continuation sink to use for subsequent operation
	 */
	public abstract Sink literal(String literal);
	
	/**
	 * Insert double literal subterm.
	 * 
	 * @param literal to add
	 * @return continuation sink to use for subsequent operation
	 */
	public abstract Sink literal(double literal);

	
	/**
	 * Start a meta-application.
	 * @param name of meta-variable to use
	 * @return continuation sink to use for subsequent operation (never null)
	 */
	public abstract Sink startMetaApplication(String name);
 
	/**
	 * End of previously started meta-application subterm.
	 * @return continuation sink to use for subsequent operation
	 *     - may return <b>null</b> if it does not make sense to send further events
	 */
	public abstract Sink endMetaApplication();


	/**
	 * Start meta-application substitutes
	 * 
	 * @return continuation sink to use for subsequent operation
	 */
	public abstract Sink startSubstitutes();
	
	/**
	 * Ends meta-application substitutes
	 * 
	 * @return continuation sink to use for subsequent operation
	 */
	public abstract Sink endSubstitutes();
	
	/**
	 * @return the context
	 */
	public abstract Context context();

}
