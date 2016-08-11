// Copyright (c) 2016 IBM Corporation.
#include <iostream>

#include "term.h"
#include "compat.h"

namespace tosca {
    
    // --- Ref
    
    Ref::Ref() :
    refcount(1)
    {
    }
    
    Ref::~Ref()
    {
        std::cout << "delete ref\n";
        // assert(refcount == 0);
    }
    
    void Ref::AddRef()
    {
        // assert(refcount > 0);
        refcount++;
    }
    
    void Ref::Release()
    {
        //assert(refcount > 0);
        refcount--;
        //if (refcount == 0)
        //  delete this;
    }
    
    // --- Term
    
    // --- Variable Use
    
    
    // --- Variable
    
    Variable::Variable(std::string&& n) :
    name(n), uses(1)
    {
    }
    
    // --- String
    //
    
    CStringTermVar::CStringTermVar(std::string&& name) : Variable(std::move(name))
    {
    }
    
    CStringTermVarUse& CStringTermVar::Use()
    {
        return *(new CStringTermVarUse(*this));
    }
    
    
    
    CStringTermVarUse::CStringTermVarUse(CStringTermVar& v) :
    VariableUse<CStringTermVar>::VariableUse(v)
    {
    }
    
    
    CStringTerm::CStringTerm(std::string& val) :
    value(val)
    {
    }
    
    CStringTerm::~CStringTerm()
    {
        // delete &value;
    }
    
    Term CStringTerm::Copy(Context& ctx)
    {
        Ref();
        return *this;
    }
    
    std::string& CStringTerm::Unbox() const
    {
        return value;
    }
    
    // --- Numeric
    //
    
    CDoubleTermVarUse::CDoubleTermVarUse(CDoubleTermVar& v) :
    VariableUse<CDoubleTermVar>::VariableUse(v)
    {
    }
    
    
    CDoubleTermVar::CDoubleTermVar(std::string&& name) : Variable(std::move(name))
    {
    }
    
    CDoubleTerm::CDoubleTerm(double val) :
    value(val)
    {
    }
    
    Term CDoubleTerm::Copy(Context& ctx)
    {
        Ref();
        return *this;
    }
    
    double CDoubleTerm::Unbox() const
    {
        return value;
    }
    
}

using namespace tosca;

StringTerm& newStringTerm(std::string&& val)
{
    return *(new CStringTerm(*(new std::string(val))));
}

StringTerm& newStringTerm(std::string& val)
{
    return *(new CStringTerm(val));
}

CStringTermVar& varStringTerm(std::string&& name)
{
    return *(new CStringTermVar(std::move(name)));
}

DoubleTerm& newDoubleTerm(double val)
{
    return *(new CDoubleTerm(val));
}

CDoubleTermVar& varDoubleTerm(std::string&& name)
{
    return *(new CDoubleTermVar(std::move(name)));
}
