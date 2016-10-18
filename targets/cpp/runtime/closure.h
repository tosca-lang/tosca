// Copyright (c) 2016 IBM Corporation.
#ifndef _CLOSURE_H
#define _CLOSURE_H

#include "term.h"
#include "ts.h"

using tosca::Ref;

// Provide commonly used closure signatures.
// Really ugly. Rely on macro expansion. Might be feasible to use c++ metaprogramming.

#define COMMA() ,
#define REF() &
#define SEMI() ;
#define EMPTY()
#define LPAR() (
#define RPAR() )
#define ADDREF() .AddRef();
#define RELEASE() .Release();

#define REPEAT0(oc, a, lp, b, os)
#define REPEAT1(oc, a, lp, b, os) REPEAT0(oc, a, lp, b, os) oc() a lp() b ## 1 os()
#define REPEAT2(oc, a, lp, b, os) REPEAT1(oc, a, lp, b, os) oc() a lp() b ## 2 os()
#define REPEAT3(oc, a, lp, b, os) REPEAT2(oc, a, lp, b, os) oc() a lp() b ## 3 os()
#define REPEAT4(oc, a, lp, b, os) REPEAT3(oc, a, lp, b, os) oc() a lp() b ## 4 os()
#define REPEAT5(oc, a, lp, b, os) REPEAT4(oc, a, lp, b, os) oc() a lp() b ## 5 os()
#define REPEAT6(oc, a, lp, b, os) REPEAT5(oc, a, lp, b, os) oc() a lp() b ## 6 os()
#define REPEAT7(oc, a, lp, b, os) REPEAT6(oc, a, lp, b, os) oc() a lp() b ## 7 os()
#define REPEAT8(oc, a, lp, b, os) REPEAT7(oc, a, lp, b, os) oc() a lp() b ## 8 os()
#define REPEAT9(oc, a, lp, b, os) REPEAT8(oc, a, lp, b, os) oc() a lp() b ## 9 os()
#define REPEAT10(oc, a, lp, b, os) REPEAT9(oc, a, lp, b, os) oc() a lp() b ## 10 os()
#define REPEAT11(oc, a, lp, b, os) REPEAT10(oc, a, lp, b, os) oc() a lp() b ## 11 os()
#define REPEAT12(oc, a, lp, b, os) REPEAT11(oc, a, lp, b, os) oc() a lp() b ## 12 os()
#define REPEAT13(oc, a, lp, b, os) REPEAT12(oc, a, lp, b, os) oc() a lp() b ## 13 os()
#define REPEAT14(oc, a, lp, b, os) REPEAT13(oc, a, lp, b, os) oc() a lp() b ## 14 os()
#define REPEAT15(oc, a, lp, b, os) REPEAT14(oc, a, lp, b, os) oc() a lp() b ## 15 os()
#define REPEAT16(oc, a, lp, b, os) REPEAT15(oc, a, lp, b, os) oc() a lp() b ## 16 os()
#define REPEAT17(oc, a, lp, b, os) REPEAT16(oc, a, lp, b, os) oc() a lp() b ## 17 os()
#define REPEAT18(oc, a, lp, b, os) REPEAT17(oc, a, lp, b, os) oc() a lp() b ## 18 os()
#define REPEAT19(oc, a, lp, b, os) REPEAT18(oc, a, lp, b, os) oc() a lp() b ## 19 os()
#define REPEAT20(oc, a, lp, b, os) REPEAT19(oc, a, lp, b, os) oc() a lp() b ## 20 os()
#define REPEAT21(oc, a, lp, b, os) REPEAT20(oc, a, lp, b, os) oc() a lp() b ## 21 os()
#define REPEAT22(oc, a, lp, b, os) REPEAT21(oc, a, lp, b, os) oc() a lp() b ## 22 os()
#define REPEAT23(oc, a, lp, b, os) REPEAT22(oc, a, lp, b, os) oc() a lp() b ## 23 os()
#define REPEAT24(oc, a, lp, b, os) REPEAT23(oc, a, lp, b, os) oc() a lp() b ## 24 os()
#define REPEAT25(oc, a, lp, b, os) REPEAT24(oc, a, lp, b, os) oc() a lp() b ## 25 os()
#define REPEAT26(oc, a, lp, b, os) REPEAT25(oc, a, lp, b, os) oc() a lp() b ## 26 os()
#define REPEAT27(oc, a, lp, b, os) REPEAT26(oc, a, lp, b, os) oc() a lp() b ## 27 os()
#define REPEAT28(oc, a, lp, b, os) REPEAT27(oc, a, lp, b, os) oc() a lp() b ## 28 os()
#define REPEAT29(oc, a, lp, b, os) REPEAT28(oc, a, lp, b, os) oc() a lp() b ## 29 os()
#define REPEAT30(oc, a, lp, b, os) REPEAT29(oc, a, lp, b, os) oc() a lp() b ## 30 os()
#define REPEAT31(oc, a, lp, b, os) REPEAT30(oc, a, lp, b, os) oc() a lp() b ## 31 os()
#define REPEAT32(oc, a, lp, b, os) REPEAT31(oc, a, lp, b, os) oc() a lp() b ## 32 os()
#define REPEAT33(oc, a, lp, b, os) REPEAT32(oc, a, lp, b, os) oc() a lp() b ## 33 os()
#define REPEAT34(oc, a, lp, b, os) REPEAT33(oc, a, lp, b, os) oc() a lp() b ## 34 os()
#define REPEAT35(oc, a, lp, b, os) REPEAT34(oc, a, lp, b, os) oc() a lp() b ## 35 os()
#define REPEAT36(oc, a, lp, b, os) REPEAT35(oc, a, lp, b, os) oc() a lp() b ## 36 os()
#define REPEAT37(oc, a, lp, b, os) REPEAT36(oc, a, lp, b, os) oc() a lp() b ## 37 os()
#define REPEAT38(oc, a, lp, b, os) REPEAT37(oc, a, lp, b, os) oc() a lp() b ## 38 os()
#define REPEAT39(oc, a, lp, b, os) REPEAT38(oc, a, lp, b, os) oc() a lp() b ## 39 os()
#define REPEAT40(oc, a, lp, b, os) REPEAT39(oc, a, lp, b, os) oc() a lp() b ## 40 os()

#define REPEAT2_0(oc, a, b, c, lp, d, rp)
#define REPEAT2_1(oc, a, b, c, lp, d, rp) REPEAT2_0(oc, a, b, c, lp, d, rp) oc() a b ## 1 c lp() d ## 1 rp()
#define REPEAT2_2(oc, a, b, c, lp, d, rp) REPEAT2_1(oc, a, b, c, lp, d, rp) oc() a b ## 2 c lp() d ## 2 rp()
#define REPEAT2_3(oc, a, b, c, lp, d, rp) REPEAT2_2(oc, a, b, c, lp, d, rp) oc() a b ## 3 c lp() d ## 3 rp()
#define REPEAT2_4(oc, a, b, c, lp, d, rp) REPEAT2_3(oc, a, b, c, lp, d, rp) oc() a b ## 4 c lp() d ## 4 rp()
#define REPEAT2_5(oc, a, b, c, lp, d, rp) REPEAT2_4(oc, a, b, c, lp, d, rp) oc() a b ## 5 c lp() d ## 5 rp()
#define REPEAT2_6(oc, a, b, c, lp, d, rp) REPEAT2_5(oc, a, b, c, lp, d, rp) oc() a b ## 6 c lp() d ## 6 rp()
#define REPEAT2_7(oc, a, b, c, lp, d, rp) REPEAT2_6(oc, a, b, c, lp, d, rp) oc() a b ## 7 c lp() d ## 7 rp()
#define REPEAT2_8(oc, a, b, c, lp, d, rp) REPEAT2_7(oc, a, b, c, lp, d, rp) oc() a b ## 8 c lp() d ## 8 rp()
#define REPEAT2_9(oc, a, b, c, lp, d, rp) REPEAT2_8(oc, a, b, c, lp, d, rp) oc() a b ## 9 c lp() d ## 9 rp()
#define REPEAT2_10(oc, a, b, c, lp, d, rp) REPEAT2_9(oc, a, b, c, lp, d, rp) oc() a b ## 10 c lp() d ## 10 rp()
#define REPEAT2_11(oc, a, b, c, lp, d, rp) REPEAT2_10(oc, a, b, c, lp, d, rp) oc() a b ## 11 c lp() d ## 11 rp()
#define REPEAT2_12(oc, a, b, c, lp, d, rp) REPEAT2_11(oc, a, b, c, lp, d, rp) oc() a b ## 12 c lp() d ## 12 rp()
#define REPEAT2_13(oc, a, b, c, lp, d, rp) REPEAT2_12(oc, a, b, c, lp, d, rp) oc() a b ## 13 c lp() d ## 13 rp()
#define REPEAT2_14(oc, a, b, c, lp, d, rp) REPEAT2_13(oc, a, b, c, lp, d, rp) oc() a b ## 14 c lp() d ## 14 rp()
#define REPEAT2_15(oc, a, b, c, lp, d, rp) REPEAT2_14(oc, a, b, c, lp, d, rp) oc() a b ## 15 c lp() d ## 15 rp()
#define REPEAT2_16(oc, a, b, c, lp, d, rp) REPEAT2_15(oc, a, b, c, lp, d, rp) oc() a b ## 16 c lp() d ## 16 rp()
#define REPEAT2_17(oc, a, b, c, lp, d, rp) REPEAT2_16(oc, a, b, c, lp, d, rp) oc() a b ## 17 c lp() d ## 17 rp()
#define REPEAT2_18(oc, a, b, c, lp, d, rp) REPEAT2_17(oc, a, b, c, lp, d, rp) oc() a b ## 18 c lp() d ## 18 rp()
#define REPEAT2_19(oc, a, b, c, lp, d, rp) REPEAT2_18(oc, a, b, c, lp, d, rp) oc() a b ## 19 c lp() d ## 19 rp()
#define REPEAT2_20(oc, a, b, c, lp, d, rp) REPEAT2_19(oc, a, b, c, lp, d, rp) oc() a b ## 20 c lp() d ## 20 rp()
#define REPEAT2_21(oc, a, b, c, lp, d, rp) REPEAT2_20(oc, a, b, c, lp, d, rp) oc() a b ## 21 c lp() d ## 21 rp()
#define REPEAT2_22(oc, a, b, c, lp, d, rp) REPEAT2_21(oc, a, b, c, lp, d, rp) oc() a b ## 22 c lp() d ## 22 rp()
#define REPEAT2_23(oc, a, b, c, lp, d, rp) REPEAT2_22(oc, a, b, c, lp, d, rp) oc() a b ## 23 c lp() d ## 23 rp()
#define REPEAT2_24(oc, a, b, c, lp, d, rp) REPEAT2_23(oc, a, b, c, lp, d, rp) oc() a b ## 24 c lp() d ## 24 rp()
#define REPEAT2_25(oc, a, b, c, lp, d, rp) REPEAT2_24(oc, a, b, c, lp, d, rp) oc() a b ## 25 c lp() d ## 25 rp()
#define REPEAT2_26(oc, a, b, c, lp, d, rp) REPEAT2_25(oc, a, b, c, lp, d, rp) oc() a b ## 26 c lp() d ## 26 rp()
#define REPEAT2_27(oc, a, b, c, lp, d, rp) REPEAT2_26(oc, a, b, c, lp, d, rp) oc() a b ## 27 c lp() d ## 27 rp()
#define REPEAT2_28(oc, a, b, c, lp, d, rp) REPEAT2_27(oc, a, b, c, lp, d, rp) oc() a b ## 28 c lp() d ## 28 rp()
#define REPEAT2_29(oc, a, b, c, lp, d, rp) REPEAT2_28(oc, a, b, c, lp, d, rp) oc() a b ## 29 c lp() d ## 29 rp()
#define REPEAT2_30(oc, a, b, c, lp, d, rp) REPEAT2_29(oc, a, b, c, lp, d, rp) oc() a b ## 30 c lp() d ## 30 rp()
#define REPEAT2_31(oc, a, b, c, lp, d, rp) REPEAT2_30(oc, a, b, c, lp, d, rp) oc() a b ## 31 c lp() d ## 31 rp()
#define REPEAT2_32(oc, a, b, c, lp, d, rp) REPEAT2_31(oc, a, b, c, lp, d, rp) oc() a b ## 32 c lp() d ## 32 rp()
#define REPEAT2_33(oc, a, b, c, lp, d, rp) REPEAT2_32(oc, a, b, c, lp, d, rp) oc() a b ## 33 c lp() d ## 33 rp()
#define REPEAT2_34(oc, a, b, c, lp, d, rp) REPEAT2_33(oc, a, b, c, lp, d, rp) oc() a b ## 34 c lp() d ## 34 rp()
#define REPEAT2_35(oc, a, b, c, lp, d, rp) REPEAT2_34(oc, a, b, c, lp, d, rp) oc() a b ## 35 c lp() d ## 35 rp()
#define REPEAT2_36(oc, a, b, c, lp, d, rp) REPEAT2_35(oc, a, b, c, lp, d, rp) oc() a b ## 36 c lp() d ## 36 rp()
#define REPEAT2_37(oc, a, b, c, lp, d, rp) REPEAT2_36(oc, a, b, c, lp, d, rp) oc() a b ## 37 c lp() d ## 37 rp()
#define REPEAT2_38(oc, a, b, c, lp, d, rp) REPEAT2_37(oc, a, b, c, lp, d, rp) oc() a b ## 38 c lp() d ## 38 rp()
#define REPEAT2_39(oc, a, b, c, lp, d, rp) REPEAT2_38(oc, a, b, c, lp, d, rp) oc() a b ## 39 c lp() d ## 39 rp()
#define REPEAT2_40(oc, a, b, c, lp, d, rp) REPEAT2_39(oc, a, b, c, lp, d, rp) oc() a b ## 40 c lp() d ## 40 rp()

#define TYPENAME(a) REPEAT ## a(COMMA, typename,EMPTY,P,EMPTY)
#define TYPEARG(a) REPEAT ## a(COMMA,,EMPTY, P,EMPTY)
#define TYPEARGREF(a) REPEAT ## a(COMMA,,EMPTY, P, REF)
#define CTYPENAME(a) REPEAT ## a(COMMA, typename,EMPTY,C,EMPTY)
#define CTYPEARG(a) REPEAT ## a(COMMA,,EMPTY, C,EMPTY)
#define CTYPEARGREF(a) REPEAT ## a(COMMA,,EMPTY, C, REF)

#define ARG(a) REPEAT ## a(COMMA,,EMPTY, p,EMPTY)
#define CPTR(a) REPEAT ## a(COMMA,Ref&,EMPTY, c,EMPTY)
#define CPTRARG(a) REPEAT ## a(COMMA,,EMPTY, c,EMPTY)
#define CPTREVALARG(a) REPEAT ## a(COMMA,,EMPTY, cptr,EMPTY)
#define CPTREF(a) REPEAT ## a(EMPTY,, EMPTY,cptr,ADDREF)
#define CPTRFREE(a) REPEAT ## a(EMPTY,, EMPTY,cptr,RELEASE)

#define PARAM(a) REPEAT2_ ## a(COMMA,, P, &,EMPTY, p, EMPTY)
#define CPARAM(a) REPEAT2_ ## a(COMMA,, C, &,EMPTY, c, EMPTY)
#define INITCPTR(a) REPEAT2_ ## a(COMMA,, cptr,,LPAR, c, RPAR)
#define DEFCPTR(a) REPEAT2_ ## a(EMPTY,, C, &, EMPTY, cptr, SEMI)

#define BASE_CLOSURE(free)                                                                      \
  template<typename R TYPENAME(free) >                                                          \
  class Closure ## free : public tosca::Term                                                    \
  {                                                                                             \
  public:                                                                                       \
    virtual R& Eval(tosca::Context& ctx PARAM(free)) = 0;                                       \
  };                                                                                            \



#define CLOSURE_CAPTURE(free, capture, arity)                                                   \
  template<typename R TYPENAME(free) CTYPENAME(capture) >                                       \
  class Closure ## free ## C ## capture : public Closure ## free< R TYPEARG(free) >             \
  {                                                                                             \
   public:                                                                                      \
     typedef R& (*ftype)(tosca::Context& TYPEARGREF(free) CTYPEARGREF(capture));                \
     Closure ## free ## C  ## capture (ftype f CPARAM(capture) ) :                              \
        function(f), freeCptrs(true) INITCPTR(capture)                                          \
      {}                                                                                        \
                                                                                                \
     ~Closure ## free ## C ## capture ()                                                        \
     {                                                                                          \
       if (freeCptrs)                                                                           \
       {                                                                                        \
            CPTRFREE(capture)                                                                   \
       }                                                                                        \
     }                                                                                          \
                                                                                                \
    R& Eval(tosca::Context& ctx PARAM(free) )                                                   \
    {                                                                                           \
      if (this->refcount > 1)                                                                   \
      {                                                                                         \
        CPTREF(capture)                                                                         \
      }                                                                                         \
      else                                                                                      \
      {                                                                                         \
        freeCptrs = false;                                                                      \
      }                                                                                         \
      this->Release();                                                                          \
      return function(ctx ARG(free) CPTREVALARG(capture) );                                     \
    }                                                                                           \
                                                                                                \
    private:                                                                                    \
      ftype function;                                                                           \
      bool freeCptrs;                                                                           \
      DEFCPTR(capture)                                                                          \
  };                                                                                            \
                                                                                                \
  template<typename R TYPENAME(free) CTYPENAME(capture)>                                        \
  Closure ## free <R TYPEARG(free)> & closure(R& (*function)(tosca::Context& TYPEARGREF(free) CTYPEARGREF(capture)) CPARAM(capture) )  \
  {                                                                                             \
    return *(new Closure ## free ## C ## capture <R TYPEARG(free) CTYPEARG(capture) >(function CPTRARG(capture) )); \
  }

#define THUNK(capture)                                                                            \
  template<typename R CTYPENAME(capture)>                                                         \
  Closure0<R>& thunk(R& (*function)(tosca::Context& CTYPEARGREF(capture)) CPARAM(capture) )       \
  {                                                                                               \
    return *(new Closure0C ## capture <R CTYPEARG(capture)>(function CPTRARG(capture) ));         \
  }

BASE_CLOSURE(0)
CLOSURE_CAPTURE(0, 0, 0) THUNK(0)
CLOSURE_CAPTURE(0, 1, 1) THUNK(1)
CLOSURE_CAPTURE(0, 2, 2) THUNK(2)
CLOSURE_CAPTURE(0, 3, 3) THUNK(3)
CLOSURE_CAPTURE(0, 4, 4) THUNK(4)
CLOSURE_CAPTURE(0, 5, 5) THUNK(5)
CLOSURE_CAPTURE(0, 6, 6) THUNK(6)
CLOSURE_CAPTURE(0, 7, 7) THUNK(7)
CLOSURE_CAPTURE(0, 8, 8) THUNK(8)
CLOSURE_CAPTURE(0, 9, 9) THUNK(9)
CLOSURE_CAPTURE(0, 10, 10) THUNK(10)
CLOSURE_CAPTURE(0, 11, 11) THUNK(11)
CLOSURE_CAPTURE(0, 12, 12) THUNK(12)
CLOSURE_CAPTURE(0, 13, 13) THUNK(13)
CLOSURE_CAPTURE(0, 14, 14) THUNK(14)
CLOSURE_CAPTURE(0, 15, 15) THUNK(15)
CLOSURE_CAPTURE(0, 16, 16) THUNK(16)
CLOSURE_CAPTURE(0, 17, 17) THUNK(17)
CLOSURE_CAPTURE(0, 18, 18) THUNK(18)
CLOSURE_CAPTURE(0, 19, 19) THUNK(19)
CLOSURE_CAPTURE(0, 20, 20) THUNK(20)
CLOSURE_CAPTURE(0, 21, 21) THUNK(21)
CLOSURE_CAPTURE(0, 22, 22) THUNK(22)
CLOSURE_CAPTURE(0, 23, 23) THUNK(23)
CLOSURE_CAPTURE(0, 24, 24) THUNK(24)
CLOSURE_CAPTURE(0, 25, 25) THUNK(25)
CLOSURE_CAPTURE(0, 26, 26) THUNK(26)
CLOSURE_CAPTURE(0, 27, 27) THUNK(27)
CLOSURE_CAPTURE(0, 28, 28) THUNK(28)
CLOSURE_CAPTURE(0, 29, 29) THUNK(29)
CLOSURE_CAPTURE(0, 30, 30) THUNK(30)

BASE_CLOSURE(1)
CLOSURE_CAPTURE(1, 0, 1)
CLOSURE_CAPTURE(1, 1, 2)
CLOSURE_CAPTURE(1, 2, 3)
CLOSURE_CAPTURE(1, 3, 4)
CLOSURE_CAPTURE(1, 4, 5)
CLOSURE_CAPTURE(1, 5, 6)
CLOSURE_CAPTURE(1, 6, 7)
CLOSURE_CAPTURE(1, 7, 8)
CLOSURE_CAPTURE(1, 8, 9)
CLOSURE_CAPTURE(1, 9, 10)
CLOSURE_CAPTURE(1, 10, 11)
CLOSURE_CAPTURE(1, 11, 12)
CLOSURE_CAPTURE(1, 12, 13)
CLOSURE_CAPTURE(1, 13, 14)
CLOSURE_CAPTURE(1, 14, 15)
CLOSURE_CAPTURE(1, 15, 16)
CLOSURE_CAPTURE(1, 16, 17)
CLOSURE_CAPTURE(1, 17, 18)
CLOSURE_CAPTURE(1, 18, 19)
CLOSURE_CAPTURE(1, 19, 20)

BASE_CLOSURE(2)
CLOSURE_CAPTURE(2, 0, 2)
CLOSURE_CAPTURE(2, 1, 3)
CLOSURE_CAPTURE(2, 2, 4)
CLOSURE_CAPTURE(2, 3, 5)
CLOSURE_CAPTURE(2, 4, 6)
CLOSURE_CAPTURE(2, 5, 7)
CLOSURE_CAPTURE(2, 6, 8)
CLOSURE_CAPTURE(2, 7, 9)
CLOSURE_CAPTURE(2, 8, 10)
CLOSURE_CAPTURE(2, 9, 11)
CLOSURE_CAPTURE(2, 10, 12)
CLOSURE_CAPTURE(2, 11, 13)
CLOSURE_CAPTURE(2, 12, 14)
CLOSURE_CAPTURE(2, 13, 15)
CLOSURE_CAPTURE(2, 14, 16)
CLOSURE_CAPTURE(2, 15, 17)

BASE_CLOSURE(3)
CLOSURE_CAPTURE(3, 0, 3)
CLOSURE_CAPTURE(3, 1, 4)
CLOSURE_CAPTURE(3, 2, 5)
CLOSURE_CAPTURE(3, 3, 6)
CLOSURE_CAPTURE(3, 4, 7)
CLOSURE_CAPTURE(3, 5, 8)
CLOSURE_CAPTURE(3, 6, 9)
CLOSURE_CAPTURE(3, 7, 10)
CLOSURE_CAPTURE(3, 8, 11)
CLOSURE_CAPTURE(3, 9, 12)
CLOSURE_CAPTURE(3, 10, 13)
CLOSURE_CAPTURE(3, 11, 14)
CLOSURE_CAPTURE(3, 12, 15)
CLOSURE_CAPTURE(3, 13, 16)
CLOSURE_CAPTURE(3, 14, 17)
CLOSURE_CAPTURE(3, 15, 18)
CLOSURE_CAPTURE(3, 16, 19)
CLOSURE_CAPTURE(3, 17, 20)
CLOSURE_CAPTURE(3, 18, 21)
CLOSURE_CAPTURE(3, 19, 22)
CLOSURE_CAPTURE(3, 20, 23)
CLOSURE_CAPTURE(3, 21, 24)
CLOSURE_CAPTURE(3, 22, 25)
CLOSURE_CAPTURE(3, 23, 26)
CLOSURE_CAPTURE(3, 24, 27)
CLOSURE_CAPTURE(3, 25, 28)
CLOSURE_CAPTURE(3, 26, 29)
CLOSURE_CAPTURE(3, 27, 30)
CLOSURE_CAPTURE(3, 28, 31)
CLOSURE_CAPTURE(3, 29, 32)
CLOSURE_CAPTURE(3, 30, 33)
CLOSURE_CAPTURE(3, 31, 34)
CLOSURE_CAPTURE(3, 32, 35)
CLOSURE_CAPTURE(3, 33, 36)
CLOSURE_CAPTURE(3, 34, 37)
CLOSURE_CAPTURE(3, 35, 38)
CLOSURE_CAPTURE(3, 36, 39)
CLOSURE_CAPTURE(3, 37, 40)

BASE_CLOSURE(4)
CLOSURE_CAPTURE(4, 0, 4)
CLOSURE_CAPTURE(4, 1, 5)
CLOSURE_CAPTURE(4, 2, 6)
CLOSURE_CAPTURE(4, 3, 7)
CLOSURE_CAPTURE(4, 4, 8)
CLOSURE_CAPTURE(4, 5, 9)
CLOSURE_CAPTURE(4, 6, 10)
CLOSURE_CAPTURE(4, 7, 11)
CLOSURE_CAPTURE(4, 8, 12)
CLOSURE_CAPTURE(4, 9, 13)
CLOSURE_CAPTURE(4, 10, 14)
CLOSURE_CAPTURE(4, 11, 15)
CLOSURE_CAPTURE(4, 12, 16)
CLOSURE_CAPTURE(4, 13, 17)
CLOSURE_CAPTURE(4, 14, 18)
CLOSURE_CAPTURE(4, 15, 19)
CLOSURE_CAPTURE(4, 16, 20)
CLOSURE_CAPTURE(4, 17, 21)
CLOSURE_CAPTURE(4, 18, 22)

BASE_CLOSURE(5)
CLOSURE_CAPTURE(5, 0, 5)
CLOSURE_CAPTURE(5, 1, 6)
CLOSURE_CAPTURE(5, 2, 7)
CLOSURE_CAPTURE(5, 3, 8)
CLOSURE_CAPTURE(5, 4, 9)
CLOSURE_CAPTURE(5, 5, 10)
CLOSURE_CAPTURE(5, 6, 11)
CLOSURE_CAPTURE(5, 7, 12)
CLOSURE_CAPTURE(5, 8, 13)
CLOSURE_CAPTURE(5, 9, 14)
CLOSURE_CAPTURE(5, 10, 15)
CLOSURE_CAPTURE(5, 11, 16)
CLOSURE_CAPTURE(5, 12, 17)
CLOSURE_CAPTURE(5, 13, 18)
CLOSURE_CAPTURE(5, 14, 19)
CLOSURE_CAPTURE(5, 15, 20)
CLOSURE_CAPTURE(5, 16, 21)
CLOSURE_CAPTURE(5, 17, 22)
CLOSURE_CAPTURE(5, 18, 23)


BASE_CLOSURE(6)
CLOSURE_CAPTURE(6, 0, 6)
CLOSURE_CAPTURE(6, 1, 7)
CLOSURE_CAPTURE(6, 2, 8)
CLOSURE_CAPTURE(6, 3, 9)
CLOSURE_CAPTURE(6, 4, 10)
CLOSURE_CAPTURE(6, 5, 11)
CLOSURE_CAPTURE(6, 6, 12)
CLOSURE_CAPTURE(6, 7, 13)
CLOSURE_CAPTURE(6, 8, 14)
CLOSURE_CAPTURE(6, 9, 15)
CLOSURE_CAPTURE(6, 10, 16)
CLOSURE_CAPTURE(6, 11, 17)
CLOSURE_CAPTURE(6, 12, 18)
CLOSURE_CAPTURE(6, 13, 19)
CLOSURE_CAPTURE(6, 14, 20)
CLOSURE_CAPTURE(6, 15, 21)
CLOSURE_CAPTURE(6, 16, 22)
CLOSURE_CAPTURE(6, 17, 23)

BASE_CLOSURE(7)
CLOSURE_CAPTURE(7, 0, 7)
CLOSURE_CAPTURE(7, 1, 8)
CLOSURE_CAPTURE(7, 2, 9)
CLOSURE_CAPTURE(7, 3, 10)
CLOSURE_CAPTURE(7, 4, 11)
CLOSURE_CAPTURE(7, 5, 12)
CLOSURE_CAPTURE(7, 6, 13)
CLOSURE_CAPTURE(7, 7, 14)
CLOSURE_CAPTURE(7, 8, 15)
CLOSURE_CAPTURE(7, 9, 16)
CLOSURE_CAPTURE(7, 10, 17)
CLOSURE_CAPTURE(7, 11, 18)
CLOSURE_CAPTURE(7, 12, 19)
CLOSURE_CAPTURE(7, 13, 20)
CLOSURE_CAPTURE(7, 14, 21)
CLOSURE_CAPTURE(7, 15, 22)
CLOSURE_CAPTURE(7, 16, 23)
CLOSURE_CAPTURE(7, 17, 24)


#endif
