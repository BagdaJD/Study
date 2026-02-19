#pragma once
#include <iostream>
using namespace std;

class Fract {
private:
	int numen, denom;
	void simplify();

public:
	Fract() : numen(0), denom(1){} //﷿﷿﷿﷿﷿﷿﷿﷿﷿﷿﷿ ﷿﷿ ﷿﷿﷿﷿﷿﷿﷿﷿﷿
	Fract(int a, int b=1) :numen(a) { //﷿﷿﷿﷿﷿﷿﷿﷿﷿﷿﷿ ﷿ ﷿﷿﷿﷿﷿﷿﷿﷿﷿﷿﷿
		 denom = (b!=0)? b:1;
		 simplify();
	}

	Fract operator+(const Fract& other);
	Fract operator-(const Fract& other);
	Fract operator/(const Fract& other);
	Fract operator*(const Fract& other);

	bool operator==(const Fract& other);
	bool operator!=(const Fract& other);
	bool operator>(const Fract& other);
	bool operator<(const Fract& other);
	bool operator>=(const Fract& other);
	bool operator<=(const Fract& other);

	friend std::ostream & operator << (std::ostream &, const Fract &); //﷿﷿﷿﷿﷿﷿﷿﷿﷿﷿ <<
	//friend ﷿﷿﷿﷿﷿﷿﷿ ﷿﷿﷿﷿﷿ ﷿﷿﷿﷿﷿﷿ ﷿ ﷿﷿﷿﷿﷿ ﷿ private
	friend std::istream& operator >> (std::istream&, Fract&);
};
