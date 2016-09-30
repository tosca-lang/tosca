// Copyright (c) 2016 IBM Corporation.

#ifndef TERMPRINTER_H
#define TERMPRINTER_H

namespace tosca {
    
    class Term;
 
    /* 
     * Print term to console
     * @param term to print. Consume reference.
     */
    void Print(Term& term);
    
}

#endif
