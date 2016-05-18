// Copyright (c) 2016 IBM Corporation.
#include "ts.h"

_StringTerm& concat(Context ctx, _StringTerm& value, _StringTerm& value2)
{
    return value;
}
_StringTerm& concat3(Context ctx, _StringTerm& value, _StringTerm& value2, _StringTerm& value3)
{
    return value3;
}

_StringTerm& cid(Context ctx, _Closure1<_StringTerm&, _StringTerm&>& callback)
{
    _StringTerm& r = callback.eval(ctx, stringTerm("1"));
     return r;
}

int main(int argc, char **argv)
{
    Context ctx = *(new _Context());
    _StringTerm& r = cid(ctx, closure(&concat,  stringTerm("5")));
    std::cout << r.Unbox().value() << "\n";
    delete &r;

    r = cid(ctx, closure(&concat3, stringTerm("7"), stringTerm("6")));
    std::cout << r.Unbox().value() << "\n";
    delete &r;
}
