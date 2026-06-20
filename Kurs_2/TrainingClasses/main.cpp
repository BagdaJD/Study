#include"Array.h"


int main()
{
    Array C;
    Array B(8);
    cout << C << endl;
    cout << B << endl;
    cout << "-----------------" << endl;
    C++;
    --B;
    cout << B << endl;
    cout << "-----------------" << endl;

    Array D(C);
    cout << D << endl;
    cout << "-----------------" << endl;
    D = C;
    D += D;
    cout << D << endl;

    return 0;
}