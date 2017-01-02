// Copyright (c) 2016 IBM Corporation.
#ifndef _STRUTILS
#define _STRUTILS

#include <string>

namespace tosca {
    class Context;
}

/* Convert UTF-8 chars to external escaped string form. */
extern std::string makeEscaped(const std::string& src);

/* Mangle the given name to be a valid Java/C/C++ identifier */
extern std::string makeMangle(const std::string& src);

/* Convert escaped string characters (without quotes) to UTF-8 form */
extern std::string makeRescaped(const std::string& src);

#endif
