// Copyright (c) 2016 IBM Corporation.
#ifndef _COMPAT_H
#define _COMPAT_H

#include <iostream>

#include <stdexcept>

// c++17
template<typename T>
class Optional
{
public:
    static Optional<T> nullopt;

    Optional() : v(0)
    {
    }

    Optional(T* value) : v(value)
    {
    }

    explicit operator bool() const
    {
        return v != 0;
    }

    T value() const
    {
        if (v)
            return *v;
        throw std::runtime_error("Bad optional access");
    }

private:
    /* A pointer (possibly empty) to the value */
    T* const v;
};

template<typename T>
Optional<T> Optional<T>::nullopt = Optional<T>();

template<typename T>
Optional<T> make_optional(T* value)
{
    return Optional<T>(value);
}

#endif
