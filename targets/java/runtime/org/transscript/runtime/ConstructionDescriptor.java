// Copyright (c) 2014-2016 IBM Corporation.

package org.transscript.runtime;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Represent a construction type.
 * 
 * @author villardl
 */
public interface ConstructionDescriptor
{
	/**
	 * @return A construction instance
	 */
	public Construction make();

	/**
	 * @return Construction symbol.
	 */
	public String symbol();

	/**
	 * @return Whether this construction represents a Function.
	 */
	public boolean isFunction();

	/**
	 * Evaluates function and send result to sink.
	 * 
	 * @param sink send the result to
	 * @param term thunk to evaluate. The reference is consumed only  when evaluation succeed.
	 * 
	 * @return true is evaluation succeeded, false otherwise. 
	 */
	public boolean step(Sink sink, Term term);

	/**
	 * @return The number of subterms
	 */
	public int arity();

	public Term sub(Construction construction, int i);

	public void setSub(Construction construction, int i, Term term);

	public Variable[] binders(Construction construction, int i);

	public void setBinder(Construction construction, int i, int j, Variable binder);

	// Static helpers

	/**
	 * Make a generic data descriptor
	 */
	public static ConstructionDescriptor makeData(String symbol)
	{
		return new DataDescriptor(symbol);
	}

	/**
	 * Make a typed data descriptor
	 * @param symbol Global data symbol
	 */
	public static ConstructionDescriptor makeData(String symbol, int arity, Class<? extends Construction> clss)
	{
		return new DynamicDataDescriptor(symbol, arity, clss);
	}

	/**
	 * Make a function type.
	 */
	public static DynamicFunctionDescriptor makeFunction(String symbol, Class<?> cls, String methodName, Class<? extends Thunk> sortClass, int[] subindex)
	{
		return new DynamicFunctionDescriptor(symbol, cls, methodName, sortClass, subindex);
	}

	/**
	 * Make a function type.
	 */
	public static DynamicFunctionDescriptor makeFunction(String symbol, Class<?> cls, String methodName)
	{
		return new DynamicFunctionDescriptor(symbol, cls, methodName, null, null);
	}

	/**
	 * Generic Data construction.
	 */
	public static abstract class BaseDescriptor implements ConstructionDescriptor
	{

		@Override
		public Term sub(Construction construction, int i)
		{
			throw new IndexOutOfBoundsException();
		}

		@Override
		public void setSub(Construction construction, int i, Term term)
		{
			throw new IndexOutOfBoundsException();

		}

		@Override
		public Variable[] binders(Construction construction, int i)
		{
			throw new IndexOutOfBoundsException();
		}

		@Override
		public void setBinder(Construction construction, int i, int j, Variable binder)
		{
			throw new IndexOutOfBoundsException();
		}

	}

	/**
	 * Generic Data construction.
	 */
	public static class DataDescriptor extends BaseDescriptor
	{
		/** Data symbol */
		protected String symbol;

		/** Data arity */
		protected int arity;

		public DataDescriptor(String symbol)
		{
			this.symbol = symbol.intern();
		}

		public DataDescriptor(String symbol, int arity)
		{
			this.symbol = symbol.intern();
			this.arity = arity;
		}

		@Override
		public String symbol()
		{
			return symbol;
		}

		@Override
		public boolean isFunction()
		{
			return false;
		}

		@Override
		public boolean step(Sink sink, Term data)
		{
			throw new RuntimeException("Data term does not have a step function");
		}

		@Override
		public Construction make()
		{
			return new GenericConstruction(this, null);
		}

		@Override
		public int arity()
		{
			return arity;
		}
	}

	/**
	 * Dynamic data construction using Java reflection API to create new instances.
	 */
	public static class DynamicDataDescriptor extends DataDescriptor
	{
		/** The class representing value of this descriptor */
		protected Class<? extends Construction> clss;

		public DynamicDataDescriptor(String symbol, int arity, Class<? extends Construction> clss)
		{
			super(symbol, arity);

			this.clss = clss;
		}

		@Override
		public Construction make()
		{
			try
			{
				return clss.newInstance();
			}
			catch (Exception e)
			{
				throw new RuntimeException(e); // Just propagate as it's a symptom a bad code generation.
			}
		}

	}

	/**
	 * Represent a function construction relying an Java reflection API to unwrap term arguments.
	 */
	public static class DynamicFunctionDescriptor implements ConstructionDescriptor
	{

		/** Function symbol */
		protected String symbol;

		/** The static method to invoke */
		protected Method method;

		/** The thunk class constructor */
		protected Constructor<? extends Thunk> thunkConstructor;

		/** Sub starting index */
		protected int[] subindex;

		/**
		 * 
		 * @param symbol
		 * @param cls
		 * @param methodName
		 * @param thunkClass
		 * @param subindex
		 */
		public DynamicFunctionDescriptor(String symbol, Class<?> cls, String methodName, Class<? extends Thunk> thunkClass,
				int[] subindex)
		{
			this.symbol = symbol;
			this.subindex = subindex;

			method = search(cls, methodName);

			if (method == null)
			{
				// This is a declared sort without actual rules.
				// Output a warning
				System.out.println("Warning: Function sort " + symbol + " is declared but has no rules. Ignored");
			}

			if (thunkClass != null)
			{
				try
				{
					this.thunkConstructor = thunkClass.getConstructor(ConstructionDescriptor.class);
				}
				catch (Exception e)
				{
					assert false : "Internal error";
					throw new RuntimeException(e);
				}
			}
		}

		/** Search for method of given name in given class */
		protected Method search(Class<?> clss, String name)
		{
			return Arrays.stream(clss.getMethods()).filter(m -> {
				return m.getName().equals(name);
			}).findFirst().orElse(null);
		}

		/**
		 * Send thunk to sink. Always return false indicating the normalizer the step failed.
		 */
		public boolean thunk(Sink sink, Object... args)
		{
			// backward compatible
			if (subindex == null)
			{
				int i = 0;

				sink.start(this);

				while (i < args.length)
				{
					if (args[i] instanceof Variable)
					{
						int end = i + 1;
						while (args[end] instanceof Variable)
							end++;

						Variable[] binders = new Variable[end - i];
						for (int j = 0; j <= end - i; j++)
							binders[j] = (Variable) args[i++];

						sink.binds(binders);
					}
					else
					{
						sink.copy((Term) args[i++]);
					}
				}

				sink.end();
				return false;
			}

			Thunk thunk;
			try
			{
				// TODO: change signature to avoid copy
				Object[] nargs = new Object[args.length + 1];
				System.arraycopy(args, 0, nargs, 1, args.length);
				
				thunk = thunkConstructor.newInstance(this);
				thunk.setArgs(nargs);
				sink.copy((Term) thunk);
				return false;
			}
			catch (Exception e)
			{
				assert false : "Internal Error";
				throw new RuntimeException(e);
			}
		}

		@Override
		public String symbol()
		{
			return symbol;
		}

		@Override
		public boolean isFunction()
		{
			return true;
		}

		@Override
		public int arity()
		{
			return method.getParameterCount() - 1; // First arg is sink
		}

		@Override
		public boolean step(Sink sink, Term term)
		{
			if (subindex == null)
			{
				assert method != null : "No method found for function " + symbol();
				Object[] args = new Object[method.getParameterCount()];

				args[0] = sink; // sink
				int argp = 1;

				for (int i = 0; i < term.arity(); i++)
				{
					Variable[] binders = term.binders(i);
					if (binders != null)
					{
						for (int j = 0; j < binders.length; j++)
							args[argp++] = binders[j];
					}
					assert argp < args.length : "Too many arguments for function " + symbol();
					args[argp++] = term.sub(i).ref();
				}

				// Remaining argument will be set to null.
				//assert argp == method.getParameterCount() : method.getName() + " not fully bound.";

				term.release(); // done with the thunk

				try
				{
					return (boolean) method.invoke(this, args);
				}
				catch (Exception e)
				{
					throw new RuntimeException(e);
				}
			}

			assert method != null : "No method found for function " + symbol();
			
			Thunk thunk = (Thunk) term;
			final Object[] args = thunk.getArgs();
			((Reference) thunk).release();
			try
			{
				args[0] = sink;
				return (boolean) method.invoke(null, args);
			}
			catch (Exception e)
			{
				throw new RuntimeException(e);
			}

		}

		public Construction make()
		{
			if (subindex == null)
				return new GenericConstruction(this, null);

			try
			{
				Thunk thunk = thunkConstructor.newInstance(this);
				thunk.setArgs(new Object[arity() + 1]);
				return (Construction) thunk;
			}
			catch (Exception e)
			{
				assert false : "Internal Error";
				throw new RuntimeException(e);
			}
		}

		@Override
		public Term sub(Construction c, int i)
		{
			// TODO: box unboxed arguments
			return (Term) ((Thunk) c).getArgs()[subindex[i] + 1];
		}

		@Override
		public void setSub(Construction c, int i, Term term)
		{
			((Thunk) c).getArgs()[subindex[i] + 1] = term;
		}

		@Override
		public Variable[] binders(Construction c, int i)
		{
			final Object[] args = ((Thunk) c).getArgs();

			// Binders are stored before their corresponding sub
			int start = i == 0 ? 0 : subindex[i - 1] + 1;
			int end = subindex[i] - 1;
			if (end > start)
				return null;

			Variable[] binders = new Variable[end - start + 1];
			int j = 0;
			while (start <= end)
				binders[j++] = (Variable) args[start++ + 1];

			return binders;
		}

		@Override
		public void setBinder(Construction c, int i, int j, Variable binder)
		{
			int start = i == 0 ? 0 : subindex[i - 1] + 1;
			((Thunk) c).getArgs()[start + j + 1] = binder;
		}

	}

	/**
	 * Represent a map construction.
	 */
	public static class MapDescriptor extends BaseDescriptor
	{
		protected static MapDescriptor singleton = new MapDescriptor();

		private MapDescriptor()
		{}

		@Override
		public String symbol()
		{
			return "Map";
		}

		@Override
		public boolean isFunction()
		{
			return false;
		}

		@Override
		public boolean step(Sink sink, Term data)
		{
			throw new RuntimeException("Maps do not  have step function");
		}

		@Override
		public Construction make()
		{
			return new GenericConstruction(this, null);
		}

		@Override
		public int arity()
		{
			return 0;
		}
	}

}
