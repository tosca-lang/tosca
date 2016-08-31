// Copyright (c) 2016 IBM Corporation.
#ifndef _TS_H
#define _TS_H

#include <stdexcept>
#include <unordered_map>

#include "closure.h"
#include "term.h"

namespace tosca {

    typedef Term& (*TermFactory)(Context&);
    typedef Variable& (*VarFactory)(std::string&& hint);

    class Context
    {
    public:
        Context();

        /**
         * Make new construction for the given symbol
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


    private:

        // The factories
        std::unordered_map<const StringTerm*, TermFactory> factories;

        // The variable factories
        std::unordered_map<const StringTerm*, VarFactory> varFactories;

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
