// Copyright (c) 2016 IBM Corporation.

#include "appendable-extern.h"
#include "string-extern.h"

StringTerm& StringToAppendable(Context& ctx, StringTerm& str)
{
    return str;
}

StringTerm& AppendableToString(Context& ctx, StringTerm& appendable)
{
    return appendable;
}

StringTerm& AppendableAppend(Context& ctx, StringTerm& left, StringTerm& right)
{
    return ConcatString(ctx, left, right);
}
