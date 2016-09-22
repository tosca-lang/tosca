// Copyright (c) 2014 IBM Corporation.
package org.transscript.runtime;

/**
 * Represent a reference to an instance (this object itself).
 * 
 * <p>
 * A Term (and Properties) instance can be shared in the term tree. A term is
 * shared when one of these conditions is satisfied:
 * <ul>
 * <li>the reference count is greater than 1
 * <li>the reference count is one and one of the ancestors has a reference
 * count greater than 1.
 * </ul>
 * 
 * <p>
 * Since terms don't keep a link to their parent, sharing can only be
 * determined by the rewriting engine.
 * 
 * @author villardl
 */
public abstract class RefImpl implements Ref
{
	// Special value indicating the reference as been released and shouldn't be used anymore
	final public static int RELEASED = Integer.MIN_VALUE; 
	
	/** Safe reference counting: check for null value */
	@SuppressWarnings("unchecked")
	final public static <T extends RefImpl> T safeRef(T ref)
	{
		return ref == null ? null : (T) ref.ref();
	}
	
	/**
	 * Number of references to this instance.
	 */
	protected int refcount;
	
	/** Create one reference */
	protected RefImpl()
	{
		refcount = 1;
	}

	/**
	 * Create a new reference
	 * 
	 * @return A new reference (itself)
	 */
	public Ref ref()
	{
		assert refcount > 0 : "Cannot create reference from a freed reference.";
		
		refcount ++;
		return this;
	}

	/**
	 * Release the reference 
	 */
	final public void release()
	{
		assert refcount > 0 : "Too many calls to Release.";
			
		refcount--;
		if (refcount == 0)
			free();
	}

	/**
	 * Free this reference. 
	 * 
	 * Should not be called directly. Instead call {@link RefImpl#release()}
	 */
	protected void free()
	{
		assert refcount == 0;
		refcount = RELEASED;
	}

	/**
	 * @return the number of references
	 */
	final public int refcount()
	{
		assert refcount > 0;
		return refcount;
	}

}
