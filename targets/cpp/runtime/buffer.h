// Copyright (c) 2016 IBM Corporation.

#ifndef BUFFER_H_
#define BUFFER_H_

#include <vector>

#include "sink.h"
#include "term.h"

namespace tosca {

/*
 * Consume simple term events to construct in-memory term representation
 */
class BufferSink: public Sink
{
public:
    BufferSink(Context& context);
    
    /* @return the constructed term */
    Term& GetTerm();

    /* Start a typed map.
       Only needed for top-level map. For submap, use StartMap which relied on Term.MakeSubTerm
     */
    template <typename K, typename V>
    Sink& StartMapT(Context& ctx)
    {
        return Start(tosca::newMapTerm<K, V>(ctx));
    }

    // --- Overrides

    Sink& Start(const StringTerm& symbol);
    Sink& Start(Term& term);
    Sink& End();
    Sink& Bind(Variable& binder);
    Sink& Use(Variable& variable);
    Sink& Literal(const std::string& literal);
    Sink& Double(double literal);
    Sink& Copy(Term& term);
    Sink& StartMap();
    Sink& MapEntry(Term& key, Term& value);
    Sink& EndMap();
    
    Variable& MakeFree(tosca::string& name);
    Variable& MakeBound(tosca::string& name);
    Term& MakeTerm(std::string& symbol);
protected:
    /** Constructed term */
    Term* term;
    
    /** Term stack */
    std::vector<Term*> terms;
    
    /** Sub current position stack */
    std::vector<int> subIndex;
    
    /** binders current position stack */
    std::vector<int> binderIndex;
    
    /** Add sub to current construction */
    void AddSub(Term& sub);

};

} // namespace tosca


#endif 
