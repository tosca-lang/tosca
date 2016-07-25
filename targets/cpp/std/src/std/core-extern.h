// Copyright (c) 2016 IBM Corporation.

#ifndef _CORE_EXTERN
#define _CORE_EXTERN

#include "ts.h"

template<typename a> class List;
class Bool;

// --- External environment

template<typename a>
a& IfDef(Context& ctx, StringTerm& value_164, _LazyTerm<a>& value_165, _LazyTerm<a>& value_166)
{

}

StringTerm& GetEnv(Context& ctx, StringTerm& value_161, StringTerm& value_162);

// --- Boolean

template<typename a, typename b>
Bool& Equal(Context& ctx, a& value_118, b& value_119)
{

}

template<typename a>
Bool& DeepEqual(Context& ctx, a& value_147, a& value_148)
{

}

// --- Syntactic Variable

template<typename a>
List<a>& FreeVariables(Context& ctx, a& value_130)
{

}

template<typename a>
List<a>& ExceptVariables(Context& ctx, a& value_112, a& value_113)
{

}

template<typename a>
List<a>& IntersectVariables(Context& ctx, a& value_116, a& value_117)
{

}

template<typename a, typename b>
Bool& SameVariable(Context& ctx, a& value_114, b& value_115)
{

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
a& Error(Context& ctx, StringTerm& value_145)
{
    throw std::runtime_error("Error");
}

template<typename a>
a& ForgivableError(Context& ctx, StringTerm& value, StringTerm& value1, StringTerm& value2, StringTerm& value3,
        StringTerm& value4, StringTerm& value5, Closure0<a>& ret)
{

}

template<typename a>
a& EventualError(Context& ctx, StringTerm& value_154)
{

}

// --- Debugging

template<typename a>
a& Debug(Context& ctx, StringTerm& value_123, _LazyTerm<a>& value_124)
{

}

template<typename a>
StringTerm& Show(Context& ctx, a& value_163)
{

}

#endif
