// Copyright (c) 2016 IBM Corporation.

#include "buffer.h"
#include "ts.h"
#include "term.h"

namespace tosca {
    
    BufferSink::BufferSink(Context& ctx): Sink(ctx), term(0)
    {
    };
    
    Term& BufferSink::GetTerm()
    {
        return *term;
    }
    
    void BufferSink::AddSub(Term& sub)
    {
        if (subIndex.empty())
        {
            // Top-level
            term = &sub;
        }
        else
        {
            Term& t = *(terms.back());
            int subindex = subIndex.back();
            subIndex.pop_back();
            
            t.SetSub(subindex, sub);
            
            subIndex.push_back(subindex + 1); // ready to receive the next sub
            
            binderIndex.pop_back();
            binderIndex.push_back(0); // reset sub binder position.
        }
    }
    Sink& BufferSink::Start(const StringTerm& symbol)
    {
        return Start(GetContext().MakeConstructor(symbol));
    }
    
    Sink& BufferSink::Start(Term& term)
    {
        AddSub(term);
        
        terms.push_back(&term);
        subIndex.push_back(0);
        binderIndex.push_back(0);
        
        return *this;
    }
    
    Sink& BufferSink::End()
    {
        Term& c = *(terms.back());
        
        terms.pop_back();
        subIndex.pop_back();
        binderIndex.pop_back();
        
       // if (terms.empty())
       //    term = &c;

        return *this;
    }
    
    Sink& BufferSink::Bind(Variable& binder)
    {
        Term& term = *terms.back();
        int bindex = binderIndex.back();
        term.SetBinder(subIndex.back(), bindex, binder);
        
        binderIndex.pop_back();
        binderIndex.push_back(bindex + 1);
        return *this;
    }
    
    Sink& BufferSink::Use(Variable& variable)
    {
        Term& use = variable.GUse();
        AddSub(use);
        return *this;
    }
    
    Sink& BufferSink::Literal(const std::string& literal)
    {
        AddSub(newStringTerm(literal));
        return *this;
    }
    
   
    
    Sink& BufferSink::EndMap()
    {
        return *this;
    }
    
    
    Sink& BufferSink::Copy(Term& term)
    {
        AddSub(term);
        return *this;
    }

} // namespace tosca