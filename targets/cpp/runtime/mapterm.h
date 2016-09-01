// Copyright (c) 2016 IBM Corporation.
#ifndef _MAPTERM
#define _MAPTERM

#include <unordered_map>
#include <compat.h>

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
    class MapTerm: public Term
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
        virtual MapTerm<K, V>& extend()
        {
            throw new std::runtime_error("");
        }

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
         * Get value corresponding to given key
         * @param key
         * @return An new reference to an optional typed term.
         */
        virtual Option<V>& getValue(Context& ctx, K& key)
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
         * @return true when this map contains an entry for the given key, including variables.
         */
        virtual bool contains(Term key)
        {
            throw new std::runtime_error("");
        }
        
        Term& Substitute(tosca::Context& c, std::unordered_map<Variable*, Term*>& substitutes)
        {
            throw new std::runtime_error("NOT IMPLEMENTED: substitution in map");
        }

    };
    
    // Forward declarations
    template<typename K, typename V> MapTerm<K, V>& newMapTerm();
    
    // MapTerm value
    template<typename K, typename V>
    class CMapTerm: public MapTerm<K, V>
    {
    public:
        CMapTerm() : parent(Optional<CMapTerm>::nullopt)
        {
        }

        virtual ~CMapTerm()
        {
          std::cout << "destroy map";
        }
        
        Term& Copy(Context& ctx)
        {
            return newMapTerm<K, V>();
        }

        MapTerm<K, V>& extend()
        {
            CMapTerm<K, V>& extended = *(new CMapTerm<K, V>(*this));
            return extended;
        }

        void putValue(K& key, V& value)
        {
            map.insert({&key, &value});
        }

        Option<V>& getValue(Context& ctx, K& key)
        {
            auto search = map.find(&key);
            if (search == map.end())
            {
                if (parent)
                    return parent.value().getValue(ctx, key);

                return newNONE<V>(ctx);
            }
            return newSOME<V>(ctx, *search->second);
        }

        void putAll(MapTerm<K, V> map)
        {
            throw new std::runtime_error("");
        }

        List<V>& values(Context& ctx)
        {
            throw new std::runtime_error("");
        }

        List<K>& keys(Context& ctx)
        {
            throw new std::runtime_error("");
        }

        bool isEmpty()
        {
            return map.empty() && (parent) ? parent.value().isEmpty() : true;
        }

        bool containsKey(K key)
        {
            throw new std::runtime_error("");
        }

        bool contains(Term key)
        {
            throw new std::runtime_error("");
        }
    protected:
        std::unordered_map<K*, V*> map;

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
    MapTerm<K, V>& newMapTerm()
    {
        return *(new CMapTerm<K, V>());
    }

}

#endif
