// Copyright (c) 2016 IBM Corporation.
#ifndef _CLOSURE_H
#define _CLOSURE_H

#include "term.h"

/* Provide generic classes to create closure */

template <typename R, typename P1>
class _Closure1: public _Term
{
public:
    typedef R(*Function1)(Context, P1);

    _Closure1(Function1 f1, _Term** cptrs) : function(f1), captures(cptrs)
    {}

    R eval(Context context, P1 p1)
    {
        return function(context, p1);
    }

private:
    Function1 function;
    _Term** captures;
};

// Don't use typename _Closure1<R, P1>::Function1 here because it's a non-deduced context.
template <typename R, typename P1>
_Closure1<R, P1>& closure(R (*function)(Context, P1), _Term** captures)
{
    return *(new _Closure1<R, P1>(function, captures));
}

template <typename T>
T identity(Context ctx, T value)
{
    return value;
}


#endif
