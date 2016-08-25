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
     * @param descriptor of the construction
     * @return this sink
     */
    virtual Sink& Start(const std::string& symbol) = 0;
    
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
    virtual Sink& Bind(const Variable& binder) = 0;
    
    /**
     * Insert variable occurrence subterm.
     *
     * @param variable to reference. The variable reference is used by this method.
     * @return this sink
     */
    virtual Sink& Use(const Variable& variable) = 0;
    
    /**
     * Insert string literal subterm.
     *
     * @param literal to add
     * @return this sink
     */
    virtual Sink& Literal(const StringTerm& literal) = 0;
    
    /**
     * Insert double literal subterm.
     *
     * @return this sink
     */
    virtual Sink& Literal(const DoubleTerm& literal) = 0;
    
    /**
     * Copy given term. Reference is consumed.
     * @param term
     */
    virtual Sink& Copy(const Term& term) = 0;
    
    /**
     * @return the context
     */
    inline Context& GetContext() { return context; };
    
private:
    // The context
    Context& context;
};
    
} // namespace tosca

#endif
