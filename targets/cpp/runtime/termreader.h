// Copyright (c) 2016 IBM Corporation.

#ifndef TERMREADER_H
#define TERMREADER_H

/* Simple term reader.
   
   Follow this grammar:
 
   term : CONSTRUCTOR args
        | VARIABLE
        | STRING
        | NUMBER
 
   args : ( terms? )
        |
 
   terms: term (, term)*
 
 */

#include <stdio.h>
#include <ostream>
#include <string>
#include <unordered_map>

namespace tosca
{
    class Sink;
    class Variable;
    
    class TermLexer
    {
    public:
        enum Token { CONSTRUCTOR, VARIABLE, STRING, NUMBER, LPAR, RPAR, COMMA, EEOF, INVALID };
        
        /* Create lexer with C style input */
        TermLexer(FILE* in);
        
        
        /* Create lexer with C++ iosteam */
        TermLexer(std::istream* in);
        
        /* Gets current token */
        Token CurrentToken();
        
        /* Consume the current token and read the next one. */
        void ConsumeToken();
        
        /* Current token text. Read-only. */
        const std::string& GetText()
        {
            return text;
        }
        
    protected:
        
        /* The C style input */
        FILE* cinput;
        
        /* The input C++ stream */
        std::istream* stream;
        
        /* Input buffer */
        char buffer[8182];
        
        /* Number of loaded characters */
        size_t loaded;
        
        /* Current position in buffer */
        ssize_t pos;
        
        /* Token text */
        std::string text;
        
        /* Read input into buffer */
        void FillBuffer();
        
        /* Read string token */
        Token ReadString();
        
        /* Read variable token */
        Token ReadVariable();
        
        /* Read number token */
        Token ReadNumber();
        
        /* Read constructor token */
        Token ReadConstructor();
        
        /* Current token */
        Token token;
        
        /* Read current character without consuming it. */
        inline char CurrentChar()
        {
            if (pos >= sizeof(buffer))
                FillBuffer();
            if (pos == loaded || pos == -1)
            {
                pos = -1;
                return '\0';
            }
            return buffer[pos];
        }
        
        /* Consume current character */
        inline char ReadChar()
        {
            char c = CurrentChar();
            if (c != '\0')
                pos ++;
            return c;
        }
        
        inline bool IsEOF()
        {
            return pos == -1;
        }
    };
    
    class TermParser
    {
    public:
        TermParser(FILE* input);
        TermParser(std::istream* input);
        
        bool ParseTerm(Sink& sink);
    private:
        /* The term lexer */
        TermLexer lexer;
        
        /* Free variables */
        std::unordered_map<std::string, tosca::Variable*> free;
        
        bool ParseArgs(Sink& sink);
        bool ParseTerms(Sink& sink);
    };
}

#endif