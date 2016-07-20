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

// --- Zero free variable

/* Closure with zero free variable, no capture. Arity must be zero. */
template<typename R>
class _Closure0: public _Ref
{
public:
    _Closure0(Function f) :
            function(f)
    {
    }
    virtual ~_Closure0()
    {
    }

    virtual R& Eval(Context context)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun0>(function)(context));
    }

protected:
    Function function;
};

/* Closure with zero free variable, with capture. */
template<typename R, int arity>
class _Closure0C: public _Closure0<R>
{
};

/* Closure with zero free variable, for function arity 1. */
template<typename R>
class _Closure0C<R, 1> : public _Closure0<R>
{
public:
    _Closure0C(Function f, Ref c1) :
            _Closure0<R>::_Closure0(f), cptr1(c1)
    {
    }

    ~_Closure0C()
    {
        cptr1.Release();
    }

    R& Eval(Context context)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun1>(_Closure0<R>::function)(context, NewRef(cptr1)));
    }

private:
    Ref cptr1;
};

/* Closure with zero free variable, for function arity 2. */
template<typename R>
class _Closure0C<R, 2> : public _Closure0<R>
{
public:
    _Closure0C(Function f, Ref c1, Ref c2) :
            _Closure0<R>::_Closure0(f), cptr1(c1), cptr2(c2)
    {
    }

    ~_Closure0C()
    {
        cptr1.Release();
        cptr2.Release();
    }

    R& Eval(Context context)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun2>(_Closure0<R>::function)(context, NewRef(cptr1), NewRef(cptr2)));
    }

private:
    Ref cptr1;
    Ref cptr2;
};

/* Closure with zero free variable, for function arity 3. */
template<typename R>
class _Closure0C<R, 3> : public _Closure0<R>
{
public:
    _Closure0C(Function f, Ref c1, Ref c2, Ref c3) :
            _Closure0<R>::_Closure0(f), cptr1(c1), cptr2(c2), cptr3(c3)
    {
    }

    ~_Closure0C()
    {
        cptr1.Release();
        cptr2.Release();
        cptr3.Release();
    }

    R& Eval(Context context)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun3>(_Closure0<R>::function)(context, NewRef(cptr1), NewRef(cptr2), NewRef(cptr3)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
};


/* Closure with zero free variable, for function arity 4. */
template<typename R>
class _Closure0C<R, 4> : public _Closure0<R>
{
public:
    _Closure0C(Function f, Ref c1, Ref c2, Ref c3, Ref c4) :
            _Closure0<R>::_Closure0(f), cptr1(c1), cptr2(c2), cptr3(c3), cptr4(c4)
    {
    }

    ~_Closure0C()
    {
        cptr1.Release();
        cptr2.Release();
        cptr3.Release();
        cptr4.Release();
    }

    R& Eval(Context context)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun4>(_Closure0<R>::function)(context, NewRef(cptr1), NewRef(cptr2), NewRef(cptr3), NewRef(cptr4)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
    Ref cptr4;
};

/* Closure with zero free variable, for function arity 5. */
template<typename R>
class _Closure0C<R, 5> : public _Closure0<R>
{
public:
    _Closure0C(Function f, Ref c1, Ref c2, Ref c3, Ref c4, Ref c5) :
            _Closure0<R>::_Closure0(f), cptr1(c1), cptr2(c2), cptr3(c3), cptr4(c4), cptr5(c5)
    {
    }

    ~_Closure0C()
    {
        cptr1.Release();
        cptr2.Release();
        cptr3.Release();
        cptr4.Release();
        cptr5.Release();
    }

    R& Eval(Context context)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun5>(_Closure0<R>::function)(context, NewRef(cptr1), NewRef(cptr2), NewRef(cptr3), NewRef(cptr4), NewRef(cptr5)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
    Ref cptr4;
    Ref cptr5;
};

/* Closure with zero free variable, for function arity 6. */
template<typename R>
class _Closure0C<R, 6> : public _Closure0<R>
{
public:
    _Closure0C(Function f, Ref c1, Ref c2, Ref c3, Ref c4, Ref c5, Ref c6) :
            _Closure0<R>::_Closure0(f), cptr1(c1), cptr2(c2), cptr3(c3), cptr4(c4), cptr5(c5), cptr6(c6)
    {
    }

    ~_Closure0C()
    {
        cptr1.Release();
        cptr2.Release();
        cptr3.Release();
        cptr4.Release();
        cptr5.Release();
        cptr6.Release();
    }

    R& Eval(Context context)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun6>(_Closure0<R>::function)(context, NewRef(cptr1), NewRef(cptr2), NewRef(cptr3), NewRef(cptr4), NewRef(cptr5), NewRef(cptr6)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
    Ref cptr4;
    Ref cptr5;
    Ref cptr6;
};


template<typename R>
_Closure0<R>& thunk(R& (*function)(Context ctx))
{
    return *(new _Closure0<R>(reinterpret_cast<Function>(function)));
}

template<typename R, typename P1>
_Closure0<R>& thunk(R& (*function)(Context ctx, P1&), Ref c1)
{
    return *(new _Closure0C<R, 1>(reinterpret_cast<Function>(function), c1));
}

template<typename R, typename P1, typename P2>
_Closure0<R>& thunk(R& (*function)(Context ctx, P1&, P2&), Ref c1, Ref c2)
{
    return *(new _Closure0C<R, 2>(reinterpret_cast<Function>(function), c1, c2));
}

template<typename R, typename P1, typename P2, typename P3>
_Closure0<R>& thunk(R& (*function)(Context ctx, P1&, P2&, P3&), Ref c1, Ref c2, Ref c3)
{
    return *(new _Closure0C<R, 3>(reinterpret_cast<Function>(function), c1, c2, c3));
}

template<typename R, typename P1, typename P2, typename P3, typename P4>
_Closure0<R>& thunk(R& (*function)(Context ctx, P1&, P2&, P3&, P4&), Ref c1, Ref c2, Ref c3, Ref c4)
{
    return *(new _Closure0C<R, 4>(reinterpret_cast<Function>(function), c1, c2, c3, c4));
}

template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5>
_Closure0<R>& thunk(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&), Ref c1, Ref c2, Ref c3, Ref c4, Ref c5)
{
    return *(new _Closure0C<R, 5>(reinterpret_cast<Function>(function), c1, c2, c3, c4, c5));
}

template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5, typename P6>
_Closure0<R>& thunk(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&, P6&), Ref c1, Ref c2, Ref c3, Ref c4, Ref c5, Ref c6)
{
    return *(new _Closure0C<R, 6>(reinterpret_cast<Function>(function), c1, c2, c3, c4, c5, c6));
}

// --- One free variable

/* Closure with one free variable, no capture. Arity must be one. */
template<typename R, typename P1>
class _Closure1: public _Ref
{
public:
    _Closure1(Function f) :
            function(f)
    {
    }
    virtual ~_Closure1()
    {
    }

    virtual R& Eval(Context context, P1& p1)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun1>(function)(context, p1));
    }

protected:
    Function function;
};


template<typename R, typename P1>
_Closure1<R, P1>& closure(R& (*function)(Context ctx, P1&))
{
    return *(new _Closure1<R, P1>(reinterpret_cast<Function>(function)));
}


/* Closure with one free variable, with capture. */
template<typename R, typename P1, int arity>
class _Closure1C: public _Closure1<R, P1>
{
};

/* Closure with one free variable, For function arity 2. */
template<typename R, typename P1>
class _Closure1C<R, P1, 2> : public _Closure1<R, P1>
{
public:
    _Closure1C(Function f, Ref c1) :
            _Closure1<R, P1>::_Closure1(f), cptr1(c1)
    {
    }

    ~_Closure1C()
    {
        cptr1.Release();
    }

    R& Eval(Context context, P1& p1)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun2>(_Closure1<R, P1>::function)(context, p1, NewRef(cptr1)));
    }

private:
    Ref cptr1;
};

// Don't use typename _Closure1<R, P1>::Function1 here because it's a non-deduced context.
template<typename R, typename P1, typename P2>
_Closure1<R, P1>& closure(R& (*function)(Context ctx, P1&, P2&), Ref c1)
{
    return *(new _Closure1C<R, P1, 2>(reinterpret_cast<Function>(function), c1));
}


/* Closure with one free variable, For function arity 3. */
template<typename R, typename P1>
class _Closure1C<R, P1, 3> : public _Closure1<R, P1>
{
public:
    _Closure1C(Function f, Ref c1, Ref c2) :
            _Closure1<R, P1>::_Closure1(f), cptr1(c1), cptr2(c2)
    {
    }

    ~_Closure1C()
    {
        cptr1.Release();
        cptr2.Release();
    }

    R& Eval(Context context, P1& p1)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun3>(_Closure1<R, P1>::function)(context, p1, NewRef(cptr1),
                NewRef(cptr2)));
    }

private:
    Ref cptr1;
    Ref cptr2;
};


template<typename R, typename P1, typename P2, typename P3>
_Closure1<R, P1>& closure(R& (*function)(Context ctx, P1&, P2&, P3&), Ref c1, Ref c2)
{
    return *(new _Closure1C<R, P1, 3>(reinterpret_cast<Function>(function), c1, c2));
}

template<typename R, typename P1>
class _Closure1C<R, P1, 4> : public _Closure1<R, P1>
{
public:
    _Closure1C(Function f, Ref c1, Ref c2, Ref c3) :
            _Closure1<R, P1>::_Closure1(f), cptr1(c1), cptr2(c2), cptr3(c3)
    {
    }

    ~_Closure1C()
    {
        cptr1.Release();
        cptr2.Release();
        cptr3.Release();
    }

    R& Eval(Context context, P1& p1)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun4>(_Closure1<R, P1>::function)(context, p1, NewRef(cptr1),
                NewRef(cptr2), NewRef(cptr3)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
};

template<typename R, typename P1, typename P2, typename P3, typename P4>
_Closure1C<R, P1, 4>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&), Ref c1, Ref c2, Ref c3)
{
    return *(new _Closure1C<R, P1, 4>(reinterpret_cast<Function>(function), c1, c2, c3));
}

template<typename R, typename P1>
class _Closure1C<R, P1, 5> : public _Closure1<R, P1>
{
public:
    _Closure1C(Function f, Ref c1, Ref c2, Ref c3, Ref c4) :
            _Closure1<R, P1>::_Closure1(f), cptr1(c1), cptr2(c2), cptr3(c3), cptr4(c4)
    {
    }

    ~_Closure1C()
    {
        cptr1.Release();
        cptr2.Release();
        cptr3.Release();
        cptr4.Release();
    }

    R& Eval(Context context, P1& p1)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun5>(_Closure1<R, P1>::function)(context, p1, NewRef(cptr1),
                NewRef(cptr2), NewRef(cptr3), NewRef(cptr4)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
    Ref cptr4;
};

template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5>
_Closure1C<R, P1, 5>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&), Ref c1, Ref c2, Ref c3, Ref c4)
{
    return *(new _Closure1C<R, P1, 5>(reinterpret_cast<Function>(function), c1, c2, c3, c4));
}

// ---


/* Closure with two free variable, no capture. Arity must be 2. */
template<typename R, typename P1, typename P2>
class _Closure2: public _Ref
{
public:
    _Closure2(Function f) :
            function(f)
    {
    }
    virtual ~_Closure2()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun2>(function)(context, p1, p2));
    }

protected:
    Function function;
};

template<typename R, typename P1, typename P2>
_Closure2<R, P1, P2>& closure(R& (*function)(Context ctx, P1&, P2&))
{
    return *(new _Closure2<R, P1, P2>(reinterpret_cast<Function>(function)));
}

/* Closure with two free variable, with capture */
template<typename R, typename P1, typename P2, int arity>
class _Closure2C: public _Closure2<R, P1, P2>
{
};

template<typename R, typename P1, typename P2>
class _Closure2C<R, P1, P2, 1> : public _Closure2<R, P1, P2>
{
public:
    _Closure2C(Function f, Ref c1) :
            _Closure2<R, P1, P2>::_Closure2(f), cptr1(c1)
    {
    }

    virtual ~_Closure2C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun3>(_Closure2<R, P1, P2>::function)(context, p1, p2, NewRef(cptr1)));
    }

private:
    Ref cptr1;
};

template<typename R, typename P1, typename P2, typename P3>
_Closure2C<R, P1, P2, 1>& closure(R& (*function)(Context ctx, P1&, P2&, P3&), P3& c1)
{
    return *(new _Closure2C<R, P1, P2, 1>(reinterpret_cast<Function>(function), c1));
}


template<typename R, typename P1, typename P2>
class _Closure2C<R, P1, P2, 2> : public _Closure2<R, P1, P2>
{
public:
    _Closure2C(Function f, Ref c1, Ref c2) :
            _Closure2<R, P1, P2>::_Closure2(f), cptr1(c1), cptr2(c2)
    {
    }

    virtual ~_Closure2C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun4>(_Closure2<R, P1, P2>::function)(context, p1, p2, NewRef(cptr1), NewRef(cptr2)));
    }

private:
    Ref cptr1;
    Ref cptr2;
};

template<typename R, typename P1, typename P2, typename P3, typename P4>
_Closure2C<R, P1, P2, 2>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&), Ref c1, Ref c2)
{
    return *(new _Closure2C<R, P1, P2, 2>(reinterpret_cast<Function>(function), c1, c2));
}


template<typename R, typename P1, typename P2>
class _Closure2C<R, P1, P2, 9> : public _Closure2<R, P1, P2>
{
public:
    _Closure2C(Function f, Ref c1, Ref c2, Ref c3, Ref c4, Ref c5, Ref c6, Ref c7, Ref c8, Ref c9) :
            _Closure2<R, P1, P2>::_Closure2(f), cptr1(c1), cptr2(c2), cptr3(c3), cptr4(c4), cptr5(c5), cptr6(c6), cptr7(c7), cptr8(c9), cptr9(c9)
    {
    }

    virtual ~_Closure2C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun11>(_Closure2<R, P1, P2>::function)(context, p1, p2, NewRef(cptr1), NewRef(cptr2), NewRef(cptr3), NewRef(cptr4), NewRef(cptr5), NewRef(cptr6), NewRef(cptr7), NewRef(cptr8), NewRef(cptr9)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
    Ref cptr4;
    Ref cptr5;
    Ref cptr6;
    Ref cptr7;
    Ref cptr8;
    Ref cptr9;
};


template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5, typename P6, typename P7, typename P8, typename P9, typename P10, typename P11>
_Closure2C<R, P1, P2, 9>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&, P6&, P7&, P8&, P9&, P10&, P11&), Ref c1, Ref c2, Ref c3, Ref c4, Ref c5, Ref c6, Ref c7, Ref c8, Ref c9)
{
    return *(new _Closure2C<R, P1, P2, 9>(reinterpret_cast<Function>(function), c1, c2, c3, c4, c5, c6, c7, c8, c9));
}

// ----

/* Closure with three free variable, no capture. Arity must be 3. */
template<typename R, typename P1, typename P2, typename P3>
class _Closure3: public _Ref
{
public:
    _Closure3(Function f) :
            function(f)
    {
    }
    virtual ~_Closure3()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun3>(function)(context, p1, p2, p3));
    }

protected:
    Function function;
};

template<typename R, typename P1, typename P2, typename P3>
_Closure3<R, P1, P2, P3>& closure(R& (*function)(Context ctx, P1&, P2&, P3&))
{
    return *(new _Closure3<R, P1, P2, P3>(reinterpret_cast<Function>(function)));
}

/* Closure with three free variable, with capture */
template<typename R, typename P1, typename P2, typename P3, int arity>
class _Closure3C: public _Closure3<R, P1, P2, P3>
{
};

template<typename R, typename P1, typename P2, typename P3>
class _Closure3C<R, P1, P2, P3, 1> : public _Closure3<R, P1, P2, P3>
{
public:
    _Closure3C(Function f, Ref c1) :
            _Closure3<R, P1, P2, P3>::_Closure3(f), cptr1(c1)
    {
    }

    virtual ~_Closure3C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun4>(_Closure3<R, P1, P2, P3>::function)(context, p1, p2, p3, NewRef(cptr1)));
    }

private:
    Ref cptr1;
};


template<typename R, typename P1, typename P2, typename P3, typename P4>
_Closure3C<R, P1, P2, P3, 1>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&), Ref c1)
{
    return *(new _Closure3C<R, P1, P2, P3, 1>(reinterpret_cast<Function>(function), c1));
}

template<typename R, typename P1, typename P2, typename P3>
class _Closure3C<R, P1, P2, P3, 2> : public _Closure3<R, P1, P2, P3>
{
public:
    _Closure3C(Function f, Ref c1, Ref c2) :
            _Closure3<R, P1, P2, P3>::_Closure3(f), cptr1(c1), cptr2(c2)
    {
    }

    virtual ~_Closure3C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun5>(_Closure3<R, P1, P2, P3>::function)(context, p1, p2, p3, NewRef(cptr1), NewRef(cptr2)));
    }

private:
    Ref cptr1;
    Ref cptr2;
};


template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5>
_Closure3C<R, P1, P2, P3, 1>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&), Ref c1, Ref c2)
{
    return *(new _Closure3C<R, P1, P2, P3, 2>(reinterpret_cast<Function>(function), c1, c2));
}

template<typename R, typename P1, typename P2, typename P3>
class _Closure3C<R, P1, P2, P3, 3> : public _Closure3<R, P1, P2, P3>
{
public:
    _Closure3C(Function f, Ref c1, Ref c2, Ref c3) :
            _Closure3<R, P1, P2, P3>::_Closure3(f), cptr1(c1), cptr2(c2), cptr3(c3)
    {
    }

    virtual ~_Closure3C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun6>(_Closure3<R, P1, P2, P3>::function)(context, p1, p2, p3, NewRef(cptr1), NewRef(cptr2), NewRef(cptr3)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
};


template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5, typename P6>
_Closure3C<R, P1, P2, P3, 3>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&, P6&), Ref c1, Ref c2, Ref c3)
{
    return *(new _Closure3C<R, P1, P2, P3, 3>(reinterpret_cast<Function>(function), c1, c2, c3));
}

template<typename R, typename P1, typename P2, typename P3>
class _Closure3C<R, P1, P2, P3, 8> : public _Closure3<R, P1, P2, P3>
{
public:
    _Closure3C(Function f, Ref c1, Ref c2, Ref c3, Ref c4, Ref c5, Ref c6, Ref c7, Ref c8) :
            _Closure3<R, P1, P2, P3>::_Closure3(f), cptr1(c1), cptr2(c2), cptr3(c3), cptr4(c4), cptr5(c5), cptr6(c6), cptr7(c7), cptr8(c8)
    {
    }

    virtual ~_Closure3C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun11>(_Closure3<R, P1, P2, P3>::function)(context, p1, p2, p3, NewRef(cptr1), NewRef(cptr2), NewRef(cptr3), NewRef(cptr4), NewRef(cptr5), NewRef(cptr6), NewRef(cptr7), NewRef(cptr8)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
    Ref cptr4;
    Ref cptr5;
    Ref cptr6;
    Ref cptr7;
    Ref cptr8;
};


template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5, typename P6, typename P7, typename P8, typename P9, typename P10, typename P11>
_Closure3C<R, P1, P2, P3, 8>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&, P6&, P7&, P8&, P9&, P10&, P11&), Ref c1, Ref c2, Ref c3, Ref c4, Ref c5, Ref c6, Ref c7, Ref c8)
{
    return *(new _Closure3C<R, P1, P2, P3, 8>(reinterpret_cast<Function>(function), c1, c2, c3, c4, c5, c6, c7, c8));
}


// ----

/* Closure with four free variable, no capture. Arity must be 4. */
template<typename R, typename P1, typename P2, typename P3, typename P4>
class _Closure4: public _Ref
{
public:
    _Closure4(Function f) :
            function(f)
    {
    }
    virtual ~_Closure4()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3, P4& p4)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun4>(function)(context, p1, p2, p3, p4));
    }

protected:
    Function function;
};

template<typename R, typename P1, typename P2, typename P3, typename P4>
_Closure4<R, P1, P2, P3, P4>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&))
{
    return *(new _Closure4<R, P1, P2, P3, P4>(reinterpret_cast<Function>(function)));
}

/* Closure with three free variable, with capture */
template<typename R, typename P1, typename P2, typename P3, typename P4, int arity>
class _Closure4C: public _Closure4<R, P1, P2, P3, P4>
{
};

template<typename R, typename P1, typename P2, typename P3, typename P4>
class _Closure4C<R, P1, P2, P3, P4, 1> : public _Closure4<R, P1, P2, P3, P4>
{
public:
    _Closure4C(Function f, Ref c1) :
            _Closure4<R, P1, P2, P3, P4>::_Closure4(f), cptr1(c1)
    {
    }

    virtual ~_Closure4C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3, P4& p4)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun5>(_Closure4<R, P1, P2, P3, P4>::function)(context, p1, p2, p3, p4, NewRef(cptr1)));
    }

private:
    Ref cptr1;
};

template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5>
_Closure4C<R, P1, P2, P3, P4, 1>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&), Ref c1)
{
    return *(new _Closure4C<R, P1, P2, P3, P4, 1>(reinterpret_cast<Function>(function), c1));
}

template<typename R, typename P1, typename P2, typename P3, typename P4>
class _Closure4C<R, P1, P2, P3, P4, 2> : public _Closure4<R, P1, P2, P3, P4>
{
public:
    _Closure4C(Function f, Ref c1, Ref c2) :
            _Closure4<R, P1, P2, P3, P4>::_Closure4(f), cptr1(c1), cptr2(c2)
    {
    }

    virtual ~_Closure4C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3, P4& p4)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun6>(_Closure4<R, P1, P2, P3, P4>::function)(context, p1, p2, p3, p4, NewRef(cptr1), NewRef(cptr2)));
    }

private:
    Ref cptr1;
    Ref cptr2;
};

template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5, typename P6>
_Closure4C<R, P1, P2, P3, P4, 2>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&, P6&), Ref c1, Ref c2)
{
    return *(new _Closure4C<R, P1, P2, P3, P4, 2>(reinterpret_cast<Function>(function), c1, c2));
}

template<typename R, typename P1, typename P2, typename P3, typename P4>
class _Closure4C<R, P1, P2, P3, P4, 3> : public _Closure4<R, P1, P2, P3, P4>
{
public:
    _Closure4C(Function f, Ref c1, Ref c2, Ref c3) :
            _Closure4<R, P1, P2, P3, P4>::_Closure4(f), cptr1(c1), cptr2(c2), cptr3(c3)
    {
    }

    virtual ~_Closure4C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3, P4& p4)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun7>(_Closure4<R, P1, P2, P3, P4>::function)(context, p1, p2, p3, p4, NewRef(cptr1), NewRef(cptr2), NewRef(cptr3)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
};

template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5, typename P6, typename P7>
_Closure4C<R, P1, P2, P3, P4, 3>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&, P6&, P7&), Ref c1, Ref c2, Ref c3)
{
    return *(new _Closure4C<R, P1, P2, P3, P4, 3>(reinterpret_cast<Function>(function), c1, c2, c3));
}

template<typename R, typename P1, typename P2, typename P3, typename P4>
class _Closure4C<R, P1, P2, P3, P4, 4> : public _Closure4<R, P1, P2, P3, P4>
{
public:
    _Closure4C(Function f, Ref c1, Ref c2, Ref c3, Ref c4) :
            _Closure4<R, P1, P2, P3, P4>::_Closure4(f), cptr1(c1), cptr2(c2), cptr3(c3), cptr4(c4)
    {
    }

    virtual ~_Closure4C()
    {
    }

    virtual R& Eval(Context context, P1& p1, P2& p2, P3& p3, P4& p4)
    {
        return dynamic_cast<R&>(reinterpret_cast<Fun8>(_Closure4<R, P1, P2, P3, P4>::function)(context, p1, p2, p3, p4, NewRef(cptr1), NewRef(cptr2), NewRef(cptr3), NewRef(cptr4)));
    }

private:
    Ref cptr1;
    Ref cptr2;
    Ref cptr3;
    Ref cptr4;
};

template<typename R, typename P1, typename P2, typename P3, typename P4, typename P5, typename P6, typename P7, typename P8>
_Closure4C<R, P1, P2, P3, P4, 4>& closure(R& (*function)(Context ctx, P1&, P2&, P3&, P4&, P5&, P6&, P7&, P8&), Ref c1, Ref c2, Ref c3, Ref c4)
{
    return *(new _Closure4C<R, P1, P2, P3, P4, 4>(reinterpret_cast<Function>(function), c1, c2, c3, c4));
}

#endif
