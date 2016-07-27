// Copyright (c) 2016 IBM Corporation.

#ifndef _CORE_EXTERN
#define _CORE_EXTERN

#include "ts.h"

template<typename a> class List;
class Bool;

extern Bool& newTRUE(Context& ctx);
extern Bool& newFALSE(Context& ctx);

// --- External environment

StringTerm& GetEnv(Context& ctx, StringTerm& key, StringTerm& def);

template<typename a>
a& IfDef(Context& ctx, StringTerm& key, Closure0<a>& ctrue, Closure0<a>& cfalse)
{
    char* value = getenv(key.Unbox().c_str());
    key.Release();
    if (value)
    {
        cfalse.Release();
        return ctrue.Eval(ctx);
    }
    ctrue.Release();
    return cfalse.Eval(ctx);
}

// --- Boolean

template<typename a, typename b>
Bool& Equal(Context& ctx, a& val1, b& val2)
{
    Bool& result = val1 == val2 ? newTRUE(ctx) : newFALSE(ctx);
    val1.Release();
    val2.Release();
    return result;
}

template<typename a>
Bool& DeepEqual(Context& ctx, a& value_147, a& value_148)
{
    throw new std::runtime_error("unimplemented");
}

// --- Syntactic Variable

template<typename a>
List<a>& FreeVariables(Context& ctx, a& value_130)
{
    throw new std::runtime_error("unimplemented");
}

template<typename a>
List<a>& ExceptVariables(Context& ctx, a& value_112, a& value_113)
{
    throw new std::runtime_error("unimplemented");
}

template<typename a>
List<a>& IntersectVariables(Context& ctx, a& value_116, a& value_117)
{
    throw new std::runtime_error("unimplemented");
}

template<typename a, typename b>
Bool& SameVariable(Context& ctx, a& value_114, b& value_115)
{
    throw new std::runtime_error("unimplemented");
}

template<typename a, typename b>
b& VariableNameIs(Context& ctx, a& value_127, StringTerm& value_128, b& value_129);

// --- Bit manipulation

Bool& BitSubSetEq(Context& ctx, DoubleTerm& value_120, DoubleTerm& value_121);
DoubleTerm& BitMinus(Context& ctx, DoubleTerm& value_125, DoubleTerm& value_126);
DoubleTerm& BitOr(Context& ctx, DoubleTerm& value_136, DoubleTerm& value_137);
DoubleTerm& BitAnd(Context& ctx, DoubleTerm& value_159, DoubleTerm& value_160);

// --- Error

template<typename a>
a& Error(Context& ctx, StringTerm& msg)
{
    throw std::runtime_error(msg.Unbox());
}

template<typename a>
a& ForgivableError(Context& ctx, StringTerm& value, StringTerm& value1, StringTerm& value2, StringTerm& value3,
        StringTerm& value4, StringTerm& value5, Closure0<a>& ret)
{
    return ret.Eval(ctx);
}

template<typename a>
a& EventualError(Context& ctx, StringTerm& msg)
{
    throw new std::runtime_error(msg.Unbox());
}

// --- Debugging

template<typename a>
a& Debug(Context& ctx, StringTerm& msg, Closure0<a>& result)
{
    std::cout << msg.Unbox();
    msg.Release();
    return result.Eval(ctx);
}

template<typename a>
StringTerm& Show(Context& ctx, a& value)
{
    return newStringTerm("");
}

#endif
