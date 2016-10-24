// Copyright (c) 2016 IBM Corporation.

#include "termreader.h"
#include "sink.h"
#include "buffer.h"
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
    
    void TermLexer::Match(Token token)
    {
        if (token != CurrentToken())
            throw std::runtime_error("Parse error.");
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
                case '[':
                    ReadChar();
                    token = LSQUARE;
                    return;
                case ']':
                    ReadChar();
                    token = RSQUARE;
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
                    ReadChar();
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
        ReadChar();
        while (true)
        {
            char c = CurrentChar();
            switch (c)
            {
                case '\0':
                    return INVALID;
                    
                case '\"':
                {
                    ReadChar();
                    char nc = CurrentChar();
                    if (nc == '\"') // ""
                    {
                        text += c;
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
    
    Term& TermParser::ParseTerm(Context& ctx)
    {
        BufferSink buffer(ctx);
        ParseTerm(buffer);
        return buffer.GetTerm();
    }
    
    void TermParser::ParseTerm(Sink& sink)
    {
        TermLexer::Token token = lexer.CurrentToken();
        switch (token)
        {
            case TermLexer::CONSTRUCTOR:
            {
                std::string st(lexer.GetText());
                Term& sub = sink.MakeTerm(st);
                lexer.ConsumeToken();
                sink.Start(sub);
                ParseArgs(sink);
                sink.End();
                break;
            }
            case TermLexer::VARIABLE:
            {
                Variable* var = FindVariable(lexer.GetText());
                if (var == 0)
                {
                    std::string& name = *(new std::string(lexer.GetText()));
                    var = &sink.MakeFree(name);
                    free.insert({&name, var});
                }
                
                sink.Use(*var);
                lexer.ConsumeToken();
                break;
            }
            case TermLexer::NUMBER:
            case TermLexer::STRING:
            {
                sink.Literal(lexer.GetText());
                lexer.ConsumeToken();
            }
            case TermLexer::LSQUARE:
            {
                std::vector<std::tuple<const std::string*, Variable*>> shadowed;
                lexer.ConsumeToken();
                ParseBinders(sink, shadowed);
                lexer.Match(TermLexer::ARROW);
                ParseTerm(sink);
                
                for (auto iter = shadowed.begin(); iter != shadowed.end(); iter++)
                    bound.insert({std::get<0>(*iter), std::get<1>(*iter)});
                
                break;
            }
            case TermLexer::COMMA:
            case TermLexer::RPAR:
            case TermLexer::EEOF:
                break;
                
            default:
                throw std::runtime_error("Parse error.");
        }
    }

    void TermParser::ParseArgs(Sink& sink)
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
                        return;
                    }
                    default:
                        ParseTerm(sink);
                        ParseTerms(sink);
                        
                        lexer.Match(TermLexer::RPAR);
                        return;
                }
            }
            case TermLexer::COMMA:
            case TermLexer::EEOF:
                return;
            
            default:
               throw std::runtime_error("Parse error.");
        }
    }
    
    void TermParser::ParseTerms(Sink& sink)
    {
        while (true)
        {
            ParseTerm(sink);
            
            TermLexer::Token token = lexer.CurrentToken();
            switch (token)
            {
                case TermLexer::COMMA:
                    lexer.ConsumeToken();
                    break; // move on to next term.
                case TermLexer::RPAR:
                    return; // done
                default:
                     throw std::runtime_error("Parse error.");
            }
        }
    }
   
    void TermParser::ParseBinders(Sink& sink, std::vector<std::tuple<const std::string*, Variable*>>& shadowed)
    {
        while (true)
        {
            TermLexer::Token token = lexer.CurrentToken();
            switch (token)
            {
                case TermLexer::VARIABLE:
                {
                    // Save shadowed bound variables.
                    auto search = bound.find(&lexer.GetText());
                    if (search != bound.end())
                        shadowed.push_back(std::tuple<const std::string*, Variable*>{search->first, search->second});
                    
                    std::string& name = *(new std::string(lexer.GetText()));
                    Variable& binder = sink.MakeBound(name);
                    bound.insert({&name, &binder});
                    sink.Bind(binder);
                    lexer.ConsumeToken();
                    break;
                }
                case TermLexer::RSQUARE:
                    return;
                default:
                    throw std::runtime_error("Parse error.");
            }
        }
    }
    
    
    Variable* TermParser::FindVariable(const std::string& name)
    {
        auto search1 = bound.find(&name);
        if (search1 != bound.end())
            return search1->second;
        
        auto search2 = free.find(&name);
        if (search2 != free.end())
            return search2->second;
        return 0;
    }
    
}