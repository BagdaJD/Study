// #include <iostream>
// #include "Lab5.h"
// using namespace std;
//
// int main() {
// 	setlocale(LC_ALL, "Rus");
// 	Student s("Student", 18, "���", 3);
// 	s.setMark(0, 5);
// 	s.setMark(1, 4);
// 	cout << s;
// 	Student s1(s);
// 	cout << s1;
// 	Student s2;
// 	cout << s2;
// 	s2 = s1;
// 	cout << s2;
//
// 	Person p("������", 20);
// 	Person* pp = &p;
// 	cout << static_cast<Student*> (pp)->get_univ() << endl;
// 	/* //��� �������� ������������� �����
// 	Person p("������", 20);
// 	Student sp("������", 19, "���", 3);
// 	p = sp;
// 	cout << p;
// 	// sp = p; ����� ������ ����������
// 	Person* pp = &p;
// 	Student* ss = &sp;
// 	pp = ss;
// 	cout << *pp;
// 	cout << *(Student*)pp; //downcast
// 	//ss = pp; // ������ ����������
// 	Person& rp = sp;
// 	//Student& rs = p; // ������ ����������
// 	*/
//
// 	return 0;
// }