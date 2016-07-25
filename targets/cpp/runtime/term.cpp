// Copyright (c) 2016 IBM Corporation.
#include <iostream>

#include "term.h"
#include "compat.h"
//
//namespace ts
//{
//namespace runtime
//{

// --- Ref

Ref::Ref() :
        refcount(1)
{
}

Ref::~Ref()
{
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
    if (refcount == 0)
        delete this;
}

// --- Term

// --- Variable Use

// --- Variable

UVariable::UVariable(std::string&& n) :
        name(n), uses(1)
{
}

// --- String
//
StringTerm& stringTerm(std::string&& val)
{
    return *(new CStringTerm(*(new std::string(val))));
}

Variable<CStringVarUse>& varStringTerm(std::string&& name)
{
    return *(new Variable<CStringVarUse>(std::move(name)));
}

CStringVarUse::CStringVarUse(Variable<CStringVarUse>& v) :
        VariableUse(v)
{
}

CStringTerm::CStringTerm(std::string& val) :
        value(val)
{
}

CStringTerm::~CStringTerm()
{
    delete &value;
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
DoubleTerm& doubleTerm(double val)
{
    return *(new CDoubleTerm(val));
}

Variable<CDoubleVarUse>& varDoubleTerm(std::string&& name)
{
    return *(new Variable<CDoubleVarUse>(std::move(name)));
}

CDoubleVarUse::CDoubleVarUse(Variable<CDoubleVarUse>& v) :
        VariableUse(v)
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



//
//} // runtime
//} // ts

//using namespace ts::runtime;
//
