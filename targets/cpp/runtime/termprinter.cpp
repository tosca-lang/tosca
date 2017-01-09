// Copyright (c) 2016 IBM Corporation.

#include <ostream>
#include <sstream>
#include <fstream>
#include "termprinter.h"
#include "ts.h"
#include "iowrapper.h"

// Simple term printer


namespace tosca {
   
	static void Print(Term& term, IOWrapper& out, PrintOptions& options)
	{
		term.Print(out, options);
		term.Release();
	}

    void Print(Term& term, FILE* out, bool indent)
    {
        IOFILEWrapper wrapper(out);
        PrintOptions options(indent, false);
        Print(term, wrapper, options);
    }
    
    void Print(Term& term, std::ostream& out, bool indent)
    {
        IOStreamWrapper wrapper(out);
        PrintOptions options(indent, false);
        Print(term, wrapper, options);
    }
    
    void Print(Term& term, IOWrapper& out, bool indent)
    {
    	PrintOptions options(indent, false);
        Print(term, out, options);
    }

    void Print(Term& term, bool indent)
    {
        Print(term, std::cerr, indent);
    }

    std::string PrintToString(Term& term, bool indent)
    {
        std::stringstream stream;
        IOStreamWrapper wrapper(stream);
        PrintOptions options(indent, true);
        Print(term, wrapper, options);
        return stream.str();
    }

    void PT(Term& term)
    {
        term.AddRef();
        Print(term, true);
    }
}
