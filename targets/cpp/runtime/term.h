// Copyright (c) 2016 IBM Corporation.

#ifndef _TERM_H
#define _TERM_H

#include <cassert>
#include <initializer_list>
#include <string>

#include "compat.h"
#include "ts.h"

namespace ts
{

namespace runtime
{

class _Variable;

//using Variable = _Variable&;
typedef _Variable& Variable;

class _Term;
//using Term = _Term&;
typedef _Term& Term;

class _Ref
{
public:
    /**
     * Number of references to this instance.
     */
    unsigned long refcount;

public:
    _Ref();
    virtual ~_Ref();

    /** Add new ref */
    void Ref();

    /** Release ref */
    void Release();

};

/*
 * Base class for all terms, typed or not.
 */
class _Term: public _Ref
{
public:
    /**
     * @return shallow copy of this term.
     */
    virtual Term Copy(Context c) = 0;

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
    virtual Optional<Variable> Binder(int i, int j)
    {
        return Optional<Variable>::nullopt;
    }

    /**
     * Set jth binder of the ith subterm.
     *
     * @param i subterm index. Must be >=0 and < number of subs
     * @param j subbinder index.  Must be >=0 and < number of binders for the given sub
     */
    virtual void SetBinder(int i, int j, Variable var)
    {
        assert(false);
    }

    // TODO: use C++11 concepts to restrict T to extends Term
    template<typename T>
    static T Subst(Context c, T term, std::initializer_list<Term> from, std::initializer_list<Term> to);

}; // _Term


/*
 * Base class for variable
 */
class _Variable: public _Term
{
protected:
    _Variable(std::string value);


    /* Globally unique variable name */
    std::string name;

    /* Count the number of variable use (in the term tree) */
    unsigned long uses;
};


/**
 * String term type
 */
class _StringTerm;
//using StringTerm = _StringTerm&;
typedef _StringTerm& StringTerm;

// Construction
StringTerm stringTerm(std::string&& str);

class _StringTerm: public _Term
{
public:

    /** Peek at native string value */
    virtual Optional<std::string> Unbox() const
    {
        return Optional<std::string>::nullopt;
    }
};
// _StringTerm

/**
 * String term value
 */
class _ValStringTerm: public _StringTerm
{
protected:
    /** The string value */
    std::string value;

public:
    _ValStringTerm(std::string value);

    Term Copy(Context c);
    Optional<std::string> Unbox() const;


};
// _StringTerm

template<typename a>
class _List;

template<typename a>
class _Cons;

/**
 * List, just to try templates
 */
template<typename a>
class _List : public _Term
{
    typedef _List<a>& type;

    virtual Optional<_Cons<a>> asCons(Context context)
    {
      return Optional<_Cons<a>>::nullopt;
    }
};

template<typename a>
class _Cons : public _List<a>
{
public:
    _Cons(a param1, typename _List<a>::List param2)
    {

    }

    virtual Optional<_Cons<a>> asCons(Context context)
    {
        return Optional<_Cons<a>>(this);
    }
};

template<typename a>
typename _List<a>::type Cons(Context context, a param1, typename _List<a>::type param2)
{
    return (*new _Cons<a>(param1, param2));
}


}// runtime
} // ts
#endif
