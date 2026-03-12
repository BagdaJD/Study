#include "Matr.h"

int main() {
    Matr m1;
    Matr m2;
    cout << m1 << endl;
    m2 = 4 * m1;
    cout << m2 << endl;
    cout << m2.isSymmetric() << endl;
    cin >> m1;
    cout << (m1 == m2) << endl;
    Matr m3;
    m3 = m1 + m2;
    cout << m3<< endl;
    return 0;
}