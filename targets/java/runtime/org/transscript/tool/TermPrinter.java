// Copyright (c) 2016 IBM Corporation.

package org.transscript.tool;

import java.io.IOException;

import org.transscript.runtime.DoubleTerm;
import org.transscript.runtime.MapTerm;
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

	// TODO: release term during traversal.

	/**
	 * Print term to console
	 * @param term
	 */
	static public void print(Term term)
	{
		try
		{
			print(term, System.out);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Print term to output
	 * @param term
	 * @param out
	 * @throws IOException
	 */
	static public void print(Term term, Appendable out) throws IOException
	{
		print(term, out, 0);
	}

	// print indent
	static protected void indent(int count, Appendable out) throws IOException
	{
		for (int i = count; i >= 0; i--)
			out.append(' ');
	}

	static protected void print(Term term, Appendable out, int indent) throws IOException
	{
		out.append("\n");
		indent(indent, out);

		if (term instanceof StringTerm)
			out.append('"').append(term.toString()).append('"');
		else if(term instanceof DoubleTerm || term instanceof MapTerm)
			out.append(term.toString());
		else
			out.append(term.getClass().getSimpleName().substring(1)); // Remove _

		// Print subs
		int i = 0;
		Term sub = term.sub(i);
		boolean hasSub = sub != null;
		while (sub != null)
		{
			out.append(i == 0 ? "(" : ",");

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
		if (hasSub)
			out.append(")");
	}
}
