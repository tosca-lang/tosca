/* Copyright © 2010 IBM Corporation. */

package org.transscript.runtime.text;

import java.io.IOException;
import java.util.ArrayDeque;

import org.transscript.runtime.BufferSink;
import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.Context;
import org.transscript.runtime.Sink;
import org.transscript.runtime.Variable;

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

	/** Whether outputting text or crsx. When empty, default to inside text. */
	protected ArrayDeque<Boolean> inText;

	/** Buffer sink fallback */
	protected Sink termSink;

	// Constructor

	public TextSink(Context context, Appendable output)
	{
		this.context = context;
		this.output = output;
		this.indent = 0;
		this.descriptors = new ArrayDeque<>();
		this.inText = new ArrayDeque<>();
		this.termSink = new BufferSink(context);
	}

	// Local

	/** Output some characters */
	final protected TextSink print(String chars)
	{
		try
		{
			output.append(chars);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		return this;
	}

	/** Output some characters, applying indentation to new lines */
	final protected TextSink printIndent(String chars)
	{
		if (indent > 0)
		{
			// Search for new line to apply indentation level.
			chars = chars.replaceAll("\n", "\n" + SPACES.substring(0, indent < SPACES.length() ? indent : SPACES.length()));
		}
		print(chars);

		return this;
	}

	/** Whether currently outputting text */
	final protected boolean inText()
	{
		return inText.isEmpty() || inText.peek();
	}

	/** Whether given constructor descriptor is a text one */
	final protected boolean isTextDescriptor(ConstructionDescriptor desc)
	{
		return false;
//		return desc == Text4.Text4_xcontent_xA1
//				|| desc == Text4._M_Text4_xcontent_xA2 || desc == Text4._M_Text4_xcontent_xA3 || desc == Text4._M_Text4_xcontent_xA4
//				|| desc == Text4._M_Text4_xtext_xA1 || desc == Text4._M_Text4_xtext_xA2;
	}

	// Overrides Sink

	@Override
	public Sink start(ConstructionDescriptor descriptor)
	{
		final boolean isText = isTextDescriptor(descriptor);

		if (inText())
		{
			if (isText)
			{
				// outputting text and receiving text. 

				//				if (descriptor == Text._M__sTextIndent)
				//				{
				//					indent += 2;
				//				}
			}
			else
			{
				// outputting text and but not receiving text. This is the beginning of a cookie. Switch to term mode.
				print("⟨");

				termSink.start(descriptor);
			}
		}
		else
		{
			if (isText)
			{
				// outputting term and receiving text. Switch to embedded text mode
				printIndent("(text⟦");
			}
			else
			{
				// outputting term and receiving term. This is a sub.
				termSink.start(descriptor);
			}
		}

		descriptors.push(descriptor);
		inText.push(isText);

		return this;
	}

	@Override
	public Sink end()
	{
		final ConstructionDescriptor descriptor = descriptors.pop();
		final boolean isText = isTextDescriptor(descriptor);
		inText.pop();

		if (inText())
		{
			if (isText)
			{
				// outputting text and receiving text. 
				//				if (descriptor == Text._M__sTextIndent)
				//				{
				//					indent -= 2;
				//				}
			}
			else
			{
				// outputting text and but not receiving text. This is the end of a cookie. Switch to text mode.
				print("⟩");
			}
		}
		else
		{
			if (isText)
			{
				// outputting term and receiving text. Terminate embedded text mode
				print("⟧");
			}
			else
			{
				// outputting term and receiving term. Terminate sub.
				termSink.end();
			}
		}
		return this;
	}

	@Override
	public Sink param(Variable param)
	{
		if (inText())
		{
			// This is really bad as the term is even not inside the sort value space.
			// Switch to term mode
			print("⟨");

			inText.pop();
			inText.push(false);

			assert!inText.isEmpty() : "Can't have to-level binders";
		}

		termSink.param(param);

		return this;
	}

	@Override
	public Sink use(Variable variable)
	{
		if (inText())
			print(variable.name());
		else
			termSink.use(variable);

		return this;
	}

	@Override
	public Sink literal(Object literal)
	{
		if (inText())
		{
			printIndent(literal.toString());
		}
		else
		{
			termSink.literal(literal);
		}
		return this;
	}
//
//	@Override
//	public Sink copy(Term term)
//	{
//		term.copy(this, true);
//		return this;
//	}

	@Override
	public Sink startMetaApplication(String name)
	{
		if (inText())
		{
			// in text mode -> switch to term mode.
			print("⟨");

			inText.pop();
			inText.push(false);
		}

		termSink.startMetaApplication(name);

		return this;
	}
	@Override
	public Sink startType()
	{
		print(":");
		return this;
	}

	@Override
	public Sink endType()
	{
		return this;
	}

	@Override
	public Sink endMetaApplication()
	{
		descriptors.pop();
		inText.pop();

		termSink.endMetaApplication();

		if (inText())
		{
			// were in text mode -> terminate term mode.
			print("⟩");
		}

		return this;
	}

	@Override
	public Sink startSubstitutes()
	{
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Sink endSubstitutes()
	{
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Context context()
	{
		return context;
	}

	@Override
	public Sink bind(Variable binder)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
