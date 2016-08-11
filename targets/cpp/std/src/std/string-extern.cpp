// Copyright (c) 2016 IBM Corporation.

#include "string-extern.h"

#include "std/core.h"
#include "strutils.h"

using namespace tosca;

StringTerm& AfterFirst(Context& ctx, StringTerm& string, StringTerm& sep)
{
    std::string& ustring = string.Unbox();
    std::string& usep = sep.Unbox();
    std::string::size_type idx = ustring.find(usep);

    StringTerm& result = newStringTerm((idx == -1) ? "" : ustring.substr(idx + 1));
    string.Release();
    sep.Release();
    return result;
}

StringTerm& BeforeFirst(Context& ctx, StringTerm& string, StringTerm& sep)
{
    std::string& ustring = string.Unbox();
    std::string& usep = sep.Unbox();
    std::string::size_type idx = ustring.find(usep);

    StringTerm& result = newStringTerm((idx == -1) ? ustring : ustring.substr(0, idx));
    string.Release();
    sep.Release();
    return result;
}

Bool& StringEqual(Context& ctx, StringTerm& str1, StringTerm& str2)
{
    std::string& ustr1 = str1.Unbox();
    std::string& ustr2 = str2.Unbox();
    Bool& result = ustr1 == ustr2 ? newTRUE(ctx) : newFALSE(ctx);
    str1.Release();
    str2.Release();
    return result;
}

StringTerm& ConcatString(Context& ctx, StringTerm& str1, StringTerm& str2)
{
    StringTerm& result = newStringTerm(str1.Unbox() + str2.Unbox());
    str1.Release();
    str2.Release();
    return result;
}

StringTerm& Escape(Context& ctx, StringTerm& str)
{
    StringTerm& result = newStringTerm(makeEscaped(ctx, str.Unbox().c_str()));
    str.Release();
    return result;
}

DoubleTerm& Length(Context& ctx, StringTerm& str)
{
    DoubleTerm& result = newDoubleTerm(str.Unbox().size());
    str.Release();
    return result;
}

StringTerm& Mangle(Context& ctx, StringTerm& str)
{
    throw new std::runtime_error("");

}

StringTerm& UpCase(Context& ctx, StringTerm& str)
{
    throw new std::runtime_error("");

}

StringTerm& Replace(Context& ctx, StringTerm& str, StringTerm&, StringTerm&)
{
    throw new std::runtime_error("");

}

Bool& Contains(Context& ctx, StringTerm& str1, StringTerm& str2)
{
    std::string& ustr1 = str1.Unbox();
    std::string& ustr2 = str2.Unbox();
    Bool& result = ustr1.find(ustr2) != std::string::npos ? newTRUE(ctx) : newFALSE(ctx);
    str1.Release();
    str2.Release();
    return result;
}

StringTerm& DownCase(Context& ctx, StringTerm& str)
{
    throw new std::runtime_error("");
}

StringTerm& Substring(Context& ctx, StringTerm& str1, DoubleTerm& str2, DoubleTerm& str3)
{
    throw new std::runtime_error("");

}

StringTerm& Substring2(Context& ctx, StringTerm& str, DoubleTerm& from)
{
    std::string& ustr = str.Unbox();
    std::string::size_type pos = static_cast<std::string::size_type>(from.Unbox());
    StringTerm& result = newStringTerm(ustr.substr(pos));
    str.Release();
    from.Release();
    return result;
}

Bool& MatchRegex(Context& ctx, StringTerm&, StringTerm&)
{
    throw new std::runtime_error("");
}

Bool& StartsWith(Context& ctx, StringTerm& str, StringTerm& prefix)
{
    std::string& ustr = str.Unbox();
    std::string& uprefix = prefix.Unbox();
    Bool& result = (!ustr.compare(0, uprefix.size(), uprefix)) ? newTRUE(ctx) : newFALSE(ctx);
    str.Release();
    prefix.Release();
    return result;

}

