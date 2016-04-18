// Copyright (c) 2014 IBM Corporation.

package org.transscript.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Rewrite engine.
 * 
 * @author villardl
 */
public class Normalizer
{

	/**
	 * Normalize term returned by the intialization method
	 * 
	 * @param context
	 * @param main returning an evaluated or partially evaluated term.
	 * @param args 
	 * @return normalized term.
	 * 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public static Term normalize(Context context, Method main, StringTerm... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		context.sd = 0;
		Object[] objs = new Object[1 + (args == null ? 0 : args.length)];
		objs[0] = context;
		if (args != null)
			System.arraycopy(args, 0, objs, 1, args.length);
		Term term = (Term) main.invoke(null, objs);
		return normalize(context, term);
	}
	
	/**
	 * Normalize term
	 * 
	 * @param context
	 * @param term The reference is used by this method.
	 * @return normalized term.
	 */
	public static Term normalize(Context context, Term term)
	{
		context.sd = 0;
		
		term = term.eval(context);

		return term;
	}
//
//	Term compute(Context context, Term term)
//	{
//		term = normalize(context, term);
//		return term;
//	}
//
//	/**
//	 * Execute one step
//	 * @param sink
//	 * @param term
//	 * @return
//	 */
//	final public static boolean step(Context context, Sink sink, Construction term)
//	{
//		assert term.descriptor() != null;
//
//		context.sd = 0;
//		if (context.verbose >= 1)
//		{
//			System.out.println(term.symbol());
//			if (context.verbose >= 2)
//				System.out.println(term);
//		}				
//				
//		return term.descriptor().step(sink, term);
//	}
//
//	/**
//	 * Normalize term
//	 * 
//	 * @param context
//	 * @param term The reference is used by this method.
//	 * @param ancestors Term ancestors
//	 * @return normalized term.
//	 */
//	public static Term normalize(Context context, Term term)
//	{
//		if (term.isNf())
//			return term;
//
//		ArrayDeque<SubTerm> stack = new ArrayDeque<>();
//		while (true)
//		{
//			if (term.isNf())
//			{
//				if (stack.isEmpty())
//					return term; // updated term; reference transferred back.
//
//				// Store term in normal form back to parent.
//				Term parent = stack.peek().term.ref();
//				int parentIndex = stack.peek().index;
//				parent.setSub(parentIndex, term); // term reference transferred to subterm pointer
//
//				final int parentArity = parent.arity();
//				if (++parentIndex < parentArity)
//				{
//					// (2) If term is marked as nf (or a variable) with a parent and a following sibling then advance to the
//					// following sibling.
//					stack.peek().index = parentIndex;
//
//					term = parent.sub(parentIndex); // Transfer sub reference to local term
//					//parent.setSub(parentIndex, null); // Not strictly needed
//
//					parent.release();
//				}
//				else
//				{
//					// (3) If term is marked as nf (or a variable) with a parent but no following sibling then pop to parent.
//					term = parent; // transfer parent reference to term
//					stack.peek().term.release();
//					stack.pop();
//
//					// propagateFreeVariables(context, parent);
//				}
//
//			}
//			else if (Term.isFunction(term) && !term.nostep())
//			{
//				BufferSink sink = context.makeBuffer();
//				if (step(context, sink, (Construction) term)) // Reference is transferred and always consumed 
//				{
//					// (4) If term is a function invocation that is not marked as nostep and that we can in fact step then do so and
//					// update term to the result.
//					term = sink.term(); // Reference is transferred
//				}
//				else
//				{
//					// (5) If term is a function invocation that is not marked as nostep and that we can in fact not step then mark it
//					// (Note: failed step output thunk to buffer)
//					term = sink.term();
//					term.setNostep(true);
//				}
//			}
//			else
//			{
//				int index = 0;
//				final int arity = term.arity();
//				while (index < arity && term.sub(index).isNf())
//					++index;
//
//				if (index < arity)
//				{
//					// (6) If term is a non-nf data term or a nostep function application with a non-nf child then clear nostep if it
//					// is a function, push term, and switch to that child.
//					if (term.kind() == Kind.CONSTRUCTION)
//						((Construction) term).setNostep(false);
//
//					stack.push(new SubTerm(term.ref(), index));
//					term.release(); // TODO: really just reference transfer from term to stack
//
//					term = term.sub(index); // Transfer sub reference to local term
//					// term.setSub(index, null); // Not strictly needed
//				}
//				else
//				{
//					// (7) If term is a non-nf data term or a nostep function
//					// application with only nf children then mark it as nf.
//					term.setNf(true);
//				}
//			}
//		}
//	}
//
//	/**
//	 * Forces term evaluation until step fails. 
//	 * @param context
//	 * @param term A reference to a term. Consumed.
//	 * @return an reference to the evaluated term
//	 */
//	public static Term force(Context context, Term term)
//	{
//		if (!term.nostep())
//		{
//			while (Term.isFunction(term))
//			{
//				BufferSink sink = context.makeBuffer();
//				if (!step(context, sink, (Construction) term)) // Reference is transferred and always consumed            
//				{
//
//					term = sink.term();
//					term.setNostep(true);
//
//					//sink.free();
//					break;
//				}
//				term = sink.term(); // reload and try again...
//				//sink.free();
//			}
//		}
//		return term;
//	}
//
//	/**
//	 * Forces sub evaluation until step fails. Update parent with new sub.
//	 * @param context
//	 * @param parent the sub's parent term
//	 * @param i the sub index
//	 * @return a peek (not a reference) at the evaluated sub.
//	 */
//	public static Term forceSub(Context context, Term parent, int i)
//	{
//		assert parent.arity() > i : "Index out of bounds";
//
//		Term sub = force(context, parent.sub(i));
//		parent.setSub(i, sub);
//		return sub;
//	}
//
//	/**
//	 * Represents a subterm (Internal).
//	 */
//	private static class SubTerm
//	{
//		public Term term; // The subterm
//		public int index; // The subterm position in its parent.
//
//		public SubTerm(Term term, int index)
//		{
//			this.term = term;
//			this.index = index;
//		}
//	}
//
//	/**
//	 * Create a thunk. 
//	 */
//	final public static boolean thunk(Sink sink, DynamicFunctionDescriptor descriptor, Object... args)
//	{
//		return descriptor.thunk(sink, args);
//	}
//
//	/**
//	 * Drop the given value and returns null	
//	 */
//	final public static <R> R drop(Object obj)
//	{
//		return null;
//	}
}
