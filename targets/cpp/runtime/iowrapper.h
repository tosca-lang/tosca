// Copyright (c) 2016 IBM Corporation.
#ifndef IOWRAPPER_H
#define IOWRAPPER_H

#include <stdio.h>
#include <string>
#include <ostream>
#include <istream>

namespace tosca
{
    class IOWrapper
    {
    public:
        virtual void Write(char c) = 0;
        virtual void Write(std::string str) = 0;
        virtual void Write(std::string& str) = 0;
        virtual void Write(const char* str) = 0;
        
        void Indent(int count);
    };

    class IOFILEWrapper : public IOWrapper
    {
    public:
        IOFILEWrapper(FILE* f);
        
        // -- overrides
        void Write(char c);
        void Write(std::string str);
        void Write(std::string& str);
        void Write(const char* str);
    private:
        FILE* file;
    };

    
    class IOStreamWrapper : public IOWrapper
    {
    public:
        IOStreamWrapper(std::ostream& s);

        // -- overrides
        void Write(char c);
        void Write(std::string str);
        void Write(std::string& str);
        void Write(const char* str);
    private:
        std::ostream& stream;
    };
    
} // tosca
#endif
