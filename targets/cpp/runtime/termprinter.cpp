// Copyright (c) 2016 IBM Corporation.

#include <ostream>
#include <sstream>
#include "termprinter.h"
#include "ts.h"

// Simple term printer


namespace tosca {

    static void Indent(int count, std::ostream& out, bool indent)
    {
        if (indent)
        {
            while (count-- > 0)
                out << ' ';
        }
    }

    static void Print(Term& term, std::ostream& out, int count, bool indent)
    {
        out << '\n';
        Indent(count, out, indent);
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

                Print(osub.value(), out, count + 2, indent);
                osub = term.Sub(++i);
            }
            out << ")";
        }
    }

    static void Print(Term& term, std::ostream& out, bool indent)
    {
        Print(term, out, 0, indent);
    }


    void Print(Term& term, bool indent)
    {
        Print(term, std::cout, indent);
        term.Release();
    }

    std::string PrintToString(Term& term, bool indent)
    {
        std::stringstream stream;
        Print(term, stream, indent);
        term.Release();
        return stream.str();
    }

}
