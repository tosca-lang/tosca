/* Copyright (c) 2009 IBM Corporation. */

package org.transscript.runtime;

import java.io.IOException;
import java.util.ArrayDeque;

/**
 * Sink that echoes the term in text form.
 * 
 * @author Lionel Villard
 * @author <a href="http://www.research.ibm.com/people/k/krisrose">Kristoffer Rose</a>.
 */
public class SimpleTermSink extends Sink
{
	// State.

	/** The crsx context */
	final Context context;

	/** Where the term goes. */
	final Appendable appendable;

	/** Stack of scopes. */
	private ArrayDeque<Integer> stack = new ArrayDeque<>();

	/** Top sibling count. */
	private int count;

	/** True just after binders or other force of separator. */
	private boolean pre;

	// Constructor.

	/**
	 * Create sink.
	 * @param factory for configuration and creation
	 * @param target to send term to 
	 */
	public SimpleTermSink(Context context, Appendable target)
	{
		this.context = context;
		this.appendable = target;
//		if (target instanceof FormattingAppendable)
//			appendable = (FormattingAppendable) target;
//		else
//			appendable = FormattingAppendable.format(target, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	// Methods.

	/** Helper to enter new argument list. */
	private void enter() throws IOException
	{
		stack.push(count);
		//appendable.open("");
		count = 0;
	}

	/** Helper to leave new argument list. */
	private void leave() throws IOException
	{
	//	appendable.close(count == 0 ? "" : "]");
		count = stack.pop();
	}

	/** Helper to issue separator right away. */
	private void preNext() throws IOException
	{
		if (!stack.isEmpty())
			appendable.append(count == 0 ? "[" : ",\n");
		pre = true;
	}

	/** Helper to advance to next argument. */
	private void next() throws IOException
	{
		if (!stack.isEmpty() && !pre)
			appendable.append(count == 0 ? "[" : ",\n");
		++count;
		pre = false;
	}

	// Sink...

	public Sink start(ConstructionDescriptor descriptor)
	{
		try
		{
			next();
			appendable.append(descriptor.symbol());
			enter();
		}
		catch (IOException e)
		{}
		return this;
	}

	public Sink end()
	{
		try
		{
			leave();
			//if (stack.isEmpty())
			//	appendable.flush();
		}
		catch (IOException e)
		{}
		return this;
	}

	public Sink binds(Variable[] binders)
	{
		try
		{
			preNext();
			if (binders.length > 0)
			{
				for (Variable v : binders)
				{
					String name = v.name();
					appendable.append(name);
					appendable.append(" ");
				}
				appendable.append(". ");
			}
		}
		catch (IOException e)
		{}
		return this;
	}

	public Sink startMetaApplication(String name)
	{
		try
		{
			next();
			appendable.append(name);
			enter();
		}
		catch (IOException e)
		{}
		return this;
	}

	public Sink endMetaApplication()
	{
		try
		{
			leave();
		}
		catch (IOException e)
		{}
		return this;
	}

	public Sink use(Variable variable)
	{
		try
		{
			next();
			appendable.append(variable.name());
		}
		catch (IOException e)
		{}
		return this;
	}

	public Sink copy(Term term)
	{
		term.copy(this, true);
		return this;
	}

	@Override
	public Sink literal(Object literal)
	{
		try
		{
			next();
			appendable.append('"').append(literal.toString()).append('"');
		}
		catch (IOException e)
		{}
		return this;
	}

	@Override
	public Sink properties(Properties properties)
	{
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Sink propertyNamed(String name, Term term)
	{
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Sink propertyVariable(Variable variable, Term term)
	{
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Context context()
	{
		return context;
	}
}
