#pragma once
#include <iostream>

using namespace std;
class Point2D {
private:
    int x, y;
public:
    Point2D(): x(1), y(1){}
    friend ostream& operator<<(ostream& os, const Point2D& point) {
        os << "x =" << point.x << "; " << "y =" << point.y << ";";
        return os;
    }

    friend istream& operator>>(istream& is, Point2D& point) {
        is >> point.x >> point.y;
        return is;
    }

    Point2D& operator--() {
        --x;
        return *this;
    }

    Point2D operator--(int) {
        Point2D t = *this;
        --(*this);
        return t;
    }
};

//Пример с динамической строкой
class DynamicString {
private:
    int n;    // Длина строки
    char* A;  // Указатель на динамический массив символов

public:
    DynamicString(const char* str) {
        if (str) {
            n = 0;
            while (str[n] != '\0') n++;
            A = new char[n + 1];
            for (int i = 0; i < n; ++i) A[i] = str[i];
        }else {
            n = 0;
            A = new char[1];
            A[0] = '\0';
        }
    }

    DynamicString(const DynamicString& other) {
        n = other.n;
        A = new char[n + 1];
        for (int i = 0; i < n; i++) A[i] = other.A[i];
    }

    DynamicString& operator=(const DynamicString &other){
        if (this == &other) {
            return *this;
        }

        n = other.n;
        delete[] A;
        A = new char[n + 1];

        for (int i = 0; i < n; i++) A[i] = other.A[i];
        return *this;
    }

    ~DynamicString() {
        delete[] A;
    }

    friend ostream& operator <<(ostream& os, const DynamicString& str) {
        if (str.A) os << str.A;
        return os;
    }

    friend istream& operator >>(istream& is, DynamicString& str) {
        if (str.A) {
            delete[] str.A;
            cin >> str.n;

            str.A = new char[str.n + 1];
            for (int i = 0; i < str.n; ++i) is >> str.A[i];
            str.A[str.n] = '\0';
        }
        return  is;
    }
};