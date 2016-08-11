// Copyright (c) 2016 IBM Corporation.
#include "ts.h"

namespace tosca {
    
    Context::Context()
    {}
    
    Optional<TermFactory> Context::LookupDescriptor(const std::string& symbol)
    {
        auto search = factories.find(symbol);
        if (search == factories.end())
        {
            return Optional<TermFactory>::nullopt;
        }
        return make_optional(search->second);
    }
    
    void Context::Register(const std::string& symbol, const TermFactory factory)
    {
        factories[symbol] = factory;
    }
    
}