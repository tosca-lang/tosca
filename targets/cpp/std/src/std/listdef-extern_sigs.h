// Copyright (c) 2017 IBM Corporation.
#ifndef LISTDEF_EXTERN_SIGS_H_
#define LISTDEF_EXTERN_SIGS_H_

#include "ts.h"
#include "core_types.h"
#include "listdef_types.h"
#include "pairdef_types.h"

template <typename a>
PPair<Option<a>, tosca::DoubleTerm>& PickFirstAt(tosca::Context& ctx, List<a>& list, tosca::DoubleTerm& idx, Closure1<Bool, a>& filter);

template <typename a>
Option<a>& PickFirst(tosca::Context& ctx, List<a>& list, Closure1<Bool, a>& filter);

template <typename a>
a& ReversePick(tosca::Context& ctx, tosca::DoubleTerm& idx, List<a>& list);

template <typename a, typename b>
b& Foldl(tosca::Context& ctx, Closure2<b, a, b>& body, b& value, List<a>& list);

template <typename a, typename b>
b& FoldlI(tosca::Context& ctx, Closure2<PPair<Bool, b>, a, b>& body, b& value, List<a>& list);

#endif
