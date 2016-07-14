// Copyright (c) 2016 IBM Corporation.
#ifndef _CLOSURE_H
#define _CLOSURE_H

#include "term.h"

// Provide commonly used closure signatures.
//
// Could propably be more generic but need to dig deep
// into C++ metaprogramming.
//
// No need to do more, as C++11 renders this code obsolete.



// --- One free variable


/* Closure with one free variable, no capture. Arity must be one. */
template<typename R, typename P1>
class _Closure1: public _Ref
{
public:
    _Closure1(Function f) : function(f) {}
    virtual ~_Closure1() {}

    virtual R eval(Context context, P1 p1)
    {
        return dynamic_cast<R>(reinterpret_cast<Fun1>(function)(context, p1));
    }

protected:
    Function function;
};

/* Closure with one free variable, with capture. */
template<typename R, typename P1, int arity>
class _Closure1C: public _Closure1<R, P1> {};

/* Closure with one free variable, For function arity 2. */
template<typename R, typename P1>
class _Closure1C<R, P1, 2> : public _Closure1<R, P1>
{
public:
    _Closure1C(Function f, Ref c1) :
            _Closure1<R, P1>::_Closure1(f), cptr1(c1) {}

    ~_Closure1C()
    {
        cptr1.Release();
    }

    R eval(Context context, P1 p1)
    {
        return dynamic_cast<R>(reinterpret_cast<Fun2>(_Closure1<R, P1>::function)(context, p1, NewRef(cptr1)));
    }

private:
    Ref cptr1;
};

/* Closure with one free variable, For function arity 2. */
template<typename R, typename P1>
class _Closure1C<R, P1, 3> : public _Closure1<R, P1>
{
public:
    _Closure1C(Function f, Ref c1, Ref c2) :
            _Closure1<R, P1>::_Closure1(f), cptr1(c1), cptr2(c2) {}

    ~_Closure1C()
    {
        cptr1.Release();
        cptr2.Release();
    }

    R eval(Context context, P1 p1)
    {
        return dynamic_cast<R>(reinterpret_cast<Fun3>(_Closure1<R, P1>::function)(context, p1, NewRef(cptr1), NewRef(cptr2)));
    }

private:
    Ref cptr1;
    Ref cptr2;
};

template<typename R, typename P1>
_Closure1<R, P1>& closure(R (*function)(Context ctx, P1))
{
    return *(new _Closure1<R, P1>(reinterpret_cast<Function>(function)));
}

// Don't use typename _Closure1<R, P1>::Function1 here because it's a non-deduced context.
template<typename R, typename P1, typename P2>
_Closure1<R, P1>& closure(R (*function)(Context ctx, P1, P2&), P2& c1)
{
    return *(new _Closure1C<R, P1, 2>(reinterpret_cast<Function>(function), c1));
}

template<typename R, typename P1, typename P2, typename P3>
_Closure1<R, P1>& closure(R (*function)(Context ctx, P1, P2&, P3&), P2& c1, P3& c2)
{
    return *(new _Closure1C<R, P1, 3>(reinterpret_cast<Function>(function), c1, c2));
}

/* Closure with two free variable, no capture. Arity must be 2. */
template<typename R, typename P1, typename P2>
class _Closure2: public _Ref
{
public:
    _Closure2(Function f) : function(f) {}
    virtual ~_Closure2() {}

    virtual R eval(Context context, P1 p1, P2 p2)
    {
        return dynamic_cast<R>(reinterpret_cast<Fun2>(function)(context, p1, p2));
    }

protected:
    Function function;
};

template<typename R, typename P1, typename P2>
_Closure2<R, P1, P2>& closure(R (*function)(Context ctx, P1, P2))
{
    return *(new _Closure2<R, P1, P2>(reinterpret_cast<Function>(function)));
}


#endif
