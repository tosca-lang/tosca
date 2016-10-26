// Copyright (c) 2016 IBM Corporation.

#ifndef _TERM_H
#define _TERM_H

#include <cassert>
#include <string>
#include <functional>
#include <unordered_map>
#include <unordered_set>

#include "compat.h"


namespace tosca {

    // Forward declarations

    class Context;
    class Ref;
    typedef Ref& (*Function)();
    class VariableUse;
    class Variable;
    class Term;
    class Maker;
    class IOWrapper;
    
    // Reference counting base facility.
    class Ref
    {
    public:
        /**
         * Number of references to this instance.
         */
        unsigned long refcount;

        Ref();
        virtual ~Ref();

        /** Add new ref */
        void AddRef();

        /** Release ref */
        void Release();

        inline void Track()
        {
          track = true;
        }
        
        static void Track(int id);
        
    protected:
        bool track;
    };

    /*
     * Base class for terms
     */
    class Term: public virtual Ref
    {
    public:
        Term();
        Term(Term& other) {};
        virtual ~Term();

        /**
         * Get this term symbol.
         * TODO: document what's a symbol
         */
        virtual const std::string Symbol() const;

        /**
         * @return A shallow copy of this term. Subs are not initialized.
         */
        virtual Term& Copy(Context& ctx);

        /** @return true when this term is data */
        virtual bool Data() const;

        /**
         * Peek at the ith subterm.
         *
         * @param i the sub index
         * @return a subterm or null if none at the given index. Does not create a new reference.
         */
        virtual Optional<Term> Sub(int i) const;
  
        /**
         * Replace the ith sub term
         *
         * @param i the sub index. Must be >=0 and < number of subs
         * @param term the term. The reference is transferred.
         */
        virtual void SetSub(int i, Term& sub);

        /**
         * Get binders of the ith subterm.
         *
         * @param index
         * @return a binder, or null.
         */
        virtual Optional<Variable> Binder(int i, int j) const;

        /**
         * Set jth binder of the ith subterm.
         *
         * @param i subterm index. Must be >=0 and < number of subs
         * @param j subbinder index.  Must be >=0 and < number of binders for the given sub
         */
        virtual void SetBinder(int i, int j, Variable& var);

        /**
         * Deep term equality operator, modulo variable and maps.
         */
        inline bool operator==(const Term& rhs) const
        {
            std::unordered_map<Variable*, Variable*> varmap;
            return DeepEquals(rhs, varmap);
        }

        /**
         * Deep term non-equality operator, modulo variable and maps.
         */
        inline bool operator!=(const Term& rhs) const
        {
            std::unordered_map<Variable*, Variable*> varmap;
            return !DeepEquals(rhs, varmap);
        }

        /* @return The variable when this term is a variable use, otherwise nullopt */
        virtual Optional<Variable> GetGVariable() const;

        /* @return The variable when this term is a variable use, otherwise nullopt */
        Optional<Variable> GetGVariable();

        /**
         * Apply substitution on this term
         *
         * <p>
         * Either update this term or copy it, depending if it is shared or not.
         *
         * <p>
         * When this method is called, it owns a reference to itself.
         *
         * @param c.
         * @param substitutes
         * @return
         */
        virtual Term& Substitute(tosca::Context& c, std::unordered_map<Variable*, Term*>& substitutes);

        /**
         * Deep term equality, modulo bound variables and map
         */
        virtual bool DeepEquals(const Term& rhs, std::unordered_map<Variable*, Variable*>& varmap) const;

        /**
         * Compute term hash code
         */
        virtual size_t HashCode();

        /**
         * Compute term hash code, modulo bound variables and map
         */
        virtual size_t Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn);
        
        /**
         * Make free variable compatible with the ith subterm.
         *
         * @param i the sub index
         * @param name of the variable.
         * @return a new variable or a std::out_of_range exception
         */
        virtual Variable& MakeFree(Context& ctx, int i, std::string& name);
      
        /**
         * Make bound variable compatible with the jth binder on the ith subterm.
         *
         * @param i the sub index
         * @param j the sub binder index
         * @param name of the variable.
         * @return a new variable or a std::out_of_range exception
         */
        virtual Variable& MakeBound(Context& ctx, int i, int j, std::string& name);
        
        /**
         * Make term compatible with the ith subterm.
         *
         * @param i the sub index
         * @param symbol the term symbol
         * @return a new uninitialized constructor or a std::out_of_range exception
         */
        virtual Term& MakeSubTerm(Context& ctx, int i, std::string& symbol);
        
        /*
         * Default fallback method for term not allowing making new variables
         */
        static Variable& MakeVariable(Context& ctx, std::string& name);
        
        /*
         * Default fallback method for term not allowing making new subterms
         */
        static Term& MakeTerm(Context& ctx, std::string& symbol);
        
        /**
         * Print this term.
         */
        virtual void Print(IOWrapper& out, int count, bool indent);
        
    protected:

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

        _LazyTerm(T value): function(0)
        {
            value = make_optional(value);
        }
    };


    /* Base class for typed variables */
    class Variable: public Ref
    {

    public:
        Variable(std::string& name);

        bool operator==(const Variable& other) const
        {
            return &other == this;
        }

        bool operator!=(const Variable& other) const
        {
            return !(*this == other);
        }

        /* @return the name of this variable */
        const std::string Symbol() const;

        /**
         * Make a new variable of the same type as this one.
         */
        virtual Variable& Copy(Context& ctx) const;

        /* @Brief Create an new use of this variable */
        virtual Term& GUse();

    protected:
        /* Globally unique variable name */
        std::string& name;

        /* Count the number of variable use (in the term tree) */
        unsigned long uses;

       // friend class BufferSink;
       // friend Term& Term::Substitute(tosca::Context& c, std::unordered_map<Variable*, Term*>& substitutes);
    };


    /* Generic Variable use interface */
    class VariableUse: public virtual Term
    {
    public:
        VariableUse(Variable& v) : var(v) {}

        //-- Overrides

        Optional<Variable> GetGVariable() const;
        bool DeepEquals(const Term& rhs, std::unordered_map<Variable*, Variable*>& varmap) const;
        virtual size_t Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn);

        inline size_t HashCode()
        {
            return Term::HashCode();
        };

    protected:
        // the used variable
        Variable& var;

    };

    // ----- String Term

    // Base type
    class StringTerm: public Term
    {
    public:
        StringTerm();
        virtual ~StringTerm();

        /** Peek at native string value */
        virtual const std::string& Unbox() const;

        inline bool operator==(const StringTerm& rhs)
        {
            return Unbox() == rhs.Unbox();
        }

        inline bool operator!=(const StringTerm& rhs)
        {
            return !(*this == rhs);
        }

        /* Make Variable of type String */
        static Variable& MakeVariable(Context& ctx, std::string& hint);
      
        /* Make a new value string  */
        static Term& MakeTerm(Context& ctx, std::string& symbol);
        
        // Overrides
        size_t Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn);
        const std::string Symbol() const;
        void Print(IOWrapper& out, int count, bool indent);

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

        // -- Overrides

        Term& Copy(Context& ctx);
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

        // Overrides
        const std::string& Unbox() const;
    };

    class CStringTermVar: public Variable
    {
    public:
        CStringTermVar(std::string& name);

        // --- Overrides
        StringTerm& Use();
        Term& GUse();
    };


    // --- Numeric type (double)

    class DoubleTerm: public Term
    {
    public:
        virtual ~DoubleTerm();

        /** Peek at native double value */
        virtual double Unbox() const
        {
            throw std::runtime_error("Fatal error: cannot access unevaluated numeric value.");
        }

        /* Make Variable of type Double */
        static Variable& MakeVariable(Context& ctx, std::string& hint);
        
        /* Make a new value of type double  */
        static Term& MakeTerm(Context& ctx, std::string& symbol);

        // Overrides

        inline bool operator==(const DoubleTerm& rhs)
        {
            return Unbox() == rhs.Unbox();
        }

        inline bool operator!=(const DoubleTerm& rhs)
        {
            return !(*this == rhs);
        }
        
        // Overrides
        size_t Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn);
        void Print(IOWrapper& out, int count, bool indent);

    };

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

        // -- Overrides

        Term& Copy(Context& ctx);
        double Unbox() const;
        const std::string Symbol() const;

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
        CDoubleTermVar(std::string& name);
        virtual DoubleTerm& Use();
        virtual Term& GUse();
    };

}

// -- Substitution

template<typename T>
T& Subst(tosca::Context& c, T& term, std::initializer_list<tosca::Variable*> binders, std::initializer_list<tosca::Term*> substitutes)
{
    std::unordered_map<tosca::Variable*, tosca::Term*> map;
    auto var = binders.begin();
    auto subst = substitutes.begin();
    for (; var != binders.end() && subst != substitutes.end(); var++, subst++)
    {
        tosca::Variable* v = *var;
        tosca::Term* s = *subst;
        map[v] = s;
    }
    if (var != binders.end() || subst != substitutes.end())
        throw new std::runtime_error("Internal error: mismatch number of binders and substitutes");

    tosca::Term& result = term.Substitute(c, map);

    subst = substitutes.begin();
    for (; subst != substitutes.end(); subst++)
    {
        (*subst)->Release();
    }
    return static_cast<T&>(result);
}



// Global string methods
tosca::StringTerm& newStringTerm(std::string&& str);
tosca::StringTerm& newStringTerm(const std::string& str);
tosca::CStringTermVar& varStringTerm(tosca::Context& ctx, const std::string& hint);

// Global double methods

// Construction

tosca::DoubleTerm& newDoubleTerm(double value);
tosca::CDoubleTermVar& varDoubleTerm(tosca::Context& ctx, const std::string& hint);

#include "mapterm.h"

// Dummy appendable type. Not supported for C++ backend
class Appendable {};


// specialize std::hash and std::equal_to for string/double
namespace std
{
    // String
    template<>
    struct hash<tosca::StringTerm*>
    {
    public:
        size_t operator()(const tosca::StringTerm* str) const
        {
            return std::hash<std::string>{}(str->Unbox());
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

    // String
    template<>
    struct hash<const tosca::StringTerm*>
    {
    public:
        size_t operator()(const tosca::StringTerm* str) const
        {
            return std::hash<std::string>{}(str->Unbox());
        }
    };

    template<>
    struct equal_to<const tosca::StringTerm*>
    {
    public:
        bool operator()(const tosca::StringTerm* lhs, const tosca::StringTerm* rhs) const
        {
            return lhs->Unbox() == rhs->Unbox();
        }
    };
    
}

// Macro specializing both std::hash and std::equal_to for term.
// I would like to use this:
// struct hash<typename std::enable_if<std::is_base_of<tosca::Term, T>::value, T>::type*>
// but does not work because of T used in a non-deduced context (on the left of ::)
// Meanwhile use a macro.

#define STD_HASH_EQUAL_TO_TERM(T)                                                                 \
    namespace std {                                                                               \
        template<>                                                                                \
        struct hash<T*>                                                                           \
        {                                                                                         \
        public:                                                                                   \
            size_t operator()(T* t) const                                                         \
            {                                                                                     \
                Optional<tosca::Variable> v = t->GetGVariable();                                  \
                if (v)                                                                            \
                    return std::hash<void*>{}(&v.value());                                        \
                return t->HashCode();                                                             \
            }                                                                                     \
        };                                                                                        \
                                                                                                  \
        template<>                                                                                \
        struct equal_to<T*>                                                                       \
        {                                                                                         \
        public:                                                                                   \
            bool operator()(T* lhs, T* rhs) const                                                 \
            {                                                                                     \
                Optional<tosca::Variable> vlhs = lhs->GetGVariable();                             \
                Optional<tosca::Variable> vrhs = rhs->GetGVariable();                             \
                if (vlhs && vrhs)                                                                 \
                    return &vlhs.value() == &vrhs.value();                                        \
                return lhs == rhs;                                                                \
            }                                                                                     \
        };                                                                                        \
    }

#endif
