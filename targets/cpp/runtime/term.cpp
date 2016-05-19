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

// --- Variable

_Variable::_Variable(std::string n) :
        name(n), uses(0)
{
}

// --- String
//
_StringTerm& stringTerm(std::string&& val)
{
    return *(new _ValStringTerm(*(new std::string(val))));
}

VarStringTerm varStringTerm(std::string&& val)
{
    return *(new _VarStringTerm(*(new std::string(val))));
}

_ValStringTerm::_ValStringTerm(std::string& val) :
        value(val)
{}

_ValStringTerm::~_ValStringTerm()
{
    delete &value;
}

Term _ValStringTerm::Copy(Context c)
{
    Ref();
    return *this;
}

Optional<std::string> _ValStringTerm::Unbox() const
{
    return make_optional<std::string>(value);
}

_VarStringTerm::_VarStringTerm(std::string& name) : _Variable(name) {}

//
//} // runtime
//} // ts

//using namespace ts::runtime;
//
