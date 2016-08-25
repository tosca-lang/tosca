// Copyright (c) 2016 IBM Corporation.

#ifndef BUFFER_H_
#define BUFFER_H_

#include <vector>

#include "sink.h"

namespace tosca {

/*
 * Consume simple term events to construct in-memory term representation
 */
class BufferSink: public Sink
{
public:
    BufferSink(Context& context);
    
    Sink& Start(const std::string& symbol);
    Sink& End();
    Sink& Bind(const Variable& binder);
    Sink& Use(Variable& variable);
    Sink& Literal(const std::string& literal);
    Sink& Copy(Term& term);
    
    /* @return the constructed term */
    Term& GetTerm();
    
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
