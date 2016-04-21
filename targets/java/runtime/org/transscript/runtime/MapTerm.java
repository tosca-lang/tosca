// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.transscript.compiler.std.Core;
import org.transscript.compiler.std.Core.Option;
import org.transscript.compiler.std.Listdef;
import org.transscript.compiler.std.Listdef.List;
import org.transscript.runtime.Functions.ThunkMaker;

/**
 * Builtin map value.
 * 
 * @author Lionel Villard
 */
public interface MapTerm<K extends Term, V extends Term> extends Term
{

	@SuppressWarnings("unchecked")
	@Override
	default MapTerm<K, V> eval(Context context)
	{
		return (MapTerm<K, V>) Term.super.eval(context);
	}
	
	static <K extends Term, V extends Term> MapTerm<K, V> newMapTerm()
	{
		return new _MapTerm<K, V>();
	}

	public static <K extends Term, V extends Term> MapTerm<K, V> lazyMapTerm(Function<Context, MapTerm<K, V>> f)
	{
		return new LazyMapTerm<K, V>(f);
	}

	public static <K extends Term, V extends Term> ThunkMaker<MapTerm<K, V>> lazyMapTermMaker()
	{
		return MapTerm::lazyMapTerm;
	}


	/**
	 * Creates a new properties reference which inherits all properties in this
	 * instance.
	 * 
	 * @return A new non-shared set of properties.
	 */
	public MapTerm<K, V> extend();

	/**
	 * Add key-value pair to map.
	 * 
	 * @param name The reference is used.
	 * @param term the associated value. The reference is used.
	 */
	public void put(K key, V value);

	/**
	 * Get value corresponding to given key
	 * @param key
	 * @return An new reference to an optional type term. 
	 */
	public Option<V> get(Context context, K key);

	/**
	 * Gets map values
	 * @param context
	 * @return
	 */
	public List<V> values(Context context);

	/**
	 * Gets map keys
	 * @param context
	 * @return
	 */
	public List<K> keys(Context context);

	static class _MapTerm<K extends Term, V extends Term> implements MapTerm<K, V>
	{
		/** String to term mapping */
		protected Map<Term, Term> named;

		@Override
		public Term copy(Context c)
		{
			throw new RuntimeException();
		}

		@Override
		public MapTerm<K, V> extend()
		{
			_MapTerm<K, V> copy = new _MapTerm<>();
			if (named != null)
				copy.named = new HashMap<>(named);
			return copy;
		}

		@Override
		public void put(K key, V value)
		{
			if (named == null)
				named = new HashMap<>();

			named.put(key, value);
		}

		@SuppressWarnings("unchecked")
		public List<V> values(Context context)
		{
			final ConstructionDescriptor cons = context.lookupDescriptor("Cons");
			final ConstructionDescriptor nil = context.lookupDescriptor("Nil");

			if (named == null || named.isEmpty())
				return (List<V>) nil.make();

			// Use unchecked API to avoid deep recursive algo.
			Listdef.List<V> top = (List<V>) cons.make();
			Listdef.List<V> c = top;
			Listdef.List<V> nc = null;
			Listdef.List<V> pc = null;

			for (Term term : named.values())
			{
				c.setSub(0, term.ref());

				nc = (List<V>) cons.make();
				c.setSub(1, nc);
				pc = c;
				c = nc;
			}
			nc.release();

			pc.setSub(1, nil.make());
			return top;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<K> keys(Context context)
		{
			final ConstructionDescriptor cons = context.lookupDescriptor("Cons");
			final ConstructionDescriptor nil = context.lookupDescriptor("Nil");

			if (named == null || named.isEmpty())
				return (List<K>) nil.make();

			// Use unchecked API to avoid deep recursive algo.
			Listdef.List<K> top = (List<K>) cons.make();
			Listdef.List<K> c = top;
			Listdef.List<K> nc = null;
			Listdef.List<K> pc = null;

			for (Term term : named.keySet())
			{
				c.setSub(0, term.ref());

				nc = (List<K>) cons.make();
				c.setSub(1, nc);
				pc = c;
				c = nc;
			}
			nc.release();

			pc.setSub(1, nil.make());
			return top;
		}

		@SuppressWarnings("unchecked")
		@Override
		public Option<V> get(Context context, K key)
		{
			Term value = null;
			if (named != null)
				value = named.get(key);

			return value == null ? Core.NONE(context) : (Option<V>) Core.SOME(context, value.ref());
			//
			//		return value;
		}
	}

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

	static class LazyMapTerm<K extends Term, V extends Term> extends LazyTerm<MapTerm<K, V>>implements MapTerm<K, V>
	{

		public LazyMapTerm(Function<Context, MapTerm<K, V>> f)
		{
			super(f);
		}

		@Override
		public Term copy(Context c)
		{
			return new LazyMapTerm<K, V>(f);
		}

		@Override
		public MapTerm<K, V> extend()
		{
			throw new RuntimeException();
		}

		@Override
		public void put(K key, V value)
		{
			throw new RuntimeException();
		}

		@Override
		public List<V> values(Context context)
		{
			throw new RuntimeException();
		}

		@Override
		public Option<V> get(Context context, K key)
		{
			throw new RuntimeException();
		}

		@Override
		public List<K> keys(Context context)
		{
			throw new RuntimeException();
		}

	}

}
