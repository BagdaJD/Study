#include "figure.h"


int main() {
	Polygon pol(10, 10);
	cout << pol.getarea() << endl;
	cout << pol.getperimetr() << endl;
	cout << pol.getInnerR() << endl;
	cout << pol.getOuterR() << endl;
	pol.print();
	return 0;
}