// Copyright (c) 2016 IBM Corporation.
#include "ts.h"
#include <iostream>

namespace tosca {

	Context::Context() : ts(0)
    {
    	for (int i = 0; i < 2048; i ++)
    		pools.push_back(std::vector<void*>());
    }

    Context::~Context()
    {
    }

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

    std::string Context::MakeGlobalName(const std::string& hint)
    {
        std::string name;
        std::string::size_type idx = hint.find("_");
        if (idx != std::string::npos)
            name += hint.substr(0, idx);
        else
            name += hint;
        name += "_";
        name += std::to_string(++ts);
        
        if (name == track)
            std::cout << name << " created\n";
        
        return name;
    }

    void Context::PutProperty(const std::string& key, void* value)
    {
        properties[key] = value;
    }
    
    void* Context::GetProperty(const std::string& key)
    {
        auto search = properties.find(key);
        return search == properties.end() ? 0 : search->second;
    }

    void Context::Track(std::string&& str)
    {
        track = str;
    }
    
    // --- Memory management

    void* Context::Allocate(std::size_t sz)
    {
    	std::vector<void*>& poolForSize = pools[sz];
    	struct TaggedObj* obj;
    	if (poolForSize.size() > 0)
    	{
    		obj = reinterpret_cast<struct TaggedObj*>(poolForSize.back());
    		poolForSize.pop_back();
    	}
    	else
    		obj = reinterpret_cast<struct TaggedObj*>(GetMem(sz + sizeof(Context*)));

    	obj->context = this;
		return &(obj->body);
    }

    void Context::Deallocate(void* ptr, std::size_t size)
    {
		std::vector<void*>& poolForSize = pools[size];
		if (poolForSize.size() < 1024)
			poolForSize.push_back(ptr);
		else
			ReleaseMem(ptr);
    }

    void* Context::GetMem(std::size_t sz)
    {
    	return ::operator new(sz);
    }

    void Context::ReleaseMem(void* ptr)
    {
    	::operator delete(static_cast<void*>(ptr));
    }


}
