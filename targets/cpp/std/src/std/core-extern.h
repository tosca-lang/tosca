// Copyright (c) 2016 IBM Corporation.

#ifndef _CORE_EXTERN
#define _CORE_EXTERN

#include "ts.h"

template<typename a> class _List;
class _Bool;

// --- External environment


template<typename a>
a& IfDef(Context ctx, _StringTerm& value_164, _LazyTerm<a>& value_165, _LazyTerm<a>& value_166)
{

}

_StringTerm& GetEnv(Context ctx, _StringTerm& value_161, _StringTerm& value_162);

// --- Boolean

template<typename a, typename b>
_Bool& Equal(Context ctx, a& value_118, b& value_119)
{

}

template<typename a>
_Bool& DeepEqual(Context ctx, a& value_147, a& value_148)
{

}

// --- Syntactic Variable

template<typename a>
_List<a>& FreeVariables(Context ctx, a& value_130)
{

}

template<typename a>
_List<a>& ExceptVariables(Context ctx, a& value_112, a& value_113)
{

}

template<typename a>
_List<a>& IntersectVariables(Context ctx, a& value_116, a& value_117)
{

}

template<typename a, typename b>
_Bool& SameVariable(Context ctx, a& value_114, b& value_115)
{

}

template<typename a, typename b>
b& VariableNameIs(Context ctx, a& value_127, _StringTerm& value_128, b& value_129);

// --- Bit manipulation

_Bool& BitSubSetEq(Context ctx, _DoubleTerm& value_120, _DoubleTerm& value_121);
_DoubleTerm& BitMinus(Context ctx, _DoubleTerm& value_125, _DoubleTerm& value_126);
_DoubleTerm& BitOr(Context ctx, _DoubleTerm& value_136, _DoubleTerm& value_137);
_DoubleTerm& BitAnd(Context ctx, _DoubleTerm& value_159, _DoubleTerm& value_160);

// --- Error

template<typename a>
a& Error(Context ctx, _StringTerm& value_145)
{
    throw std::runtime_error("Error");
}

template<typename a>
a& ForgivableError(Context ctx, _StringTerm& value_138, _StringTerm& value_139, _StringTerm& value_140,
        _StringTerm& value_141, _StringTerm& value_142, _StringTerm& value_143, _LazyTerm<a>& value_144)
{

}

template<typename a>
a& EventualError(Context ctx, _StringTerm& value_154)
{

}

// --- Debugging

template<typename a>
a& Debug(Context ctx, _StringTerm& value_123, _LazyTerm<a>& value_124)
{

}

template<typename a>
_StringTerm& Show(Context ctx, a& value_163)
{

}

#endif
