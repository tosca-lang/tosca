// Copyright (c) 2016 IBM Corporation.
#include "ts.h"

namespace tosca {

    Context::Context() : ts(0)
    {}

    Term& Context::MakeConstructor(const StringTerm& symbol)
    {
        auto search = factories.find(&symbol);
        if (search == factories.end())
        {
            throw std::runtime_error("Internal Error: symbol not registered.");
        }
        return search->second(*this);
    }

    void Context::Register(const StringTerm& symbol, const TermFactory factory)
    {
        std::size_t s = std::hash<const tosca::StringTerm*>{}(&symbol);


        factories[&symbol] = factory;
    }

    void Context::RegisterVariable(const StringTerm& type, const VarFactory factory)
    {
        varFactories[&type] = factory;
    }

    std::string& Context::MakeGlobalName(const std::string& hint)
    {
        std::string& name = *(new std::string());
        std::string::size_type idx = hint.find("_");
        if (idx != std::string::npos)
            name += hint.substr(0, idx);
        else
            name += hint;
        name += "_";
        name += std::to_string(++ts);
        return name;
    }

}
