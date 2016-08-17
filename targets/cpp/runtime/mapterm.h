// Copyright (c) 2016 IBM Corporation.
#ifndef _MAPTERM
#define _MAPTERM

#include <unordered_map>

// Forward declarations
template<typename V>
class Option;

template<typename V>
class List;

template<typename a> ::Option<a>& newNONE(tosca::Context& ctx);
template<typename a> ::Option<a>& newSOME(tosca::Context& ctx, a& param);
template<typename a> ::List<a>& newNil(tosca::Context& ctx);

namespace tosca {
    
    // MapTerm type definition
    template<typename K, typename V>
    class MapTerm: public Term, public std::unordered_map<K*, V*>
    {
    public:
        virtual ~MapTerm()
        {
        }
        
        /**
         * Creates a new map reference which inherits all properties in this
         * instance.
         *
         * This reference is consumed.
         *
         * @return A new non-shared map.
         */
        MapTerm<K, V>& extend();
        
        /**
         * Add key-value pair to map.
         *
         * @param key term. The reference is used.
         * @param value the associated term value. The reference is used.
         */
        virtual void putValue(K& key, V& value)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * Add key-value pair to map, where key is a variable.
         *
         * @param key variable. The reference is used.
         * @param value the associated term value. The reference is used.
         */
        virtual void putVar(Variable key, V& value)
        {
            throw new std::runtime_error("");
            
        }
        
        /**
         * Get value corresponding to given key
         * @param key
         * @return An new reference to an optional typed term.
         */
        virtual Option<V>& getValue(Context& ctx, K& key)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * Get value corresponding to given variable key
         * @param key
         * @return An new reference to an optional typed term.
         */
        virtual Option<V> getValueVar(Context& ctx, Variable key)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * Put all entries in the given map into this map
         * @param map
         */
        virtual void putAll(MapTerm<K, V> map)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * Gets map values
         * @param context
         * @return
         */
        virtual List<V>& values(Context& ctx)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * Gets map keys
         * @param context
         * @return
         */
        virtual List<K>& keys(Context& ctx)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * Gets map variable values
         * @param context
         * @return
         */
        virtual List<V>& varValues(Context& ctx)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * Gets map variable keys
         * @param context
         * @return
         */
        template<typename VK>
        List<VK>& varKeys(Context& ctx)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * @return true when this map is empty
         */
        virtual bool isEmpty()
        {
            throw new std::runtime_error("");
        }
        
        /**
         * @return true when this map contains an entry for the given key
         */
        virtual bool containsKey(K key)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * @return true when this map contains an entry for the given variable
         */
        virtual bool containsVar(Variable var)
        {
            throw new std::runtime_error("");
        }
        
        /**
         * @return true when this map contains an entry for the given key, including variables.
         */
        virtual bool contains(Term key)
        {
            throw new std::runtime_error("");
        }
        
    };
    
    
    
    // MapTerm value
    template<typename K, typename V>
    class CMapTerm: public MapTerm<K, V>
    {
    public:
        CMapTerm() :
        parent(Optional<CMapTerm>::nullopt)
        {
        }
        
        virtual ~CMapTerm()
        {
        }
        
        MapTerm<K, V>& extend()
        {
            CMapTerm<K, V>& extended = *(new CMapTerm<K, V>(*this));
            return extended;
        }
        
        virtual void putValue(K& key, V& value)
        {
            this->insert({&key, &value});
        }
        
        virtual void putVar(Variable key, V& value)
        {
            throw new std::runtime_error("");
            
        }
        
        virtual Option<V>& getValue(Context& ctx, K& key)
        {
            auto search = this->find(&key);
            if (search == this->end())
            {
                if (parent)
                    return parent.value().getValue(ctx, key);
                
                return newNONE<V>(ctx);
            }
            return newSOME<V>(ctx, *search->second);
        }
        
        virtual Option<V> getValueVar(Context& ctx, Variable key)
        {
            throw new std::runtime_error("");
        }
        
        virtual void putAll(MapTerm<K, V> map)
        {
            throw new std::runtime_error("");
        }
        
        virtual List<V>& values(Context& ctx)
        {
            throw new std::runtime_error("");
        }
        
        List<K>& keys(Context& ctx)
        {
            throw new std::runtime_error("");
        }
        
        List<V>& varValues(Context& ctx)
        {
            throw new std::runtime_error("");
        }
        
        template<typename VK>
        List<VK>& varKeys(Context& ctx)
        {
            throw new std::runtime_error("");
        }
        
        bool isEmpty()
        {
            return this->empty();
        }
        
        bool containsKey(K key)
        {
            throw new std::runtime_error("");
        }
        
        bool containsVar(Variable var)
        {
            throw new std::runtime_error("");
        }
        
        bool contains(Term key)
        {
            throw new std::runtime_error("");
        }
    protected:
        
        // Extended map
        Optional<CMapTerm> parent;
        
        CMapTerm(CMapTerm& parent) :
        parent(make_optional<CMapTerm>(parent))
        {
            parent.AddRef();
        }
    };
    
    // Construction
    template<typename K, typename V>
    MapTerm<K, V>& mapTerm()
    {
        return *(new CMapTerm<K, V>());
    }
    
}

#endif
