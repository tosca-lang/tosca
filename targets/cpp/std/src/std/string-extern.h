// Copyright (c) 2016 IBM Corporation.
#ifndef _STRING_EXTERN
#define _STRING_EXTERN

class StringTerm;
class Context;
class DoubleTerm;
class Bool;

extern StringTerm& AfterFirst(Context&, StringTerm&, StringTerm&);

extern StringTerm& BeforeFirst(Context&, StringTerm&, StringTerm&);

extern Bool& StringEqual(Context&, StringTerm&, StringTerm&);

extern StringTerm& ConcatString(Context&, StringTerm&, StringTerm&);

extern StringTerm& Escape(Context&, StringTerm&);

extern DoubleTerm& Length(Context&, StringTerm&);

extern StringTerm& Mangle(Context&, StringTerm&);

extern StringTerm& UpCase(Context&, StringTerm&);

extern StringTerm& Replace(Context&, StringTerm&, StringTerm&, StringTerm&);

extern Bool& Contains(Context&, StringTerm&, StringTerm&);

extern StringTerm& DownCase(Context&, StringTerm&);

extern StringTerm& Substring(Context&, StringTerm&, DoubleTerm&, DoubleTerm&);

extern StringTerm& Substring2(Context&, StringTerm&, DoubleTerm&);

extern Bool& MatchRegex(Context&, StringTerm&, StringTerm&);


/* Tests if the beginning of the given string starts with the specified prefix. */
extern Bool& StartsWith(Context&, StringTerm& str, StringTerm& prefix);

#endif
