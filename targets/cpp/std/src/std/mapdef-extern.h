// Copyright (c) 2016 IBM Corporation.
#ifndef _MAPDEF_EXTERN
#define _MAPDEF_EXTERN

#include "ts.h"
#include "std/core.h"

template<typename a>
class _Option;
class _Bool;

/**
 * Extend the given map with the given key-value pair.
 * If a entry for the given key already exists in the map, it is shadowed.
 * @param context
 * @param map
 * @param key
 * @param value
 * @return
 */
template<typename a, typename b>
_MapTerm<a, b>& MapPut(Context context, _MapTerm<a, b>& map, a& key, b& value)
{
    _MapTerm<a, b>& emap = force(context, map);
    a& ekey = force(context, key);
    b& evalue = force(context, value);

    // TODO extends only when refcount > 1
    _MapTerm<a, b>& xmap = emap.extend();
    xmap.putValue(ekey, evalue);

    return xmap;
}

/**
 * Add all entries from map2 into map1. Entries in map1 existing in map2 are shadowed.
 * @param context
 * @param map1
 * @param map2
 * @return
 */
template<typename a, typename b>
_MapTerm<a, b>& MapAddAll(Context context, _MapTerm<a, b>& map1, _MapTerm<a, b>& map2)
{
    _MapTerm<a, b>& emap1 = force(context, map1);
    _MapTerm<a, b>& emap2 = force(context, map2);

    _MapTerm<a, b>& xmap = emap1.extend();
    xmap.putAll(emap2);
    return xmap;
}

/**
 * Lookup entry for given key.
 * @param context
 * @param map
 * @param key
 * @return
 */
template<typename a, typename b>
_Option<b>& MapGet(Context context, _MapTerm<a, b>& map, a& key)
{
    _MapTerm<a, b>& emap = force(context, map);
    a ekey = force(context, key);

    _Option<b>& result = emap.getValue(context, ekey);
   // emap.release();
    return result;
}

/**
 * Extend the given map with the given key-value pair, where key is a syntactic variable
 * If a entry for the given key already exists in the map, it is shadowed.
 * @param context
 * @param map
 * @param varuse
 * @param value
 * @return
 */
template<typename a, typename b, typename c>
_MapTerm<a, b>& MapPutVar(Context context, _MapTerm<a, b>& map, c& key, b& value)
{
    _MapTerm<a, b>& emap = force(context, map);
    c& ekey = force(context, key);
    b& evalue = force(context, value);

    Optional<_Variable> v = ekey.variable();
    if (v)
    {
        // TODO extends only when refcount > 1
        _MapTerm<a, b>& xmap = emap.extend();
        xmap.putVar(v.value(), evalue);
        return xmap;
    }

    throw std::runtime_error("Invalid MapPutVar key. Excepted a variable use, but instead got :"); //+ key.toString()
}

template<typename a, typename b, typename c>
_Option<b>& MapGetVar(Context context, _MapTerm<a, b>& map, c& key)
{
    _MapTerm<a, b>& emap = force(context, map);
    c& ekey = force(context, key);

    Optional<_Variable> v = ekey.variable();
    if (v)
    {
        _Option<b>& result = emap.getValueVar(context, v.value());
        //emap.release();
        return result;
    }

    throw std::runtime_error("Invalid MapPutVar key. Excepted a variable use, but instead got :"); // + key.toString()
}

/**
 * Gets list of keys, excluding variable keys
 * @param context
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
_List<a>& MapKeys(Context context, _MapTerm<a, b>& map)
{
    _MapTerm<a, b>& emap = force(context, map);
    _List<a>& keys = emap.keys(context);
    //emap.release();
    return keys;
}

template<typename a, typename b, typename c>
_List<c>& MapVarKeys(Context context, _MapTerm<a, b>& map)
{
    _MapTerm<a, b>& emap = force(context, map);
    _List<c>& keys = emap.varKeys(context);
    //emap.release();
    return keys;
}

/**
 * Create new empty map
 * @param context
 * @param tma
 * @param tmb
 * @return
 */
template<typename a, typename b>
_MapTerm<a, b>& MapNew(Context context)
{
    return mapTerm<a, b>();
}

/**
 * Gets list of values, excluding variable values
 * @param context
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b> _List<b>& MapValues(Context context, _MapTerm<a, b>& map)
{
    _MapTerm<a, b>& emap = force(context, map);

    _List<b>& values = emap.values(context);
    emap.release();
    return values;
}

/**
 * Gets list of variable values
 * @param context
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b> _List<b>& MapVarValues(Context context, _MapTerm<a, b>& map)
{
    _MapTerm<a, b>& emap = force(context, map);

    _List<b>& values = emap.varValues(context);
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
template<typename a, typename b>
_Bool& MapIsEmpty(Context context, _MapTerm<a, b>& map)
{
    _MapTerm<a, b>& emap = force(context, map);
    _Bool& result = emap.isEmpty() ? TRUE(context) : FALSE(context);
    emap.release();
    return result;
}

template<typename a, typename b, typename c> _MapTerm<a, b>& MapFind(Context context, c value)
{

}

template<typename a, typename b, typename c> c MapReplace(Context context, c value_1377, _MapTerm<a, b>& map_1378)
{

}

#endif
