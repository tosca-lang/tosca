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
StringTerm& newStringTerm(std::string&& val)
{
    return *(new CStringTerm(*(new std::string(val))));
}

StringTerm& newStringTerm(std::string& val)
{
    return *(new CStringTerm(val));
}

CStringVar::CStringVar(std::string&& name) : Variable(std::move(name))
{
}

CStringVarUse& CStringVar::Use()
{
    return *(new CStringVarUse(*this));
}

CStringVar& varStringTerm(std::string&& name)
{
    return *(new CStringVar(std::move(name)));
}


CStringVarUse::CStringVarUse(CStringVar& v) :
        VariableUse(v)
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
DoubleTerm& newDoubleTerm(double val)
{
    return *(new CDoubleTerm(val));
}

CDoubleVar& varDoubleTerm(std::string&& name)
{
    return *(new CDoubleVar(std::move(name)));
}

CDoubleVarUse::CDoubleVarUse(CDoubleVar& v) :
        VariableUse(v)
{
}


CDoubleVar::CDoubleVar(std::string&& name) : Variable(std::move(name))
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
