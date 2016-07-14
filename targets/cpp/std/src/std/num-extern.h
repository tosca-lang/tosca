// Copyright (c) 2016 IBM Corporation.

#ifndef _NUM_EXTERN
#define _NUM_EXTERN

#include "ts.h"

class _Bool;

DoubleTerm Plus(Context ctx, DoubleTerm left, DoubleTerm right);
DoubleTerm Minus(Context ctx, DoubleTerm left, DoubleTerm right);

_Bool& LessThan(Context ctx, DoubleTerm left, DoubleTerm right);
_Bool& GreaterThan(Context ctx, DoubleTerm left, DoubleTerm right);
StringTerm FormatNumber(Context ctx, DoubleTerm num);
StringTerm FormatInteger(Context ctx, DoubleTerm num);
StringTerm FormatDecimal(Context ctx, DoubleTerm num);
DoubleTerm Hex(Context ctx, StringTerm str);

#endif
