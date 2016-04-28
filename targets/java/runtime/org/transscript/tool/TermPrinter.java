// Copyright (c) 2016 IBM Corporation.

package org.transscript.tool;

import java.io.IOException;

import org.transscript.runtime.DoubleTerm;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.Variable;

/**
 * Simple term printer using Java reflection API.
 * 
 * @author Lionel Villard
 */
public class TermPrinter
{

	/**
	 * Print term to output
	 * @param term
	 * @param out
	 * @throws IOException
	 */
	public void print(Term term, Appendable out) throws IOException
	{
		print(term, out, 0);
	}

	// print indent
	protected void indent(int count, Appendable out) throws IOException
	{
		for (int i = count; i >= 0; i--)
			out.append(' ');
	}

	protected void print(Term term, Appendable out, int indent) throws IOException
	{
		out.append("\n");
		indent(indent, out);

		if (term instanceof StringTerm || term instanceof DoubleTerm)
			out.append(term.toString());
		else
			out.append(term.getClass().getSimpleName());

		// Print subs
		int i = 0;
		Term sub = term.sub(i);
		while (sub != null)
		{
			int j = 0;
			Variable binder = term.binder(i, j);
			while (binder != null)
			{
				out.append('[').append(binder.name()).append(']');
				binder = term.binder(i, ++j);
			}
			
			j = 0;
			Variable param = term.param(i, j);
			while (param != null)
			{
				out.append('(').append(param.name()).append(')');
				param = term.param(i, ++j);
			}
			
			print(sub, out, indent + 2);
			sub = term.sub(++i);
		}
	}
}
