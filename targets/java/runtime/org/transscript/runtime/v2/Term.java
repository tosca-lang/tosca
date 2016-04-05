// Copyright (c) 2014 IBM Corporation.

package org.transscript.runtime.v2;

import java.util.IdentityHashMap;
import java.util.Map;

import org.transscript.runtime.Context;  

/**
 * Base class for all terms.
 * 
 * @author Lionel Villard
 */
public interface Term extends Ref
{
	/**
	 * Box primitive string value
	 */
	static Term box(String value)
	{
		return new StringLiteral(value);
	}

	
	@Override
	default Term ref()
	{
		return (Term) Ref.super.ref();
	}

	/**
	 * @return shallow copy of this term. 
	 */
	public Term copy(Context c);

	/**
	 * Peek at the ith subterm.
	 * 
	 * @param i the sub index
	 * @return a subterm or null. does not create a new reference.  
	 */
	default Term sub(int i)
	{
		return null;
	}

	/**
	 * Replace the ith sub term
	 * 
	 * @param i the sub index
	 * @param term the term. The reference is transferred.
	 * @throws IndexOutOfBoundsException when no subterm at the given index
	 */
	default void setSub(int i, Term sub)
	{
		throw new IndexOutOfBoundsException();
	}

	/**
	 * Get binders of the ith subterm.
	 * 
	 * @param index
	 * @return a binder, or null.
	 */
	default Variable binder(int i, int j)
	{
		return null;
	}

	/**
	 * Set jth binder of the ith subterm.
	 * 
	 * @param i subterm index
	 * @param j subbinder index
	 * @throws IndexOutOfBoundsException if no subterm / binder or at the given index
	 */
	default void setBinder(int i, int j, Variable var)
	{
		throw new IndexOutOfBoundsException();
	}

	@SuppressWarnings("unchecked")
	static <T extends Term> T force(Context c, T term)
	{
		return (T) term.force(c);
	}

	default Term force(Context c)
	{
		return eval(c);
	}

	/**
	 * Evaluates lazy function. 
	 * @param context
	 * @return
	 */
	default Term eval(Context context)
	{
		return this;
	}

	@SuppressWarnings("unchecked")
	static <T extends Term> T subst(Context c, T term, Object... substitutes)
	{
		return (T) term.substitute(c, substitutes);
	}

	/**
	* Apply substitution on this term
	* 
	* <p>
	* Either update this term or copy it, depending if it is shared or not.
	* 
	* <p>
	* When this method is called, it owns a reference to itself.
	* 
	* @param binders term original variables.
	* @param substitutes 
	* @return 
	*/
	default Term substitute(Context c, Object... substitutes)
	{
		IdentityHashMap<Variable, Term> map = new IdentityHashMap<>();
		for (int i = 0; i < substitutes.length; i += 2)
			map.put((Variable) substitutes[i], (Term) substitutes[i + 1]);

		Term result = substitute(c, map);

		// Release substitute references
		for (int i = 0; i < substitutes.length; i += 2)
			((Term) substitutes[i + 1]).release();

		return result;
	}

	default Term substitute(Context c, Map<Variable, Term> substitutes)
	{
		Term copy = copy(c);

		int i = 0;
		while (true)
		{
			Term sub = sub(i); // Take a peek at sub.
			if (sub == null)
				break;

			if (binder(i, 0) == null)
			{
				// --  i'th subterm with no binders: just continue copying.
				if (substitutes.isEmpty())
				{
					// Nothing to substitute: just reference sub
					copy.setSub(i, sub.ref());
				}
				else
				{
					// Recursively substitute.  
					// Make sure sub is not a lazy function so that substitution can be recursively be applied.
					// An alternative algorithm (not implemented yet) is to lazily performed substitution.
					sub = sub.eval(c);
					copy.setSub(i, sub.ref().substitute(c, substitutes));
				}
			}
			else
			{
				// -- i'th subterm with binders, second and following copy: add new binders to substitution!
				int j = 0;
				while (true)
				{
					Variable oldbinder = binder(i, j);
					if (oldbinder == null)
						break;

					Variable subbinder = c.makeRefVariable(oldbinder.name);

					substitutes.put(oldbinder, subbinder.use());
					copy.setBinder(i, j, subbinder);
					j++;
				}

				sub = sub.eval(c);
				copy.setSub(i, sub.ref().substitute(c, substitutes));

				// Cleanup
				j = 0;
				while (true)
				{
					Variable oldbinder = binder(i, j);
					if (oldbinder == null)
						break;

					substitutes.remove(oldbinder).release();
					j++;
				}
			}
			i++;
		}
		return copy;
	}

}
