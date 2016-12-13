// Copyright (c) 2016 IBM Corporation.
#include "core-extern.h"

#include  <cstdlib>
#include  <vector>
#include "core.h"
#include "listdef.h"

using namespace tosca;

StringTerm& GetEnv(Context& ctx, StringTerm& key, StringTerm& def)
{
    char* value = getenv(key.Unbox().c_str());
    key.Release();
    if (value)
    {
        def.Release();
        return newStringTerm(ctx, value);
    }
    return def;
}

Bool& BitSubSetEq(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long lleft = left.Unbox();
    long lright = right.Unbox();
    Bool& result = ((lleft & (~lright)) == 0) ? newTRUE(ctx) : newFALSE(ctx);
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& BitMinus(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long lleft = left.Unbox();
    long lright = right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, lleft & ~lright);
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& BitOr(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long lleft = left.Unbox();
    long lright = right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, lleft | lright);
    left.Release();
    right.Release();
    return result;
}

DoubleTerm& BitAnd(Context& ctx, DoubleTerm& left, DoubleTerm& right)
{
    long lleft = left.Unbox();
    long lright = right.Unbox();
    DoubleTerm& result = newDoubleTerm(ctx, lleft & lright);
    left.Release();
    right.Release();
    return result;
}

bool IsFreeVariableImpl(Context& ctx, const Variable& var, const Term& term)
{
	std::vector<const Term*> stack;
	stack.push_back(&term);
	while (!stack.empty())
	{
		const Term& current = *stack.back();
		stack.pop_back();

		Optional<tosca::Variable> ovar = current.GetGVariable();
		if (ovar)
		{
			if (ovar.value() == var)
				return true;
		}
		else
		{
			for (int subidx = current.Arity() - 1; subidx >= 0; subidx --)
			{
				int binderidx = 0;
				bool skipsub = false;
				while (true)
				{
					Optional<tosca::Variable> binder = current.Binder(subidx, binderidx);
					if (!binder)
						break;

					if (binder.value() == var)
					{
						// binder shadowed the variable: can't be free
						skipsub = true;
						break;
					}

					binderidx ++;
				}

				if (!skipsub)
					stack.push_back(&current.Sub(subidx).value());
			}
		}
	}
	return false;
}
