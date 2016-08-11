// Copyright (c) 2016 IBM Corporation.
#ifndef _TS_H
#define _TS_H

#include <stdexcept>
#include <unordered_map>

#include "closure.h"
#include "term.h"
#include "mapterm.h"

namespace tosca {
    
    typedef Term& (*TermFactory)();
    
    class Context
    {
    public:
        Context();
        
        /**
         * Lookup descriptor for symbol
         *
         * @param symbol
         * @return A descriptor or
         */
        Optional<TermFactory> LookupDescriptor(const std::string& symbol);
        
        /**
         * Register symbol
         *
         * @param symbol
         * @param desc
         */
        void Register(const std::string& symbol, const TermFactory factory);
    private:
        
        // The factories
        std::unordered_map<std::string, TermFactory> factories;
    };
}

template<typename T>
T& force(tosca::Context& ctx, T& term)
{
    return term;
}

/* Small utility function turning a rvalue into an lvalue */
template<typename T>
T& lvalue(T&& r)
{
    return r;
}

#endif
