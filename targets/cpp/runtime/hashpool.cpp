// Copyright (c) 2017 IBM Corporation.

#include <hashpool.h>
#include "term.h"

using namespace tosca;


StringTerm& HashPool::newPooledStringTerm(const std::string&& str)
{
	static std::unordered_map<std::string, StringTerm*> strpool;

	std::string s(str);
	auto search = strpool.find(s);
	if (search == strpool.end())
	{
		strpool[str] = ::new _CStringTerm(str, true);
		return *strpool[str];
	}
	return *search->second;
}
