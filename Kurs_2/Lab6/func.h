#pragma once
#include <iostream>
#include <string>

using namespace std;

class Unpair {
};

class MissRight {
};

class stackEmpty {
};

class stackFull {
};

template <typename T>
class Stack {
private:
    //����, ������������ ���������� ����� � ������������ ������
    T* start;
    int size;
    int head;
public:
    //������
    Stack(int n = 10);
    ~Stack() { delete[] start; }
    void push(const T&x); //���������� �������� � ����
    T pop(); //���������� �������� �� �����
    T top()const; //�������� �������� �� ������� �����
    bool isEmpty() const; //true, ���� ���� ������
    bool isFull() const; //true, ���� ���� �����
};

template <typename T>
Stack<T>::Stack(int n) {
    size = n > 0 && n < 1000 ? n : 10;
    start = new T[size];
    head = -1;
}

template <typename T>
bool Stack<T>::isEmpty() const {
    return head == -1;
}
template <typename T>
bool Stack<T>::isFull()const {
    return head == size - 1;
}

template <typename T>
void Stack<T>::push(const T& x) {
    if (isFull()) throw stackFull();
    start[++head] = x;
}
template <typename T>
T Stack<T>::pop() {
    if (isEmpty())throw stackEmpty();
    T x = start[head--];
    return x;
}

template<typename T>
T Stack<T>::top() const {
    if (isEmpty()) throw stackEmpty();
    T x = start[head];
    return x;
}

bool check_bracket(string s);
string rpn(string s);
int prior(char);
int expression(string s);
