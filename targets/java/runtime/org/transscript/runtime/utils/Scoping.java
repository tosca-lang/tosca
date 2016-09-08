// Copyright (c) 2016 IBM Corporation.
package org.transscript.runtime.utils;

import java.util.ArrayDeque;
import java.util.Optional;

import org.transscript.runtime.Variable;

/**
 * Manages variable scoping during parsing
 * 
 * @author Lionel Villard
 */
public class Scoping extends ArrayDeque<Pair<String /* In the source */, Variable /* In the term */>>
{

	private static final long serialVersionUID = 1719900429676332636L;

	// Variable stack marker
	final static public Pair<String, Variable> MARKER = new Pair<>(null, null);
	

	/** Look for the variable declaration corresponding to the given variable occurrence */
	public Optional<Pair<String, Variable>> findVarDecl(String var)
	{
		Optional<Pair<String, Variable>> variable = stream().filter(pair -> {
			if (pair == MARKER)
				return false;

			return pair.fst.equals(var);
		}).findFirst();
		return variable;
	}
}
