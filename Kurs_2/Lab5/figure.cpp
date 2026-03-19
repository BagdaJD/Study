#include"figure.h"

void Polygon::print() const {
	cout << "n = " << n << " ; " << "a = " << a << " ;" << endl;
}

double Polygon::getarea() const {
	return a * n / (4 * (1.0 / tan(M_PI/n)));
}

double Polygon::getperimetr() const {
	return 2 * this->getarea() / this->getOuterR();
}

double Polygon::getOuterR() const {
	return a / (2 * sin(M_PI / n));
}

double Polygon::getInnerR() const {
	return 2 * this->getarea() / this->getperimetr();
}