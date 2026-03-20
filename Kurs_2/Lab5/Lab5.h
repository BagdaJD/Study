#pragma once
#include <iostream>
#include <string>
#include <exception>
using namespace std;
class Person {
private: // обратите внимание!!! поля закрыты для потомков!
	string name;
	int age;
public:
	Person(const string& name = "noname", int age = 18) :
		name(name), age(age) {}
	friend ostream & operator<< (ostream & os, const Person & p);
};


class Student : public Person
{
private:
	string univ; // университет
	int m;
	int* marks; // оценки
public:
	Student();
	Student(const string& name, int age, const string& u, int m);
	Student(const Student& s);
	~Student();

	Student& operator=(const Student& s);
	
	void setMark(int i, int mark);
	string get_univ() const;
 	friend ostream & operator<< (ostream & os, const Student & s);
};

class ErrMark : public exception { //наследуем от базового типа исключений
private:
	int mark;
public:
	ErrMark(int n) :mark(n) {};
	const char* what() const noexcept override {
		return "Error in mark";
	}
	int getmark() const{return mark;}
 };
