/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.compiler.std.Core.Bool;
import org.transscript.compiler.std.Core.Option;
import org.transscript.compiler.std.Listdef.List;
import org.transscript.runtime.Context;
import org.transscript.runtime.Functions.ThunkMaker;
import org.transscript.runtime.MapTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.VariableUse;

/**
 * Map standard library external functions.
 * 
 * @author Lionel Villard
 */
public class MapdefExtern
{

	/**
	 * Extend the given map with the given key-value pair.
	 * If a entry for the given key already exists in the map, it is shadowed.
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param map
	 * @param key
	 * @param value
	 * @return
	 */
	public static <a extends Term, b extends Term> MapTerm<a, b> MapPut(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map, a key, b value)
	{
		MapTerm<a, b> emap = Term.force(context, map);
		a ekey = Term.force(context, key);
		b evalue = Term.force(context, value);

		// TODO extends only when refcount > 1
		MapTerm<a, b> xmap = emap.extend();
		xmap.putValue(ekey, evalue);

		return xmap;
	}

	/**
	 * Add all entried from map2 into map1. Entries in map1 existing in map2 are shadowed.
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param map1
	 * @param map2
	 * @return
	 */
	public static <a extends Term, b extends Term> MapTerm<a, b> MapAddAll(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map1, MapTerm<a, b> map2)
	{
		MapTerm<a, b> emap1 = Term.force(context, map1);
		MapTerm<a, b> emap2 = Term.force(context, map2);

		MapTerm<a, b> xmap = emap1.extend();
		xmap.putAll(emap2);
		return xmap;
	}

	/**
	 * Lookup entry for given key.
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param map
	 * @param key
	 * @return
	 */
	public static <a extends Term, b extends Term> Option<b> MapGet(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map, a key)
	{
		MapTerm<a, b> emap = Term.force(context, map);
		a ekey = Term.force(context, key);
		if (emap.data() && ekey.data())
		{
			Option<b> result = emap.getValue(context, ekey);
			emap.release();
			return result;
		}

		return Core.lazyOption(c -> MapGet(c, tma, tmb, emap, ekey));
	}

	/**
	 * Extend the given map with the given key-value pair, where key is a syntactic variable
	 * If a entry for the given key already exists in the map, it is shadowed.
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param tmc
	 * @param map
	 * @param varuse
	 * @param value
	 * @return
	 */
	public static <a extends Term, b extends Term, c extends Term> MapTerm<a, b> MapPutVar(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, ThunkMaker<c> tmc, MapTerm<a, b> map, c key, b value)
	{
		MapTerm<a, b> emap = Term.force(context, map);
		c ekey = Term.force(context, key);
		b evalue = Term.force(context, value);
		if (emap.data() && ekey.data() && evalue.data())
		{
			if (ekey instanceof VariableUse)
			{
				// TODO extends only when refcount > 1
				MapTerm<a, b> xmap = emap.extend();
				xmap.putVar(((VariableUse) ekey).variable(), evalue);
				return xmap;
			}

			throw new RuntimeException("Invalid MapPutVar key. Excepted a variable use, but instead got :" + key.toString());
		}

		return MapTerm.lazyMapTerm(c -> MapPutVar(c, tma, tmb, tmc, emap, ekey, evalue));
	}

	public static <a extends Term, b extends Term, c extends Term> Option<b> MapGetVar(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, ThunkMaker<c> tmc, MapTerm<a, b> map, c key)
	{
		MapTerm<a, b> emap = Term.force(context, map);
		c ekey = Term.force(context, key);

		if (emap.data() && ekey.data())
		{
			if (ekey instanceof VariableUse)
			{
				Option<b> result = emap.getValueVar(context, ((VariableUse) ekey).variable());
				emap.release();
				return result;
			}

			throw new RuntimeException("Invalid MapPutVar key. Excepted a variable use, but instead got :" + key.toString());
		}

		return Core.lazyOption(c -> MapGetVar(c, tma, tmb, tmc, emap, ekey));
	}

	/**
	 * Gets list of keys, excluding variable keys
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param map
	 * @return
	 */
	public static <a extends Term, b extends Term> List<a> MapKeys(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map)
	{
		MapTerm<a, b> emap = Term.force(context, map);
		if (emap.data())
		{
			List<a> keys = emap.keys(context);
			emap.release();
			return keys;
		}
		return Listdef.lazyList(c -> MapKeys(c, tma, tmb, emap));
	}

	/**
	 * Create new empty map
	 * @param context
	 * @param tma
	 * @param tmb
	 * @return
	 */
	public static <a extends Term, b extends Term> MapTerm<a, b> MapNew(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb)
	{
		return MapTerm.mapTerm();
	}

	/**
	 * Gets list of values, excluding variable values
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param map
	 * @return
	 */
	public static <a extends Term, b extends Term> List<b> MapValues(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map)
	{
		MapTerm<a, b> emap = Term.force(context, map);

		List<b> values = emap.values(context);
		emap.release();
		return values;
	}

	/**
	 * Return true if the given map is empty
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param map
	 * @return
	 */
	public static <a extends Term, b extends Term> Bool MapIsEmpty(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map)
	{
		MapTerm<a, b> emap = Term.force(context, map);
		Bool result = emap.isEmpty() ? Core.TRUE(context) : Core.FALSE(context);
		emap.release();
		return result;
	}

}
