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

_Ref::_Ref() :
        refcount(1)
{
}

_Ref::~_Ref()
{
    // assert(refcount == 0);
}

void _Ref::Ref()
{
    // assert(refcount > 0);
    refcount++;
}

void _Ref::Release()
{
    //assert(refcount > 0);
    refcount--;
    if (refcount == 0)
        delete this;
}

// --- Term

// --- Variable Use

// --- Variable

_Variable::_Variable(std::string&& n) :
        name(n), uses(0)
{
}

// --- String
//
_StringTerm& stringTerm(std::string&& val)
{
    return *(new _ValStringTerm(*(new std::string(val))));
}

VarStringTerm var_StringTerm(std::string&& name)
{
    return *(new Var_StringTerm(std::move(name)));
}

Var_StringTerm::Var_StringTerm(std::string&& name) :
        _TypedVariable(std::move(name))
{
}

_ValStringTerm::_ValStringTerm(std::string& val) :
        value(val)
{
}

_ValStringTerm::~_ValStringTerm()
{
    delete &value;
}

Term _ValStringTerm::Copy(Context c)
{
    Ref();
    return *this;
}

std::string& _ValStringTerm::Unbox() const
{
    return value;
}

// --- Numeric
//
_DoubleTerm& doubleTerm(double val)
{
    return *(new _ValDoubleTerm(val));
}

VarDoubleTerm varDoubleTerm(std::string&& name)
{
    return *(new Var_DoubleTerm(std::move(name)));
}

Var_DoubleTerm::Var_DoubleTerm(std::string&& name) :
        _TypedVariable(std::move(name))
{
}

_ValDoubleTerm::_ValDoubleTerm(double val) :
        value(val)
{
}

Term _ValDoubleTerm::Copy(Context c)
{
    Ref();
    return *this;
}

double _ValDoubleTerm::Unbox() const
{
    return value;
}

//
//} // runtime
//} // ts

//using namespace ts::runtime;
//
