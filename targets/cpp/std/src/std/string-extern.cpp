// Copyright (c) 2016 IBM Corporation.

#include "string-extern.h"

#include "std/core.h"
#include "std/listdef.h"
#include "strutils.h"
#include <regex>

using namespace tosca;

StringTerm& AfterFirst(Context& ctx, StringTerm& string, StringTerm& sep)
{
    const std::string& ustring = string.Unbox();
    const std::string& usep = sep.Unbox();
    std::string::size_type idx = ustring.find(usep);

    StringTerm& result = newStringTerm(ctx, (idx == std::string::npos) ? "" : ustring.substr(idx + 1));
    string.Release();
    sep.Release();
    return result;
}

StringTerm& BeforeFirst(Context& ctx, StringTerm& string, StringTerm& sep)
{
    const std::string& ustring = string.Unbox();
    const std::string& usep = sep.Unbox();
    std::string::size_type idx = ustring.find(usep);

    StringTerm& result = newStringTerm(ctx, (idx == std::string::npos) ? ustring : ustring.substr(0, idx));
    string.Release();
    sep.Release();
    return result;
}

Bool& StringEqual(Context& ctx, StringTerm& str1, StringTerm& str2)
{
    const std::string& ustr1 = str1.Unbox();
    const std::string& ustr2 = str2.Unbox();
    Bool& result = ustr1 == ustr2 ? newTRUE(ctx) : newFALSE(ctx);
    str1.Release();
    str2.Release();
    return result;
}

StringTerm& Escape(Context& ctx, StringTerm& str)
{
    StringTerm& result = newStringTerm(ctx, makeEscaped(str.Unbox()));
    str.Release();
    return result;
}

DoubleTerm& Length(Context& ctx, StringTerm& str)
{
    DoubleTerm& result = newDoubleTerm(ctx, str.Unbox().size());
    str.Release();
    return result;
}

StringTerm& Mangle(Context& ctx, StringTerm& str)
{
    StringTerm& result = newStringTerm(ctx, makeMangle(str.Unbox()));
    str.Release();
    return result;
}

StringTerm& UpCase(Context& ctx, StringTerm& str)
{
    std::string upper(str.Unbox());
    for (std::string::iterator it= upper.begin(); it != upper.end(); ++it)
        *it = toupper(*it);
    str.Release();
    return newStringTerm(ctx, std::move(upper));
}

StringTerm& DownCase(Context& ctx, StringTerm& str)
{
    std::string& lower = *(new std::string(str.Unbox()));
    for (std::string::iterator it= lower.begin(); it != lower.end(); ++it)
        *it = tolower(*it);
    str.Release();
    return newStringTerm(ctx, lower);
}

StringTerm& Replace(Context& ctx, StringTerm& str, StringTerm& oldStr, StringTerm& newStr)
{
    if (oldStr.Unbox().empty())
    {
        oldStr.Release();
        newStr.Release();
        return str;
    }

    std::string& result = *(new std::string(str.Unbox()));
    const std::string& uoldStr = oldStr.Unbox();
    const std::string& unewStr = newStr.Unbox();

    size_t pos = 0;
    while ((pos = result.find(uoldStr, pos)) != std::string::npos)
    {
        result.replace(pos, uoldStr.length(), unewStr);
        pos += unewStr.length();
    }
    str.Release();
    oldStr.Release();
    newStr.Release();

    return newStringTerm(ctx, result);
}

Bool& Contains(Context& ctx, StringTerm& str1, StringTerm& str2)
{
    const std::string& ustr1 = str1.Unbox();
    const std::string& ustr2 = str2.Unbox();
    Bool& result = ustr1.find(ustr2) != std::string::npos ? newTRUE(ctx) : newFALSE(ctx);
    str1.Release();
    str2.Release();
    return result;
}


StringTerm& Substring(Context& ctx, StringTerm& str, DoubleTerm& from, DoubleTerm& to)
{
    const std::string& ustr = str.Unbox();
    std::string::size_type pos = static_cast<std::string::size_type>(from.Unbox());
    std::string::size_type end = static_cast<std::string::size_type>(to.Unbox());
    std::string::size_type count = end > pos ? end - pos : 0;
    StringTerm& result = newStringTerm(ctx, ustr.substr(pos, count));
    str.Release();
    from.Release();
    return result;
}

StringTerm& Substring2(Context& ctx, StringTerm& str, DoubleTerm& from)
{
    const std::string& ustr = str.Unbox();
    std::string::size_type pos = static_cast<std::string::size_type>(from.Unbox());
    StringTerm& result = newStringTerm(ctx, ustr.substr(pos));
    str.Release();
    from.Release();
    return result;
}

#ifdef STD_REGEX
Bool& MatchRegex(Context& ctx, StringTerm& pattern, StringTerm& str)
{
    std::regex regex(pattern.Unbox());
    Bool& result = std::regex_match(str.Unbox(), regex) ? newTRUE(ctx) : newFALSE(ctx);
    pattern.Release();
    str.Release();
    return result;
}
#endif

Bool& StartsWith(Context& ctx, StringTerm& str, StringTerm& prefix)
{
    const std::string& ustr = str.Unbox();
    const std::string& uprefix = prefix.Unbox();
    Bool& result = (!ustr.compare(0, uprefix.size(), uprefix)) ? newTRUE(ctx) : newFALSE(ctx);
    str.Release();
    prefix.Release();
    return result;
}

Bool& EndsWith(tosca::Context& ctx, tosca::StringTerm& str, tosca::StringTerm& suffix)
{
    const std::string& ustr = str.Unbox();
    const std::string& usuffix = suffix.Unbox();
    Bool& result = (ustr.size() >= usuffix.size()
                    && !ustr.compare(ustr.size() - usuffix.size(), usuffix.size(), usuffix)) ? newTRUE(ctx) : newFALSE(ctx);
    str.Release();
    suffix.Release();
    return result;
}

tosca::StringTerm& Trim(tosca::Context& ctx, tosca::StringTerm& str)
{
    const std::string& ustr = str.Unbox();
    if (ustr.empty())
        return str;

    std::string::size_type first = ustr.find_first_not_of(" \t\f\n\r\b");
    if (first == std::string::npos)
    {
        // All whitespace characters.
        str.Release();
        return newStringTerm(ctx, "");
    }

    size_t last = ustr.find_last_not_of(" \t\f\n\r\b");
    StringTerm& result = newStringTerm(ctx, ustr.substr(first, (last-first+1)));
    str.Release();
    return result;
}

List<tosca::StringTerm>& Split(tosca::Context& ctx, tosca::StringTerm& str, tosca::StringTerm& sep)
{
    const std::string& ustr = str.Unbox();
    if (ustr.empty())
    {
        str.Release();
        sep.Release();
        return newNil<tosca::StringTerm>(ctx);
    }

    const std::string& usep = sep.Unbox();
    List<tosca::StringTerm>* result = 0;
    List<tosca::StringTerm>* last = 0;

    std::string::size_type spos = 0;
    std::string::size_type pos = 0;
    int trailings = 0; // to discard empty trailing strings
    while ((pos = ustr.find(usep, spos)) != std::string::npos)
    {
    	std::string::size_type count = pos - spos;
    	if (count == 0)
    	{
    		trailings ++;
    		spos += usep.length();
    		continue;
    	}
    	for (; trailings > 0; trailings--)
    	{
    		List<tosca::StringTerm>& cons = dynamic_cast<List<tosca::StringTerm>&>(_CCons<tosca::StringTerm>::Make(ctx));
    		cons.SetSub(0, newStringTerm(ctx, ""));
    		if (last)
    			last->SetSub(1, cons);
    		last = &cons;

    		if (!result)
    			result = last;
    	}

    	List<tosca::StringTerm>& cons = dynamic_cast<List<tosca::StringTerm>&>(_CCons<tosca::StringTerm>::Make(ctx));
    	cons.SetSub(0, newStringTerm(ctx, ustr.substr(spos, count)));
    	if (last)
    		last->SetSub(1, cons);
    	last = &cons;

    	if (!result)
    		result = last;

        spos = pos + usep.length();
    }
    if (spos < ustr.length())
    {
    	List<tosca::StringTerm>& cons = dynamic_cast<List<tosca::StringTerm>&>(_CCons<tosca::StringTerm>::Make(ctx));
    	cons.SetSub(0, newStringTerm(ctx, ustr.substr(spos)));
    	if (last)
    		last->SetSub(1, cons);
    	last = &cons;

    	if (!result)
    		result = last;
    }

    if (last)
    {
        last->SetSub(1, newNil<tosca::StringTerm>(ctx));
        str.Release();
    }
    else
    {
        // sep was not found or only trailing empty strings. Just return the original string, even when empty
        result = &newCons(ctx, str, newNil<tosca::StringTerm>(ctx));
    }
    sep.Release();
    return *result;
}

tosca::StringTerm& Squash(tosca::Context& ctx, tosca::StringTerm& str)
{
    std::string squashed;
    bool wasspace = false;
    
    for (auto iter = str.Unbox().begin(); iter != str.Unbox().end(); iter++)
    {
        if (isspace(*iter))
        {
            if (!wasspace)
            {
                wasspace=true;
                squashed += ' ';
            }
        }
        else
        {
            squashed += *iter;
            wasspace = false;
        }
    }
    str.Release();
    return newStringTerm(ctx, squashed);
}

tosca::DoubleTerm& Index(tosca::Context& ctx, tosca::StringTerm& string, tosca::StringTerm& pattern)
{
    auto search = string.Unbox().find(pattern.Unbox());
    tosca::DoubleTerm& result = newDoubleTerm(ctx, search == std::string::npos ? -1 : search);
    string.Release();
    pattern.Release();
    return result;
}

