#include "figure.h"
#include<fstream>

int main()
{
	setlocale(LC_ALL, "Rus");
	Polygon pol(10, 10);
	cout << pol.getarea() << endl;
	cout << pol.getperimetr() << endl;
	cout << pol.getInnerR() << endl;
	cout << pol.getOuterR() << endl;
	pol.print();

	cout << "---------------" << endl;
	ifstream fin("./text.txt");
	try
	{
		if (!fin) throw 200;
	}catch (int e)
	{
		cout << "err" << endl;
	}

	int n, m;
	string str;
	double a, b, c;
	fin >> n;

	//указатель на массив указателей
	Circled** arrayOfFigures = new Circled*[n];
	for (int i = 0; i < n; i++)
	{
		fin >> str; // считали до первого пробела
		if (str == "Triangle")
		{
			fin >> a >> b >> c;
			arrayOfFigures[i] = new Triangle(a, b , c);
		}else if (str == "Square")
		{
			fin >> a;
			arrayOfFigures[i] = new Square(a);
		}else
		{
			fin >> m >> a;
			arrayOfFigures[i] = new Polygon(m, a);
		}
	}
	fin.close();

	for (int i = 0; i < n; i++)
	{
		if (typeid(*arrayOfFigures[i]).name()==typeid(Triangle).name())
			dynamic_cast<Triangle*> (arrayOfFigures[i])->checkTriangleType();

	}

	bool flag = true;
	for (int i = 0; i < n - 1; i++)
	{
		if (!equalPerimetr(*arrayOfFigures[i], *arrayOfFigures[i + 1]))
		{
			flag = false;
			break;
		}
	}

	if (flag) cout << "Периметры у всех фигур равны" << endl;
	else cout << "Периметры у фигур не совпадают" << endl;

	sortArray(arrayOfFigures, n, lessPerimetr);

	for (int i = 0; i < n; i++)
		arrayOfFigures[i] -> print();
	cout << " ---------------- " << endl;
	sortArray(arrayOfFigures, n, lessArea);

	for (int i = 0; i < n; i++)
		arrayOfFigures[i] -> print();

	cout << " ---------------- " << endl;
	sortArray(arrayOfFigures, n, lessInnerR);

	cout << " ---------------- " << endl;
	for (int i = 0; i < n; i++)
		arrayOfFigures[i] -> print();

	for (int i = 0;  i < n; i++)  delete arrayOfFigures[i];

	delete[] arrayOfFigures;
	// Shape* arrayOfFigures[3];
	// arrayOfFigures[0] = new Polygon(10, 10);
	// arrayOfFigures[1] = new Square(11);
	// arrayOfFigures[2] = new Triangle();
	//
	// for (auto elem : arrayOfFigures)
	// {
	// 	elem->print();
	// }

	return 0;
}