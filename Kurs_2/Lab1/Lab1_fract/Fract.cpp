#include <iostream>
#include "fract.h"

Fract Fract::operator+(const Fract& other) {//?????????? ????????? ????????(????????? ??? ??? ?????)
	Fract temp;
	temp.denom = this->denom*other.denom; //???????????
	temp.numen = this->denom*other.numen+ other.denom*this->numen;
	temp.simplify();
	return temp;
}

Fract Fract::operator-(const Fract& other) {
	Fract temp;
	temp.denom = this->denom * other.denom; 
	temp.numen = this->denom * other.numen - other.denom * this->numen;
	temp.simplify();
	return temp;
}

Fract Fract::operator*(const Fract& other) {
	Fract temp;
	temp.denom = this->denom * other.denom;
	temp.numen = this->numen * other.numen;
	temp.simplify();
	return temp;
}

Fract Fract::operator/(const Fract& other) {
	Fract temp;
	temp.denom = this->denom * other.numen;
	temp.numen = this->numen * other.denom;
	temp.simplify();
	return temp;
}

bool Fract::operator==(const Fract& other) {
	return this->numen == other.numen && this->denom == other.denom;
}

bool Fract::operator!=(const Fract& other) {
	return !(*this == other);
}

bool Fract::operator>(const Fract& other) {
	return !(*this >= other);
}

bool Fract::operator<(const Fract& other) {
	return !(*this <= other);
}

bool Fract::operator>=(const Fract& other) {
	return this->numen * other.denom >= this->denom * other.numen;
}

bool Fract::operator<=(const Fract& other) {
	return this->numen * other.denom <= this->denom * other.numen;
}


void Fract::simplify() {
	if (denom < 0) {
		numen = -numen;
		denom = -denom;
	}

	int a = abs(numen);
	int b = abs(denom);

	while (b != 0) {
		a = a % b;
		swap(a, b);
	}
	numen /= a;
	denom /= a;
}


std::ostream & operator << (std::ostream & os, const Fract & fr) {
	os << fr.numen << " / " << fr.denom;
	return os;
 }

std::istream& operator >> (std::istream& is, Fract& fr) {
	is >> fr.numen;
	is >> fr.denom;
	fr.simplify();
	return is;
}