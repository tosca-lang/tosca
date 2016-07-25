// Copyright (c) 2016 IBM Corporation.

#include "string-extern.h"

#include "std/core.h"

StringTerm& AfterFirst(Context& ctx, StringTerm& str1, StringTerm& str2)
{
    return str1;
}

StringTerm& BeforeFirst(Context& ctx, StringTerm& str1, StringTerm& str2)
{
    return str1;
}

Bool& StringEqual(Context& ctx, StringTerm& str1, StringTerm& str2)
{
    return newTRUE(ctx);
}

StringTerm& ConcatString(Context& ctx, StringTerm& str1, StringTerm& str2)
{
    return str1;
}

StringTerm& Escape(Context& ctx, StringTerm&)
{

}

DoubleTerm& Length(Context& ctx, StringTerm&)
{

}

StringTerm& Mangle(Context& ctx, StringTerm&)
{

}

StringTerm& UpCase(Context& ctx, StringTerm&)
{

}

StringTerm& Replace(Context& ctx, StringTerm&, StringTerm&, StringTerm&)
{

}

Bool& Contains(Context& ctx, StringTerm&, StringTerm&)
{

}

StringTerm& DownCase(Context& ctx, StringTerm&)
{

}

StringTerm& Substring(Context& ctx, StringTerm&, DoubleTerm&, DoubleTerm&)
{

}

StringTerm& Substring2(Context& ctx, StringTerm& str, DoubleTerm&)
{
    return str;
}

Bool& MatchRegex(Context& ctx, StringTerm&, StringTerm&)
{

}

Bool& StartsWith(Context& ctx, StringTerm& str, StringTerm& prefix)
{
    return newTRUE(ctx);
}

