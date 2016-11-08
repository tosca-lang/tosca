// Copyright (c) 2016 IBM Corporation.

#ifndef APPENDABLE_EXTERN_H
#define APPENDABLE_EXTERN_H

#include "ts.h"

using tosca::StringTerm;
using tosca::Context;


StringTerm& StringToAppendable(Context& ctx, StringTerm& str);
StringTerm& AppendableToString(Context& ctx, StringTerm& appendable);
StringTerm& AppendableAppend(Context& ctx, StringTerm& left, StringTerm& right);



#endif