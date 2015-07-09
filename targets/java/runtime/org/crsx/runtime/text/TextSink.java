/* Copyright © 2010 IBM Corporation. */

package org.crsx.runtime.text;

import java.io.IOException;
import java.util.ArrayDeque;

import org.crsx.compiler.std.Text;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Properties;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
import org.crsx.runtime.Variable;

/**
 * Outputs formatted text terms as plain text.
 * 
 * @author Lionel Villard
 */
public class TextSink extends Sink
{
	/** Spaces used for indentation. */
	final static String SPACES = "                                                                                                                                                                                                                                                          ";

	// State

	/** The context */
	final protected Context context;

	/** Where to send the text */
	protected Appendable output;

	/** Current indentation level */
	protected int indent;

	/** Descriptors stack */
	protected ArrayDeque<ConstructionDescriptor> descriptors;

	// Constructor

	public TextSink(Context context, Appendable output)
	{
		this.context = context;
		this.output = output;
		this.indent = 0;
		this.descriptors = new ArrayDeque<>();
	}

	// Overrides Sink

	@Override
	public Sink start(ConstructionDescriptor descriptor)
	{
		//try
		{
			if (descriptor == Text._M__sTextChars)
			{}
			else if (descriptor == Text._M__sTextBreak)
			{}
			else if (descriptor == Text._M__sTextIndent)
			{
				indent += 2;
			}
			else if (descriptor == Text._M__sTextEmbed)
			{
				//output.append("«");
			}
			else if (descriptor == Text._M__sTextString)
			{

			}
			else if (descriptor == Text._M__sTextCons)
			{

			}
			else if (descriptor == Text._M__sTextNil)
			{

			}
			descriptors.push(descriptor);
			return this;
		}
//		catch (IOException e)
//		{
//			throw new RuntimeException(e);
//		}
	}

	@Override
	public Sink end()
	{
		//try
		{
			ConstructionDescriptor descriptor = descriptors.pop();
			if (descriptor == Text._M__sTextIndent)
			{
				indent -= 2;
			}
//			else if (descriptor == Text._M__sTextEmbed)
//			{
//			//	output.append("»");
//			}
			return this;
		}

//		catch (IOException e)
//		{
//			throw new RuntimeException(e);
//		}
	}

	@Override
	public Sink binds(Variable[] binders)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public Sink use(Variable variable)
	{
		try
		{
			output.append(variable.toString()); // TODO: quote variable
			return this;
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public Sink literal(Object literal)
	{
		try
		{
			String str = literal.toString();
			if (indent > 0)
			{
				// Search for new line to apply indentation level.
				str = str.replaceAll("\n", "\n" + SPACES.substring(0, indent));
			}
			
			output.append(str);
			return this;
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public Sink copy(Term term)
	{
		term.copy(this, true);
		return this;
	}

	@Override
	public Sink startMetaApplication(String name)
	{
		// Meta application should not appear.

		try
		{
			output.append(name);
			return this;
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public Sink endMetaApplication()
	{
		return this;
	}

	@Override
	public Sink properties(Properties properties)
	{
		return this;
	}

	@Override
	public Sink propertyNamed(String name, Term term)
	{
		return this;
	}

	@Override
	public Sink propertyVariable(Variable variable, Term term)
	{
		return this;
	}

	@Override
	public Context context()
	{
		return context;
	}

}
