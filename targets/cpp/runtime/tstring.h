// Copyright (c) 2017 IBM Corporation.
#ifndef _TSTRING_H
#define _TSTRING_H

#include <string>
#include <functional>

#include "talloc.h"

namespace tosca {

	typedef std::basic_string<char, std::char_traits<char>, tosca::Allocator<char>> string;

}


namespace std {

	// tosca::string

	template<>
    struct hash<tosca::string>
    {
    public:
        size_t operator()(const tosca::string& str) const
        {
        	const char* cstr = str.c_str();

        	// Implementation of FNV hash for 64-bit size_
        	size_t hash = 2166136261UL;
        	while (*cstr)
        	{
        		hash ^= static_cast<size_t>(*cstr);
        		hash *= static_cast<size_t>(1099511628211ULL);
        		cstr ++;
        	}
        	return hash;
        }
    };

    template<>
    struct equal_to<tosca::string>
    {
    public:
        bool operator()(const tosca::string& lhs, const tosca::string& rhs) const
        {
            return lhs == rhs;
        }
    };
//
//    // const tosca::string
//
//    template<>
//	struct hash<const tosca::string>
//	{
//	public:
//		size_t operator()(const tosca::string& str) const
//		{
//			const char* cstr = str.c_str();
//
//			// Implementation of FNV hash for 64-bit size_
//			size_t hash = 2166136261UL;
//			while (cstr)
//			{
//				hash ^= static_cast<size_t>(*cstr++);
//				hash *= static_cast<size_t>(1099511628211ULL);
//			}
//			return hash;
//		}
//	};
//
//	template<>
//	struct equal_to<const tosca::string>
//	{
//	public:
//		bool operator()(const tosca::string* lhs, const tosca::string* rhs) const
//		{
//			return lhs == rhs || !std::strcmp(lhs->c_str(), rhs->c_str());
//		}
//	};

}

#endif
