// Copyright (c) 2016 IBM Corporation.
#ifndef _STRUTILS
#define _STRUTILS

#include <string>

namespace tosca {
    class Context;
}

/* Convert UTF-8 chars to external escaped string form. */
extern std::string& makeEscaped(tosca::Context& context, const char *src);

#endif
