// Copyright (c) 2016 IBM Corporation.
#include "num-extern.h"

#include "std/core.h"

DoubleTerm& Plus(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    DoubleTerm& result = newDoubleTerm(left.Unbox() + right.Unbox());
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& Minus(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    DoubleTerm& result = newDoubleTerm(left.Unbox() - right.Unbox());
    left.Release();
    right.Release();
    return result;
}

Bool& LessThan(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    throw new std::runtime_error("");
}

Bool& GreaterThan(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    double uleft = left.Unbox();
    double uright = right.Unbox();
    Bool& result = uleft > uright ? newTRUE(ctx) : newFALSE(ctx);
    left.Release();
    right.Release();
    return result;
}

StringTerm& FormatNumber(Context& ctx, DoubleTerm& num)
{
    double unum = num.Unbox();
    num.Release();
    char* str = (char*) alloca((size_t) 32);
    snprintf(str, (size_t) 31, "%G", unum);
    return newStringTerm(str);
}

StringTerm& FormatInteger(Context& ctx, DoubleTerm& num)
{
    long long unum = (long long) num.Unbox();
    num.Release();
    char* str = (char*) alloca((size_t) 32);
    snprintf(str, (size_t) 31, "%lld", unum);
    return newStringTerm(str);}

StringTerm& FormatDecimal(Context& ctx, DoubleTerm& num)
{
    throw new std::runtime_error("");
}

DoubleTerm& Hex(Context& ctx, StringTerm& str)
{
    throw new std::runtime_error("");
}
