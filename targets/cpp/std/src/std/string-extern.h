// Copyright (c) 2016 IBM Corporation.
#ifndef _STRING_EXTERN
#define _STRING_EXTERN

class _StringTerm;
class _Context;
class _DoubleTerm;
class _Bool;

extern _StringTerm& AfterFirst(_Context&, _StringTerm&, _StringTerm&);

extern _StringTerm& BeforeFirst(_Context&, _StringTerm&, _StringTerm&);

extern _Bool& StringEqual(_Context&, _StringTerm&, _StringTerm&);

extern _StringTerm& ConcatString(_Context&, _StringTerm&, _StringTerm&);

extern _StringTerm& Escape(_Context&, _StringTerm&);

extern _DoubleTerm& Length(_Context&, _StringTerm&);

extern _StringTerm& Mangle(_Context&, _StringTerm&);

extern _StringTerm& UpCase(_Context&, _StringTerm&);

extern _StringTerm& Replace(_Context&, _StringTerm&, _StringTerm&, _StringTerm&);

extern _Bool& Contains(_Context&, _StringTerm&, _StringTerm&);

extern _StringTerm& DownCase(_Context&, _StringTerm&);

extern _StringTerm& Substring(_Context&, _StringTerm&, _DoubleTerm&, _DoubleTerm&);

#endif
