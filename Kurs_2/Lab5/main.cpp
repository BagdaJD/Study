<<<<<<< Updated upstream
#include "figure.h"


int main() {
	Polygon pol(10, 10);
	cout << pol.getarea() << endl;
	cout << pol.getperimetr() << endl;
	cout << pol.getInnerR() << endl;
	cout << pol.getOuterR() << endl;
	pol.print();
	return 0;
=======
#include <iostream>
#include "Lab5.h"
using namespace std;

int main() {
    setlocale(LC_ALL, "Rus");
    Student s("Student", 18, "Sfedu", 3);
    s.setMark(0, 5);
    s.setMark(1, 4);
    cout << s;
    Student s1(s);
    cout << s1;
    Student s2;
    cout << s2 << endl;;
    s2 = s1;
    cout << s2 << endl;

    Person p("lodl", 20);
    Person* pp = &p;
    cout << static_cast<Student*> (pp) -> get_univ()<< endl;

    /* //äëÿ ïðîâåðêè ñîâìåñòèìîñòè òèïîâ
    Person p("Èâàíîâ", 20);
    Student sp("Ïåòðîâ", 19, "ÞÔÓ", 3);
    p = sp;
    cout << p;
    // sp = p; áóäåò îøèáêà êîìïèëÿöèè
    Person* pp = &p;
    Student* ss = &sp;
    pp = ss;
    cout << *pp;
    cout << *(Student*)pp; //downcast
    //ss = pp; // îøèáêà êîìïèëÿöèè
    Person& rp = sp;
    //Student& rs = p; // îøèáêà êîìïèëÿöèè
    */

    return 0;
>>>>>>> Stashed changes
}