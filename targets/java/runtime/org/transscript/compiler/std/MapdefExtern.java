/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.compiler.std.Core.Option;
import org.transscript.compiler.std.Listdef.List;
import org.transscript.runtime.Context;
import org.transscript.runtime.MapTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.Functions.ThunkMaker;

/**
 * Map standard library external functions.
 * 
 * @author Lionel Villard
 */
public class MapdefExtern
{

	public static <a extends Term, b extends Term> MapTerm<a, b> MapPut(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map, a key, b value)
	{
		MapTerm<a, b> emap = map.eval(context);
		if (emap.data())
		{
			// TODO extends only when refcount > 1
			MapTerm<a, b> xmap = emap.extend();
			xmap.put(key, value);
			return xmap;
		}

		return MapTerm.lazyMapTerm(c -> MapPut(c, tma, tmb, emap, key, value));
	}

	public static <a extends Term, b extends Term> Option<b> MapGetVar(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> x_56, a x_60)
	{
		throw new RuntimeException();
	}
	public static <a extends Term, b extends Term> List<a> MapKeys(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map)
	{
		MapTerm<a, b> emap = map.eval(context);
		if (emap.data())
		{
			return emap.keys(context);

		}
		return Listdef.lazyList(c -> MapKeys(c, tma, tmb, emap));
	}

	public static <a extends Term, b extends Term> MapTerm<a, b> MapNew(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb)
	{
		return MapTerm.newMapTerm();
	}

	public static <a extends Term, b extends Term> List<b> MapValues(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map)
	{
		return map.values(context);
	}

	public static <a extends Term, b extends Term> Option<b> MapGet(Context context, ThunkMaker<a> tma, ThunkMaker<b> tmb, MapTerm<a, b> map, a key)
	{
		MapTerm<a, b> emap = map.eval(context);
		if (emap.data())
		{
			Option<b> result = emap.get(context, key);
			emap.release();
			return result;
		}

		return Core.lazyOption(c -> MapGet(c, tma, tmb, emap, key));
	}

}
