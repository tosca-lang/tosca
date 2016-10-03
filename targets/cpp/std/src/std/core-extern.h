// Copyright (c) 2016 IBM Corporation.

#ifndef CORE_EXTERN_H_
#define CORE_EXTERN_H_

#include <unordered_set>
#include "ts.h"

// Forward declarations

template<typename a> class List;
template<typename a> List<a>& newNil(tosca::Context& ctx);
template<typename a> List<a>& newCons(tosca::Context& ctx, a& param1, List<a>& param2);
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


template <typename b>
List<b>* FreeVariablesImpl(tosca::Context& ctx, tosca::Term& term, List<b>* result, std::unordered_set<tosca::Variable*>& bound)
{
    Optional<tosca::Variable> ovar = term.GetGVariable();
    if (ovar)
    {
        tosca::Variable& v = ovar.value();
        auto search = bound.find(&v);
        if (search == bound.end())
        {
            // Make sure the variable is of the same type as the expected type.
            tosca::Term& guse = v.GUse();
            b* vuse = dynamic_cast<b*>(&guse);
            if (vuse)
                return &newCons<b>(ctx, *vuse, *result);
            
            guse.Release();
        }
        
        return result;
    }
    else
    {
        int subidx = 0;
        while (true)
        {
            Optional<tosca::Term> osub = term.Sub(subidx);
            if (!osub)
                break;
            
            int binderidx = 0;
            while (true)
            {
                Optional<tosca::Variable> binder = term.Binder(subidx, binderidx);
                if (!binder)
                    break;
                
                bound.insert(&binder.value());
                binderidx ++;
            }
            
            result = FreeVariablesImpl(ctx, osub.value(), result, bound);
            
            binderidx = 0;
            while (true)
            {
                Optional<tosca::Variable> binder = term.Binder(subidx, binderidx);
                if (!binder)
                    break;
                
                bound.erase(&binder.value());
                binderidx ++;
            }
            
            subidx ++;
        }
        
        return result;
    }
}


template<typename a, typename b>
List<b>& FreeVariables(tosca::Context& ctx, a& term)
{
    std::unordered_set<tosca::Variable*> bound;
    return *FreeVariablesImpl(ctx, term, &newNil<b>(ctx), bound);
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

/* @return true when the two given terms are variables, and they are equal (same identity). */
template<typename a, typename b>
Bool& SameVariable(tosca::Context& ctx, a& var1, b& var2)
{
    Bool* result = 0;
    Optional<tosca::Variable> ov1 = var1.GetGVariable();
    if (ov1)
    {
        Optional<tosca::Variable> ov2 = var2.GetGVariable();
        if (ov2)
          result = &(&ov1.value() == &ov2.value() ? newTRUE(ctx) : newFALSE(ctx));
    }
    if (!result)
        result = &newFALSE(ctx);
    
    var1.Release();
    var2.Release();
    return *result;
}

template<typename a, typename b>
b& VariableNameIs(tosca::Context& ctx, a& var, tosca::StringTerm& name, b& result)
{
    // TODO:
    return result;
}

// --- Bit manipulation

/* @return true when all bits in left are also in right. */
Bool& BitSubSetEq(tosca::Context& ctx, tosca::DoubleTerm& left, tosca::DoubleTerm& right);

/* @return the integer with the bits in left which are not in right.  */
tosca::DoubleTerm& BitMinus(tosca::Context& ctx, tosca::DoubleTerm& left, tosca::DoubleTerm& right);

/* @return the integer with the bits in either left and/or right */
tosca::DoubleTerm& BitOr(tosca::Context& ctx, tosca::DoubleTerm& left, tosca::DoubleTerm& right);

/* @return the integer with the bits in both left and right */
tosca::DoubleTerm& BitAnd(tosca::Context& ctx, tosca::DoubleTerm& left, tosca::DoubleTerm& right);

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
  return newStringTerm(value.Symbol());
  //return newStringTerm("");
}

#endif
