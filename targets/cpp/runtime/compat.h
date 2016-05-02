// Copyright (c) 2016 IBM Corporation.
#ifndef _COMPAT_H
#define _COMPAT_H

// Various macros/functions helping cross-compilers compatibility
/*
// C++11 nullptr workaround as documented in the C++11 spec.
const class
{
    public:
    template<class T> operator T*() const
    {
        return 0;
    }

    template<class C, class T> operator T C::*() const
    {
        return 0;
    }
private:
    void operator&() const;
} nullptr = {};
*/

#endif
