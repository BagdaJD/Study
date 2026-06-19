#include "Matr.h"

bool Matr::operator==(const Matr &matr) const {
    bool flag = true;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (this->matr[i][j] != matr.matr[i][j]) {
                flag = false;
                return flag;
            }
        }
    }

    return flag;
}

Matr operator*(const Matr& matr, int scalar) {
    Matr tempMatr;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            tempMatr.matr[i][j] = scalar * matr.matr[i][j];
        }
    }

    return tempMatr;
}

Matr operator*(int scalar, const Matr & matr) {
    return matr * scalar;
}

Matr Matr::operator+(Matr &matr) const{
    Matr tempMatr;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            tempMatr.matr[i][j] = this->matr[i][j] + matr.matr[i][j];
        }
    }

    return tempMatr;
}

ostream & operator <<(ostream &out, const Matr &matr) {
    for (int i = 0; i < 3; i++) {
        out << "[ ";
        for (int j = 0; j < 3; j++) {
            out << " " << matr.matr[i][j] << "; ";
        }
        out << " ]";
    }

    return out;
}

istream &operator >>(istream &in, Matr &matr) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            in >> matr.matr[i][j];
        }
    }

    return in;
}