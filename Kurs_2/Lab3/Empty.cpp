#include <string>
#include <iostream>
#include "Empty.h"

using namespace std;

Empty::Empty() {
	name = "noname";
	cout << "create Empty with name=" + name << endl;
}
Empty::Empty(string s) {
	name = s;
	cout << "create Empty with name=" + name << endl;
}
Empty::Empty(const Empty& other) {
	name = "copy "+other.name;
	cout << "create Empty with name=" + name << endl;
}

Empty::Empty(const Empty&& other)noexcept {
 	name = "MOVE " + other.name;
 	cout << "create Empty with name=" + name << endl;
}

Empty::~Empty() {
	cout << "delete Empty with name=" + name << endl;
}

Empty& Empty::operator=(const Empty& other) {
	cout << "Empty with name " + name +" = Empty with name "+other.name<< endl;
	return*this;
}

Empty& Empty::operator=(const Empty&&other)noexcept {
	cout << "Empty with name " + name + " MOVE Empty with name " + other.name << endl;
	return*this;
}

Empty Empty::operator-() {
	Empty q(*this);
	return q;
}
void f1(Empty a) {
	cout << "in function f1 "<<endl;
}
Empty f3(Empty& a) {
	cout << "in function f3 " << endl;
	return a;
}
Empty f2() {
	cout << "in function f2 " << endl;
	Empty* q=new Empty("f2");
	return *q;
}