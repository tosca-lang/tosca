// Copyright (c) 2017 IBM Corporation.

#include <hashpool.h>
#include "term.h"

using namespace tosca;

std::unordered_map<std::string, StringTerm*> HashPool::strpool;

StringTerm& HashPool::newPooledStringTerm(const std::string&& str)
{
	auto search = strpool.find(str);
	if (search == strpool.end())
	{
		strpool[str] = ::new _CStringTerm(str, true);
		return *strpool[str];
	}
	return *search->second;
}
