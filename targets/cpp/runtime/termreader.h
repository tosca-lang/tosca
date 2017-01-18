// Copyright (c) 2016 IBM Corporation.

#ifndef TERMREADER_H
#define TERMREADER_H

/* Simple term reader.
   
   Follow this grammar:
 
   term : CONSTRUCTOR args
        | VARIABLE
        | STRING
        | NUMBER
        | [ binder ] -> term
        | {}
 
   args : ( terms? )
        |
 
   terms: term (, term)*
 
   binders : VARIABLE*
 */

#include <stdio.h>
#include <ostream>
#include <string>
#include <unordered_map>
#include <vector>
#include <tuple>
#include "tstring.h"

namespace tosca
{
    class BufferSink;
    class Variable;
    class Context;
    class Term;
    
    class TermLexer
    {
    public:
        enum Token { CONSTRUCTOR, VARIABLE, STRING, NUMBER, LPAR, RPAR, LSQUARE, RSQUARE, ARROW, COMMA,
            LCURLY, RCURLY, COLON, EEOF, INVALID };
        
        /* Create lexer with C style input */
        TermLexer(FILE* in);
        
        
        /* Create lexer with C++ iosteam */
        TermLexer(std::istream* in);
        
        /* Gets current token */
        Token CurrentToken();
        
        /* Consume the current token and read the next one. */
        void ConsumeToken();
        
        /* 
         * Check current token matches the given token and consume it
         * Throw runtime_error if the token does not match
         */
        void Match(Token token);
        
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
        char buffer[8192];
        
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
        Token ReadNumber(char first);
        
        /* Read constructor token */
        Token ReadConstructor();
        
        /* Current token */
        Token token;
        
        /* Read current character without consuming it. */
        inline char CurrentChar()
        {
            if (pos >= static_cast<ssize_t>(sizeof(buffer)))
                FillBuffer();
            if (pos == static_cast<ssize_t>(loaded) || pos == -1)
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
        ~TermParser();
        
        /*
         * Parses term and send result to the given sink 
         */
        void ParseTerm(BufferSink& sink);
        
        /*
         * Parses term and return the produced term
         */
        Term& ParseTerm(Context& ctx);
        
    private:
        /* The term lexer */
        TermLexer lexer;
        
        /* Free variables */
        std::unordered_map<tosca::string, tosca::Variable*> free;
        
        /* Bound variables */
        std::unordered_map<tosca::string, tosca::Variable*> bound;
        
        void ParseArgs(BufferSink& sink);
        void ParseTerms(BufferSink& sink);
        void ParseBinders(BufferSink& sink, std::vector<std::tuple<const tosca::string*, Variable*>>& localbound);
        void ParseMap(BufferSink& sink);

        Variable* FindVariable(const tosca::string& name);
    };
}





#endif
