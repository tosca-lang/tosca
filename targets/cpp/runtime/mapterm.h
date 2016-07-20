// Copyright (c) 2016 IBM Corporation.
#ifndef _MAPTERM
#define _MAPTERM

#include <unordered_map>

// Forward declarations
template<typename V>
class _List;

template<typename V>
class _Option;

template<typename K, typename V>
class _MapTerm;

// Construction
template<typename K, typename V>
_MapTerm<K, V>& mapTerm();

// MapTerm type definition
template<typename K, typename V>
class _MapTerm: public _Term, std::unordered_map<K, V>
{
public:
    virtual ~_MapTerm()
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
    virtual _MapTerm<K, V>& extend()
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
    virtual void putVar(Variable key, V& value)
    {

    }

    /**
     * Get value corresponding to given key
     * @param key
     * @return An new reference to an optional typed term.
     */
    virtual _Option<V>& getValue(Context context, K& key)
    {

    }

    /**
     * Get value corresponding to given variable key
     * @param key
     * @return An new reference to an optional typed term.
     */
    virtual Optional<V> getValueVar(Context context, Variable key)
    {

    }

    /**
     * Put all entries in the given map into this map
     * @param map
     */
    virtual void putAll(_MapTerm<K, V> map)
    {

    }

    /**
     * Gets map values
     * @param context
     * @return
     */
    virtual _List<V>& values(Context context)
    {

    }

    /**
     * Gets map keys
     * @param context
     * @return
     */
    virtual _List<K>& keys(Context context)
    {

    }

    /**
     * Gets map variable values
     * @param context
     * @return
     */
    virtual _List<V>& varValues(Context context)
    {

    }

    /**
     * Gets map variable keys
     * @param context
     * @return
     */
    template<typename VK>
    _List<VK>& varKeys(Context context)
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
    virtual bool containsVar(Variable var)
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
class _ValMapTerm: public _MapTerm<K, V>
{
protected:

public:
    _ValMapTerm();
    ~_ValMapTerm();

    Term Copy(Context c);
    double Unbox() const;

};

/*
 * Variable of type Numeric
 */
template<typename K, typename V>
class Var_MapTerm: public _MapTerm<K, V>, _Variable
{
public:
    Var_MapTerm(std::string& name);
};

template<typename K, typename V>
Var_MapTerm<K, V> var_MapTerm(std::string&& hint);

#endif
