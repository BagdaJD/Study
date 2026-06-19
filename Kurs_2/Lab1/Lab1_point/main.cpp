#include <iostream>
#include "point.h"
using namespace std;

int main() {
	Point p;
	Point *ptr = new Point(4, 6);//в динамической памяти

	Point p1(3, 4); //в статической памяти
	//Конструктор для копирования работает только с динамической памятью

	cout << p1.getX() << endl;
	p1.set_point(4, 3);
	cout << p1.getX() << endl;
	p1.shift_X(10);
	cout << p1.getX() << endl;

	Point p2(14, 3);

	cout << p1.isEqual(p2) << endl;

	cout << "Vizov add1" << endl;
	Point p3 = add1(p1, p); //при передаче статических объектов в качетсве параметров, внуктри функции создаются локальные функции
	//и после выполнения функции вызывается деструктор и все уничтожается само

	cout << p3.getX() << endl;

	cout << "Vizov add2" << endl;
	Point ptr1 = add2(p, p2);
	cout << ptr1.getX() << endl;

	p.print();
	p1.print();

	delete ptr;

	system("pause");
	return 0;
}