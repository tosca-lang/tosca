// Copyright (c) 2016 IBM Corporation.
#include "ts.h"

namespace tosca {
    
    Context::Context()
    {}
    
    Term& Context::MakeConstructor(const std::string& symbol)
    {
        auto search = factories.find(symbol);
        if (search == factories.end())
        {
            throw std::runtime_error("Internal Error: symbol not registered.");
        }
        return search->second(*this);
    }
    
    void Context::Register(const std::string& symbol, const TermFactory factory)
    {
        factories[symbol] = factory;
    }
    
}