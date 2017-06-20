// Copyright (c) 2016 IBM Corporation.
#ifndef _STRING_EXTERN_SIGS_H
#define _STRING_EXTERN_SIGS_H

#include "term.h"
#include "std/listdef_types.h"
#include "std/core_types.h"

// Forward declarations


/* @return the string after the first occurrence of the given first string, or
           the empty string if there is no such occurrences */
extern tosca::StringTerm& AfterFirst(tosca::Context&, tosca::StringTerm&, tosca::StringTerm&);

/* @return the string before the first occurrence of the given first string, or
            the original string if there is no such occurrences */
extern tosca::StringTerm& BeforeFirst(tosca::Context&, tosca::StringTerm&, tosca::StringTerm&);

/* @return `TRUE` if and only if the given strings are equals. */
extern Bool& StringEqual(tosca::Context&, tosca::StringTerm&, tosca::StringTerm&);

/* @return the concatenation of the given strings */
template <typename T1>
tosca::StringTerm& ConcatString(tosca::Context& ctx);

template <typename T1>
tosca::StringTerm& ConcatString(tosca::Context&, T1& str);

template <typename T1, typename ... Ts>
tosca::StringTerm& ConcatString(tosca::Context& ctx, T1& str, Ts&... strs);


extern tosca::StringTerm& Escape(tosca::Context&, tosca::StringTerm&);

extern tosca::DoubleTerm& Length(tosca::Context&, tosca::StringTerm&);

extern tosca::StringTerm& Mangle(tosca::Context&, tosca::StringTerm&);

/* Converts all of the characters of the given string to upper case */
extern tosca::StringTerm& UpCase(tosca::Context&, tosca::StringTerm&);

/* Converts all of the characters of the given string to lower case */
extern tosca::StringTerm& DownCase(tosca::Context&, tosca::StringTerm&);

extern tosca::StringTerm& Replace(tosca::Context&, tosca::StringTerm&, tosca::StringTerm&, tosca::StringTerm&);

extern Bool& Contains(tosca::Context&, tosca::StringTerm&, tosca::StringTerm&);

extern tosca::StringTerm& Substring(tosca::Context&, tosca::StringTerm&, tosca::DoubleTerm&, tosca::DoubleTerm&);

extern tosca::StringTerm& Substring2(tosca::Context&, tosca::StringTerm&, tosca::DoubleTerm&);

extern Bool& MatchRegex(tosca::Context&, tosca::StringTerm&, tosca::StringTerm&);

/* Tests if the given string starts with the specified prefix. */
extern Bool& StartsWith(tosca::Context&, tosca::StringTerm& str, tosca::StringTerm& prefix);

/* Tests if the given string ends with the specified suffix. */
extern Bool& EndsWith(tosca::Context&, tosca::StringTerm& str, tosca::StringTerm& suffix);

/* Trim leading and trailing spaces */
extern tosca::StringTerm& Trim(tosca::Context&, tosca::StringTerm& str);

/* Splits the string around the given separator string.*/
extern List<tosca::StringTerm>& Split(tosca::Context& ctx, tosca::StringTerm& str, tosca::StringTerm& sep);

/* @return the given string with all occurrences of white space collapsed to single ordinary spaces */
extern tosca::StringTerm& Squash(tosca::Context& ctx, tosca::StringTerm& str);

/* @return the index of the first occurrence of `#pattern` in `#string`. */
extern tosca::DoubleTerm& Index(tosca::Context& ctx, tosca::StringTerm& string, tosca::StringTerm& pattern);


#endif
