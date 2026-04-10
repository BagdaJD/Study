#include "List.h"

int main() {
    List* l1 = new List();
    l1->addFirst(10);
    l1->addFirst(11);
    l1 ->addFirst(12);
    l1 ->addFirst(22);
    l1->delLast();

    cout << l1->getLast() << endl;
    cout << l1->kol(odd) << endl;

    l1->for_each(mult2);
    cout << l1->getFirst() << endl;

    List l2;
    l2.addFirst(12);
    l2.addFirst(13);
    l2.addFirst(14);
    int total = sum(l2.begin(), l2.end());
    cout << total << endl;

    int max = maxL(l2.begin(), l2.end());
    cout << max << endl;
    return 0;
}