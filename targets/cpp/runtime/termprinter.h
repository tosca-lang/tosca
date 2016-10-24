// Copyright (c) 2016 IBM Corporation.

#ifndef TERMPRINTER_H
#define TERMPRINTER_H

namespace tosca {
    
    class Term;
 
    /**
     * Print term to the given output file
     */
    void Print(Term& term, std::ostream& out, bool indent);
    
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
