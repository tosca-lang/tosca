// Copyright (c) 2016 IBM Corporation.

#ifndef LANGUAGE_EXTERN_H
#define LANGUAGE_EXTERN_H

#include <stdexcept>
#include <fstream>
#include "ts.h"
#include "termprinter.h"
#include "termreader.h"
#include "term.h"

template <typename a>
tosca::StringTerm& PrintTerm(tosca::Context& ctx, tosca::StringTerm& category, a& term)
{
    tosca::Term& t = dynamic_cast<tosca::Term&>(term);
    return newStringTerm(tosca::PrintToString(t, true));
}

template <typename a>
a& ParseResource(tosca::Context& ctx, tosca::StringTerm& category, tosca::StringTerm& filename)
{
    // TODO: user-defined category
    std::fstream input(filename.Unbox(), std::ios_base::in);
    
    tosca::TermParser parser(&input);
    tosca::Term& term = parser.ParseTerm(ctx);
    return dynamic_cast<a&>(term);
}

template <typename a, typename b>
b& Save(tosca::Context& ctx, tosca::StringTerm& category, tosca::StringTerm& filename, a& term,
                tosca::MapTerm<tosca::StringTerm, tosca::StringTerm>& props, b& result)
{
    // TODO: user-defined category.
    //const std::string& ucat = category.Unbox();
    
    
    //if (ucat == "" || ucat == "term")
    {
        std::fstream output(filename.Unbox(), std::ios_base::out);
        tosca::Print(static_cast<tosca::Term&>(term), output, false);
    }
    
    return result;
}

template <typename a>
a& ParseText(tosca::Context& ctx, tosca::StringTerm& category, tosca::StringTerm& content)
{
    throw new std::runtime_error("");
}

#endif
