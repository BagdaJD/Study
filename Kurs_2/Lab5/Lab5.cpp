#include <string>
#include "Lab5.h"
using namespace std;

string Student::get_univ() const {
	return univ;
}

ostream & operator<< (ostream & os, const Person & p)
{
	os << p.name << " " << p.age << endl;
	return os;
}

//Student::Student() : univ("МГУ"), m(3)
//{
//	marks = new int[m];
//	for (int i = 0; i<m; ++i)
//		marks[i] = 0;
//}
Student::Student(const string& name, int age, const string& u, int m) :
	Person(name, age), univ(u), m(m)
{
	marks = new int[m];
	for (int i = 0; i<m; ++i)
		marks[i] = 0;
}
Student::Student(const Student& s) : Person(s), univ(s.univ), m(s.m) //обратите внимание на вызов конструктора предка!
{
	marks = new int[s.m];
	for (int i = 0; i<m; ++i)
		marks[i] = s.marks[i];
}
Student::~Student() { delete[] marks; }
Student& Student::operator=(const Student& s)
{
	if (&s != this)
	{
		delete[] marks;
		Person::operator=(s); //обратите внимание для закрытых полей предка вызываем метод предка!
		univ = s.univ;
		m = s.m;
		marks = new int[m];
		for (int i = 0; i<m; ++i)
			marks[i] = s.marks[i];
	}
	return *this;
};
void Student::setMark(int i, int mark)
{
	if (i < 0 || i >= m)
		throw ErrMark(i);
	marks[i] = mark;
};
ostream& operator<< (ostream& os, const Student& s)
{
	os << (Person)s;
	os << s.univ << endl;
	for (int i = 0; i < s.m; ++i)
		os << s.marks[i] << " ";
	os << endl;
	return os;
};

Student& Student::operator=(const Student& s) {
	if (this != &s) {
		Person::operator=(s);
		univ = s.univ;
		marks = s.marks;
	}
	return *this;
}