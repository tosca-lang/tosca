// Copyright (c) 2016 IBM Corporation.
#include "strutils.h"
#include "ts.h"
#include <cstring>

// Interpret one Unicode relaxed UTF-8 character starting at s into codepoint c.
// NOTE: leaves s on last character in sequence (this leaves s untouched for 7-bit characters)
static unsigned int onecodepoint(unsigned char **sp)
{
    unsigned int c = **sp;
    if (c <= 0x7F) // .7 bit: U+0000     U+007F     1     0xxxxxxx
    {}
    else if ((c & 0xC0) == 0x80) // continuation character out of place -- assume normal
    {}
    else if ((c & 0xE0) == 0xC0) // 11 bit: U+0080 U+07FF    2 110xxxxx 10xxxxxx
    {
        if ((*((*sp)+1) & 0xC0) == 0x80) // if not continued assume roque 8-bit!
        {
            c = (c & 0x1F) << 6;
            c |= *(++(*sp)) & 0x3F;
        }
    }
    else if ((c & 0xF0) == 0xE0) // 16 bit: U+0800 U+FFFF 3 1110xxxx 10xxxxxx 10xxxxxx
    {
        if ((*((*sp)+1) & 0xC0) == 0x80) // if not continued assume roque 8-bit!
        {
            c = (c & 0x1F) << 12;
            c |= (*(++(*sp)) & 0x3F) << 6;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= *(++(*sp)) & 0x3F;
        }
    }
    else if ((c & 0xF8) == 0xF0) // 21 bit: U+10000 U+1FFFFF 4     11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
    {
        if ((*((*sp)+1) & 0xC0) == 0x80) // if not continued assume roque 8-bit!
        {
            c = (c & 0x1F)<<18;
            c |= (*(++(*sp)) & 0x3F) << 12;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= (*(++(*sp)) & 0x3F) << 6;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= *(++(*sp)) & 0x3F;
        }
    }
    else if ((c & 0xFC) == 0xF8) // 26 bit: U+200000 U+3FFFFFF 5 111110xx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx
    {
        if ((*((*sp)+1) & 0xC0) == 0x80) // if not continued assume roque 8-bit!
        {
            c = (c & 0x1F)<<24;
            c |= (*(++(*sp)) & 0x3F) << 18;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= (*(++(*sp)) & 0x3F) << 12;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= (*(++(*sp)) & 0x3F) << 6;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= *(++(*sp)) & 0x3F;
        }
    }
    else if ((c & 0xFE) == 0xFC) // 31 bit: U+4000000 U+7FFFFFFF 6 1111110x 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx
    {
        if ((*((*sp)+1) & 0xC0) == 0x80) // if not continued assume roque 8-bit!
        {
            c = (c & 0x1F)<<30;
            c |= (*(++(*sp)) & 0x3F) << 24;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= (*(++(*sp)) & 0x3F) << 18;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= (*(++(*sp)) & 0x3F) << 12;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= (*(++(*sp)) & 0x3F) << 6;
            if ((*((*sp)+1) & 0xC0) == 0x80) c |= *(++(*sp)) & 0x3F;
        }
    }
    return c;
}


// Convert UTF-8 chars to external escaped string form.
// All characters in *sourcep are converted into characters starting at *targetp,
// not going beyond endtarget. Updates *sourcep and *targetp.
static const char HexDigits[16] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
static void escape(char **sourcep, char **targetp, char *endsource, char *endtarget)
{
    unsigned char *s = (unsigned char *)*sourcep;
    unsigned char *t = (unsigned char *)*targetp;
    for (; *s && s < (unsigned char *)endsource && t < (unsigned char *)endtarget-5; ++s)
    {
        unsigned int c = *s;
        switch (c)
        {
        case '\"' : *(t++) = '\\'; *(t++) = '\"'; break;
        case '\\' : *(t++) = '\\'; *(t++) = '\\'; break;
        case '\n' : *(t++) = '\\'; *(t++) = 'n'; break;
        case '\r' : *(t++) = '\\'; *(t++) = 'r'; break;
        case '\f' : *(t++) = '\\'; *(t++) = 'f'; break;
        case '\a' : *(t++) = '\\'; *(t++) = 'a'; break;
        case '\t' : *(t++) = '\\'; *(t++) = 't'; break;

        default :
            c = onecodepoint(&s);
            // Ready to externalize
            if (c >= ' ' && c <= '~')
            {
                *(t++) = c;
            }
            else if (c <= 0x7F) // non-printable 7 bit characters printed as octal.
            {
                *(t++) = '\\'; *(t++) = '0' + ((c>>6)&0x7); *(t++) = '0' + ((c>>3)&0x7); *(t++) = '0' + (c&0x7);
            }
            else if (c <= 0xFFFF) // most Unicode escapes
            {
                *(t++) = '\\'; *(t++) = 'u';
                *(t++) = HexDigits[(c>>12)&0xF]; *(t++) = HexDigits[(c>>8)&0xF]; *(t++) = HexDigits[(c>>4)&0xF]; *(t++) = HexDigits[c&0xF];
            }
            else // extreme Unicode
            {
                *(t++) = '\\'; *(t++) = 'U';
                *(t++) = HexDigits[(c>>28)&0xF]; *(t++) = HexDigits[(c>>24)&0xF]; *(t++) = HexDigits[(c>>20)&0xF]; *(t++) = HexDigits[(c>>16)&0xF];
                *(t++) = HexDigits[(c>>12)&0xF]; *(t++) = HexDigits[(c>>8)&0xF]; *(t++) = HexDigits[(c>>4)&0xF]; *(t++) = HexDigits[c&0xF];
            }
        }
    }
    *sourcep = (char*)s;
    *targetp = (char*)t;
}


const char* makeEscapedC(const char* src)
{
    size_t src_length = strlen(src);
    size_t tmp_length = src_length*10+3; // enough space even if all are quotes!
    char *tmp = (char *) malloc(tmp_length+1);
    char *s = (char*)src;
    char *t = tmp;
    *(t++) = '"';
    escape(&s, &t, ((char*)src)+src_length, tmp+tmp_length-2);
    *(t++) = '"';
    *(t++) = '\0';
    return tmp;
}

std::string makeEscaped(const std::string& src)
{
	const char* escaped = makeEscapedC(src.c_str());
    std::string result(escaped);
    free((void*) escaped);
    return result;
}

tosca::string makeEscaped(const tosca::string& src)
{
	const char* escaped = makeEscapedC(src.c_str());
    tosca::string result(escaped, src.get_allocator());
    free((void*) escaped);
    return result;
}

/**
 * Mangle the given name to be a valid Java/C/C++ identifier
 */
std::string makeMangle(const std::string& src)
{
    std::string::size_type length = src.size();
    std::string mangled(src);
    for (std::string::size_type i = 0; i < length; ++i)
    {
        char c = src[i];
        mangled[i] = (c == '/' ? '_' : c);
    }
    return mangled;
}

tosca::string makeMangle(const tosca::string& src)
{
    tosca::string::size_type length = src.size();
    tosca::string mangled(src);
    for (tosca::string::size_type i = 0; i < length; ++i)
    {
        char c = src[i];
        mangled[i] = (c == '/' ? '_' : c);
    }
    return mangled;
}


// Convert escaped string characters (without quotes) to UTF-8 form.
// All characters in *sourcep are converted into characters starting at *targetp,
// not going beyond endtarget. Updates *sourcep and *targetp.
static
void rescape(char **sourcep, char **targetp, char *endsource, char *endtarget)
{
    unsigned char *s = (unsigned char *)*sourcep;
    unsigned char *t = (unsigned char *)*targetp;
    for (; *s && s < (unsigned char *)endsource && t < (unsigned char *)endtarget; ++s)
    {
        unsigned int c = *s;
        if (c == '\\')
        {
            switch (c = *(++s))
            {
            case 'a' : c =  '\n'; break;
            case 't' : c =  '\t'; break;
            case 'r' : c =  '\r'; break;
            case 'f' : c =  '\f'; break;
            case 'n' : c =  '\n'; break;
            case '0' : case '1' : case '2' : case '3' : case '4' : case '5' : case '6' : case '7' : { // octal escape \OOO
                c = (*s - '0'); unsigned char *e = s + 3;
                while (++s < e && '0' <= *s && *s <= '7') c = (c<<3) + (*s - '0');
                s--;
                break;
            }
            case 'u' :
            case 'U' : { // hex Unicode escape \uXXXX and \UXXXXXXXX
                unsigned char *e = s + (c == 'u' ? 5 : 9);
                c = 0;
                while (++s < e)
                {
                    switch (*s)
                    {
                    case '0' : case '1' : case '2' : case '3' : case '4' :
                    case '5' : case '6' : case '7' : case '8' : case '9' :
                        c = (c<<4) + (*s - '0');
                        break;
                    case 'a' : case 'b' : case 'c' : case 'd' : case 'e' : case 'f' :
                        c = (c<<4) + (*s - 'a' + 10);
                        break;
                    case 'A' : case 'B' : case 'C' : case 'D' : case 'E' : case 'F' :
                        c = (c<<4) + (*s - 'A' + 10);
                        break;
                    default : e = s; // hack to break loop early
                    }
                }
                s--;
                break;
            }
            default :
                c = onecodepoint(&s);
            }
        }
        if (c == 0) // 'modified UTF-8' avoids \0 in string
        {
            *(t++) = 0xC0;
            *(t++) = 0x80;
        }
        else if (c <= 0x7F) // 7 bit: U+0000 U+007F 1 0xxxxxxx
        {
            *(t++) = c;
        }
        else if (c <= 0x7FF) // 11 bit: U+0080 U+07FF 2 110xxxxx 10xxxxxx
        {
            *(t++) = 0xC0 | (c>>6);
            *(t++) = 0x80 | (c&0x3F);
        }
        else if (c <= 0xFFFF) // 16 bit: U+0800 U+FFFF 3 1110xxxx     10xxxxxx     10xxxxxx
        {
            *(t++) = 0xE0 | (c>>12);
            *(t++) = 0x80 | ((c>>6)&0x3F);
            *(t++) = 0x80 | (c&0x3F);
        }
        else if (c <= 0x1FFFFF) // 21 bit: U+10000 U+1FFFFF 4 11110xxx 10xxxxxx     10xxxxxx     10xxxxxx
        {
            *(t++) = 0xF0 | (c>>18);
            *(t++) = 0x80 | ((c>>12)&0x3F);
            *(t++) = 0x80 | ((c>>6)&0x3F);
            *(t++) = 0x80 | (c&0x3F);
        }
        else if (c <= 0x3FFFFFF) // 26 bit: U+200000 U+3FFFFFF 5 111110xx     10xxxxxx     10xxxxxx     10xxxxxx     10xxxxxx
        {
            *(t++) = 0xF8 | (c>>24);
            *(t++) = 0x80 | ((c>>18)&0x3F);
            *(t++) = 0x80 | ((c>>12)&0x3F);
            *(t++) = 0x80 | ((c>>6)&0x3F);
            *(t++) = 0x80 | (c&0x3F);
        }
        else if (c <= 0x7FFFFFFF) // 31 bit: U+4000000     U+7FFFFFFF 6 1111110x     10xxxxxx     10xxxxxx     10xxxxxx     10xxxxxx     10xxxxxx
        {
            *(t++) = 0xFC | (c>>30);
            *(t++) = 0x80 | ((c>>24)&0x3F);
            *(t++) = 0x80 | ((c>>18)&0x3F);
            *(t++) = 0x80 | ((c>>12)&0x3F);
            *(t++) = 0x80 | ((c>>6)&0x3F);
            *(t++) = 0x80 | (c&0x3F);
        }
    }
    *sourcep = (char*)s;
    *targetp = (char*)t;
}

std::string makeRescaped(const std::string& ssrc, bool trim)
{
	size_t len = ssrc.length();
	if (len == 0)
		return "";

	const char* src = (char*) ssrc.c_str();

    char *s1 = (char*)src;
    if (trim)
    {
    	while (isspace(*s1))
    		++s1; // trim front spaces
    }
    char *s2 = (char*)src + len;
    if (trim)
    {
    	while (isspace(*(s2-1)) && s1<s2)
    		--s2; // trim back spaces
    }
    if ((*s1 == '"' || *s1 == '\'') && *s1 == *(s2-1) && s1+2 <= s2)
    {
    	// trim quotes
    	++s1;
    	--s2;
    }
    size_t z = s2 - s1;
    if (z == 0)
        return (char *) "";
    char *tmp = (char*) alloca(z+1);
    char *t = tmp;
    rescape(&s1, &t, s2, tmp+z);
    *(t++) = '\0';
    size_t dstz = t - tmp;

    std::string dst(tmp);
    return dst;
}

/* Convert double to string using 15 precision */
extern tosca::string double15ToString(const tosca::Context& ctx, double value)
{
	char buffer[128]; // more than enough
	snprintf(buffer, 128, "%.15G", value);
	tosca::string result(buffer, ctx.allocChar);
	return result;
}
