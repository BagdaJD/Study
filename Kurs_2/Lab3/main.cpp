#include <iostream>
#include "Empty.h"

using namespace std;

int main() {
    cout << "test constructors" << endl;
    Empty a;
    Empty b("1");
    Empty c(a);
    //lvalue -> copy
    cout << "test move-constructor" << endl;
    Empty s(-b);
    //rvalue -> move
    cout << "end test constructors" << endl;


    cout << "test operator= and functions" << endl;
    cout << "test =" << endl;
    c = -b;
    cout << "test f1" << endl;
    f1(b);
    cout << "test f2" << endl;
    a = f2();
    cout << "test f3" << endl;
    a = f3(c);

    return 0;
}