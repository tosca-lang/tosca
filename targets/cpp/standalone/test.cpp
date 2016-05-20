// Copyright (c) 2016 IBM Corporation.

/* Define main to run Tests */
#include "ts.h"

extern StringTerm Tests(Context);

int main(int argc, char **argv)
{
    Context ctx = *(new _Context());

    StringTerm result = Tests(ctx);

    std::cout << result.Unbox().value();

    delete &result;
}
