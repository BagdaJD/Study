#include "func.h"
int main() {
    setlocale(LC_ALL, "Rus");

    Stack<int> intStack(5);
    for (int i = 0; i < 5; i++)
        intStack.push(10 - i);
    cout << "������� �� ������� ������: " << intStack.top() << endl;
    while (!intStack.isEmpty())
        cout << intStack.pop() << ' ';
    cout << endl;
    cout << check_bracket("{[])([])(}") << endl;

    cout << rpn("(a+b)*(c-d)/e") << endl;
    cout << expression("2 3 + 5 /") << endl;
    return 0;
}