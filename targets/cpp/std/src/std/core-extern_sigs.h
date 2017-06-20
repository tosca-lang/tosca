// Copyright (c) 2016 IBM Corporation.

#ifndef CORE_EXTERN_SIGS_H_
#define CORE_EXTERN_SIGS_H_

#include <unordered_set>
#include <vector>
#include "ts.h"
#include "listdef_sigs.h"

// --- Evaluation

template<typename a, typename b>
b& As(tosca::Context& ctx, a& value);

// --- External environment

template<typename a>
a& IfDef(tosca::Context& ctx, tosca::StringTerm& key, Closure0<a>& ctrue, Closure0<a>& cfalse);

// --- Boolean

template<typename a, typename b>
Bool& Equal(tosca::Context& ctx, a& val1, b& val2);

template<typename a>
Bool& DeepEqual(tosca::Context& ctx, a& lhs, a& rhs);

// --- Syntactic Variable

template <typename b>
List<b>* FreeVariablesImpl(tosca::Context& ctx, const tosca::Term& term, List<b>* result, std::unordered_set<tosca::Variable*>& bound, std::unordered_set<tosca::Variable*>& free);

template<typename a, typename b>
List<b>& FreeVariables(tosca::Context& ctx, a& term);

template<typename a, typename b>
Bool& IsFreeVariable(tosca::Context& ctx, a& var, b& term);

template<typename a>
void IndexVariables(tosca::Context& ctx, List<a>& list, std::unordered_set<tosca::Variable*>& index);

template<typename a>
List<a>& ExceptVariables(tosca::Context& ctx, List<a>& lhs, List<a>& rhs);

template<typename a>
List<a>& IntersectVariables(tosca::Context& ctx, List<a>& lhs, List<a>& rhs);

/* @return true when the two given terms are variables, and they are equal (same identity). */
template<typename a, typename b>
Bool& SameVariable(tosca::Context& ctx, a& var1, b& var2);

template<typename a, typename b>
b& VariableNameIs(tosca::Context& ctx, a& var, tosca::StringTerm& name, b& result);

// --- Bit manipulation

/* @return true when all bits in left are also in right. */
Bool& BitSubSetEq(tosca::Context& ctx, tosca::DoubleTerm& left, tosca::DoubleTerm& right);

/* @return the integer with the bits in left which are not in right.  */
tosca::DoubleTerm& BitMinus(tosca::Context& ctx, tosca::DoubleTerm& left, tosca::DoubleTerm& right);

/* @return the integer with the bits in either left and/or right */
tosca::DoubleTerm& BitOr(tosca::Context& ctx, tosca::DoubleTerm& left, tosca::DoubleTerm& right);

/* @return the integer with the bits in both left and right */
tosca::DoubleTerm& BitAnd(tosca::Context& ctx, tosca::DoubleTerm& left, tosca::DoubleTerm& right);

// --- Profiling

template<typename a>
a& CI_Enter(tosca::Context& ctx, tosca::DoubleTerm& mid, tosca::StringTerm& name, Closure0<a>& result);

template<typename a>
a& CI_Exit(tosca::Context& ctx, tosca::DoubleTerm& mid, Closure0<a>& result);

// --- Error

template<typename a>
a& Error(tosca::Context& ctx, tosca::StringTerm& msg);

template<typename a>
a& ForgivableError(tosca::Context& ctx, tosca::StringTerm& value, tosca::StringTerm& value1, tosca::StringTerm& value2, tosca::StringTerm& value3,
        tosca::StringTerm& value4, tosca::StringTerm& value5, Closure0<a>& ret);

template<typename a>
a& EventualError(tosca::Context& ctx, tosca::StringTerm& format, List<tosca::StringTerm>& arg, Closure0<a>& result);

// --- Debugging

template<typename a>
a& Debug(tosca::Context& ctx, tosca::StringTerm& msg, Closure0<a>& result);

template<typename a>
tosca::StringTerm& Show(tosca::Context& ctx, a& value);

#endif
