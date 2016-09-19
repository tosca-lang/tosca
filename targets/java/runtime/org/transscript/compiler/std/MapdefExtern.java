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
		// TODO extends only when refcount > 1
		MapTerm<a, b> xmap = map.extend();
		xmap.putValue(key, value);

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
		MapTerm<a, b> xmap = map1.extend();
		xmap.putAll(map2);
		map2.release();
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
		Option<b> result = map.getValue(context, key);
		map.release();
		return result;
	}

	/**
	 * Extend the given map with the given key-value pair, where key is a syntactic variable
	 * If a entry for the given key already exists in the map, it is shadowed.
	 * @param context
	 * @param tma
	 * @param tmb
	 * @param map
	 * @param varuse
	 * @param value
	 * @return
	 */
	public static <a extends Term, b extends Term> MapTerm<a, b> MapPutVar(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map, a key, b value)
	{
		if (key instanceof VariableUse)
			return MapPut(context, tma, tmb, map, key, value);

		throw new RuntimeException("Invalid MapPutVar key. Excepted a variable use, but instead got :" + key.toString());
	}

	public static <a extends Term, b extends Term> Option<b> MapGetVar(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map, a key)
	{
		if (key instanceof VariableUse)
			return MapGet(context, tma, tmb, map, key);

		throw new RuntimeException("Invalid MapPutVar key. Excepted a variable use, but instead got :" + key.toString());
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
		List<a> keys = map.keys(context);
		map.release();
		return keys;
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
		List<b> values = map.values(context);
		map.release();
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
		Bool result = map.isEmpty() ? Core.TRUE(context) : Core.FALSE(context);
		map.release();
		return result;
	}

	public static <a extends Term, b extends Term, c extends Term> MapTerm<a, b> MapFind(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, ThunkMaker<c> tmc, c value)
	{
		throw new RuntimeException("Not implemented");
	}

	public static <a extends Term, b extends Term, c extends Term> c MapReplace(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, ThunkMaker<c> tmc, c value_1377, MapTerm<a, b> map_1378)
	{
		throw new RuntimeException("Not implemented");
	}

}
