#pragma once
#define _USE_MATH_DEFINES
#include<iostream>
#include<cmath>


using namespace std;

class Shape{
public:
	virtual void print() const = 0;
	virtual double getarea() const = 0;
	virtual double getperimetr() const = 0;
};

class Circled : public Shape {
public:
	virtual double getInnerR() const = 0;
	virtual double getOuterR() const = 0;

	typedef bool (*compare) (const Circled& f1, const Circled&f2);
};

class Polygon : public Circled {
protected:
	int n;
	double a;
	const double pi = 3.14;
public:
	Polygon(int _n, double _a) {
		n = _n >= 3 ? _n : 3;
		a = _a < 0 ? 1 : _a;
	}

	void print() const override;
	double getarea() const override;
	double getperimetr() const override;
	double getInnerR() const override;
	double getOuterR() const override;
};

class Square : public Polygon
{
public:
	Square(double _a): Polygon(4, _a){};

	void print() const override;
	double getarea() const override;
	double getInnerR() const override;
	double getOuterR() const override;
};

class Triangle : public Circled
{
private:
	double a, b, c;
public:
	Triangle():a(1), b(1), c(1){};
	Triangle(double _a, double _b, double _c)
	{
		if (_a > _b + _c || _b > _a + _c || _c > _a + _b) throw 1;
		a = _a > 0 ? _a : 1;
		b = _b > 0 ? _b : 1;
		c = _c > 0 ? _c : 1;
	};

	void checkTriangleType() const;
	void print() const override;
	double getarea() const override;
	double getperimetr() const override;
	double getInnerR() const override;
	double getOuterR() const override;
};
typedef bool (*compare) (const Circled& f1, const Circled&f2);
void sortArray(Circled** array, int n, compare f);

bool equalPerimetr(const Shape& f1, const Shape& f2);
bool lessPerimetr(const Circled& f1, const Circled& f2);
bool lessArea(const Circled& f1, const Circled& f2);
bool lessInnerR(const Circled& f1, const Circled& f2);
bool lessOuterR(const Circled& f1, const Circled& f2);