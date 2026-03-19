#include <iostream>
#include "Lab5.h"
using namespace std;

int main() {
	setlocale(LC_ALL, "Rus");
	Student s("Student", 18, "ЮФУ", 3);
	s.setMark(0, 5);
	s.setMark(1, 4);
	cout << s;
	Student s1(s);
	cout << s1;
	Student s2;
	cout << s2;
	s2 = s1;
	cout << s2;

	Person p("Иванов", 20);
	Person* pp = &p;
	cout << static_cast<Student*> (pp)->get_univ() << endl;
	/* //для проверки совместимости типов
	Person p("Иванов", 20);
	Student sp("Петров", 19, "ЮФУ", 3);
	p = sp;
	cout << p;
	// sp = p; будет ошибка компиляции
	Person* pp = &p;
	Student* ss = &sp;
	pp = ss;
	cout << *pp;
	cout << *(Student*)pp; //downcast
	//ss = pp; // ошибка компиляции
	Person& rp = sp;
	//Student& rs = p; // ошибка компиляции
	*/

	return 0;
}