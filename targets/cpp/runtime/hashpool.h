// Copyright (c) 2017 IBM Corporation.
#ifndef HASHPOOL_H
#define HASHPOOL_H

/* Simple hash pool */
#include <string>
#include <unordered_map>

namespace tosca {

	// Forward declarations
	class StringTerm;

	class HashPool
	{
	public:

		/* Create pooled StringTerm */
		static StringTerm& newPooledStringTerm(const std::string&& str);

	private:
		/* String pool */
		static std::unordered_map<std::string, StringTerm*> strpool;

	};

}

#endif
