// Copyright (c) 2016 IBM Corporation.
#include "num-extern.h"

#include <cstdio>
#include "std/core.h"

using namespace tosca;

DoubleTerm& Plus(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    DoubleTerm& result = newDoubleTerm(ctx, left.Unbox() + right.Unbox());
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& Minus(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    DoubleTerm& result = newDoubleTerm(ctx, left.Unbox() - right.Unbox());
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& Times(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    DoubleTerm& result = newDoubleTerm(ctx, left.Unbox() * right.Unbox());
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& Divide(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    double uleft = left.Unbox();
    double uright = right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, uleft / uright);
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& Modulo(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long long uleft = (long long) left.Unbox();
    long long uright = (long long) right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, uleft % uright);
    left.Release();
    right.Release();
    return result;
}


Bool& LessThan(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    double uleft = left.Unbox();
    double uright = right.Unbox();
    Bool& result = uleft < uright ? newTRUE(ctx) : newFALSE(ctx);
    left.Release();
    right.Release();
    return result;
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
    return newStringTerm(ctx, str);
}

StringTerm& FormatInteger(Context& ctx, DoubleTerm& num)
{
    long long unum = (long long) num.Unbox();
    num.Release();
    char* str = (char*) alloca((size_t) 32);
    snprintf(str, (size_t) 31, "%lld", unum);
    return newStringTerm(ctx, str);
}

StringTerm& FormatDecimal(Context& ctx, DoubleTerm& num)
{
    double unum = num.Unbox();
    num.Release();
    char* str = (char*) alloca((size_t) 32);
    snprintf(str, (size_t) 31, "%f", unum);
    return newStringTerm(ctx, str);
}

tosca::DoubleTerm& ToDecimal(tosca::Context& ctx, tosca::StringTerm& str)
{
    double num;
    if (std::sscanf(str.Unbox().c_str(), "%lg", &num) <= 0)
        throw new std::runtime_error("Illegally formatted decimal: " + str.Unbox());
    str.Release();
    return newDoubleTerm(ctx, num);
}


DoubleTerm& Hex(Context& ctx, StringTerm& hex)
{
    long long num;
    if (std::sscanf(hex.Unbox().c_str(), "%llX", &num) <= 0)
        throw new std::runtime_error("Illegally formatted hex: " + hex.Unbox());
    hex.Release();
    return newDoubleTerm(ctx, num);
}
