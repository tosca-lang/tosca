// Copyright (c) 2016 IBM Corporation.
#ifndef _MAPDEF_EXTERN
#define _MAPDEF_EXTERN

#include "ts.h"
#include "std/core.h"

template<typename a>
class Option;
class Bool;

/**
 * Extend the given map with the given key-value pair.
 * If a entry for the given key already exists in the map, it is shadowed.
 * @param ctx
 * @param map
 * @param key
 * @param value
 * @return
 */
template<typename a, typename b>
MapTerm<a, b>& MapPut(Context& ctx, MapTerm<a, b>& map, a& key, b& value)
{
    MapTerm<a, b>& emap = force(ctx, map);
    a& ekey = force(ctx, key);
    b& evalue = force(ctx, value);

    // TODO extends only when refcount > 1
    MapTerm<a, b>& xmap = emap.extend();
    xmap.putValue(ekey, evalue);

    return xmap;
}

/**
 * Add all entries from map2 into map1. Entries in map1 existing in map2 are shadowed.
 * @param ctx
 * @param map1
 * @param map2
 * @return
 */
template<typename a, typename b>
MapTerm<a, b>& MapAddAll(Context& ctx, MapTerm<a, b>& map1, MapTerm<a, b>& map2)
{
    MapTerm<a, b>& emap1 = force(ctx, map1);
    MapTerm<a, b>& emap2 = force(ctx, map2);

    MapTerm<a, b>& xmap = emap1.extend();
    xmap.putAll(emap2);
    return xmap;
}

/**
 * Lookup entry for given key.
 * @param ctx
 * @param map
 * @param key
 * @return
 */
template<typename a, typename b>
Option<b>& MapGet(Context& ctx, MapTerm<a, b>& map, a& key)
{
    MapTerm<a, b>& emap = force(ctx, map);
    a& ekey = force(ctx, key);

    Option<b>& result = emap.getValue(ctx, ekey);
   // emap.release();
    return result;
}

/**
 * Extend the given map with the given key-value pair, where key is a syntactic variable
 * If a entry for the given key already exists in the map, it is shadowed.
 * @param ctx
 * @param map
 * @param varuse
 * @param value
 * @return
 */
template<typename a, typename b, typename c>
MapTerm<a, b>& MapPutVar(Context& ctx, MapTerm<a, b>& map, c& key, b& value)
{
    MapTerm<a, b>& emap = force(ctx, map);
    c& ekey = force(ctx, key);
    b& evalue = force(ctx, value);

    Optional<Variable> v = ekey.variable();
    if (v)
    {
        // TODO extends only when refcount > 1
        MapTerm<a, b>& xmap = emap.extend();
        xmap.putVar(v.value(), evalue);
        return xmap;
    }

    throw std::runtime_error("Invalid MapPutVar key. Excepted a variable use, but instead got :"); //+ key.toString()
}

template<typename a, typename b, typename c>
Option<b>& MapGetVar(Context& ctx, MapTerm<a, b>& map, c& key)
{
    MapTerm<a, b>& emap = force(ctx, map);
    c& ekey = force(ctx, key);

    Optional<Variable> v = ekey.variable();
    if (v)
    {
        Option<b>& result = emap.getValueVar(ctx, v.value());
        //emap.release();
        return result;
    }

    throw std::runtime_error("Invalid MapPutVar key. Excepted a variable use, but instead got :"); // + key.toString()
}

/**
 * Gets list of keys, excluding variable keys
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
List<a>& MapKeys(Context& ctx, MapTerm<a, b>& map)
{
    MapTerm<a, b>& emap = force(ctx, map);
    List<a>& keys = emap.keys(ctx);
    //emap.release();
    return keys;
}

template<typename a, typename b, typename c>
List<c>& MapVarKeys(Context& ctx, MapTerm<a, b>& map)
{
    MapTerm<a, b>& emap = force(ctx, map);
    List<c>& keys = emap.varKeys(ctx);
    //emap.release();
    return keys;
}

/**
 * Create new empty map
 * @param ctx
 * @param tma
 * @param tmb
 * @return
 */
template<typename a, typename b>
MapTerm<a, b>& MapNew(Context& ctx)
{
    return mapTerm<a, b>();
}

/**
 * Gets list of values, excluding variable values
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
List<b>& MapValues(Context& ctx, MapTerm<a, b>& map)
{
    MapTerm<a, b>& emap = force(ctx, map);

    List<b>& values = emap.values(ctx);
    emap.release();
    return values;
}

/**
 * Gets list of variable values
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
List<b>& MapVarValues(Context& ctx, MapTerm<a, b>& map)
{
    MapTerm<a, b>& emap = force(ctx, map);

    List<b>& values = emap.varValues(ctx);
    emap.release();
    return values;
}

/**
 * Return true if the given map is empty
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
Bool& MapIsEmpty(Context& ctx, MapTerm<a, b>& map)
{
    MapTerm<a, b>& emap = force(ctx, map);
    Bool& result = emap.isEmpty() ? newTRUE(ctx) : newFALSE(ctx);
    emap.release();
    return result;
}

template<typename a, typename b, typename c>
MapTerm<a, b>& MapFind(Context& ctx, c& value)
{
    // TODO:
    return MapNew<a, b>(ctx);
}

template<typename a, typename b, typename c> c MapReplace(Context& ctx, c value_1377, MapTerm<a, b>& map_1378)
{
throw new std::runtime_error("");
}

#endif
