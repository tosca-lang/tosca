// Copyright (c) 2016 IBM Corporation.
#ifndef _TS_H
#define _TS_H

#include <stdexcept>
#include "term.h"
#include "mapterm.h"
#include "closure.h"

class Context
{

};

template<typename T>
T& force(Context& ctx, T& term)
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
