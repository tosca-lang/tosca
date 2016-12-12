#include "ts.h"
#include "term.h"
#include "termprinter.h"
#include "std/listdef.h"

using namespace tosca;


int main(int argc, char **argv) {
    Context& ctx = *(new Context());

    _CStringTermVar& binder = varStringTerm(ctx, "v1");

    List<StringTerm>& lst1 = newCons<StringTerm>(ctx, newStringTerm(ctx, "First"), newCons<StringTerm>(ctx, binder.Use(ctx), newNil<StringTerm>(ctx)));
    List<StringTerm>& lst2 = newCons<StringTerm>(ctx, binder.Use(ctx), lst1);


    StringTerm& replace = newStringTerm(ctx, "Second");

    Term& result = Subst(ctx, lst2, {&binder}, {&replace});

    PT(result);
}
