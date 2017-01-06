// Copyright (c) 2016 IBM Corporation.
#ifndef _STRING_EXTERN_H
#define _STRING_EXTERN_H

#include "std/string-extern_sigs.h"
#include "term.h"

#include <string>

/* @return the concatenation of the given strings */
template <typename T1>
tosca::StringTerm& ConcatString(tosca::Context& ctx)
{
    return newStringTerm(ctx, "");
}

template <typename T1>
tosca::StringTerm& ConcatString(tosca::Context&, T1& str)
{
    return static_cast<tosca::StringTerm&>(str);
}

template <typename T1, typename ... Ts>
tosca::StringTerm& ConcatString(tosca::Context& ctx, T1& str, Ts&... strs)
{
    tosca::StringTerm& s1 = static_cast<tosca::StringTerm&>(str);
    tosca::StringTerm& s2 = ConcatString(ctx, strs...);
    tosca::StringTerm& result = newStringTerm(ctx, s1.Unbox() + s2.Unbox());
    s1.Release();
    s2.Release();
    return result;
}

#endif
