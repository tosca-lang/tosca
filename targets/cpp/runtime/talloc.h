// Copyright (c) 2017 IBM Corporation.
#ifndef _TALLOC_H
#define _TALLOC_H

#include <climits>

namespace tosca
{
	// forward decls
	class Context;
    void* Allocate(std::size_t sz, Context& ctx);
    void Deallocate(void* ptr, std::size_t size);

	/** C++ pre-11 allocator. */
	template<class T>
	struct Allocator
	{
		typedef T value_type;
		typedef size_t size_type;
		typedef T* pointer;
		typedef const T* const_pointer;
		typedef T& reference;
		typedef const T& const_reference;
		typedef ptrdiff_t difference_type;
		tosca::Context* context;

		Allocator() : context(0)
		{}

		Allocator(tosca::Context& ctx) : context(&ctx)
		{}

		template<class U>
		Allocator(const Allocator<U>& other)
		{
			context = other.context;
		}

		T* allocate(std::size_t n)
		{
			if (context)
				return static_cast<T*>(Allocate(n * sizeof(T), *context));
			return static_cast<T*>(::operator new (n * sizeof(T)));
		}

		void deallocate(T* p, std::size_t n)
		{
			if (context)
				Deallocate(p, sizeof(T) * n);
			else
				::operator delete (static_cast<void*>(p));
		}

		template <typename U>
		struct rebind
		{
			   typedef Allocator<U> other;
		};

		void construct (T* p, const T& value)
		{
			new ((void*) p) T(value);
		}

		void destroy (T* p)
		{
			p->~T();
		}

		size_type max_size () const
		{
			return ULONG_MAX / sizeof(T);
		}

	};

	template<class T, class U>
	bool operator==(const Allocator<T>& lhs, const Allocator<U>& rhs) {
		return lhs.context == rhs.context;
	}

	template<class T, class U>
	bool operator!=(const Allocator<T>& lhs, const Allocator<U>& rhs) {
		return lhs.context != rhs.context;
	}

	inline const Allocator<char> StaticAlloc()
	{
		static const Allocator<char> allocator;
		return allocator;
	}
}

#endif
