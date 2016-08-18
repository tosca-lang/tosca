// Copyright (c) 2016 IBM Corporation.

#ifndef CORE_EXTERN_H_
#define CORE_EXTERN_H_

#include "ts.h"

template<typename a> class List;
class Bool;


extern Bool& newTRUE(tosca::Context& ctx);
extern Bool& newFALSE(tosca::Context& ctx);

// --- External environment

tosca::StringTerm& GetEnv(tosca::Context& ctx, tosca::StringTerm& key, tosca::StringTerm& def);

template<typename a>
a& IfDef(tosca::Context& ctx, tosca::StringTerm& key, Closure0<a>& ctrue, Closure0<a>& cfalse)
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
Bool& Equal(tosca::Context& ctx, a& val1, b& val2)
{
    Bool& result = val1 == val2 ? newTRUE(ctx) : newFALSE(ctx);
    val1.Release();
    val2.Release();
    return result;
}

template<typename a>
Bool& DeepEqual(tosca::Context& ctx, a& value_147, a& value_148)
{
    throw new std::runtime_error("unimplemented");
}

// --- Syntactic Variable

template<typename a>
List<a>& FreeVariables(tosca::Context& ctx, a& value_130)
{
    throw new std::runtime_error("unimplemented");
}

template<typename a>
List<a>& ExceptVariables(tosca::Context& ctx, List<a>& value_112, List<a>& value_113)
{
    throw new std::runtime_error("unimplemented");
}

template<typename a>
List<a>& IntersectVariables(tosca::Context& ctx, List<a>& value_116, List<a>& value_117)
{
    throw new std::runtime_error("unimplemented");
}

template<typename a, typename b>
Bool& SameVariable(tosca::Context& ctx, a& value_114, b& value_115)
{
    throw new std::runtime_error("unimplemented");
}

template<typename a, typename b>
b& VariableNameIs(tosca::Context& ctx, a& value_127, tosca::StringTerm& value_128, b& value_129);

// --- Bit manipulation

Bool& BitSubSetEq(tosca::Context& ctx, tosca::DoubleTerm& value_120, tosca::DoubleTerm& value_121);
tosca::DoubleTerm& BitMinus(tosca::Context& ctx, tosca::DoubleTerm& value_125, tosca::DoubleTerm& value_126);
tosca::DoubleTerm& BitOr(tosca::Context& ctx, tosca::DoubleTerm& value_136, tosca::DoubleTerm& value_137);
tosca::DoubleTerm& BitAnd(tosca::Context& ctx, tosca::DoubleTerm& value_159, tosca::DoubleTerm& value_160);

// --- Error

template<typename a>
a& Error(tosca::Context& ctx, tosca::StringTerm& msg)
{
    throw std::runtime_error(msg.Unbox());
}

template<typename a>
a& ForgivableError(tosca::Context& ctx, tosca::StringTerm& value, tosca::StringTerm& value1, tosca::StringTerm& value2, tosca::StringTerm& value3,
        tosca::StringTerm& value4, tosca::StringTerm& value5, Closure0<a>& ret)
{
    return ret.Eval(ctx);
}

template<typename a>
a& EventualError(tosca::Context& ctx, tosca::StringTerm& msg)
{
    throw new std::runtime_error(msg.Unbox());
}

// --- Debugging

template<typename a>
a& Debug(tosca::Context& ctx, tosca::StringTerm& msg, Closure0<a>& result)
{
    std::cout << msg.Unbox();
    msg.Release();
    return result.Eval(ctx);
}

template<typename a>
tosca::StringTerm& Show(tosca::Context& ctx, a& value)
{
    return newStringTerm("");
}

#endif
