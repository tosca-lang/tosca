// Copyright (c) 2016 IBM Corporation.

#ifndef BUFFER_H_
#define BUFFER_H_

#include "sink.h"

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
    Sink& Use(const Variable& variable);
    Sink& Literal(const StringTerm& literal);
    Sink& Literal(const DoubleTerm& literal);
    Sink& Copy(const Term& term);
};

#endif 
