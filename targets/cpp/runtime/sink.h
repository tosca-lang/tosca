// Copyright (c) 2016 IBM Corporation.
#ifndef SINK_H_
#define SINK_H_

#include <string>

namespace tosca {
    class Variable;
    class Context;
    class Term;
    class StringTerm;
    class DoubleTerm;


/**
 * Consumes simple term events.
 *
 * <p>The simple term abstract syntax is defined by this grammar:
 * <pre>
 * term
 *   : {@link #start} CONSTRUCTOR bterm* {@link #end}
 *   | {@link #use} VARIABLE
 *   | {@link #literal(String)} STRING
 *   | {@link #literal(Double)} DOUBLE
 *   ;
 *
 * bterms
 * 	 : term
 *   | {@link #bind} VARIABLE bterms
 *   ;
 * </pre>
 */
class Sink
{
public:
    Sink(Context& ctx) : context(ctx) {}
    
    /**
     * Start of construction.
     *
     * The following events are the construction arguments, either terms or bound terms.
     *
     * @param symbol external construction symbol
     * @return this sink
     */
    virtual Sink& Start(const StringTerm& symbol) = 0;
    
    /**
     * Start of construction.
     *
     * The following events are the construction arguments, either terms or bound terms.
     *
     * @param term uninitialized term.
     * @return this sink
     */
    virtual Sink& Start(Term& term) = 0;
        
    /**
     * End of construction.
     *
     * @return this sink
     */
    virtual Sink& End() = 0;
    
    /**
     * Receives the declaration of a bound variable.
     *
     * @param binder to be bound here. The variable reference is used by this method.
     * @return this sink.
     */
    virtual Sink& Bind(Variable& binder) = 0;
    
    /**
     * Insert variable occurrence subterm.
     *
     * @param variable to reference. The variable reference is used by this method.
     * @return this sink
     */
    virtual Sink& Use(Variable& variable) = 0;
   
    /**
     * Insert string literal subterm.
     *
     * @param literal to add. 
     * @return this sink
     */
    virtual Sink& Literal(const std::string& literal) = 0;
    
    /**
     * End of map.
     *
     * @return this sink
     */
    virtual Sink& EndMap() = 0;
    
    /**
     * Copy given term. Reference is consumed.
     * @param term
     */
    virtual Sink& Copy(Term& term) = 0;
    
    /**
     * @return the context
     */
    inline Context& GetContext() { return context; };
    
    /*
     * Make new free variable compatible with the pending subterm
     * Throw runtime_exception when there is no pending subterm.
     * @param name 
     */
    virtual Variable& MakeFree(std::string& name) = 0;
    
    /*
     * Make new bound variable compatible with the pending subbinder
     * Throw runtime_exception when there is no pending subterm.
     */
    virtual Variable& MakeBound(std::string& name) = 0;
    
    /*
     * Make new term compatible with the pending subterm.
     * For top level constructor, return a term instance registered for the given symbol.
     * Throw runtime_exception of the symbol is not registered (for instance if the symbol 
     * would have correspond to a polypmorphic term).
     */
    virtual Term& MakeTerm(std::string& symbol) = 0;
    
private:
    // The context
    Context& context;
};
    
} // namespace tosca

#endif
