// Copyright (c) 2016 IBM Corporation.

#ifndef _TERM_H
#define _TERM_H

#include <cassert>
#include <string>
#include <functional>

#include "compat.h"

class Context;
class Ref;

typedef Ref& (*Function)();
typedef Ref& (*Fun0)(Context& ctx);
typedef Ref& (*Fun1)(Context& ctx, Ref&);
typedef Ref& (*Fun2)(Context& ctx, Ref&, Ref&);
typedef Ref& (*Fun3)(Context& ctx, Ref&, Ref&, Ref&);
typedef Ref& (*Fun4)(Context& ctx, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun5)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun6)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun7)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun8)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun9)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun10)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun11)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun12)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun13)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun14)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun15)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&);
typedef Ref& (*Fun16)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&);
typedef Ref& (*Fun17)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&);
typedef Ref& (*Fun18)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun19)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun20)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun21)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun22)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun23)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun24)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun25)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun26)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun27)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun28)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun29)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun30)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun31)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun32)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun33)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&);
typedef Ref& (*Fun34)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&);
typedef Ref& (*Fun35)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&);
typedef Ref& (*Fun36)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun37)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun38)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun39)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);
typedef Ref& (*Fun40)(Context& ctx, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&,
        Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&, Ref&);

//
//
//namespace ts
//{
//
//namespace runtime
//{

template<typename VU>
class VariableUse;

class UVariable;

template<typename VU>
class Variable;

class Term;

class Ref
{
public:
    /**
     * Number of references to this instance.
     */
    unsigned long refcount;

public:
    Ref();
    virtual ~Ref();

    /** Add new ref */
    void AddRef();

    /** Release ref */
    void Release();

};

/* Just a convenient function for the user code to look nicer */
template<typename T>
inline T& NewRef(T& ref)
{
    ref.AddRef();
    return static_cast<T&>(ref);
}

/*
 * Base class for terms
 */
class Term: public Ref
{
public:
    /**
     * @return shallow copy of this term.
     */
    //  virtual Term Copy(Context& ctx) = 0;
    /** @return true when this term is data */
    virtual bool Data() const
    {
        return true;
    }

    /**
     * Peek at the ith subterm.
     *
     * @param i the sub index
     * @return a subterm or null if none at the given index. does not create a new reference.
     */
    virtual Optional<Term> Sub(int i) const
    {
        return Optional<Term>::nullopt;
    }

    /**
     * Replace the ith sub term
     *
     * @param i the sub index. Must be >=0 and < number of subs
     * @param term the term. The reference is transferred.
     */
    virtual void SetSub(int i, Term sub)
    {
        assert(false);
    }

    /**
     * Get binders of the ith subterm.
     *
     * @param index
     * @return a binder, or null.
     */
    virtual Optional<UVariable> Binder(int i, int j)
    {
        return Optional<UVariable>::nullopt;
    }

    /**
     * Set jth binder of the ith subterm.
     *
     * @param i subterm index. Must be >=0 and < number of subs
     * @param j subbinder index.  Must be >=0 and < number of binders for the given sub
     */
    virtual void SetBinder(int i, int j, UVariable& var)
    {
        assert(false);
    }

    /**
     * Evaluates thunk (if needed).
     *
     * The reference to this term is consumed.
     *
     * @param context
     * @return A new reference to the evaluated term. It might still be a thunk if the evaluation has been interrupted
     */
    virtual Term Eval(Context& ctx)
    {
        return *this;
    }

    // TODO: use C++11 concepts to restrict T to extends Term
    template<typename T>
    static T Subst(Context& ctx, T term, std::initializer_list<Term> from, std::initializer_list<Term> to);

};
// Term

/* Term allowing variable */
template<typename VU>
class TermVar: public Term
{
public:
    Optional<Variable<VU>> variable()
    {
        return Optional<Variable<VU>>::nullopt;
    }
};

/* Unevaluated function (thunk) */
template<typename T>
class _LazyTerm: public Term
{
public:
    _LazyTerm(Function f) :
            function(f), value(Optional<T>::nullopt)
    {
    }

    /** @return true when this term is data */
    bool Data() const
    {
        return function == 0 ? reinterpret_cast<Term&>(value.value()).Data() : false;
    }

    T Eval(Context& ctx)
    {
        if (!value)
        {
            value = function(ctx); // Acquire ref.
            function = 0;
        }
        value.value().AddRef();
        return value.value();
    }

protected:
    // the unevaluated value.
    Function function;

    // the evaluated value.
    Optional<T> value;

    _LazyTerm(T value) :
            function(0)
    {
        value = make_optional(value);
    }
};

/* Base class for typed variables */

class UVariable: public Ref
{

protected:
    UVariable(std::string&& name);

    /* Globally unique variable name */
    std::string& name;

    /* Count the number of variable use (in the term tree) */
    unsigned long uses;

};

/*
 * Templated typed variable
 */
template<typename VU>
class Variable: public UVariable
{
public:
    Variable(std::string&& name) :
            UVariable(std::move(name))
    {
    }

    typename VU::type& use()
    {
        uses++;
        return VU::make(*this);
    }
};

template<typename VU>
Variable<VU>& newVariable(std::string&& name)
{
    return *(new Variable<VU>(std::move(name)));
}

/* Templated typed variable use */
template<typename VU>
class VariableUse: public virtual TermVar<VU>
{
public:
    VariableUse(Variable<VU>& v) :
            var(v)
    {
    }

    Optional<Variable<VU>> variable()
    {
        return make_optional<Variable<VU>>(var);
    }

protected:
    // the used variable
    Variable<VU>& var;

};

// -- Substitution

template<typename T>
T& Subst(Context& c, T& term, std::initializer_list<UVariable*> binders, std::initializer_list<Term*> substitutes)
{
    return term; // TODO
}

// ----- String Term

class StringTerm;

// Construction
StringTerm& stringTerm(std::string&& str);

// Base type
class StringTerm: public Term
{
public:
    virtual ~StringTerm()
    {
    }

    /** Peek at native string value */
    virtual std::string& Unbox() const
    {
        throw std::runtime_error("Fatal error: cannot access unevaluated string value.");
    }
};

/**
 * String term value
 */
class CStringTerm: public StringTerm
{
protected:
    /** The string value. A reference to it so that we can unbox it. */
    std::string& value;

public:
    CStringTerm(std::string& value);
    ~CStringTerm();

    Term Copy(Context& ctx);
    std::string& Unbox() const;

};

/**
 * Variable use of type String
 */
class CStringVarUse: public StringTerm, public VariableUse<CStringVarUse>
{
public:
    typedef CStringVarUse type;

    CStringVarUse(Variable<CStringVarUse>& v);

};

Variable<CStringVarUse>& varStringTerm(std::string&& name);

// specialize std::hash and std::equal_to
namespace std
{

template<>
struct hash<StringTerm>
{
public:
    size_t operator()(const StringTerm &str) const
    {
        std::hash<std::string> str_hash;
        return str_hash(str.Unbox());
    }
};

template<>
struct equal_to<StringTerm>
{
public:
    bool operator()(const StringTerm& lhs, const StringTerm& rhs) const
    {
        return lhs.Unbox() == rhs.Unbox();
    }
};

}
;

// --- Numeric type (double)

class DoubleTerm;

// Construction
DoubleTerm& doubleTerm(double value);

class DoubleTerm: public Term
{
public:
    virtual ~DoubleTerm()
    {
    }

    /** Peek at native double value */
    virtual double Unbox() const
    {
        throw std::runtime_error("Fatal error: cannot access unevaluated numeric value.");
    }
};
// DoubleTerm

/**
 * Double term value
 */
class CDoubleTerm: public DoubleTerm
{
protected:
    /** The double value. */
    double value;

public:
    CDoubleTerm(double value);

    Term Copy(Context& ctx);
    double Unbox() const;

};

/*
 * Variable Use of type Numeric
 */
class CDoubleVarUse: public DoubleTerm, public VariableUse<CDoubleVarUse>
{
public:
    typedef CDoubleVarUse type;

    CDoubleVarUse(Variable<CDoubleVarUse>& v);
};

Variable<CDoubleVarUse>& varDoubleTerm(std::string&& name);

#include "mapterm.h"

//}// runtime
//} // ts

#endif
