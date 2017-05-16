// Copyright (c) 2016 IBM Corporation.

#include "termreader.h"
#include "sink.h"
#include "buffer.h"
#include "term.h"
#include "strutils.h"
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
                case '{':
                    ReadChar();
                    token = LCURLY;
                    return;
                case '}':
                    ReadChar();
                    token = RCURLY;
                    return;
                case ':':
                    ReadChar();
                    token = COLON;
                    return;
                case '-':
                {
                    char first = ReadChar();
                    switch (CurrentChar())
                    {
                        case '>':
                            ReadChar();
                            token = ARROW;
                            break;
                        default:
                            token = ReadNumber(first);
                            break;
                    }
                    return;
                }
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
                    token = ReadNumber(ReadChar());
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
    
    
    inline static bool isAlpha(char c)
    {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    
    inline static bool isDigit(char c)
    {
        return (c >= '0' && c <= '9');
    }
    
    TermLexer::Token TermLexer::ReadVariable()
    {
        // Lower (Alpha | Digit | '-' | '_')*;
        text += ReadChar();
        while (true)
        {
            char c = CurrentChar();
            if (isAlpha(c) || isDigit(c) || c == '-' || c == '_')
            {
                ReadChar();
                text += c;
            }
            else
                return VARIABLE;
        }
    }
    
    TermLexer::Token TermLexer::ReadNumber(char first)
    {
        //'-'? [0-9]+ ('.' [0-9]+)? | '.' [0-9]+;
        text += first;
        while (true)
        {
            char c = CurrentChar();
            // Approximation.
            
            if (isDigit(c) || c == '.')
            {
                ReadChar();
                text += c;
            }
            else
                return NUMBER;
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
    
    TermParser::~TermParser()
    {
        // Release bound (in case of error) and free variables
        for (auto iter = bound.begin(); iter != bound.end(); iter++)
            iter->second->Release();
        
        for (auto iter = free.begin(); iter != free.end(); iter++)
        	iter->second->Release();
    }
    
    void TermParser::BindVariable(Context& ctx, tosca::string name, tosca::Variable* var)
    {
        free.insert({name, var});
    }

    Term& TermParser::ParseTerm(Context& ctx)
    {
        BufferSink buffer(ctx);
        ParseTerm(buffer);
        return buffer.GetTerm();
    }
    
    void TermParser::ParseTerm(BufferSink& sink)
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
            	tosca::string name(lexer.GetText().c_str(), sink.GetContext().allocChar);
            	Variable* var = FindVariable(name);
                if (var == 0)
                {
                    var = &sink.MakeFree(name);
                    free.insert({name, var}); // Keep one var ref
                }

                sink.Use(NewRef(*var));
                lexer.ConsumeToken();
                break;
            }
            case TermLexer::NUMBER:
            {
            	double d = stod(lexer.GetText());
            	sink.Double(d);
            	lexer.ConsumeToken();
            	break;
            }
            case TermLexer::STRING:
            {
            	std::string unquote = makeRescaped(lexer.GetText());
                sink.Literal(unquote);
                lexer.ConsumeToken();
                break;
            }
            case TermLexer::LSQUARE:
            {
                std::vector<std::tuple<tosca::string, Variable*>> local;
                lexer.ConsumeToken();
                ParseBinders(sink, local);
                lexer.Match(TermLexer::RSQUARE);
                lexer.ConsumeToken();
                lexer.Match(TermLexer::ARROW);
                lexer.ConsumeToken();
                ParseTerm(sink);
                
                for (auto iter = local.begin(); iter != local.end(); iter++)
                {
                    bound.erase(std::get<0>(*iter));
                    std::get<1>(*iter)->Release();
                }
                
                break;
            }
            case TermLexer::LCURLY:
            {
                lexer.ConsumeToken();

                sink.StartMap();

                if (lexer.CurrentToken() != TermLexer::RCURLY)
                    ParseMap(sink);

                sink.EndMap();

                lexer.Match(TermLexer::RCURLY);
                lexer.ConsumeToken();
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

    void TermParser::ParseArgs(BufferSink& sink)
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
                        lexer.ConsumeToken();
                        return;
                }
            }
            case TermLexer::COMMA:
            case TermLexer::RPAR:
            case TermLexer::EEOF:
                return;
            
            default:
               throw std::runtime_error("Parse error.");
        }
    }
    
    void TermParser::ParseTerms(BufferSink& sink)
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
   
    void TermParser::ParseBinders(BufferSink& sink, std::vector<std::tuple<tosca::string, Variable*>>& local)
    {
        while (true)
        {
            TermLexer::Token token = lexer.CurrentToken();
            switch (token)
            {
                case TermLexer::VARIABLE:
                {
                    tosca::string name(lexer.GetText().c_str(), sink.GetContext().allocChar);
                    Variable& binder = sink.MakeBound(name);
                    bound[name] = &binder; // Keep one ref. See ParseTerm for Release
                    local.push_back(std::tuple<tosca::string, Variable*>{name, &binder});
                    binder.AddRef();
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
    
    void TermParser::ParseMap(BufferSink& sink)
    {
        while (true)
        {
            lexer.Match(TermLexer::STRING);
            const std::string key = makeRescaped(lexer.GetText());
            lexer.ConsumeToken();

            lexer.Match(TermLexer::COLON);
            lexer.ConsumeToken();

            BufferSink value(sink.GetContext());
            ParseTerm(value);
            sink.MapEntry(newStringTerm(sink.GetContext(), key), value.GetTerm());

            if (lexer.CurrentToken() == TermLexer::RCURLY)
                break;

            lexer.Match(TermLexer::COMMA);
            lexer.ConsumeToken();
        }
    }
    
    Variable* TermParser::FindVariable(const tosca::string& name)
    {
        auto search1 = bound.find(name);
        if (search1 != bound.end())
            return search1->second;
        
        auto search2 = free.find(name);
        if (search2 != free.end())
            return search2->second;
        return 0;
    }
    
}
