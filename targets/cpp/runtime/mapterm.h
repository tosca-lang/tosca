// Copyright (c) 2016 IBM Corporation.
#ifndef _MAPTERM
#define _MAPTERM

#include <unordered_map>

// Forward declarations
template<typename V>
class Option;

template<typename V>
class List;

template<typename K, typename V>
class MapTerm;

// Construction
template<typename K, typename V>
MapTerm<K, V>& mapTerm();

// MapTerm type definition
template<typename K, typename V>
class MapTerm: public Term, std::unordered_map<K, V>
{
public:
    virtual ~MapTerm()
    {
    }
    ;

    /**
     * Creates a new map reference which inherits all properties in this
     * instance.
     *
     * This reference is consumed.
     *
     * @return A new non-shared map.
     */
    virtual MapTerm<K, V>& extend()
    {

    }

    /**
     * Add key-value pair to map.
     *
     * @param key term. The reference is used.
     * @param value the associated term value. The reference is used.
     */
    virtual void putValue(K& key, V& value)
    {

    }

    /**
     * Add key-value pair to map, where key is a variable.
     *
     * @param key variable. The reference is used.
     * @param value the associated term value. The reference is used.
     */
    virtual void putVar(UVariable key, V& value)
    {

    }

    /**
     * Get value corresponding to given key
     * @param key
     * @return An new reference to an optional typed term.
     */
    virtual Option<V>& getValue(Context& ctx, K& key)
    {

    }

    /**
     * Get value corresponding to given variable key
     * @param key
     * @return An new reference to an optional typed term.
     */
    virtual Optional<V> getValueVar(Context& ctx, UVariable key)
    {

    }

    /**
     * Put all entries in the given map into this map
     * @param map
     */
    virtual void putAll(MapTerm<K, V> map)
    {

    }

    /**
     * Gets map values
     * @param context
     * @return
     */
    virtual List<V>& values(Context& ctx)
    {

    }

    /**
     * Gets map keys
     * @param context
     * @return
     */
    virtual List<K>& keys(Context& ctx)
    {

    }

    /**
     * Gets map variable values
     * @param context
     * @return
     */
    virtual List<V>& varValues(Context& ctx)
    {

    }

    /**
     * Gets map variable keys
     * @param context
     * @return
     */
    template<typename VK>
    List<VK>& varKeys(Context& ctx)
    {

    }

    /**
     * @return true when this map is empty
     */
    virtual bool isEmpty()
    {

    }

    /**
     * @return true when this map contains an entry for the given key
     */
    virtual bool containsKey(K key)
    {

    }

    /**
     * @return true when this map contains an entry for the given variable
     */
    virtual bool containsVar(UVariable var)
    {

    }

    /**
     * @return true when this map contains an entry for the given key, including variables.
     */
    virtual bool contains(Term key)
    {

    }

};

// MapTerm value
template<typename K, typename V>
class ValMapTerm: public MapTerm<K, V>
{

public:
    ValMapTerm() {}
    ~ValMapTerm() {}

};

// Construction
template<typename K, typename V>
MapTerm<K, V>& mapTerm()
{
    return *(new ValMapTerm<K, V>());
}

/*
 * Variable use of type Map
 */
template<typename K, typename V>
class MapTermUse: public MapTerm<K, V>, VariableUse<MapTermUse<K, V>>
{
public:
    MapTermUse(std::string& name);
};

template<typename K, typename V>
Variable<MapTermUse<K, V>> varMapTerm(std::string&& hint);

#endif
