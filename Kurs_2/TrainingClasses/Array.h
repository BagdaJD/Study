#pragma once
#include<iostream>

using namespace std;
class Array
{
    int n;
    int* values;
public:
    Array(): n(10)
    {
        values = new int[n];
        for (int i = 0; i < n; i++)
        {
            values[i] = i;
        }
    }

    Array(int n)
    {
        this -> n = n;
        values = new int[n];
        for (int i = 0; i < n; i++)
        {
            values[i] = i * i;
        }
    }

    Array(const Array &B)
    {
        n = B.n;
        values = new int[n];
        for (int i = 0; i < n; i++)
        {
            values[i] = B.values[i];
        }
    }

    Array& operator=(const Array& B)
    {
        if (this != &B)
        {
            delete[] values;
            n = B.n;
            values = new int[n];
            for (int i = 0; i < n; i++) values[i] = B.values[i];
        }

        return *this;
    }

    Array& operator+=(const Array& B)
    {
        if (B.n != n) throw 200;
        for (int i = 0; i < n; i++)
        {
            values[i] += B.values[i];
        }

        return *this;
    }

    //префиксный
    Array& operator++()
    {
        for (int i = 0; i < n; i++) values[i]++;
        return *this;
    }

    Array& operator--()
    {
        for (int i = 0; i < n; i++) values[i]--;
        return *this;
    }


    //постфиксный
    Array operator++(int)
    {
        Array C(*this);
        ++(*this);

        return C;
    }

    Array operator--(int)
    {
        Array C(*this);
        --(*this);
        return C;
    }
    Array operator+(const Array & B)
    {
        if (B.n != n) throw 200;
        Array C(n);
        for (int i = 0; i < n; i++)
        {
            C.values[i] = values[i] + B.values[i];
        }

        return C;
    }

    Array operator-(const Array &B)
    {
        if (B.n != n) throw 300;
        Array C(n);
        for (int i = 0; i < n; i++) C.values[i] = values[i] - B.values[i];

        return C;
    }

    int operator[](int i) const
    {
        return values[i];
    }

    int& operator[](int i)
    {
        return values[i];
    }

    ~Array()
    {
        delete[] values;
    }

    friend ostream& operator<<(ostream& os, const Array& A)
    {
        for (int i = 0; i < A.n; i++) os << A.values[i] << endl;
        return os;
    }

    friend istream& operator>>(istream& is, Array& A)
    {
        delete[] A.values;
        is >> A.n;
        A.values = new int[A.n];

        for (int i = 0; i < A.n; i++) is >> A.values[i];
        return is;
    }


};