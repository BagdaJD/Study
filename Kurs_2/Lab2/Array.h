#pragma once
#include <iostream>
using namespace std;

class Array {
private:
    int n;
    int *values;
public:
    Array();
    //конструктор по умолчанию
    Array(int _n, int x = 0);
    //конструктор с параметрами
    Array(const Array &other);
    //конструктор копии

    //конструктор move
    Array(Array&& other) noexcept;

    ~Array(); // деструктор
    // методы
    int size() const ;
    // дружественные функции
    friend ostream & operator << (ostream &out, const Array &arr);
    friend istream & operator >> (istream &in,Array &arr);

    Array operator + (const Array &arr)const;
    Array operator += (const Array &arr);
    Array operator + (const int x);
    Array &operator = (const Array &arr);
    Array& operator= ( Array&& arr) noexcept;

    bool operator == (const Array &arr)const;
    int& operator [] (int i);
    int operator [] (int i) const;

    void reSize(int new_n);
    void add(int x);
    void vst(int k, int x);
    void del(int k);
};
