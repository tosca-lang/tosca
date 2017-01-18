// Copyright (c) 2016 IBM Corporation.
#ifndef _TS_H
#define _TS_H

#include <stdexcept>
#include <string>
#include <unordered_map>
#include <vector>
#include <cstddef>

#include "closure.h"
#include "term.h"

namespace tosca {

	// Forward declarations
	template<class T> struct Allocator;
	typedef std::basic_string<char, std::char_traits<char>, Allocator<char>> string;

    typedef Term& (*TermFactory)(Context&);
    typedef Variable& (*VarFactory)(Context&, std::string& hint);

    class Context
    {
    public:
        Context(Context&);
        virtual ~Context();

        /**
         * Make new construction for the given external symbol
         *
         * @param symbol
         * @return A term, or an exception when symbol hasn't been registered
         */
        Term& MakeConstructor(const StringTerm& symbol);
        
        /**
         * Register symbol
         *
         * @param symbol
         * @param factory
         */
        void Register(const StringTerm& symbol, const TermFactory factory);

        /**
         * Register factory for the specified variable type.
         *
         * @param type
         * @param factory
         */
        void RegisterVariable(const StringTerm& type, const VarFactory factory);

        /**
         * Make globally unique name from the given hint
         *
         * @param hint
         * @return A new unique name
         */
        tosca::string MakeGlobalName(const tosca::string& hint);
        
        /** 
         * Add user-defined properties 
         */
        void PutProperty(const std::string& key, void* value);
        
        /**
         * Add user-defined properties
         */
        void* GetProperty(const std::string& key);
        
        /** Track global name */
        void Track(tosca::string&& name);

        // Allocation helper

        /** Allocate memory in the object pool, or in the heap when the pool is exhausted. */
        void* Allocate(std::size_t sz);

        /** Deallocate memory  */
        void Deallocate(void* ptr, std::size_t size);

        /** Low-level memory allocation. By default, call the global new operation  */
        virtual void* GetMem(std::size_t sz);

        /** Low-level memory deallocation, By default, call the global delete operation  */
        virtual void ReleaseMem(void* ptr);

        /* Custom char allocator */
        const Allocator<char>& allocChar;

    private:

        // The factories
        std::unordered_map<const StringTerm*, TermFactory> factories;

        // The variable factories
        std::unordered_map<const StringTerm*, VarFactory> varFactories;

        // User-defined properties
        std::unordered_map<std::string, void*> properties;
        
        // The generic pools
        std::vector<std::vector<void*>> pools;

        // global counter.
        unsigned long long ts;
        
        // Name to track (debugging purpose)
        tosca::string track;
        

    };
    
    /** Add new reference to the given term */
    template<typename T>
    inline T& NewRef(T& ref)
    {
        ref.AddRef();
        return ref;
    }

    // Helper struct storing Context along with objects.
    struct TaggedObj
   	{
       	Context* context;
       	void* body;
   	};

	static const bool NOALLOC = getenv("toscanoalloc") != 0;

    /** Allocate memory in the term pool, or in the heap when the term pool is exhausted. */
    inline void* Allocate(std::size_t sz, Context& ctx)
    {
    	if (NOALLOC)
    		return ::operator new (sz);
    	return ctx.Allocate(sz);
    }

    /** Deallocate memory  */
    inline void Deallocate(void* ptr, std::size_t size)
    {
    	if (NOALLOC)
			::operator delete (ptr);
    	else
    	{
    		struct TaggedObj* tag = reinterpret_cast<struct TaggedObj*>(static_cast<uint8_t*>(ptr) - sizeof(Context*));
    		tag->context->Deallocate(static_cast<void*>(tag), size);
    	}
    }

}


#endif
