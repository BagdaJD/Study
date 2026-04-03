#include "Tree.h"

int main() {
    Tree t;
   for (int i = 0; i < 10; i++) {
       t.addNode(i * i);
       t.addNode((-1) * i * i);
   }

    t.addNode(-10);
    t.addNode(23);
    t.addNode(43);
    t.addNode(-21);

    cout << t << endl;
    cout << endl;
    t.printTree();
    cout << "--------------------" << endl;

    cout << t.count_nodes() << endl;
    cout << t.count_leaves() << endl;
    cout << t.deep_tree() << endl;

    cout << "------------------" << endl;
    Tree t1;
    //Tree t = t1 - сработал бы конструктор присваивания
    for (int i = 0; i < 5; i++) {
        t1.addNode(i * i);
        t1.addNode((-1) * i * i);
    }
    // t = t1;
    // t.printTree();
    cout << "-------------------------" << endl;
    cout << (t1 == t1) << endl;
    cout << (t == t1) << endl;
    cout << "-------------------------" << endl;
    Tree t2;
    //t2.create_width(10);
    t2.create_balanced_tree(10);

    t2.printTree();
    cout << "----------------------" << endl;

    return 0;
}