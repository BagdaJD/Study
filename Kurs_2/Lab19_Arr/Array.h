#pragma once
#include <iostream>
#include<memory>
using namespace std;

class Array {
private:
    static void copy(const int* from, int* to, int size) {
        for (int i = 0; i < size; i++) to[i] = from[i];
    }
    int n;
    unique_ptr<int[]> values;
public:
    // Исправлен порядок: n(0) идет первым
    Array() : n(0), values(nullptr) {};

    // Исправлено: теперь используем переданный параметр _n
    Array(int _n, int x = 0) : n(_n), values(new int[_n]) {
        for (int i = 0; i < n; i++) values[i] = x;
    };

    // Исправлен порядок инициализации
    Array(const Array &other) : n(other.n), values(new int[other.n]) {
        copy(other.values.get(), values.get(), n);
    };

    // Добавлен Move-конструктор (без него не будут работать операторы +)
    Array(Array &&other) noexcept : n(other.n), values(move(other.values)) {
        other.n = 0;
    }

    ~Array() = default; // Умный указатель сам всё удалит

    int size() const { return n; }

    friend ostream & operator << (ostream &out, const Array &arr);

    // Исправлено присваивание (добавлено обновление n)
    Array &operator = (const Array &arr) {
        if (this != &arr) {
            n = arr.n;
            values.reset(new int[n]);
            copy(arr.values.get(), values.get(), n);
        }
        return *this;
    }

    // Move-присваивание
    Array &operator = (Array &&other) noexcept {
        if (this != &other) {
            n = other.n;
            values = move(other.values);
            other.n = 0;
        }
        return *this;
    }

    int& operator [] (int i) { return values[i]; };
    int operator [] (int i) const { return values[i]; };

    void reSize(size_t newSize);
};