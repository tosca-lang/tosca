// Copyright (c) 2016 IBM Corporation.

#ifndef _TERM_H
#define _TERM_H

#include <cassert>
#include <string>
#include <functional>

#include "compat.h"

namespace tosca {
    
    // Forward declarations
    
    class Context;
    class Ref;
    typedef Ref& (*Function)();
    class VariableUse;
    class Variable;
    class Term;
    
    // Reference counting base facility.
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
        virtual void SetSub(int i, Term& sub)
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
        virtual void SetBinder(int i, int j, Variable& var)
        {
            assert(false);
        }
        
//        /**
//         * Evaluates thunk (if needed).
//         *
//         * The reference to this term is consumed.
//         *
//         * @param context
//         * @return A new reference to the evaluated term. It might still be a thunk if the evaluation has been interrupted
//         */
//        virtual Term Eval(Context& ctx)
//        {
//            return *this;
//        }
        
        inline bool operator==(const Term& rhs)
        {
            throw std::runtime_error("not implemented");
        }
        
    protected:
        
        /* @return The variable when this term is a variable use, otherwise nullopt */
        virtual Optional<Variable> GetGVariable() const;
        
        friend struct std::hash<std::reference_wrapper<tosca::Term>>;
        friend struct std::equal_to<std::reference_wrapper<tosca::Term>>;
    };
    // Term
    
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
            return function == 0 ? value.value().Data() : false;
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
    class Variable: public Ref
    {
        
    public:
        Variable(std::string&& name);
        
        bool operator==(const Variable& other) const
        {
            return &other == this;
        }
        
        bool operator!=(const Variable& other) const
        {
            return !(*this == other);
        }
        
    protected:
        /* Globally unique variable name */
        std::string& name;
        
        /* Count the number of variable use (in the term tree) */
        unsigned long uses;
        
        /* @Brief Create an new use of this variable */
        virtual Term& GUse();
        
        friend class BufferSink;
    };
    
    /* Generic Variable use interface */
    class VariableUse: public virtual Term
    {
    public:
        VariableUse(Variable& v) : var(v) {}
        
        
    protected:
        // the used variable
        Variable& var;
        
        Optional<Variable> GetGVariable() const;
    };
    
    
    // ----- String Term
    
    // Base type
    class StringTerm: public Term
    {
    public:
        StringTerm()
        {
        }
        
        StringTerm(const StringTerm& other)
        {
        }
        
        virtual ~StringTerm()
        {
        }
        
        /** Peek at native string value */
        virtual const std::string& Unbox() const
        {
            throw std::runtime_error("Fatal error: cannot access unevaluated string value.");
        }
        
        inline bool operator==(const StringTerm& rhs)
        {
            return Unbox() == rhs.Unbox();
        }
        
        inline bool operator!=(const StringTerm& rhs)
        {
            return !(*this == rhs);
        }
    };
    
    /**
     * String term value
     */
    class CStringTerm: public StringTerm
    {
    protected:
        /** The string value. A reference so that we can unbox it. */
        const std::string& value;
        
    public:
        CStringTerm(const std::string& value);
        ~CStringTerm();
        
        Term Copy(Context& ctx);
        const std::string& Unbox() const;
        
    };
    
    class CStringTermVar;
    
    /**
     * Variable use of type String
     */
    class CStringTermVarUse: public StringTerm, public VariableUse
    {
    public:
        CStringTermVarUse(CStringTermVar& v);
        
    };
    
    class CStringTermVar: public Variable
    {
    public:
        CStringTermVar(std::string&& name);
        StringTerm& Use();
        Term& GUse();
    };
    
    
    // --- Numeric type (double)
    
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
        
        inline bool operator==(const DoubleTerm& rhs)
        {
            return Unbox() == rhs.Unbox();
        }
        
        inline bool operator!=(const DoubleTerm& rhs)
        {
            return !(*this == rhs);
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
    
    class CDoubleTermVar;
    
    /*
     * Variable Use of type Numeric
     */
    class CDoubleTermVarUse: public DoubleTerm, public VariableUse
    {
    public:
        CDoubleTermVarUse(CDoubleTermVar& v);
    };
    
    class CDoubleTermVar: public Variable
    {
    public:
        CDoubleTermVar(std::string&& name);
        virtual DoubleTerm& Use();
        virtual Term& GUse();
    };
    
   
    
}

/* Just a convenient function for the user code to look nicer */
template<typename T>
inline T& NewRef(T& ref)
{
    ref.AddRef();
    return ref;
}

// -- Substitution

template<typename T>
T& Subst(tosca::Context& c, T& term, std::initializer_list<tosca::Variable*> binders, std::initializer_list<tosca::Term*> substitutes)
{
    return term; // TODO
}

// Global string methods
tosca::StringTerm& newStringTerm(std::string&& str);
tosca::StringTerm& newStringTerm(const std::string& str);
tosca::CStringTermVar& varStringTerm(std::string&& name);

// Global double methods

// Construction

tosca::DoubleTerm& newDoubleTerm(double value);
tosca::CDoubleTermVar& varDoubleTerm(std::string&& name);

#include "mapterm.h"

// specialize std::hash and std::equal_to for string/double/variable
namespace std
{
    // String
    template<>
    struct hash<tosca::StringTerm*>
    {
    public:
        size_t operator()(const tosca::StringTerm*str) const
        {
            std::hash<std::string> str_hash;
            return str_hash(str->Unbox());
        }
    };
    
    template<>
    struct equal_to<tosca::StringTerm*>
    {
    public:
        bool operator()(const tosca::StringTerm* lhs, const tosca::StringTerm* rhs) const
        {
            return lhs->Unbox() == rhs->Unbox();
        }
    };
    
    // Variable
    template<>
    struct hash<std::reference_wrapper<tosca::Variable>>
    {
    public:
        size_t operator()(const tosca::Variable &var) const
        {
            std::hash<const tosca::Variable*> var_hash;
            return var_hash(&var);
        }
    };
    
    template<>
    struct equal_to<std::reference_wrapper<tosca::Variable>>
    {
    public:
        bool operator()(const tosca::Variable& lhs, const tosca::Variable& rhs) const
        {
            return (&lhs) == (&rhs);
        }
    };
 
    template<>
    struct hash<std::reference_wrapper<tosca::Term>>
    {
    public:
        size_t operator()(const tosca::Term& e) const
        {
            Optional<tosca::Variable> v = e.GetGVariable();
            if (v)
            {
                std::hash<tosca::Variable*> var_hash;
                return var_hash(&v.value());
            }
            throw runtime_error("Term hashing not supported yet.");
        }
    };
    
    template<>
    struct equal_to<std::reference_wrapper<tosca::Term>>
    {
    public:
        bool operator()(const tosca::Term& lhs, const tosca::Term& rhs) const
        {
            Optional<tosca::Variable> vlhs = lhs.GetGVariable();
            Optional<tosca::Variable> vrhs = rhs.GetGVariable();
            if (vlhs && vrhs)
            {
                return (&vlhs.value()) == (&vrhs.value());
            }
            throw runtime_error("Term equality not supported yet.");
        }
    };
    
}

#endif
