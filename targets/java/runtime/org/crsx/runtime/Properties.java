// Copyright (c) 2014 IBM Corporation.

package org.crsx.runtime;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.crsx.runtime.Term.Kind;

/**
 * Properties are:
 * 
 * <ul>
 * <li>A mapping set between variable and term
 * <li>A mapping set between string literal and term
 * </ul>
 * 
 * <p>
 * Properties are attached to either function and/or data. For function, they
 * are called "Environment" and for data, they are called "Attributes"
 * 
 * @author villardl
 */
public class Properties extends Reference
{
	/** Extended properties */
	protected Properties parent;

	/** Variable to term mapping */
	protected IdentityHashMap<Variable, Term> variables;

	/** String to term mapping */
	protected Map<String, Term> named;

	/** @param parent properties. The reference is transferred. */
	protected Properties(Properties parent)
	{
		this.parent = parent;
	}

	/**
	 * Lookup named property value
	 * 
	 * @return value or null if none. Does not return a new reference.
	 */
	public Term lookup(String key)
	{
		Term value = null;
		if (named != null)
			value = named.get(key);

		if (value == null && parent != null)
			value = parent.lookup(key);

		return value;
	}

	/**
	 * Lookup variable property value
	 * 
	 * @return value or null if none. Does not return a new reference.
	 */
	public Term lookup(Variable key)
	{
		Term value = null;
		if (variables != null)
			value = variables.get(key);

		if (value == null && parent != null)
			value = parent.lookup(key);

		return value;
	}

	/**
	 * Lookup property value
	 * @param key. Reference is not released.
	 * @return value or null if none. Does not return a new reference.
	 */
	public Term lookup(Term key)
	{
		return key.kind() == Kind.VARIABLE_USE ? lookup(((VariableUse) key).variable) : lookup(key.symbol());
	}

	@Override
	public Properties ref()
	{
		return (Properties) super.ref();
	}

	/**
	 * Creates a new properties reference which inherits all properties in this
	 * instance.
	 * 
	 * @return A new non-shared set of properties.
	 */
	public Properties extend()
	{
		return new Properties(ref());
	}

	/**
	 * Deep copy these properties to a sink 
	 *
	 * @param sink to copy to 
	 * @param discard whether to discard these properties
	 */
	public void copy(Sink sink, boolean discard)
	{
		copy(sink, discard, new HashSet<>(), new IdentityHashMap<>());
	}

	/**
	 * Deep copy these properties to a sink 
	 *
	 * @param sink to copy to 
	 * @param discard whether to discard these properties
	 */
	protected void copy(Sink sink, boolean discard, HashSet<String> names, IdentityHashMap<Variable, Boolean> vars)
	{
		if (variables != null)
		{
			for (Entry<Variable, Term> entry : variables.entrySet())
			{
				if (!vars.containsKey(entry.getKey()))
				{
					sink.propertyVariable(entry.getKey(), entry.getValue().ref());
					vars.put(entry.getKey(), true);
				}
			}
		}
		if (named != null)
		{
			for (Entry<String, Term> entry : named.entrySet())
			{
				if (!names.contains(entry.getKey()))
				{
					sink.propertyNamed(entry.getKey(), entry.getValue().ref());
					names.add(entry.getKey());
				}
			}
		}

		if (parent != null)
			parent.ref().copy(sink, discard, names, vars);
		
		if (discard)
			release();
	}

	/**
	 * Apply substitution to all properties and send result to sink
	 * 
	 * <p>Consumes 'this' reference
	 * 
	 * @param context
	 * @param substitutes
	 * @return a lone properties reference.
	 */
	protected void substituteTo(Sink sink, Map<Variable, Term> substitutes)
	{
		if (substitutes.isEmpty())
			sink.properties(this); // Transfer properties ref
		else
		{
			if (parent != null)
				parent.ref().substituteTo(sink, substitutes);

			final Context context = sink.context();

			if (named != null)
			{
				named.forEach((String name, Term term) -> {
					Term nterm = term.ref().substitute(context, substitutes);
					sink.propertyNamed(name, nterm); // consume nterm reference
				});
			}

			if (variables != null)
			{
				variables.forEach((Variable var, Term term) -> {
					Variable key = var;
					Term substitute = substitutes.get(var);
					if (substitute != null)
					{
						if (substitute.kind() == Kind.VARIABLE_USE)
						{
							// This is a substitution of a variable for a variable!
							key = ((VariableUse) substitute).variable;
						}
						else
						{
							// The variable is substituted by a term. 
							// TODO: remove key?
						}
					}

					// Substitute value
					Term nterm = term.ref().substitute(context, substitutes);

					// And send..
					sink.propertyVariable(key.ref(), nterm); // consume nterm reference
				});
			}
			// Done with this instance
			release();
		}
	}

	/**
	 * Add named property
	 * 
	 * @param name
	 * @param term the associated value. The reference is used.
	 */
	public void addNamedProperty(String name, Term term)
	{
		if (named == null)
			named = new HashMap<>();

		named.put(name, term);
	}

	/**
	 * Add variable property
	 * 
	 * @param variable. The reference is used.
	 * @param term the associated value. The reference is used.
	 */
	public void addVariableProperty(Variable variable, Term term)
	{
		if (variables == null)
			variables = new IdentityHashMap<>();

		variables.put(variable, term);
	}

	@Override
	public void free()
	{
		if (parent != null)
		{
			parent.release();
			parent = null;
		}

		if (variables != null)
		{
			variables.forEach((Variable var, Term u) -> {
				var.release();
				u.release();
			});
			variables = null;
		}

		if (variables != null)
		{
			named.forEach((String key, Term u) -> {
				u.release();
			});
			named = null;
		}

		super.free();
	}

	/**
	 * Print out properties. Eliminate duplicates.
	 * @param out
	 * @param names
	 * @throws IOException 
	 */
	protected void print(Appendable out, HashSet<String> names, IdentityHashMap<Variable, Boolean> vars) throws IOException
	{
		if (variables != null)
		{
			for (Entry<Variable, Term> entry : variables.entrySet())
			{
				if (!vars.containsKey(entry.getKey()))
				{
					out.append(entry.getKey().name).append(":").append(entry.getValue().toString()).append(";");
					vars.put(entry.getKey(), true);
				}
			}
		}
		if (named != null)
		{
			for (Entry<String, Term> entry : named.entrySet())
			{
				if (!names.contains(entry.getKey()))
				{
					out.append('"').append(entry.getKey()).append('"').append(":").append(entry.getValue().toString()).append(";");
					names.add(entry.getKey());
				}
			}
		}

		if (parent != null)
			parent.print(out, names, vars);
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("{");

		HashSet<String> names = new HashSet<>();
		IdentityHashMap<Variable, Boolean> vars = new IdentityHashMap<Variable, Boolean>();

		try
		{
			print(builder, names, vars);
		}
		catch (IOException e)
		{}

		return builder.append('}').toString();
	}

}
