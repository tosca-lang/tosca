// Copyright (c) 2016 IBM Corporation.
#include "core-extern.h"

#include  <cstdlib>
#include "core.h"
#include "listdef.h"

using namespace tosca;

StringTerm& GetEnv(Context& ctx, StringTerm& key, StringTerm& def)
{
    char* value = getenv(key.Unbox().c_str());
    key.Release();
    if (value)
    {
        def.Release();
        return newStringTerm(ctx, value);
    }
    return def;
}

Bool& BitSubSetEq(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long lleft = left.Unbox();
    long lright = right.Unbox();
    Bool& result = ((lleft & (~lright)) == 0) ? newTRUE(ctx) : newFALSE(ctx);
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& BitMinus(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long lleft = left.Unbox();
    long lright = right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, lleft & ~lright);
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& BitOr(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long lleft = left.Unbox();
    long lright = right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, lleft | lright);
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& BitAnd(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long lleft = left.Unbox();
    long lright = right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, lleft & lright);
    left.Release();
    right.Release();
    return result;
}
