// Copyright (c) 2016 IBM Corporation.

#ifndef LANGUAGE_EXTERN_SIGS_H
#define LANGUAGE_EXTERN_SIGS_H

#include "ts.h"
#include "core_types.h"

template <typename a>
tosca::StringTerm& PrintTerm(tosca::Context& ctx, tosca::StringTerm& category, a& term);

template <typename a>
a& ParseResource(tosca::Context& ctx, tosca::StringTerm& category, tosca::StringTerm& filename);

template <typename a, typename b>
b& Save(tosca::Context& ctx, tosca::StringTerm& category, tosca::StringTerm& filename, a& term,
                tosca::MapTerm<tosca::StringTerm, tosca::StringTerm>& props, b& result);

template <typename a>
a& ParseText(tosca::Context& ctx, tosca::StringTerm& category, tosca::StringTerm& content);


/* @return the last time the given file located at the given location has been modified */
tosca::DoubleTerm& FileLastModified(tosca::Context& ctx, tosca::StringTerm& url);

/* @return TRUE if the two files are identical */
Bool& FileSame(tosca::Context& ctx, tosca::StringTerm& url1, tosca::StringTerm& url2);

#endif
