// Copyright (c) 2016 IBM Corporation.

#ifndef CORE_EXTERN_H_
#define CORE_EXTERN_H_

#include <unordered_set>
#include <vector>
#include "ts.h"
#include "listdef_sigs.h"

// Forward declarations

template<typename a> class List;
template<typename a> List<a>& newNil(tosca::Context& ctx);
template<typename a> List<a>& newCons(tosca::Context& ctx, a& param1, List<a>& param2);
class Bool;

extern Bool& newTRUE(tosca::Context& ctx);
extern Bool& newFALSE(tosca::Context& ctx);

// --- Evaluation

template<typename a, typename b>
b& As(tosca::Context& ctx, a& value)
{
    return dynamic_cast<b&>(value);
}

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
Bool& DeepEqual(tosca::Context& ctx, a& lhs, a& rhs)
{
    std::unordered_map<tosca::Variable*, tosca::Variable*> varmap;
    Bool& result = lhs.DeepEquals(rhs, varmap) ? newTRUE(ctx) : newFALSE(ctx);
    lhs.Release();
    rhs.Release();
    return result;
}

// --- Syntactic Variable

template <typename b>
List<b>* FreeVariablesImpl(tosca::Context& ctx, const tosca::Term& term, List<b>* result, std::unordered_set<tosca::Variable*>& bound)
{
    Optional<tosca::Variable> ovar = term.GetGVariable();
    if (ovar)
    {
        tosca::Variable& v = ovar.value();
        auto search = bound.find(&v);
        if (search == bound.end()) // If not found, it's a free var.
        {
            // Make sure the variable is of the same type as the expected type.
            tosca::Term& guse = v.GUse(ctx);
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
            std::vector<tosca::Variable*> shadowed;
            while (true)
            {
                Optional<tosca::Variable> binder = term.Binder(subidx, binderidx);
                if (!binder)
                    break;
                
                auto search = bound.find(&binder.value());
                if (search == bound.end())
                {
                    shadowed.push_back(0);
                    bound.insert(&binder.value());
                }
                else
                    shadowed.push_back(*search);

                binderidx ++;
            }
            
            result = FreeVariablesImpl(ctx, osub.value(), result, bound);
            
            binderidx = 0;
            while (true)
            {
                Optional<tosca::Variable> binder = term.Binder(subidx, binderidx);
                if (!binder)
                    break;
                
                tosca::Variable* v = shadowed[binderidx];
                if (!v)
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
    List<b>& fvs = *FreeVariablesImpl(ctx, term, &newNil<b>(ctx), bound);
    term.Release();
    return fvs;
}

bool IsFreeVariableImpl(tosca::Context& ctx, const tosca::Variable& var, const tosca::Term& term);

template<typename a, typename b>
Bool& IsFreeVariable(tosca::Context& ctx, a& var, b& term)
{
    Bool& result = IsFreeVariableImpl(ctx, var.GetGVariable().value(), term) ? newTRUE(ctx) : newFALSE(ctx);
    term.Release();
    return result;
}

template<typename a>
void IndexVariables(tosca::Context& ctx, List<a>& list, std::unordered_set<tosca::Variable*>& index)
{
    List<a>* c = &list;
    while (true)
    {
        auto ocons = c->asCons(ctx);
        if (!ocons)
            break;
        
        auto& cons = ocons.value();
        auto ovar = cons.getValue1(ctx, true).GetGVariable();
        if (ovar)
            index.insert(&ovar.value());
        
        c = &cons.getValue2(ctx, true);
    }
}


template<typename a>
List<a>& ExceptVariables(tosca::Context& ctx, List<a>& lhs, List<a>& rhs)
{
    std::unordered_set<tosca::Variable*> index;
    IndexVariables(ctx, rhs, index);
    
    List<a>* result = &newNil<a>(ctx);
    List<a>* c = &lhs;
    while (true)
    {
        auto ocons = c->asCons(ctx);
        if (!ocons)
            break;
        
        auto& cons = ocons.value();
        auto ovar = cons.getValue1(ctx, true).GetGVariable();
        if (ovar)
        {
            tosca::Variable& v = ovar.value();
            if (index.find(&v) == index.end())
                result = &newCons<a>(ctx, *dynamic_cast<a*>(&v.GUse(ctx)), *result);
        }
        c = &cons.getValue2(ctx, true);
    }
    // TODO: inline release for efficiency.
    lhs.Release();
    rhs.Release();
    return *result;
}

template<typename a>
List<a>& IntersectVariables(tosca::Context& ctx, List<a>& lhs, List<a>& rhs)
{
    std::unordered_set<tosca::Variable*> index;
    IndexVariables(ctx, rhs, index);
    
    List<a>* result = &newNil<a>(ctx);
    List<a>* c = &lhs;
    while (true)
    {
        auto ocons = c->asCons(ctx);
        if (!ocons)
            break;
        
        auto& cons = ocons.value();
        auto ovar = cons.getValue1(ctx, true).GetGVariable();
        if (ovar)
        {
            tosca::Variable& v = ovar.value();
            if (index.find(&v) != index.end())
                result = &newCons<a>(ctx, *dynamic_cast<a*>(&v.GUse(ctx)), *result);
        }
        c = &cons.getValue2(ctx, true);
    }
    // TODO: inline release for efficiency.
    lhs.Release();
    rhs.Release();
    return *result;

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

// --- Profiling


template<typename a>
a& CI_Enter(tosca::Context& ctx, tosca::DoubleTerm& mid, tosca::StringTerm& name,  Closure0<a>& result)
{
    mid.Release();
    name.Release();
    return result.Eval(ctx);
}

template<typename a>
a& CI_Exit(tosca::Context& ctx, tosca::DoubleTerm& mid, Closure0<a>& result)
{
    mid.Release();
    return result.Eval(ctx);
}


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
a& EventualError(tosca::Context& ctx, tosca::StringTerm& format, List<tosca::StringTerm>& arg, Closure0<a>& result)
{
    format.Release();
    arg.Release();
    return result.Eval(ctx);

}

// --- Debugging

template<typename a>
a& Debug(tosca::Context& ctx, tosca::StringTerm& msg, Closure0<a>& result)
{
    std::cerr << msg.Unbox();
    msg.Release();
    return result.Eval(ctx);
}

template<typename a>
tosca::StringTerm& Show(tosca::Context& ctx, a& value)
{
  return newStringTerm(ctx, value.Symbol());
  //return newStringTerm("");
}

#endif
