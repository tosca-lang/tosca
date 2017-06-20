// Copyright (c) 2016 IBM Corporation.
#ifndef MAPDEF_EXTERN_SIGS_H_
#define MAPDEF_EXTERN_SIGS_H_
#include "ts.h"
#include "std/core_sigs.h"

/**
 * Convert std:vector to a List
 */
template<typename a>
List<a>& VectorToList(tosca::Context& ctx, std::vector<a*>& vector);

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
tosca::MapTerm<a, b>& MapPut(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key, b& value);

/**
 * Add all entries from map2 into map1. Entries in map1 existing in map2 are shadowed.
 * @param ctx
 * @param map1
 * @param map2
 * @return
 */
template<typename a, typename b>
tosca::MapTerm<a, b>& MapAddAll(tosca::Context& ctx, tosca::MapTerm<a, b>& map1, tosca::MapTerm<a, b>& map2);

/**
 * Lookup entry for given key.
 * @param ctx
 * @param map
 * @param key
 * @return
 */
template<typename a, typename b>
Option<b>& MapGet(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key);

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
tosca::MapTerm<a, b>& MapPutVar(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key, b& value);

template<typename a, typename b>
Option<b>& MapGetVar(tosca::Context& ctx, tosca::MapTerm<a, b>& map, a& key);

/**
 * Gets list of keys, excluding variable keys
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
List<a>& MapKeys(tosca::Context& ctx, tosca::MapTerm<a, b>& map);

template<typename a, typename b, typename c>
List<c>& MapVarKeys(tosca::Context& ctx, tosca::MapTerm<a, b>& map);

/**
 * Create new empty map
 * @param ctx
 * @param tma
 * @param tmb
 * @return
 */
template<typename a, typename b>
tosca::MapTerm<a, b>& MapNew(tosca::Context& ctx);

/**
 * Gets list of values, excluding variable values
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
List<b>& MapValues(tosca::Context& ctx, tosca::MapTerm<a, b>& map);

/**
 * Gets list of variable values
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
List<b>& MapVarValues(tosca::Context& ctx, tosca::MapTerm<a, b>& map);

/**
 * Return true if the given map is empty
 * @param ctx
 * @param tma
 * @param tmb
 * @param map
 * @return
 */
template<typename a, typename b>
Bool& MapIsEmpty(tosca::Context& ctx, tosca::MapTerm<a, b>& map);

template<typename a, typename b, typename c>
tosca::MapTerm<a, b>& MapFind(tosca::Context& ctx, c& value);

// --- Overload.

template <typename a, typename b>
b& MapGetD(tosca::Context& ctx, MapTerm<a,tosca::Term>& map, a& key, b& dvalue);

template <typename a, typename b>
b& MapGetE(tosca::Context& ctx, MapTerm<a,tosca::Term>& map, a& key);


#endif
