// Copyright (c) 2016 IBM Corporation.

#include "termreader.h"
#include "sink.h"
#include "term.h"
#include "ts.h"


namespace tosca
{
    
    TermLexer::TermLexer(FILE* in) : cinput(in), stream(0), loaded(0)
    {
        pos = sizeof(buffer); // buffer will be filled
        ConsumeToken();
        
    }
    
    TermLexer::TermLexer(std::istream* in) : cinput(0), stream(in), loaded(0)
    {
        pos = sizeof(buffer); // buffer will be filled
        ConsumeToken();
    }
    
    
    void TermLexer::FillBuffer()
    {
        if (cinput)
            loaded = fread(&buffer, sizeof(char), sizeof(buffer), cinput);
        else
        {
            stream->read(buffer, sizeof(buffer));
            loaded = stream->gcount();
        }
            
        pos = loaded == 0 ? -1 : 0;
    }
    
    
    TermLexer::Token TermLexer::CurrentToken()
    {
        return token;
    }
    
    void TermLexer::ConsumeToken()
    {
        text.clear();
        
        while (true)
        {
            char c = CurrentChar();
            switch (c)
            {
                case '\0':
                    token = EEOF;
                    return;
                case '\"':
                    token = ReadString();
                    return;
                case '(':
                    ReadChar();
                    token = LPAR;
                    return;
                case ')':
                    ReadChar();
                    token = RPAR;
                    return;
                case ',':
                    ReadChar();
                    token = COMMA;
                    return;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '-':
                    token = ReadNumber();
                    return;
                case ' ' :
                case '\t':
                case '\f':
                case '\n':
                case '\r':
                case '\b':
                    break; // skip whitespace
                    
                default:
                    if (c >= 'a' && c <= 'z')
                        token = ReadVariable();
                    else if ((c >= 'A' && c <= 'Z') || c == '_' || c == '$')
                        token = ReadConstructor();
                    else
                        token = INVALID;
                    return;
            }
        }
    }
    
    TermLexer::Token TermLexer::ReadString()
    {
        //  '"' ('\\"'|'""'|~'"')*? '"';
        text += ReadChar();
        while (true)
        {
            char c = CurrentChar();
            switch (c)
            {
                case '\0':
                    return INVALID;
                    
                case '\"':
                {
                    text += c;
                    ReadChar();
                    char nc = CurrentChar();
                    if (nc == '\"') // ""
                    {
                        ReadChar();
                    }
                    else
                    {
                        // Reach end of string.
                        return STRING;
                    }
                    break;
                }
                case '\\':
                {
                    ReadChar();
                    char nc = CurrentChar();
                    if (nc == '\"')
                    {
                        text += '"';
                        ReadChar();
                    }
                    else
                        text += c;
                    
                    break;
                }
                default:
                    // TODO: UTF-8.
                    ReadChar();
                    text += c;
                    break;
            }
        }
    }
    
    TermLexer::Token TermLexer::ReadVariable()
    {
        // Lower (Alpha | Digit | '-' | '_')*;
        text += ReadChar();
        while (true)
        {
            char c = CurrentChar();
            switch (c)
            {
                case ' ' :
                case '\t':
                case '\f':
                case '\n':
                case '\r':
                case '\b':
                case '\0':
                case ',':
                case ')':
                    return VARIABLE;
                    
                default:
                    // TODO: check syntax
                    ReadChar();
                    text += c;
                    break;
            }
        }
    }
    
    TermLexer::Token TermLexer::ReadNumber()
    {
        //'-'? [0-9]+ ('.' [0-9]+)? | '.' [0-9]+;
        text += ReadChar();
        while (true)
        {
            char c = CurrentChar();
            switch (c)
            {
                case ' ' :
                case '\t':
                case '\f':
                case '\n':
                case '\r':
                case '\b':
                case '\0':
                case ',':
                case ')':
                    return NUMBER;
                    
                default:
                    // TODO: check syntax
                    ReadChar();
                    text += c;
                    break;
            }
        }
    }
    
    TermLexer::Token TermLexer::ReadConstructor()
    {
        // ConsHead ConsChar* Ebnf?;
        text += ReadChar();
        while (true)
        {
            char c = CurrentChar();
            switch (c)
            {
                case ' ' :
                case '\t':
                case '\f':
                case '\n':
                case '\r':
                case '\b':
                case '\0':
                case ',':
                case ')':
                case '(':
                    return CONSTRUCTOR;
                    
                default:
                    ReadChar();
                    text += c;
                    break;
            }
        }
    }

    TermParser::TermParser(FILE* input) : lexer(input)
    {}
    
    TermParser::TermParser(std::istream* input) : lexer(input)
    {}
    
    bool TermParser::ParseTerm(Sink& sink)
    {
        TermLexer::Token token = lexer.CurrentToken();
        switch (token)
        {
            case TermLexer::CONSTRUCTOR:
            {
                CStringTerm symbol(lexer.GetText());
                lexer.ConsumeToken();
                sink.Start(symbol);
                if (ParseArgs(sink))
                    sink.End();
                return true;
            }
            case TermLexer::VARIABLE:
            {
                // TODO: 
                return true;
            }
            case TermLexer::NUMBER:
            case TermLexer::STRING:
            {
                sink.Literal(lexer.GetText());
                lexer.ConsumeToken();
                return true;
            }
            default:
                // Syntax error
                return false;
        }
    }

    bool TermParser::ParseArgs(Sink& sink)
    {
        TermLexer::Token token = lexer.CurrentToken();
        switch (token)
        {
            case TermLexer::LPAR:
            {
                lexer.ConsumeToken();
                token = lexer.CurrentToken();
                switch (token)
                {
                    case TermLexer::RPAR:
                    {
                        lexer.ConsumeToken();
                        return true;
                    }
                    default:
                        if (ParseTerms(sink))
                        {
                            if (lexer.CurrentToken() == TermLexer::RPAR)
                            {
                                lexer.ConsumeToken();
                                return true;
                            }
                        }
                }
                return false;
            }
            case TermLexer::COMMA:
            case TermLexer::EEOF:
                return true;
            
            default:
                return false;
        }
    }
    
    bool TermParser::ParseTerms(Sink& sink)
    {
        while (true)
        {
            if (ParseTerm(sink))
            {
                TermLexer::Token token = lexer.CurrentToken();
                switch (token)
                {
                    case TermLexer::COMMA:
                        lexer.ConsumeToken();
                        break; // Read next term
                    case TermLexer::RPAR:
                        lexer.ConsumeToken();
                        return true;
                    default:
                        return false;
                }
            }
            else
                return false;
        }
    }
    
}