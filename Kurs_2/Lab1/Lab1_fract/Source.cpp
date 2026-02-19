#include <iostream>
#include "fract.h"

int main() {
	Fract f1(2, 3),f2(3),f3(1,2);
	cout << "f1=" << f1 << endl;
	cout << "f2=" << f2 << endl; 
	cout << "f3=" << f3 << endl;
	Fract res = f1 + f2;
	cout << res << endl;
	res = f1 + f3;
	cout << res << endl;
	Fract sum;
	sum = sum + f1;
	sum = sum + f2;
	sum = sum + f3;
	cout << sum << endl;
	cout << "Raznost" << endl;
	Fract f4(1, 2), f5(1, 4);
	Fract minus;
	minus = f5 - f4;
	cout << minus << endl;

	cout << "test simplify" << endl;

	Fract a(15, 25), b(3, 5), c(1, 2), d(1, 4);
	cout << a << endl;
	bool isBool = (a == b);

	cout << isBool << endl;
	cout << (d < c) << endl;
	cout << (c >= d) << endl;
	cout << "--------------" << endl;
	Fract f66;
	sin >> f66.numen;
	sin >> f66.denom;
	system("pause");
	return 0;
}