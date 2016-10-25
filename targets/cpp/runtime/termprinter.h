// Copyright (c) 2016 IBM Corporation.

#ifndef TERMPRINTER_H
#define TERMPRINTER_H

#include <stdio.h>

namespace tosca {
    
    class Term;
    class IOWrapper;
    
    /**
     * Print term to the given output POSIX file
     */
    void Print(Term& term, FILE* out, bool indent);
   
    /**
     * Print term to the given output stream
     */
    void Print(Term& term, std::ostream& out, bool indent);
    
    /**
     * Print term to the given output wrapper
     */
    void Print(Term& term, IOWrapper& out, bool indent);
    
    /* 
     * Print term to console
     * @param term to print. Consume reference.
     */
    void Print(Term& term, bool indent);
 
    /*
     * Print term to string
     */
    std::string PrintToString(Term& term, bool indent);
}

#endif
