// Copyright (c) 2016 IBM Corporation.
#include "num-extern.h"

#include <cstdio>
#include "std/core.h"

using namespace tosca;

// integer max and min definitions

/* @brief Internal number to represent integer max based on double's
          precision (mantissa is 53 bits). Note that integer is 
          language specific. In C++ the integer primitive is long 
          long (64 bits). In Java the integer primitive is int 
          (32 bits). */
#define INTEGER_MAX_DBL_PRECISION (1LL<<53)

/* @brief Internal number to represent integer min based on double's
          precision (mantissa is 53 bits). Note that integer is 
          language specific. In C++ the integer primitive is long 
          long (64 bits). In Java the integer primitive is int 
          (32 bits). */
#define INTEGER_MIN_DBL_PRECISION ((1LL<<53) * -1)

DoubleTerm& GetDefine_INTEGER_MAX_DBL_PRECISION(Context& ctx)
{
  return newDoubleTerm(ctx, INTEGER_MAX_DBL_PRECISION);
}

DoubleTerm& GetDefine_INTEGER_MIN_DBL_PRECISION(Context& ctx)
{
  return newDoubleTerm(ctx, INTEGER_MIN_DBL_PRECISION);
}

DoubleTerm& ClipToMaxOrMin(Context& ctx, DoubleTerm& dTerm)
{
  DoubleTerm result;
  double d = dTerm.Unbox();
  if (d > INTEGER_MAX_DBL_PRECISION)
  {
    dTerm.Release();
    return GetDefine_INTEGER_MAX_DBL_PRECISION(ctx);
  }
  else if (d < INTEGER_MIN_DBL_PRECISION)
  {
    dTerm.Release();
    return GetDefine_INTEGER_MIN_DBL_PRECISION(ctx);
  }
  else
  {
    dTerm.Release();
    return newDoubleTerm(ctx, d);
  }
}

Bool& IsWithinIntegerPrecision(Context& ctx, DoubleTerm& dTerm)
{
  double d = dTerm.Unbox();
  if (d > INTEGER_MAX_DBL_PRECISION ||
      d < INTEGER_MIN_DBL_PRECISION)
  {
    dTerm.Release();
    return newFALSE(ctx);
  }
  else
  {
    dTerm.Release();
    return newTRUE(ctx);
  }
}

DoubleTerm& Plus(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    DoubleTerm& result = newDoubleTerm(ctx, left.Unbox() + right.Unbox());
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& Minus(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    DoubleTerm& result = newDoubleTerm(ctx, left.Unbox() - right.Unbox());
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& Times(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    DoubleTerm& result = newDoubleTerm(ctx, left.Unbox() * right.Unbox());
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& Divide(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    double uleft = left.Unbox();
    double uright = right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, uleft / uright);
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& Modulo(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long long uleft = (long long) left.Unbox();
    long long uright = (long long) right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, uleft % uright);
    left.Release();
    right.Release();
    return result;
}


Bool& LessThan(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    double uleft = left.Unbox();
    double uright = right.Unbox();
    Bool& result = uleft < uright ? newTRUE(ctx) : newFALSE(ctx);
    left.Release();
    right.Release();
    return result;
}

Bool& GreaterThan(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    double uleft = left.Unbox();
    double uright = right.Unbox();
    Bool& result = uleft > uright ? newTRUE(ctx) : newFALSE(ctx);
    left.Release();
    right.Release();
    return result;
}

StringTerm& FormatNumber(Context& ctx, DoubleTerm& num)
{
    double unum = num.Unbox();
    num.Release();
    char* str = (char*) alloca((size_t) 32);
    snprintf(str, (size_t) 31, "%G", unum);
    return newStringTerm(ctx, str);
}

StringTerm& FormatInteger(Context& ctx, DoubleTerm& num)
{
    DoubleTerm& unumTerm = ClipToMaxOrMin(ctx, num);
    long long unum = (long long) unumTerm.Unbox();
    unumTerm.Release();
    char* str = (char*) alloca((size_t) 32);
    snprintf(str, (size_t) 31, "%lld", unum);
    return newStringTerm(ctx, str);
}

StringTerm& FormatDecimal(Context& ctx, DoubleTerm& num)
{
    double unum = num.Unbox();
    num.Release();
    char* str = (char*) alloca((size_t) 32);
    snprintf(str, (size_t) 31, "%f", unum);
    return newStringTerm(ctx, str);
}

tosca::DoubleTerm& ToDecimal(tosca::Context& ctx, tosca::StringTerm& str)
{
    double num;
    if (std::sscanf(str.Unbox().c_str(), "%lg", &num) <= 0)
    {
    	std::string s("Illegally formatted decimal: ");
    	s += str.Unbox().c_str();
        throw new std::runtime_error(s);
    }
    str.Release();
    return newDoubleTerm(ctx, num);
}


DoubleTerm& Hex(Context& ctx, StringTerm& hex)
{
    long long num;
    if (std::sscanf(hex.Unbox().c_str(), "%llX", &num) <= 0)
    {
    	std::string s("Illegally formatted hex: ");
    	s += hex.Unbox().c_str();

        throw new std::runtime_error(s);
    }
    hex.Release();
    return newDoubleTerm(ctx, num);
}
