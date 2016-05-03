// Copyright (c) 2016 IBM Corporation.
#ifndef _COMPAT_H
#define _COMPAT_H

#include <stdexcept>

// c++17
template<typename T>
class Optional
{
public:
    static Optional<T> nullopt;

    Optional()
    {
    }

    virtual const T value()
    {
        throw std::runtime_error("Bad optional access");
    }

};

template<typename T>
class OptionalSome : public Optional<T>
{
public:
    OptionalSome(const T value) :
            v(value)
    {
    }

    const T value()
    {
        return v;
    }

private:
    /* The value */
    const T v;
};

template<typename T>
Optional<T> Optional<T>::nullopt = Optional<T>();

template<typename T>
Optional<T> make_optional(T value) {
    return OptionalSome<T>(value);
}


#endif
