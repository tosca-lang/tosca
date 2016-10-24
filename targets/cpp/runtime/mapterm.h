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

    // Forward declarations
    template<typename K, typename V> class MapTerm;
    template<typename K, typename V> MapTerm<K, V>& newMapTerm();
    template<typename T> T& NewRef(T&);

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
        virtual void putValue(Context& ctx, K& key, V& value)
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

        /*
         * Make new map term.
         */
        static Term& MakeTerm(Context& ctx, std::string& symbol)
        {
            return newMapTerm<K, V>();
        }
        
        // Overrides

        const std::string Symbol() const
        {
            // TODO:
            return "{}";
        }

    };


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
            if (parent)
                parent.value().Release();

            for (auto iter = map.begin(); iter != map.end(); iter ++)
            {
                iter->first->Release();
                iter->second->Release();
            }
        }

        Term& Copy(Context& ctx)
        {
            return newMapTerm<K, V>();
        }

        MapTerm<K, V>& extend()
        {
            this->AddRef();
            CMapTerm<K, V>& extended = *(new CMapTerm<K, V>(*this));
            return extended;
        }

        void putValue(Context& ctx, K& key, V& value)
        {
            auto search = map.find(&key);
            map.insert({&key, &value});
            if (search != map.end())
            {
                // Entry has been replaced so release references to previous entry
                search->first->Release();
                search->second->Release();
            }
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
            return newSOME<V>(ctx, tosca::NewRef(*search->second));
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

        bool DeepEquals(const Term& rhs, std::unordered_map<Variable*, Variable*>& varmap) const
        {
            // implement equality modulo variable and map.
            return true;
        }

        Term& Substitute(tosca::Context& ctx, std::unordered_map<Variable*, Term*>& substitutes)
        {
            MapTerm<K, V>& copy = newMapTerm<K, V>();
            CMapTerm<K, V>& cmap = *this;
            while (true)
            {
                for (auto it = cmap.map.begin(); it != cmap.map.end(); it ++)
                {
                    it->first->AddRef();
                    it->second->AddRef();
                    copy.putValue(ctx, *it->first, dynamic_cast<V&>(it->second->Substitute(ctx, substitutes)));
                }
                if (!cmap.parent)
                    break;

                 cmap = cmap.parent.value();
            }
            return copy;
        }

    protected:
        std::unordered_map<K*, V*> map;

        // Extended map
        Optional<CMapTerm> parent;

        CMapTerm(CMapTerm& parent): parent(make_optional<CMapTerm>(parent))
        {}
    };

    // Construction
    template<typename K, typename V>
    MapTerm<K, V>& newMapTerm()
    {
        return *(new CMapTerm<K, V>());
    }

}

#endif
