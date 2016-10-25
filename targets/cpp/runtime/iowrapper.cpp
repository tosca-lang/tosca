// Copyright (c) 2016 IBM Corporation.
#include "iowrapper.h"

namespace tosca
{
    void IOWrapper::Indent(int count)
    {
        while (count-- > 0)
            Write(' ');
    }


    IOFILEWrapper::IOFILEWrapper(FILE* f) : file(f)
    {}

    void IOFILEWrapper::Write(char c)
    {
        fputc(c, file);
    }

    void IOFILEWrapper::Write(std::string str)
    {
        fputs(str.c_str(), file);
    }

    void IOFILEWrapper::Write(std::string& str)
    {
        fputs(str.c_str(), file);
    }

    void IOFILEWrapper::Write(const char* str)
    {
        fputs(str, file);
    }

    IOStreamWrapper::IOStreamWrapper(std::ostream& s) : stream(s)
    {}
    
    void IOStreamWrapper::Write(char c)
    {
        stream << c;
    }
    
    void IOStreamWrapper::Write(std::string str)
    {
        stream << str;
    }
    
    void IOStreamWrapper::Write(std::string& str)
    {
        stream << str;
    }
    
    void IOStreamWrapper::Write(const char* str)
    {
        stream << str;
    }
   
}