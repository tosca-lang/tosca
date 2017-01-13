// Copyright (c) 2016 IBM Corporation.

#ifndef _TERM_H
#define _TERM_H

#include <cassert>
#include <string>
#include <functional>
#include <unordered_map>
#include <unordered_set>
#include <set>
#include <climits>

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
    
    void* Allocate(std::size_t sz, Context& ctx);
    void Deallocate(void* ptr, std::size_t size);

    // Reference counting base facility.
    class Ref
    {
    public:
        /**
         * Number of references to this instance.
         */
        unsigned long refcount;

        Ref();
        Ref(bool immortal);
        virtual ~Ref();

//        void AddRef();
//        void Release();
        /** Add new ref */
        inline void AddRef()
        {
        	if (refcount != IMMORTAL)
        		refcount++;
        }

        /** Release ref */
        inline void Release()
        {
        	if (refcount != IMMORTAL)
        	{
        		refcount--;
        		if (refcount == 0)
        			delete this;
        	}
        }

        inline void Track()
        {
          track = true;
        }
        
        /* @return true if this is a immortal reference */
        inline bool IsImmortal()
        {
        	return refcount == IMMORTAL;
        }

        static void Track(long id);
        static void PrintAlive();
    protected:
        bool track;

        // Immortal ref.
        static const unsigned long IMMORTAL = ULONG_MAX - 1UL;
    };

    /** Options controlling term printing */
    class PrintOptions
    {
    public:
    	PrintOptions(bool _indent, bool _escape);

    	/* Current indentation level */
    	int count;

    	/* whether to indent term */
    	bool indent;

    	/* whether to escape string value */
    	bool escape;

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
         * Get the construction symbol or the empty string this is is not a construction.
         */
        virtual const std::string& Symbol() const;

        /**
         * @return A shallow copy of this term. Subs are not initialized.
         */
        virtual Term& Copy(Context& ctx);

        /** @return true when this term is data */
        virtual bool Data() const;

        /** @return this term arity */
        virtual unsigned Arity() const;

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
        bool operator==(const Term& rhs) const
        {
            std::unordered_map<Variable*, Variable*> varmap;
            return DeepEquals(rhs, varmap);
        }

        /**
         * Deep term non-equality operator, modulo variable and maps.
         */
        bool operator!=(const Term& rhs) const
        {
        	return !(*this == rhs);
        }

        /* @return The variable when this term is a variable use, otherwise nullopt */
        virtual Optional<Variable> GetGVariable() const;

        /* @return The variable when this term is a variable use, otherwise nullopt */
        Optional<Variable> GetGVariable();

        /* @return true if this term is a map */
        virtual bool IsMap() const;

        /* @return the list of keys contained in this map. Only applicable when IsMap returns true */
        virtual void MapKeys(std::set<Term*>& keys) const;

        /*
         * Get the value corresponding to the given keys. Only applicable when IsMap returns true
         * @param key. The reference is *NOT* consumed
         */
        virtual Optional<Term> MapGetValue(Context& ctx, Term& key);

        /*
         * Add key-value pair to map. Only applicable when IsMap returns true
         * @param key. Consumed.
         * @param value. Consumed.
         */
        virtual Term& MapPutValue(Context& ctx, Term& key, Term& value);

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
        static Term& Substitute2(tosca::Context& c, Term& term, std::unordered_map<Variable*, Term*>& substitutes); // Same but optimized

        /**
         * Deep term equality, modulo bound variables and map
         * Do not consume any references.
         */
        virtual bool DeepEquals(const Term& rhs, std::unordered_map<Variable*, Variable*>& varmap) const;

        /**
         * Compute term hash code
         */
        virtual size_t HashCode() const;

        /**
         * Compute term hash code, modulo bound variables and map
         */
        virtual size_t Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn) const;
        
        /**
         * Make free variable compatible with the ith subterm.
         *
         * @param i the sub index
         * @param name of the variable.
         * @return a new variable or a std::out_of_range exception
         */
        virtual Variable& MakeFree(Context& ctx, int i, const std::string& hint);
      
        /**
         * Make bound variable compatible with the jth binder on the ith subterm.
         *
         * @param i the sub index
         * @param j the sub binder index
         * @param name of the variable.
         * @return a new variable or a std::out_of_range exception
         */
        virtual Variable& MakeBound(Context& ctx, int i, int j, const std::string& hint);
        
        /**
         * Make term compatible with the ith subterm.
         *
         * @param i the sub index
         * @param symbol the term symbol
         * @return a new uninitialized constructor or a std::out_of_range exception
         */
        virtual Term& MakeSubTerm(Context& ctx, int i, const std::string& symbol);
        
        /*
         * Default fallback method for term not allowing making new variables
         */
        static Variable& MakeVariable(Context& ctx, const std::string& hint);
        
        /*
         * Default fallback method for term not allowing making new subterms
         */
        static Term& MakeTerm(Context& ctx, const std::string& symbol);
        
        /**
         * Print this term.
         */
        virtual void Print(IOWrapper& out, PrintOptions& options);
        
    protected:
        friend struct std::hash<std::reference_wrapper<tosca::Term>>;
        friend struct std::equal_to<std::reference_wrapper<tosca::Term>>;
        friend class Context;
        friend void Deallocate(void* ptr);

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
        Variable(std::string name);

        bool operator==(const Variable& other) const
        {
            return &other == this;
        }

        bool operator!=(const Variable& other) const
        {
            return !(*this == other);
        }

        /* @return the name of this variable */
        const std::string& Symbol() const;

        /**
         * Make a new variable of the same type as this one.
         */
        virtual Variable& Copy(Context& ctx) const;

        /* @Brief Create an new use of this variable */
        virtual Term& GUse(Context& ctx);

        // Custom allocation

        static void* operator new(std::size_t sz, Context& ctx)
        {
        	return Allocate(sz, ctx);
        }

        static void operator delete(void* ptr)
        {
        	Deallocate(ptr, sizeof(Variable));
        }

    protected:
        /* Globally unique variable name. Allowed to be changed. */
        std::string name;

        /* Count the number of variable use (in the term tree) */
        unsigned long uses;

        friend class VariableUse;
    };


    /* Generic Variable use interface */
    class VariableUse: public virtual Term
    {
    public:
        VariableUse(Variable& v);
        ~VariableUse();
        //-- Overrides

        Optional<Variable> GetGVariable() const;
        bool DeepEquals(const Term& rhs, std::unordered_map<Variable*, Variable*>& varmap) const;
        virtual size_t Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn) const;

        inline size_t HashCode() const
        {
            return Term::HashCode();
        };

    protected:
        // the used variable
        Variable& var;

    };

    // ----- String Term
    
    class _CStringTermVar;
    class _CStringTermVarUse;

    // Base type
    class StringTerm: public Term
    {
    public:
        StringTerm();
        virtual ~StringTerm();

        /** Peek at native string value */
        virtual const std::string& Unbox() const;

        /* @return this as a Variable or nullopt */
        virtual Optional<_CStringTermVar> GetVariable() const;

        /* Make Variable of type String */
        static Variable& MakeVariable(Context& ctx, const std::string& hint);
      
        /* Make a new value string  */
        static Term& MakeTerm(Context& ctx, const std::string& symbol);
        
        // Overrides
        size_t Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn) const;
        const std::string& Symbol() const;
        void Print(IOWrapper& out, PrintOptions& options);

    };

    /**
     * String term value
     */
    class _CStringTerm: public StringTerm
    {
    public:
        _CStringTerm(const std::string&& value);
        _CStringTerm(const std::string&& value, bool immortal);
        _CStringTerm(const std::string& value);
        ~_CStringTerm();

        // -- Custom allocation

        static void* operator new(std::size_t sz, Context& ctx)
        {
        	return Allocate(sz, ctx);
        }

        static void operator delete(void* ptr)
        {
        	Deallocate(ptr, sizeof(_CStringTerm));
        }

        // -- Overrides

        size_t HashCode() const;
        Term& Copy(Context& ctx);
        const std::string& Unbox() const;
        
    protected:
        /** The string value. */
        const std::string value;

        /** cached hash value */
        size_t hash;
    };

    class _CStringTermVar: public Variable
    {
    public:
        _CStringTermVar(std::string name);

        // --- Overrides
        StringTerm& Use(Context& ctx);
        Term& GUse(Context& ctx);
    };

    /**
     * Variable use of type String
     */
    class _CStringTermVarUse: public StringTerm, public VariableUse
    {
    public:
        _CStringTermVarUse(_CStringTermVar& v);

        // -- Custom allocation

		static void* operator new(std::size_t sz, Context& ctx)
		{
			return Allocate(sz, ctx);
		}

		static void operator delete(void* ptr)
		{
			Deallocate(ptr, sizeof(_CStringTermVarUse));
		}

        // -- Overrides
        const std::string& Unbox() const;
        Optional<_CStringTermVar> GetVariable() const;
        Optional<Variable> GetGVariable() const;

    };


    // --- Numeric type (double)
    
    class _CDoubleTermVar;
    class _CDoubleTermVarUse;

    class DoubleTerm: public Term
    {
    public:
        virtual ~DoubleTerm();

        /** Peek at native double value */
        virtual double Unbox() const
        {
            throw std::runtime_error("Fatal error: cannot access unevaluated numeric value.");
        }
        
        /* @return this as a Variable or nullopt */
        virtual Optional<_CDoubleTermVar> GetVariable() const;

        /* Make Variable of type Double */
        static Variable& MakeVariable(Context& ctx, const std::string& hint);
        
        /* Make a new value of type double  */
        static Term& MakeTerm(Context& ctx, const std::string& symbol);
        
        // Overrides
        size_t Hash(size_t code, std::unordered_set<tosca::Variable*>& deBruijn) const;
        void Print(IOWrapper& out, PrintOptions& options);
    };
   
    /**
     * Double term value
     */
    class _CDoubleTerm: public DoubleTerm
    {
    public:
        _CDoubleTerm(double value);
        // -- Custom allocation

		static void* operator new(std::size_t sz, Context& ctx)
		{
			return Allocate(sz, ctx);
		}

		static void operator delete(void* ptr)
		{
			Deallocate(ptr, sizeof(_CDoubleTerm));
		}

		// -- Overrides

        Term& Copy(Context& ctx);
        double Unbox() const;
        const std::string& Symbol() const;
        bool DeepEquals(const Term& rhs, std::unordered_map<Variable*, Variable*>& varmap) const;

    protected:
        /** The double value. */
        double value;
        
        /** The original double value as string. */
        const std::string str;

    };

    class _CDoubleTermVar: public Variable
    {
    public:
        _CDoubleTermVar(std::string name);
        virtual DoubleTerm& Use(Context& ctx);
        virtual Term& GUse(Context& ctx);
    };

    /*
     * Variable Use of type Numeric
     */
    class _CDoubleTermVarUse: public DoubleTerm, public VariableUse
    {
    public:
        _CDoubleTermVarUse(_CDoubleTermVar& v);

        // -- Custom allocation

		static void* operator new(std::size_t sz, Context& ctx)
		{
			return Allocate(sz, ctx);
		}

		static void operator delete(void* ptr)
		{
			Deallocate(ptr, sizeof(_CDoubleTermVarUse));
		}

        // Overrides
        Optional<_CDoubleTermVar> GetVariable() const;
		Optional<Variable> GetGVariable() const;
    };


}

// -- Substitution

const bool TOSCAFASTSUBST = getenv("toscanofastsubst") == 0;

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

    tosca::Term& result = (TOSCAFASTSUBST) ?  tosca::Term::Substitute2(c, term, map) : term.Substitute(c, map);

    subst = substitutes.begin();
    for (; subst != substitutes.end(); subst++)
    {
        (*subst)->Release();
    }
    return static_cast<T&>(result);
}



// Global string methods
tosca::StringTerm& newStringTerm(tosca::Context& ctx, std::string&& str);
tosca::StringTerm& newStringTerm(tosca::Context& ctx, const std::string& str);
tosca::_CStringTermVar& varStringTerm(tosca::Context& ctx, const std::string& hint);

// Global double methods

// Construction

tosca::DoubleTerm& newDoubleTerm(tosca::Context& ctx, double value);
tosca::_CDoubleTermVar& varDoubleTerm(tosca::Context& ctx, const std::string& hint);

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
            return str->HashCode();
        }
    };

    template<>
    struct equal_to<tosca::StringTerm*>
    {
    public:
        bool operator()(const tosca::StringTerm* lhs, const tosca::StringTerm* rhs) const
        {
            return lhs == rhs || lhs->Unbox() == rhs->Unbox();
        }
    };

    // const String
    template<>
    struct hash<const tosca::StringTerm*>
    {
    public:
        size_t operator()(const tosca::StringTerm* str) const
        {
        	return str->HashCode();
        }
    };

    template<>
    struct equal_to<const tosca::StringTerm*>
    {
    public:
        bool operator()(const tosca::StringTerm* lhs, const tosca::StringTerm* rhs) const
        {
            return lhs == rhs || lhs->Unbox() == rhs->Unbox();
        }
    };
    
    // double
    template<>
    struct hash<tosca::DoubleTerm*>
    {
    public:
        size_t operator()(const tosca::DoubleTerm* d) const
        {
            return std::hash<double>{}(d->Unbox());
        }
    };

    template<>
    struct equal_to<tosca::DoubleTerm*>
    {
    public:
        bool operator()(const tosca::DoubleTerm* lhs, const tosca::DoubleTerm* rhs) const
        {
            return lhs == rhs || lhs->Unbox() == rhs->Unbox();
        }
    };

    // const Double
    template<>
    struct hash<const tosca::DoubleTerm*>
    {
    public:
        size_t operator()(const tosca::DoubleTerm* d) const
        {
            return std::hash<double>{}(d->Unbox());
        }
    };

    template<>
    struct equal_to<const tosca::DoubleTerm*>
    {
    public:
        bool operator()(const tosca::DoubleTerm* lhs, const tosca::DoubleTerm* rhs) const
        {
            return lhs == rhs || lhs->Unbox() == rhs->Unbox();
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
