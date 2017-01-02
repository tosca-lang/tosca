// Copyright (c) 2016 IBM Corporation.

#include <ostream>
#include <sstream>
#include <fstream>
#include "termprinter.h"
#include "ts.h"
#include "iowrapper.h"

// Simple term printer


namespace tosca {
   
    void Print(Term& term, FILE* out, bool indent)
    {
        IOFILEWrapper wrapper(out);
        Print(term, wrapper, indent);
    }
    
    void Print(Term& term, std::ostream& out, bool indent)
    {
        IOStreamWrapper wrapper(out);
        Print(term, wrapper, indent);
    }
    
    void Print(Term& term, IOWrapper& out, bool indent)
    {
        term.Print(out, 0, indent);
        term.Release();
    }

    void Print(Term& term, bool indent)
    {
        Print(term, std::cerr, indent);
    }

    std::string PrintToString(Term& term, bool indent)
    {
        std::stringstream stream;
        Print(term, stream, indent);
        return stream.str();
    }

    void PT(Term& term)
    {
        term.AddRef();
        Print(term, true);
    }
}
