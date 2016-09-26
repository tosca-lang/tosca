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
	 * Remove value corresponding to given key
	 * @param key
	 */
	public void removeValue(Context context, K key);

	/**
	 * Put all entries in the given map into this map
	 * @param map. Consume the reference.
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
	static class _MapTerm<K extends Term, V extends Term> extends RefTerm implements MapTerm<K, V>
	{
		//private static final long serialVersionUID = -9134352548915946315L;

		// The boxed map.
		protected HashMap<K, V> map;

		public _MapTerm()
		{
			map = new HashMap<>();
		}

		@Override
		public String symbol()
		{
			return super.toString();
		}

		@Override
		public MapTerm<K, V> copy(Context c)
		{
			return mapTerm();
		}

		@Override
		public MapTerm<K, V> extend()
		{
			if (refcount() == 1)
				return this;
			
			if (map.size() > 200)
				System.out.println("copy map:" + map.size());

			_MapTerm<K, V> copy = new _MapTerm<>();

			for (Map.Entry<K, V> entry : map.entrySet())
				copy.putValue(Ref.ref(entry.getKey()), Ref.ref(entry.getValue()));

			release();
			return copy;
		}

		@Override
		public void putValue(K key, V value)
		{
			Term old = map.put(key, value);
			if (old != null)
			{
				old.release();
				key.release();
			}
		}

		@Override
		public void putAll(MapTerm<K, V> othermap)
		{
			_MapTerm<K, V> _map = (_MapTerm<K, V>) othermap;

			for (Map.Entry<K, V> entry : _map.map.entrySet())
				putValue(Ref.ref(entry.getKey()), Ref.ref(entry.getValue()));

			othermap.release();
		}

		@SuppressWarnings("unchecked")
		@Override
		public Option<V> getValue(Context context, K key)
		{
			Term value = map.get(key);

			return value == null ? Core.NONE(context) : (Option<V>) Core.SOME(context, value.ref());
		}

		public void removeValue(Context context, K key)
		{
			V value = map.remove(key);
			if (value != null)
			{
				value.release();

				// TODO: release the key in the map
			}
		}

		public List<V> values(Context context)
		{
			Listdef.List<V> c = Listdef.Nil(context);

			for (V term : map.values())
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

			for (K term : map.keySet())
			{
				Listdef.List<K> nc = Listdef.Cons(context, Ref.ref(term), c);
				c = nc;
			}

			return c;
		}

		@Override
		public boolean isEmpty()
		{
			return map.isEmpty();
		}

		@Override
		public boolean containsKey(K key)
		{
			return map.containsKey(key);
		}

		@SuppressWarnings("unchecked")
		@Override
		public boolean contains(Term key)
		{
			return containsKey((K) key);
		}

		@SuppressWarnings("unchecked")
		@Override
		public Term substitute(Context ctx, Object... substitutes)
		{
			MapTerm<K, V> copy = copy(ctx);
			for (K key : map.keySet())
				copy.putValue(key, (V) map.get(key).ref().substitute(ctx, substitutes));
			return copy;
		}

		@Override
		protected void free()
		{
			for (K key : map.keySet())
			{
				map.get(key).release();
				key.release();
			}
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

		@Override
		public void removeValue(Context context, K key)
		{
			throw new RuntimeException("Fatal error: cannot modify unevaluated map.");
		}

	}

}
