// Copyright (c) 2016 IBM Corporation.

package org.transscript.runtime;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.Function;

import org.transscript.compiler.std.Core;
import org.transscript.compiler.std.Core.Option;
import org.transscript.compiler.std.Listdef;
import org.transscript.compiler.std.Listdef.List;
import org.transscript.runtime.Functions.ThunkMaker;

/**
 * Builtin homogeneous map associated with syntactic variable map.
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

	/**
	 * Create new term map.
	 * @return
	 */
	static <K extends Term, V extends Term> MapTerm<K, V> mapTerm()
	{
		return new _MapTerm<K, V>();
	}

	/**
	 * Create an unevaluated map.
	 * @param f the function producing a map
	 * @return
	 */
	public static <K extends Term, V extends Term> MapTerm<K, V> lazyMapTerm(Function<Context, MapTerm<K, V>> f)
	{
		return new LazyMapTerm<K, V>(f);
	}

	/**
	 * @return Thunk factory for MapTerm
	 */
	public static <K extends Term, V extends Term> ThunkMaker<MapTerm<K, V>> lazyMapTermMaker()
	{
		return MapTerm::lazyMapTerm;
	}

	/**
	 * Creates a new map reference which inherits all properties in this
	 * instance.
	 * 
	 * This reference is consumed.
	 * 
	 * @return A new non-shared map.
	 */
	public MapTerm<K, V> extend();

	/**
	 * Add key-value pair to map.
	 * 
	 * @param key term. The reference is used.
	 * @param value the associated term value. The reference is used.
	 */
	public void putValue(K key, V value);

	/**
	 * Add key-value pair to map, where key is a variable.
	 * 
	 * @param key variable. The reference is used.
	 * @param value the associated term value. The reference is used.
	 */
	public void putVar(Variable key, V value);

	/**
	 * Get value corresponding to given key
	 * @param key
	 * @return An new reference to an optional typed term. 
	 */
	public Option<V> getValue(Context context, K key);

	/**
	 * Get value corresponding to given variable key
	 * @param key
	 * @return An new reference to an optional typed term. 
	 */
	public Option<V> getValueVar(Context context, Variable key);

	/**
	 * Put all entries in the given map into this map
	 * @param map
	 */
	public void putAll(MapTerm<K, V> map);

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

	/**
	 * Gets map variable values
	 * @param context
	 * @return
	 */
	public List<V> varValues(Context context);

	/**
	 * Gets map variable keys
	 * @param context
	 * @return
	 */
	public <VK extends Term> List<VK> varKeys(Context context);

	/**
	 * @return true when this map is empty
	 */
	public boolean isEmpty();

	/**
	 * @return true when this map contains an entry for the given key
	 */
	public boolean containsKey(K key);

	/**
	 * @return true when this map contains an entry for the given variable
	 */
	boolean containsVar(Variable var);

	/**
	 * @return true when this map contains an entry for the given key, including variables.
	 */
	public boolean contains(Term key);

	/**
	 * The actual map value.
	 * @param <K>
	 * @param <V>
	 */
	static class _MapTerm<K extends Term, V extends Term> extends HashMap<K, V> implements MapTerm<K, V>
	{
		private static final long serialVersionUID = -9134352548915946315L;

		/** Variable to term mapping */
		protected IdentityHashMap<Variable, V> vars;

		@Override
		public Term copy(Context c)
		{
			throw new RuntimeException();
		}

		@Override
		public MapTerm<K, V> extend()
		{
			_MapTerm<K, V> copy = new _MapTerm<>();

			for (Map.Entry<K, V> entry : entrySet())
				copy.putValue(Ref.ref(entry.getKey()), Ref.ref(entry.getValue()));

			if (vars != null)
			{
				for (Map.Entry<Variable, V> entry : vars.entrySet())
					copy.putVar(Ref.ref(entry.getKey()), Ref.ref(entry.getValue()));
			}

			return copy;
		}

		@Override
		public void putValue(K key, V value)
		{
			Term old = super.put(key, value);
			if (old != null)
				old.release();
		}

		@Override
		public void putAll(MapTerm<K, V> map)
		{
			_MapTerm<K, V> _map = (_MapTerm<K, V>) map;

			for (Map.Entry<K, V> entry : _map.entrySet())
				putValue(Ref.ref(entry.getKey()), Ref.ref(entry.getValue()));

			if (_map.vars != null)
			{
				for (Map.Entry<Variable, V> entry : _map.vars.entrySet())
					putVar(Ref.ref(entry.getKey()), Ref.ref(entry.getValue()));
			}
		}

		@Override
		public void putVar(Variable key, V value)
		{
			if (vars == null)
				vars = new IdentityHashMap<>();

			vars.put(key, value);
		}

		@SuppressWarnings("unchecked")
		@Override
		public Option<V> getValue(Context context, K key)
		{
			Term value = get(key);

			return value == null ? Core.NONE(context) : (Option<V>) Core.SOME(context, value.ref());
		}

		@SuppressWarnings("unchecked")
		@Override
		public Option<V> getValueVar(Context context, Variable key)
		{
			if (vars == null)
				return Core.NONE(context);
			Term value = vars.get(key);
			return value == null ? Core.NONE(context) : (Option<V>) Core.SOME(context, value.ref());
		}

		public List<V> values(Context context)
		{
			Listdef.List<V> c = Listdef.Nil(context);

			for (V term : values())
			{
				Listdef.List<V> nc = Listdef.Cons(context, Ref.ref(term), c);
				c = nc;
			}

			return c;
		}

		@Override
		public List<K> keys(Context context)
		{
			Listdef.List<K> c = Listdef.Nil(context);

			for (K term : keySet())
			{
				Listdef.List<K> nc = Listdef.Cons(context, Ref.ref(term), c);
				c = nc;
			}

			return c;
		}

		/**
		 * Gets map variable values
		 * @param context
		 * @return
		 */
		public List<V> varValues(Context context)
		{
			Listdef.List<V> c = Listdef.Nil(context);

			if (vars != null)
			{
				for (V val : vars.values())
				{
					Listdef.List<V> nc = Listdef.Cons(context, Ref.ref(val), c);
					c = nc;
				}
			}
			return c;
		}

		/**
		 * Gets map variable keys
		 * @param context
		 * @return
		 */
		@SuppressWarnings("unchecked")
		public <VK extends Term> List<VK> varKeys(Context context)
		{
			Listdef.List<VariableUse> c = Listdef.Nil(context);

			if (vars != null)
			{
				for (Variable var : vars.keySet())
				{
					Listdef.List<VariableUse> nc = Listdef.Cons(context, var.use(), c);
					c = nc;
				}
			}
			return (List<VK>) c;
		}

		@Override
		public boolean isEmpty()
		{
			return super.isEmpty() && (vars == null || vars.isEmpty());
		}

		@Override
		public boolean containsKey(K key)
		{
			return super.containsKey(key);
		}

		@Override
		public boolean containsVar(Variable var)
		{
			return vars != null && vars.containsKey(var);
		}

		@SuppressWarnings("unchecked")
		@Override
		public boolean contains(Term key)
		{
			if (key instanceof VariableUse)
				return containsVar(((VariableUse) key).variable);
			return containsKey((K) key);
		}

	}

	/**
	 * Map term thunk
	 * @param <K>
	 * @param <V>
	 */
	static class LazyMapTerm<K extends Term, V extends Term> extends LazyTerm<MapTerm<K, V>> implements MapTerm<K, V>
	{

		public LazyMapTerm(Function<Context, MapTerm<K, V>> f)
		{
			super(f);
		}

		@Override
		public boolean data()
		{
			return false;
		}

		@Override
		public Term copy(Context c)
		{
			return new LazyMapTerm<K, V>(f);
		}

		@Override
		public MapTerm<K, V> extend()
		{
			throw new RuntimeException("Fatal error: cannot modify unevaluated map.");
		}

		@Override
		public void putValue(K key, V value)
		{
			throw new RuntimeException("Fatal error: cannot modify unevaluated map.");
		}

		@Override
		public List<V> values(Context context)
		{
			throw new RuntimeException("Fatal error: cannot query unevaluated map.");
		}

		@Override
		public Option<V> getValue(Context context, K key)
		{
			throw new RuntimeException("Fatal error: cannot query unevaluated map.");
		}

		@Override
		public List<K> keys(Context context)
		{
			throw new RuntimeException("Fatal error: cannot query unevaluated map.");
		}

		@Override
		public void putVar(Variable key, V value)
		{
			throw new RuntimeException("Fatal error: cannot modify unevaluated map.");
		}

		@Override
		public Option<V> getValueVar(Context context, Variable key)
		{
			throw new RuntimeException("Fatal error: cannot query unevaluated map.");
		}

		@Override
		public void putAll(MapTerm<K, V> map)
		{
			throw new RuntimeException("Fatal error: cannot modify unevaluated map.");
		}

		@Override
		public boolean isEmpty()
		{
			throw new RuntimeException("Fatal error: cannot modify unevaluated map.");
		}

		@Override
		public boolean containsKey(K key)
		{
			throw new RuntimeException("Fatal error: cannot modify unevaluated map.");
		}

		@Override
		public boolean contains(Term key)
		{
			throw new RuntimeException("Fatal error: cannot modify unevaluated map.");
		}

		@Override
		public boolean containsVar(Variable var)
		{
			throw new RuntimeException("Fatal error: cannot modify unevaluated map.");
		}

		@Override
		public List<V> varValues(Context context)
		{
			throw new RuntimeException("Fatal error: cannot query unevaluated map.");
		}

		@Override
		public <VK extends Term> List<VK> varKeys(Context context)
		{
			throw new RuntimeException("Fatal error: cannot query unevaluated map.");
		}

	}

}
