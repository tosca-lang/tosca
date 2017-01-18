// Copyright (c) 2017 IBM Corporation.

#include <hashpool.h>
#include "term.h"

using namespace tosca;


StringTerm& HashPool::newPooledStringTerm(const std::string& str)
{
	static std::unordered_map<std::string, _CStringTerm> strpool;

	auto search = strpool.find(str);
	if (search == strpool.end())
	{
		_CStringTerm entry(str, true);
		strpool.insert({str, entry});
		return strpool[str];
	}
	return search->second;
}
