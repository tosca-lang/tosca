// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

/**
 * Represent a reference
 * 
 * <p>
 * A term instance can be shared in the term tree. A term is
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
public interface Ref
{

	/** Typed reference counting */
	@SuppressWarnings("unchecked")
	static <T extends Ref> T ref(T ref)
	{
		return (T) ref.ref();
	}

	default Ref ref()
	{
		return this;
	}

	default void release()
	{}
	
	/**
	 * @return the number of references
	 */
//	public int refcount();
}
