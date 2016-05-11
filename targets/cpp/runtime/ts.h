// Copyright (c) 2016 IBM Corporation.
#ifndef _TS_H
#define _TS_H

#include <stdexcept>
#include "term.h"
#include "closure.h"

class _Context
{

};
typedef _Context& Context;

template<typename T>
T force(Context ctx, T term)
{
    return term;
}


/* Builtin identity function */


#endif
