#pragma once
#include<iostream>
using namespace std;
class Matr {
private:
    int matr[3][3];
public:
    Matr() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matr[i][j] = i + j;
            }
        }
    }

    Matr(int matr[3][3]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this->matr[i][j] = matr[i][j];
            }
        }
    }

    bool isSymmetric() const {
        for (int i = 0; i < 3; ++i) {
            for (int j = i + 1; j < 3; ++j) {
                if (matr[i][j] != matr[j][i]) return false;
            }
        }
        return true;
    }

    bool operator==(const Matr &matr) const;
    friend Matr operator*(int scalar, const Matr &matr);
    friend Matr operator*(const Matr &matr, int scalar);
    Matr operator+(Matr& matr) const;

    friend ostream & operator <<(ostream &out, const Matr &matr);
    friend istream & operator >>(istream &in, Matr &matr);

};

