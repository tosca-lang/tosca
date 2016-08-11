// Copyright (c) 2016 IBM Corporation.
#ifndef _COMPAT_H
#define _COMPAT_H

#include <iostream>
#include <stdexcept>

// C++17: std::optional
template<typename T>
class Optional
{
public:
    static Optional<T> nullopt;

    Optional() : v(0) {}
    Optional(T& val) : v(&val){}

    // explicit conversion operator is not yet implemented in GCC 4.4
    // 
    /*explicit*/ operator bool() const
    {
        return v != 0;
    }

    T& value() const
    {
        if (v)
            return *v;
        throw std::runtime_error("Bad optional access");
    }

private:
    /* A pointer (possibly empty) to the value */
    T* v;
};

template<typename T>
Optional<T> Optional<T>::nullopt = Optional<T>();

template<typename T>
Optional<T> make_optional(T& value)
{
    return Optional<T>(value);
}

#endif
