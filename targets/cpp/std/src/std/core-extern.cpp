// Copyright (c) 2016 IBM Corporation.
#include "core-extern.h"

#include  <cstdlib>
#include "core.h"

using namespace tosca;

StringTerm& GetEnv(Context& ctx, StringTerm& key, StringTerm& def)
{
    char* value = getenv(key.Unbox().c_str());
    key.Release();
    if (value)
    {
        def.Release();
        return newStringTerm(value);
    }
    return def;
}

Bool& BitSubSetEq(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    throw new std::runtime_error("unimplemented");
}

DoubleTerm& BitMinus(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    throw new std::runtime_error("unimplemented");
}

DoubleTerm& BitOr(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    throw new std::runtime_error("unimplemented");
}

DoubleTerm& BitAnd(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    throw new std::runtime_error("unimplemented");
}

