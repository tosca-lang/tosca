// Copyright (c) 2017 IBM Corporation.
#ifndef LISTDEF_EXTERN_H_
#define LISTDEF_EXTERN_H_

#include "std/listdef-extern_sigs.h"
#include "std/core.h"
#include "std/pairdef.h"

template <typename a>
Option<a>& PickFirst(tosca::Context& ctx, List<a>& list, Closure1<Bool, a>& filter)
{
	List<a>* c = &list;
	while (!c->asNil(ctx))
	{
		a& value = c->asCons(ctx).value().getValue1(ctx, true);
		Bool& filtered = tosca::NewRef(filter).Eval(ctx, tosca::NewRef(value));
		if (filtered.asTRUE(ctx))
		{
			filtered.Release();

			value.AddRef();
			list.Release();
			filter.Release();
			return newSOME<a>(ctx, value);
		}
		filtered.Release();
		c = &c->asCons(ctx).value().getValue2(ctx, true);
	}
	list.Release();
	filter.Release();
	return newNONE<a>(ctx);
}

template <typename a>
PPair<Option<a>, tosca::DoubleTerm>& PickFirstAt(tosca::Context& ctx, List<a>& list, tosca::DoubleTerm& idx, Closure1<Bool, a>& filter)
{
	unsigned long i = (unsigned long) idx.Unbox();
	idx.Release();

	List<a>* c = &list;
	while (!c->asNil(ctx))
	{
		a& value = c->asCons(ctx).value().getValue1(ctx, true);
		Bool& filtered = tosca::NewRef(filter).Eval(ctx, tosca::NewRef(value));
		if (filtered.asTRUE(ctx))
		{
			filtered.Release();

			value.AddRef();
			list.Release();
			filter.Release();
			return newPairCons(ctx, newSOME<a>(ctx, value), newDoubleTerm(ctx, (double) i));
		}
		filtered.Release();
		c = &c->asCons(ctx).value().getValue2(ctx, true);
		i++;
	}
	list.Release();
	filter.Release();
	return newPairCons(ctx, newNONE<a>(ctx), newDoubleTerm(ctx, (double) i));
}

/* @return the element at the given idx of the reverse of the given list (starting from 0). */
template <typename a>
a& ReversePick(tosca::Context& ctx, DoubleTerm& idx, List<a>& list)
{
	long i = (long) idx.Unbox();
	idx.Release();

	List<a>* p = &list;
	while (!p->asNil(ctx))
	{
		i --;
		p = &p->asCons(ctx).value().getValue2(ctx, true);
	}
	List<a>* t = &list;
	while (++ i)
		t = &t->asCons(ctx).value().getValue2(ctx, true);

	a& result = t->asCons(ctx).value().getValue1(ctx, true);
	result.AddRef();
	list.Release();
	return result;
}

template <typename a, typename b>
b& Foldl(tosca::Context& ctx, Closure2<b, a, b>& body, b& value, List<a>& list)
{
	List<a>* p = &list;
	b* result = &value;
	while (!p->asNil(ctx))
	{
		a& item = p->asCons(ctx).value().getValue1(ctx, true);
		result = &NewRef(body).Eval(ctx, NewRef(item), *result);
		p = &p->asCons(ctx).value().getValue2(ctx, true);
	}
	body.Release();
	list.Release();
	return *result;
}

template <typename a, typename b>
b& FoldlI(tosca::Context& ctx, Closure2<PPair<Bool, b>, a, b>& body, b& value, List<a>& list)
{
	List<a>* p = &list;
	b* result = &value;
	while (!p->asNil(ctx))
	{
		a& item = p->asCons(ctx).value().getValue1(ctx, true);
		auto& pair = NewRef(body).Eval(ctx, NewRef(item), *result).asPairCons(ctx).value();
		result = &pair.getValue2(ctx, true);
		result->AddRef();
		if (pair.getValue1(ctx, true).asTRUE(ctx))
		{
			pair.Release();
			break;
		}
		pair.Release();
		p = &p->asCons(ctx).value().getValue2(ctx, true);
	}
	body.Release();
	list.Release();
	return *result;
}

#endif
