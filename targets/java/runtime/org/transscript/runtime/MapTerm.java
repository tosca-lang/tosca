// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.function.Function; 

/**
 * Builtin map value.
 * 
 * @author Lionel Villard
 */
public interface MapTerm extends Term
{

	@Override
	default MapTerm eval(Context context)
	{ 
		return (MapTerm) Term.super.eval(context);
	}
 
	public static MapTerm newLazyMapTerm(Function<Context, MapTerm> f)
	{
		// TODO Auto-generated method stub
		return null;
	}

	
//	static MapTerm newMapTerm()
//	{
//		return new DoubleValue(d);
//	}
//
//	static DoubleTerm newLazyDoubleTerm(Function<Context, DoubleTerm> f)
//	{
//		return new LazyDoubleTerm(f);
//	}
//
//	static class DoubleValue implements DoubleTerm
//	{


//	
//	
//	/** String/Variable to term mapping */
//	protected Map<Object, Term> map;
//
//	/**  */
//	public MapTerm()
//	{}
//
//	/**
//	 * Lookup named property value
//	 * 
//	 * @return value or null if none. Does not return a new reference.
//	 */
//	public Term lookup(String key)
//	{
//		Term value = null;
//		if (map != null)
//			value = map.get(key);
//
//		return value;
//	}
//
//	/**
//	 * Lookup variable property value
//	 * 
//	 * @return value or null if none. Does not return a new reference.
//	 */
//	public Term lookup(Variable key)
//	{
//		Term value = null;
//		if (map != null)
//			value = map.get(key);
//
//		return value;
//	}
//
//	/**
//	 * Lookup property value
//	 * @param key. Reference is not released.
//	 * @return value or null if none. Does not return a new reference.
//	 */
//	public Term lookup(Term key)
//	{
//		return key.kind() == Kind.VARIABLE_USE ? lookup(((VariableUse) key).variable) : lookup(key.symbol());
//	}
//
//	@Override
//	public MapTerm ref()
//	{
//		return (MapTerm) super.ref();
//	}
//
//	/**
//	 * Creates a new properties reference which inherits all properties in this
//	 * instance.
//	 * 
//	 * @return A new non-shared set of properties.
//	 */
//	public MapTerm extend()
//	{
//		MapTerm copy = new MapTerm();
//		if (map != null)
//			copy.map = new HashMap<>(map);
//		return copy;
//	}
//
//	@Override
//	public void copy(Sink sink, boolean discard)
//	{
//		copy(sink, discard, new HashSet<>(), new IdentityHashMap<>());
//	}
//
//	/**
//	 * Deep copy these properties to a sink 
//	 *
//	 * @param sink to copy to 
//	 * @param discard whether to discard these properties
//	 */
//	protected void copy(Sink sink, boolean discard, HashSet<String> names, IdentityHashMap<Variable, Boolean> vars)
//	{
//	//	sink.copy(this.ref());
//		//throw new RuntimeException("Not implemented");
//	}
//
//	/**
//	 * Apply substitution to all properties and send result to sink
//	 * 
//	 * <p>Consumes 'this' reference
//	 * 
//	 * @param context
//	 * @param substitutes
//	 * @return a lone properties reference.
//	 */
//	protected void substituteTo(Sink sink, Map<Variable, Term> substitutes)
//	{
//		sink.copy(this);
//		
//		//throw new RuntimeException("Not implemented");
//
//		//		if (substitutes.isEmpty())
//		//			sink.copy(this); // Transfer properties ref
//		//		else
//		//		{
//		//			if (parent != null)
//		//				parent.ref().substituteTo(sink, substitutes);
//		//
//		//			final Context context = sink.context();
//		//
//		//			if (named != null)
//		//			{
//		//				named.forEach((String name, Term term) -> {
//		//					Term nterm = term.ref().substitute(context, substitutes);
//		//					sink.propertyNamed(name, nterm); // consume nterm reference
//		//				});
//		//			}
//		//
//		//			if (variables != null)
//		//			{
//		//				variables.forEach((Variable var, Term term) -> {
//		//					Variable key = var;
//		//					Term substitute = substitutes.get(var);
//		//					if (substitute != null)
//		//					{
//		//						if (substitute.kind() == Kind.VARIABLE_USE)
//		//						{
//		//							// This is a substitution of a variable for a variable!
//		//							key = ((VariableUse) substitute).variable;
//		//						}
//		//						else
//		//						{
//		//							// The variable is substituted by a term. 
//		//							// TODO: remove key?
//		//						}
//		//					}
//		//
//		//					// Substitute value
//		//					Term nterm = term.ref().substitute(context, substitutes);
//		//
//		//					// And send..
//		//					sink.propertyVariable(key.ref(), nterm); // consume nterm reference
//		//				});
//		//			}
//		//			// Done with this instance
//		//			release();
//		//		}
//	}
//
//	/**
//	 * Add named property
//	 * 
//	 * @param name
//	 * @param term the associated value. The reference is used.
//	 */
//	public void addNamedProperty(String name, Term term)
//	{
//		if (map == null)
//			map = new HashMap<>();
//
//		map.put(name, term);
//	}
//
//	/**
//	 * Add variable property
//	 * 
//	 * @param variable. The reference is used.
//	 * @param term the associated value. The reference is used.
//	 */
//	public void addVariableProperty(Variable variable, Term term)
//	{
//		if (map == null)
//			map = new HashMap<>();
//
//		map.put(variable, term);
//	}
//
//	/**
//	 * Add property
//	 * 
//	 * @param key. The property key. If key is a variable use, add as a variable entry. 
//	 * @param term the associated value. The reference is used.
//	 */
//	public void addProperty(Term key, Term term)
//	{
//		if (key instanceof VariableUse)
//			addVariableProperty(((VariableUse) key).variable(), term);
//		else
//			addNamedProperty(key.symbol(), term);
//	}
//
//	@Override
//	public void free()
//	{
//	 	if (map != null)
//		{
//			map.forEach((Object key, Term u) -> {
//				u.release();
//			});
//			map = null;
//		}
//
//		super.free();
//	}
//
//	/**
//	 * Print out properties. Eliminate duplicates.
//	 * @param out
//	 * @param names
//	 * @throws IOException 
//	 */
//	protected void print(Appendable out, HashSet<String> names, IdentityHashMap<Variable, Boolean> vars) throws IOException
//	{
//
//		if (map != null)
//		{
//			for (Entry<Object, Term> entry : map.entrySet())
//			{
//				if (!names.contains(entry.getKey()))
//				{
//					out.append('"').append(entry.getKey().toString()).append('"').append(":").append(
//							entry.getValue().toString()).append(";");
//					if (entry.getKey() instanceof String)
//						names.add((String) entry.getKey());
//				}
//			}
//		} 
//	}
//
//	@Override
//	public String toString()
//	{
//		StringBuilder builder = new StringBuilder();
//		builder.append("{");
//
//		HashSet<String> names = new HashSet<>();
//		IdentityHashMap<Variable, Boolean> vars = new IdentityHashMap<Variable, Boolean>();
//
//		try
//		{
//			print(builder, names, vars);
//		}
//		catch (IOException e)
//		{}
//
//		return builder.append('}').toString();
//	}
//	
//	/**
//	 * Print out properties. Eliminate duplicates.
//	 * @param out
//	 * @param names
//	 * @throws IOException 
//	 */
//	protected void print4(Appendable out, HashSet<String> names, IdentityHashMap<Variable, Boolean> vars) throws IOException
//	{
//
//		if (map != null)
//		{
//			for (Entry<Object, Term> entry : map.entrySet())
//			{
//				if (!names.contains(entry.getKey()))
//				{
//					out.append('"').append(entry.getKey().toString()).append('"').append(":").append(
//							entry.getValue().toString4());
//					if (entry.getKey() instanceof String)
//						names.add((String) entry.getKey());
//				}
//			}
//		} 
//	}
//
//
//	@Override
//	public String toString4()
//	{
//		StringBuilder builder = new StringBuilder();
//		builder.append("{");
//
//		HashSet<String> names = new HashSet<>();
//		IdentityHashMap<Variable, Boolean> vars = new IdentityHashMap<Variable, Boolean>();
//
//		try
//		{
//			print4(builder, names, vars);
//		}
//		catch (IOException e)
//		{}
//
//		return builder.append('}').toString();
//	}
//	
//	
//	@Override
//	protected boolean deepEquals(Term other, Map<Variable, Variable> renamings)
//	{
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public ConstructionDescriptor descriptor()
//	{
//		return ConstructionDescriptor.MapDescriptor.singleton;
//	}
//
//	public boolean sendKeys(Sink sink)
//	{
//		if (map != null)
//		{
//			map.forEach((key, value) -> {
//				sink.start(List._M_Cons).literal(key);
//			});
//			
//		}
//
//		sink.start(List._M_Nil).end();
//
//		if (map != null)
//		{
//			map.forEach((key, value) -> {
//				sink.end();
//			});
//		}
//
//		return true;
//	}
//
//	public boolean sendValues(Sink sink)
//	{
//		if (map != null)
//		{
//			map.forEach((key, value) -> {
//				sink.start(List._M_Cons).copy(value.ref());
//			});
//		}
//
//		sink.start(List._M_Nil).end();
//
//		if (map != null)
//		{
//			map.forEach((key, value) -> {
//				sink.end();
//			});
//		}
//		return true;
//	}
//

}
