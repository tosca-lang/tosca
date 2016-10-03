// Copyright (c) 2016 IBM Corporation.

#include <ostream>
#include "termprinter.h"
#include "ts.h"

// Simple term printer


namespace tosca {
    
    static void indent(int count, std::ostream& out)
    {
        while (count-- > 0)
            out << ' ';
    }
    
    static void Print(Term& term, std::ostream& out, int count)
    {
        out << '\n';
        indent(count, out);
        out << term.Symbol();
        
        // Print subs
        int i = 0;
        Optional<Term> osub = term.Sub(i);
        if (osub)
        {
            out << "(";
            while (osub)
            {
                if (i > 0)
                  out << ",";
                
                int j = 0;
                Optional<Variable> obinder = term.Binder(i, j);
                while (obinder)
                {
                    out << (j == 0 ? '[' : ' ');
                    out << obinder.value().Symbol();
                    obinder = term.Binder(i, ++j);
                    
                }
                if (term.Binder(i, 0))
                    out << "]->";
                
                Print(osub.value(), out, count + 2);
                osub = term.Sub(++i);
            }
            out << ")";
        }
        
        term.Release();
    }
    
    static void Print(Term& term, std::ostream& out)
    {
        Print(term, out, 0);
    }
    
    
    void Print(Term& term)
    {
        Print(term, std::cout);
    }
    
}
