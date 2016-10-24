// Copyright (c) 2016 IBM Corporation.

#ifndef BUFFER_H_
#define BUFFER_H_

#include <vector>

#include "sink.h"

namespace tosca {
    
// Forward declarations
template<typename K, typename V> class MapTerm;
template<typename K, typename V> MapTerm<K, V>& newMapTerm();
/*
 * Consume simple term events to construct in-memory term representation
 */
class BufferSink: public Sink
{
public:
    BufferSink(Context& context);
    
    /* @return the constructed term */
    Term& GetTerm();
    
    // --- Overrides
    
    Sink& Start(const StringTerm& symbol);
    Sink& Start(Term& term);
    Sink& End();
    Sink& Bind(Variable& binder);
    Sink& Use(Variable& variable);
    Sink& Literal(const std::string& literal);
    Sink& Copy(Term& term);
    
    template <typename K, typename V> Sink& StartMap()
    {
        AddSub(newMapTerm<K, V>());
        return *this;
    }
   
    Sink& EndMap();
    
    Variable& MakeFree(std::string& name);
    Variable& MakeBound(std::string& name);
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
