
package org.transscript.runtime.utils;

import java.util.ArrayDeque;

import org.transscript.runtime.Pair;
import org.transscript.runtime.Variable;

/**
 * Manages variable scoping during parsing
 * 
 * @author Lionel Villard
 */
public class Scoping extends ArrayDeque<Pair<String /* In the source */, Variable /* In the term */>>
{

	private static final long serialVersionUID = 1719900429676332636L;
}
