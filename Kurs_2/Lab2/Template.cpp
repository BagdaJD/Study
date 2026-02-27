#include "Template.h"
#include "Array.h"
#include "point.h"
#include <iostream>
#include <string>

using namespace std;
struct Persone {
	string name;
	int year;
	
	bool operator>(const Persone& oth) const{
		return year > oth.year;
	}
	friend ostream & operator << (ostream & out, const Persone &B) {
		out << B.name << "  " << B.year;
		return out;
	}
};

int main() {
	cout << max_type_T(3, 2) << endl;
	cout << max_type_T(3.5, -10.6) << endl;

	string s1 = "hello";
	string s2 = "world";
	cout << max_type_T(s1, s2) << endl;

	cout << "--------" << endl;

	Array A;
	Array B(20, 0);

	cout << (max_type_T(A, B)) << endl;
	cout << endl;

	Point point1;
	Point point2(10, 10);
	Point point3 = max_type_T(point1, point2);
	cout << point3.getX() << endl;

	Persone p1{ "aaa",1980 }, p2{ "BBb",2000 };
	cout << max_type_T(p1, p2) << endl;


	char str[7] = "dasdsa";
	char str2[8] = "bkhhbha";
	cout << max_type_T(str, str2, 7, 8) << endl;

	cout << "--------------------" << endl;

	char* str3 = new char[10]{"retghjkln"};
	char* str4 = new char[12]{"tyujsbdgvsq"};

	cout << max_type_T(str3, str4, 10, 12) << endl;

	return 0;
}