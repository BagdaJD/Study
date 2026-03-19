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
};

class Polygon : public Circled {
private:
	int n;
	double a;
	const double pi = 3.14;
public:
	Polygon(int _n, double _a) {
		n = _n >= 3 ? _n : 3;
		a = _a < 0 ? 1 : _a;
	}

	virtual void print() const override;
	virtual double getarea() const override;
	virtual double getperimetr() const override;
	virtual double getInnerR() const override;
	virtual double getOuterR() const override;
};