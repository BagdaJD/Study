#pragma once
#include "Array.h"
#include "point.h"

template <typename T>
T max_type_T(const T& a, const T& b) {
	return a > b ? a : b;
}

template<>
Array max_type_T(const Array& a, const Array& b)
{
	return a.size() > b.size() ? a : b;
}

template<>
Point max_type_T(const Point& a, const Point& b)
{
	return a.distance_to(Point (0, 0)) > b.distance_to(Point (0, 0)) ? a : b;
}

int len_str(const char* str, int n)
{
	int len = 0;
	for (int i = 0; i < n; i++) len++;

	return len;
}

const char* max_type_T(const char* a, const char* b, int n1, int n2)
{
	return len_str(a, n1) > len_str(b, n2) ? a : b;
}
