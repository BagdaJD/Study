#include "Array.h"

using namespace std;
Array::Array() {
    n = 10;
    values = new int[n];

    for (int i = 0; i < n; i++) {
        values[i] = i;
    }
}

Array::Array(int _n, int x) {
    //всегда должна происходить инициализация полей
    n = _n;
    values = new int[_n];

    for (int i = 0; i < _n; i++) {
        values[i] = x;
    }
}

Array::Array(const Array &other) {
    n = other.n;
    values = new int[n];
    for (int i = 0; i < n; i++) {
        values[i] = other.values[i];
    }
}

Array::~Array() {
    delete[] values;
}

int Array::size() const {
    return n;
}

bool Array::operator==(const Array&arr) const{
    if (n != arr.n) return false;

    for (int i = 0; i < n; i++) {
        if (values[i] != arr.values[i]) return false;
    }

    return true;
}

Array &Array::operator = (const Array &arr) {
    if (this != &arr){
        delete[] values;
        n = arr.n;
        values = new int[n];
        for (int i = 0; i<n; i++)
            values[i] = arr.values[i];
    }
    return *this;
}

Array Array::operator += (const Array &arr) {
    if (n != arr.n)
        throw 300;
    for (int i = 0; i<n; i++)
        values[i] = values[i] + arr.values[i];
    return *this;
}

int& Array::operator [] (int i) {
    return values[i];
}

int Array::operator [] (int i) const{
     return values[i];
}

Array Array::operator+(const Array &arr) const {
    if (n != arr.n) throw 100;
    Array temp(n);
    for (int i = 0; i < n; i++) {
        temp.values[i] = values[i] + arr.values[i];
    }

    return temp;
}

Array Array::operator+(const int x) {
    Array temp(n);
    for (int i = 0; i < n; i++) {
        temp.values[i] = values[i] + x;
    }

    return temp;
}

void Array::reSize(int nsize){
    int* new_arr = new int[nsize];
    for (int i = 0; i < nsize; i++){
        new_arr[i] = values[i];
    }
    n = nsize;
    delete[] values;
    values = new_arr;
}

void Array::add(int x){
    reSize(n + 1);
    values[n - 1] = x;
}

void Array::vst(int k, int x){
    int* temp = new int[n + 1];

    for (int i = 0; i < k; i++) temp[i] = values[i];
    temp[k] = x;
    for (int i = k + 1; i < n; i++) temp[i] = values[i-1];

    delete[] values;
    n = n - 1;
    values = temp;
}

void Array::del(int k)
{
    int* temp = new int[n + 1];
    for (int i = 0; i < k; i++) temp[i] = values[i];
    for (int i = k + 1; i < n; i++) temp[i - 1] = values[i];

    delete[] values;
    n = n - 1;
    values = temp;
}

ostream &operator <<(ostream &out, const Array &arr) {
    //не войдовска  функция, т.к чтобы мы могли после нашего вывода что-то выводить
    for (int i = 0; i < arr.n; i++) {
        out << arr.values[i] << " ";
    }
    return out;
}

istream &operator >>(istream &in,Array &arr) {
    for (int i = 0; i < arr.n; i++) {
        in >> arr.values[i];
    }
    return in;
}