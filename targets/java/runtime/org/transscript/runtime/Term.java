// Copyright (c) 2014 IBM Corporation.

package org.transscript.runtime;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Base class for all boxed TransScript entities
 * 
 * @author Lionel Villard
 */
public abstract class Term extends Reference
{

	/** Kind of term */
	public enum Kind {
		/** Term is construction. */
		CONSTRUCTION, /** Term is a variable occurrence. */
		VARIABLE_USE, /** Term is a meta-application. */
		META_APPLICATION
	}

	// Static utilities

	/**
	 * Whether the given term is a constant: a construction with no argument. 
	 * 
	 * @param term
	 */
	public static boolean isConstant(Term term)
	{
		return term.kind() == Kind.CONSTRUCTION && term.arity() == 0;
	}

	/**
	 * Whether the given term is a function 
	 * 
	 * @param term
	 */
	public static boolean isFunction(Term term)
	{
		return term.kind() == Kind.CONSTRUCTION && ((Construction) term).descriptor().isFunction();
	}

	/**
	 * Whether the given term is a (boxed) literal 
	 * 
	 * @param term
	 */
	public static boolean isLiteral(Term term)
	{
		return term.descriptor() == Literal.LITERAL_DESC;
	}

	/**
	 * Whether the given term is a variable use 
	 * 
	 * @param term
	 */
	public static boolean isVariableUse(Term term)
	{
		return term.kind() == Kind.VARIABLE_USE;
	}

	// State

	/** Whether this term is in normal form */
	private boolean nf;

	/** Whether this term has no step */
	private boolean nostep; // TODO: might not need it with new runtime.

	// Methods

	@Override
	public Term ref()
	{
		return (Term) super.ref();
	}

	/** Gets term descriptor (type) */
	public ConstructionDescriptor descriptor()
	{
		return null;
	}

	/** Normal form? */
	public boolean isNf()
	{
		return nf;
	}

	/** Set normal form flag */
	public void setNf(boolean nf)
	{
		this.nf = nf;
	}

	/** Whether the term has no step */
	final public boolean nostep()
	{
		return nostep;
	}

	/** Set whether term has a step */
	final public void setNostep(boolean nostep)
	{
		this.nostep = nostep;
	}

	/**
	 * Gets term's kind
	 */
	public abstract Kind kind();

	/**
	 * Gets the construction symbol.
	 * 
	 * @return symbol of the construction, or null if not a construction.
	 */
	public String symbol()
	{
		return null;
	}

	/**
	 * Peek at the properties
	 * 
	 * @return properties.
	 */
	public Properties properties()
	{
		throw new RuntimeException("Invalid call to properties on a non-construction term");
	}

	/**
	 * Peek at the ith subterm.
	 * 
	 * @param i
	 * @return a subterm Does not create a new reference.
	 * @throws IndexOutOfBoundsException when no subterm at the given index
	 */
	// TODO: make is protected.
	public Term sub(int i)
	{
		throw new IndexOutOfBoundsException();
	}

	/**
	 * Replace the ith sub term
	 * 
	 * @param i
	 *            the sub index
	 * @param term
	 *            the term. The reference is transferred.
	 * @throws IndexOutOfBoundsException
	 *             when no subterm at the given index
	 */
	// TODO: make is protected.
	public void setSub(int i, Term term)
	{
		throw new IndexOutOfBoundsException();
	}

	/**
	 * @return the term arity
	 */
	public int arity()
	{
		return 0;
	}

	/**
	 * Get binders of the ith subterm.
	 * 
	 * @param index
	 * 
	 * @return a list of binders.
	 * @throws IndexOutOfBoundsException
	 *             if no subterm at the given index
	 */
	public Variable[] binders(int i)
	{
		throw new RuntimeException("Invalid call to binders(int i) on a non-construction term");
	}

	/**
	 * Set ith binder of the jth subterm.
	 * 
	 * @param i subterm index
	 * @param j subbinder index
	 * @throws IndexOutOfBoundsException if no subterm / binder or at the given index
	 */
	public void setBinder(int i, int j, Variable binder)
	{
		throw new RuntimeException("Invalid call to binders(int i) on a non-construction term");
	}

	/**
	 * Deep copy this term to a sink 
	 *
	 * @param sink to copy to 
	 * @param discard whether to discard this term
	 */
	public abstract void copy(Sink sink, boolean discard);

	/**
	 * Apply substitution on this term and send result to sink
	 * 
	 * <p>
	 * Either update this term or copy it, depending if it is shared or not.
	 * 
	 * <p>
	 * When this method is called, it owns a reference to itself.
	 * 
	 * @param sink where to send result
	 * @param binders term original binders.
	 * @param substitutes
	 * @return sink.
	 */

	public Sink substitute(Sink sink, Variable[] binders, Term[] substitutes)
	{
		assert binders.length == substitutes.length;

		// binders are all the original term binders
		// this.binders are the binders that have been renamed.

		IdentityHashMap<Variable, Term> map = new IdentityHashMap<>();
		for (int i = binders.length - 1; i >= 0; i--)
			map.put(binders[i], substitutes[i]);

		sink.copy(substitute(sink.context(), map)); // uses term reference.

		// Release substitute references
		for (int i = 0; i < substitutes.length; ++i)
			substitutes[i].release();

		return sink;
	}

	/**
	 * Apply substitution on this term. 
	 * 
	 * <p>
	 * Either update this term or copy it, depending if it is shared or not.
	 * 
	 * <p>
	 * When this method is called, it owns a reference to itself.
	 * 
	 * @param context
	 * @param binders term original binders.
	 * @param substitutes
	 * @return a lone substituted term reference .
	 */
	final public Term substitute(Context context, Map<Variable, Term> substitutes)
	{
		//TODO: in place update

		BufferSink buffer = context.makeBuffer();
		substituteTo(buffer, substitutes);
		Term term = buffer.term();
		//buffer.free(context);
		return term;
	}

	/**
	 * Apply substitution on this term and send result to sink. 
	 * 
	 * @param context
	 * @param binders term original binders.
	 * @param substitutes
	 * @return a lone substituted term reference .
	 */
	protected abstract void substituteTo(Sink sink, Map<Variable, Term> substitutes);

	/**
	 * Whether this and that term are equal except for specific variables in this being renamed to variables in that.
	 * @param other other term to compare to
	 * 
	 * @return true if terms are equals
	 */
	final public boolean deepEquals(Term other)
	{
		return deepEquals(other, new IdentityHashMap<>());
	}

	/**
	 * Whether this and that term are equal except for specific variables in this being renamed to variables in that.
	 * @param other other term to compare to
	 * @param renamings of variables in this to variables in other
	 * 
	 * @return true if terms are equals
	 */
	protected abstract boolean deepEquals(Term other, Map<Variable, Variable> renamings);

	public abstract String toString4();
}
