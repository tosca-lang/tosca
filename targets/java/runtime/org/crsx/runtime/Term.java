// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.util.Map;

/**
 * A Term.
 * 
 * @author villardl
 */
public abstract class Term extends Reference
{
	/* Kind of term */
	public enum Kind {
		/** Term is construction. */
		CONSTRUCTION,
		/** Term is a variable occurrence. */
		VARIABLE_USE,
		/** Term is a meta-application. */
		META_APPLICATION
	}

	// Static utilities

	/**
	 * Whether the term is a constant.
	 * @param term
	 */
	public static boolean isConstant(Term term)
	{
		return term != null && term.isConstruction() && term.arity() == 0;
	}

	// State

	/** Whether this term is in normal form */
	private boolean nf;

	/** Whether this term has no step */
	private boolean nostep;

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
	 * @return true if this term represents a function
	 */
	public boolean isFunction()
	{
		return false;
	}

	/**
	 * @return true if this term is a variable use
	 */
	public boolean isVariableUse()
	{
		return false;
	}

	/**
	 * @return true if this term is a construction
	 */
	public boolean isConstruction()
	{
		return false;
	}

	/**
	 * @return true if this term is a literal
	 */
	public boolean isLiteral()
	{
		return false;
	}

	/**
	 * @return Term as a construction. Does not create a new reference.
	 */
	final public Construction asConstruction()
	{
		return (Construction) this;
	}

	/**
	 * Gets the term symbol
	 * 
	 * @return Term symbol (always interned).
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
	 * @throws IndexOutOfBoundsException
	 *             when no subterm at the given index
	 */
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

}
