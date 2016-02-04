// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * Represent a construction type.
 * 
 * @author villardl
 */
public abstract class ConstructionDescriptor
{

	/**
	 * Make a data type
	 */
	public static ConstructionDescriptor makeData(String symbol)
	{
		return new DataDescriptor(symbol);
	}

	/**
	 * Make a function type
	 */
	public static ConstructionDescriptor makeFunction(String symbol, Step step)
	{
		return new FunctionDescriptor(symbol, step);
	}

	/**
	 * Make a function type.
	 */
	public static DynamicFunctionDescriptor makeFunction(String symbol, Class<?> cls, String methodName)
	{
		return new DynamicFunctionDescriptor(symbol, cls, methodName);
	}

	/**
	 * @return Construction symbol.
	 */
	public abstract String symbol();

	/**
	 * @return Whether this construction represents a Function.
	 */
	public abstract boolean isFunction();

	/**
	 * Evaluates function and send result to sink.
	 * 
	 * @param sink send the result to
	 * @param term thunk to evaluate. The reference is consumed only  when evaluation succeed.
	 * 
	 * @return true is evaluation succeeded, false otherwise. 
	 */
	public abstract boolean step(Sink sink, Term term);

	/**
	 * Represent a data construction.
	 */
	public static class DataDescriptor extends ConstructionDescriptor
	{
		/** Data symbol */
		public String symbol;

		public DataDescriptor(String symbol)
		{
			this.symbol = symbol.intern();
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
	}

	/**
	 * Represent a function construction.
	 */
	public static class FunctionDescriptor extends ConstructionDescriptor
	{
		/** Function symbol */
		public String symbol;

		/** The step function */
		public Step step;

		public FunctionDescriptor(String symbol, Step step)
		{
			this.symbol = symbol.intern();
			this.step = step;
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
		public boolean step(Sink sink, Term term)
		{
			return step.run(sink, term);
		}
	}

	/**
	 * Represent a function construction relying an Java reflection API to unwrap term arguments.
	 */
	public static class DynamicFunctionDescriptor extends ConstructionDescriptor
	{
		/** Function symbol */
		protected String symbol;

		/** The static method to invoke */
		protected Method method;

		/** Whether this constructor needs properties */
		final protected boolean hasProperties;

		public DynamicFunctionDescriptor(String symbol, Class<?> cls, String methodName)
		{
			this.symbol = symbol;

			// Search the static method
			method = Arrays.stream(cls.getMethods()).filter(m -> {
				return m.getName().equals(methodName);
			}).findFirst().orElse(null);

			if (method == null)
			{
				// This is a declared sort without actual rules.
				// Output a warning
				System.out.println("Warning: Function sort " + symbol + " is declared but has no rules. Ignored");

				hasProperties = false;
			}
			else
			{
				// Introspect to see if Properties is needed
				Parameter[] params = method.getParameters();
				if (params.length >= 4)
				{
					hasProperties = params[3].getType().isAssignableFrom(Properties.class);
				}
				else
					hasProperties = false;

				assert method != null;
			}
		}

		/**
		 * Send thunk to sink. Always return false indicating the normalizer the step failed.
		 */
		public boolean thunk(Sink sink, Object... args)
		{
			int i = 0;

			if (args[i] instanceof Properties || args[i] == null)
				sink.properties((Properties) args[i++]);

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
		public boolean step(Sink sink, Term term)
		{
			Object[] args = new Object[method.getParameterCount()];

			args[0] = sink; // sink
			int argp = 1;

			if (hasProperties)
			{
				args[argp] = Reference.safeRef(term.properties());
				argp++;
			}

			for (int i = 0; i < term.arity(); i++)
			{
				Variable[] binders = term.binders(i);
				if (binders != null)
				{
					for (int j = 0; j < binders.length; j++)
						args[argp++] = binders[j];
				}
				args[argp++] = term.sub(i).ref();
			}

			assert argp == method.getParameterCount() : method.getName() + " not fully bound.";

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
	}

	/**
	 * Represents a step function
	 */
	@FunctionalInterface
	public interface Step
	{
		/**
		 * Evaluate the function term within the given context.
		 * 
		 * <p>
		 * When the evaluation succeeds, the function term reference has been
		 * consumed by the step function. Otherwise it is left untouched.
		 *
		 * @param sink send the result to
		 * @param term thunk to evaluate. The reference is always consumed 
		 * 
		 * @return true is evaluation succeeded, false otherwise. 
		 */
		public abstract boolean run(Sink sink, Term term);
	}

	/**
	 * Represent a literal construction.
	 */
	protected static class LiteralDescriptor extends ConstructionDescriptor
	{
		protected static LiteralDescriptor singleton = new LiteralDescriptor();
	
		private LiteralDescriptor()
		{}
	
		@Override
		public String symbol()
		{
			return "$Literal";
		}
	
		@Override
		public boolean isFunction()
		{
			return false;
		}
	
		@Override
		public boolean step(Sink sink, Term data)
		{
			throw new RuntimeException("Literals do not  have step function");
		}
	}

}
