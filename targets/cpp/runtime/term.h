// Copyright (c) 2016 IBM Corporation.

#ifndef _TERM_H
#define _TERM_H

#include <cassert>
#include <memory>
#include <initializer_list>

#include "compat.h"
#include "engine.h"

namespace ts {

namespace runtime{

class _Variable;
using Variable = std::shared_ptr<_Variable>;

class _Term;
using Term = std::shared_ptr<_Term>;

/*
 * Base class for all terms, typed or not.
 */
class _Term {


    /**
     * @return shallow copy of this term.
     */
    virtual Term Copy(Context c) = 0;

    /** @return true when this term is data */
    virtual bool data()
    {
        return true;
    }

    /**
     * Peek at the ith subterm.
     *
     * @param i the sub index
     * @return a subterm or null if none at the given index. does not create a new reference.
     */
    virtual Term sub(int i)
    {
        return nullptr;
    }

    /**
     * Replace the ith sub term
     *
     * @param i the sub index. Must be >=0 and < number of subs
     * @param term the term. The reference is transferred.
     */
    virtual void setSub(int i, Term sub)
    {
        assert(false);
    }

    /**
     * Get binders of the ith subterm.
     *
     * @param index
     * @return a binder, or null.
     */
    virtual Variable binder(int i, int j)
    {
        return nullptr;
    }

    /**
     * Set jth binder of the ith subterm.
     *
     * @param i subterm index. Must be >=0 and < number of subs
     * @param j subbinder index.  Must be >=0 and < number of binders for the given sub
     */
    virtual void setBinder(int i, int j, Variable var)
    {
        assert(false);
    }

    // TODO: use C++11 concepts to restrict T to extends Term
    template <typename T>
    static T subst(Context c, T term, std::initializer_list<Term> from, std::initializer_list<Term> to);

}; // Term



}
}
#endif
