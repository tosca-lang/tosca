// Copyright (c) 2016 IBM Corporation.

#include "buffer.h"


BufferSink::BufferSink(Context& ctx):Sink(ctx) {};

Sink& BufferSink::Start(const std::string& symbol)
{
    return *this;
}

Sink& BufferSink::End(){return *this;}
Sink& BufferSink::Bind(const Variable& binder){return *this;}
Sink& BufferSink::Use(const Variable& variable){return *this;}
Sink& BufferSink::Literal(const StringTerm& literal){return *this;}
Sink& BufferSink::Literal(const DoubleTerm& literal){return *this;}
Sink& BufferSink::Copy(const Term& term){return *this;}
