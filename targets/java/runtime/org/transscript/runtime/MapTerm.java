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
 * Builtin homogeneous map
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
	 * Get value corresponding to given key
	 * @param key
	 * @return An new reference to an optional typed term. 
	 */
	public Option<V> getValue(Context context, K key);

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
	 * @return true when this map is empty
	 */
	public boolean isEmpty();

	/**
	 * @return true when this map contains an entry for the given key
	 */
	public boolean containsKey(K key);


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
		}

		@SuppressWarnings("unchecked")
		@Override
		public Option<V> getValue(Context context, K key)
		{
			Term value = get(key);

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

		@Override
		public boolean isEmpty()
		{
			return super.isEmpty();
		}

		@Override
		public boolean containsKey(K key)
		{
			return super.containsKey(key);
		}

		@SuppressWarnings("unchecked")
		@Override
		public boolean contains(Term key)
		{
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

	}

}
