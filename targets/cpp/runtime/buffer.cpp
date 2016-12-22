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
        Term& use = variable.GUse(GetContext());
        AddSub(use);
        return *this;
    }
    
    Sink& BufferSink::Literal(const std::string& literal)
    {
        AddSub(newStringTerm(GetContext(), literal));
        return *this;
    }

    Sink& BufferSink::Double(double literal)
    {
        AddSub(newDoubleTerm(GetContext(), literal));
        return *this;
    }
    Sink& BufferSink::StartMap()
    {
        std::string symbol("dummy");
        Start(MakeTerm(symbol));

        return *this;
    }

    Sink& BufferSink::MapEntry(Term& key, Term& value)
    {
        Term& t = *(terms.back());
        Term& newmap = t.MapPutValue(GetContext(), key, value);
        if (&newmap != &t)
        {
        	terms.pop_back();
        	if (terms.empty())
        		term = &newmap;
        	else
        	{
        		subIndex.pop_back();
        		int subindex = subIndex.back();
        		Term& parent = *(terms.back());
        		parent.SetSub(subindex - 1, newmap);
        		subIndex.push_back(0);
        	}

        	terms.push_back(&newmap);
        }
        return *this;
    }

    Sink& BufferSink::EndMap()
    {
        return End();
    }

    Sink& BufferSink::Copy(Term& term)
    {
        AddSub(term);
        return *this;
    }
    
    Variable& BufferSink::MakeFree(std::string& name)
    {
        if (terms.empty())
            throw std::runtime_error("Invalid top-level call to MakeFree.");
        Term& t = *(terms.back());
        int subindex = subIndex.back();
        return t.MakeFree(GetContext(), subindex, name);
    }
    
    Variable& BufferSink::MakeBound(std::string& name)
    {
        if (terms.empty())
            throw std::runtime_error("Invalid top-level call to MakeBound.");
        Term& t = *(terms.back());
        int bindex = binderIndex.back();
        int subindex = subIndex.back();
        return t.MakeBound(GetContext(), subindex, bindex, name);
    }

    Term& BufferSink::MakeTerm(std::string& symbol)
    {
        if (terms.empty())
        {
            _CStringTerm st(symbol);
            return GetContext().MakeConstructor(st);
        }
        Term& t = *(terms.back());
        int subindex = subIndex.back();
        return t.MakeSubTerm(GetContext(), subindex, symbol);
    }
    
} // namespace tosca
