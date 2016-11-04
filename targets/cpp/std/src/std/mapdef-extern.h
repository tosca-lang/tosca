// Copyright (c) 2016 IBM Corporation.
#ifndef MAPDEF_EXTERN_H_
#define MAPDEF_EXTERN_H_

#include "ts.h"
#include "std/core.h"
#include "std/mapdef_sigs.h"

template<typename a> class Option;
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
tosca::MapTerm<a, b>& MapPut(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key, b& value)
{
    tosca::MapTerm<a, b>& xmap = map.extend();
    xmap.putValue(ctx, key, value);
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
tosca::MapTerm<a, b>& MapAddAll(tosca::Context& ctx, tosca::MapTerm<a, b>& map1, tosca::MapTerm<a, b>& map2)
{
    tosca::MapTerm<a, b>& xmap = map1.extend();
    xmap.putAll(map2);
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
Option<b>& MapGet(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key)
{
   Option<b>& result = map.getValue(ctx, key);
   map.Release();
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
template<typename a, typename b>
tosca::MapTerm<a, b>& MapPutVar(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key, b& value)
{
    auto v = key.variable();
    if (v)
        return MapPut(ctx, map, key, value);
    
    throw std::runtime_error("Invalid MapPutVar key. Excepted a variable use, but instead got :"); //+ key.toString()
}

template<typename a, typename b>
Option<b>& MapGetVar(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key)
{
    auto v = key.GetVariable();
    if (v)
        return MapGet(ctx, map, key);

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
List<a>& MapKeys(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
    List<a>& keys = map.keys(ctx);
    map.Release();
    return keys;
}

template<typename a, typename b, typename c>
List<c>& MapVarKeys(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
    List<c>& keys = map.varKeys(ctx);
    map.Release();
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
tosca::MapTerm<a, b>& MapNew(tosca::Context& ctx)
{
    return *(new tosca::CMapTerm<a, b>());
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
List<b>& MapValues(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
    List<b>& values = map.values(ctx);
    map.Release();
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
List<b>& MapVarValues(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
    List<b>& values = map.varValues(ctx);
    map.Release();
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
Bool& MapIsEmpty(tosca::Context& ctx, tosca::MapTerm<a, b>& map)
{
    tosca::MapTerm<a, b>& emap = force(ctx, map);
    Bool& result = emap.isEmpty() ? newTRUE(ctx) : newFALSE(ctx);
    emap.release();
    return result;
}

template<typename a, typename b, typename c>
tosca::MapTerm<a, b>& MapFind(tosca::Context& ctx, c& value)
{
    // TODO:
    return MapNew<a, b>(ctx);
}

template<typename a, typename b, typename c> c& MapReplace(tosca::Context& ctx, c& value_1377, tosca::MapTerm<a, b>& map_1378)
{
    throw new std::runtime_error("");
}

// --- Overload.

template <typename a, typename b>
b& MapGetD(tosca::Context& ctx, MapTerm<a,tosca::Term>& map, a& key, b& dvalue)
{
    auto& ovalue = MapGet<a, tosca::Term>(ctx, map, key);
    Optional<CSOME<tosca::Term>> osome = ovalue.asSOME(ctx);
    if (osome)
    {
        dvalue.Release();
        tosca::Term& result = osome.value().getValue1(ctx, true);
        return dynamic_cast<b&>(result);
    }
    ovalue.Release();
    return dvalue;
}

template <typename a, typename b>
b& MapGetE(tosca::Context& ctx, MapTerm<a,tosca::Term>& map, a& key)
{
    auto& ovalue = MapGet<a, tosca::Term>(ctx, map, key);
    Optional<CSOME<tosca::Term>> osome = ovalue.asSOME(ctx);
    if (osome)
    {
        tosca::Term& result = osome.value().getValue1(ctx, true);
        return dynamic_cast<b&>(result);
    }
    throw new std::runtime_error(key.Symbol() + " not found.");
}



#endif
