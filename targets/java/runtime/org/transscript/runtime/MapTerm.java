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
	 * The actual map value.
	 * @param <K>
	 * @param <V>
	 */
	static class _MapTerm<K extends Term, V extends Term> extends HashMap<K, V>implements MapTerm<K, V>
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

			if (vars!=null)
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
				return Core.NONE(context) ;
			Term value = vars.get(key);
			return value == null ? Core.NONE(context) : (Option<V>) Core.SOME(context, value.ref());
		}

		@SuppressWarnings("unchecked")
		public List<V> values(Context context)
		{
			final ConstructionDescriptor cons = context.lookupDescriptor("Cons");
			final ConstructionDescriptor nil = context.lookupDescriptor("Nil");

			if (isEmpty())
				return (List<V>) nil.make();

			// Use unchecked API to avoid deep recursive algo.
			Listdef.List<V> top = (List<V>) cons.make();
			Listdef.List<V> c = top;
			Listdef.List<V> nc = null;
			Listdef.List<V> pc = null;

			for (Term term : values())
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

			if (isEmpty())
				return (List<K>) nil.make();

			// Use unchecked API to avoid deep recursive algo.
			Listdef.List<K> top = (List<K>) cons.make();
			Listdef.List<K> c = top;
			Listdef.List<K> nc = null;
			Listdef.List<K> pc = null;

			for (Term term : keySet())
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
	}

	/**
	 * Map term thunk
	 * @param <K>
	 * @param <V>
	 */
	static class LazyMapTerm<K extends Term, V extends Term> extends LazyTerm<MapTerm<K, V>>implements MapTerm<K, V>
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

	}

}
