#include"figure.h"

void Polygon::print() const {
	cout << "n = " << n << " ; " << "a = " << a << " ;" << getperimetr() << endl;
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

void Square::print() const
{
	cout << "n = " << n << " ; " << "a = " << a << getperimetr() << endl;
}

double Square::getarea() const
{
	return a * a;
}

double Square::getInnerR() const
{
	return a / 2;
}

double Square::getOuterR() const
{
	return a / sqrt(2);
}

void Triangle::print() const
{
	cout << "a = " << a << " ; " << "b = " << b << " ; " << "c = " << c << " ;"  << getperimetr() << endl;
}

double Triangle::getperimetr() const
{
	return a + b + c;
}

double Triangle::getarea() const
{
	double p = getperimetr();
	return sqrt(p * (p - a) * (p - b) * (p - c));
}

double Triangle::getInnerR() const
{
	double s = getarea();
	return sqrt((s - a) * (s - b) * (s - c) / s);
}

double Triangle::getOuterR() const
{
	return ( a * b * c) / (4 * getarea());
}

void Triangle::checkTriangleType() const
{
	bool srAb = abs(a - b) < 1e-05;
	bool srBc = abs(b - c) < 1e-05;
	bool srCa = abs(c - a) < 1e-05;
	if (srAb && srBc && srCa)
		cout << "Равносторонний треугольник" << endl;

	if (srAb || srBc || srCa)
		cout << "Равнобедренный треугольник" << endl;
	else cout << "Just triangle" << endl;
}

bool equalPerimetr(const Shape& f1, const Shape& f2)
{
	return f1.getperimetr() == f2.getperimetr();
}

bool lessPerimetr(const Circled& f1, const Circled& f2)
{
	return f1.getperimetr() < f2.getperimetr();
}
bool lessArea(const Circled& f1, const Circled& f2)
{
	return f1.getarea() < f2.getarea();
}

bool lessInnerR(const Circled& f1, const Circled& f2)
{
	return f1.getInnerR() < f2.getInnerR();
}

bool lessOuterR(const Circled& f1, const Circled& f2)
{
	return f1.getOuterR() < f2.getOuterR();
}

void sortArray(Circled** array, int n, compare f)
{
	for (int i = 0; i < n-1; i++)
	{
		for (int j = 0; j < n - i - 1; j++)
		{
			if(!f(*array[j], *array[j+1]))
			{
				Circled* temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
			}
		}
	}
}