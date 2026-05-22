#pragma once
#include <iostream>
#include <memory>
using namespace std;
template<typename  Datatype>
class List {
private:
    struct Node {
        Datatype data;
        shared_ptr<Node> next, prev;
        Node (const Datatype& x): data(x), next(nullptr), prev(nullptr){};
    };
    Node* first;
    Node* last;
public:
    List() : first(nullptr), last(nullptr) {}
    List(Node* first, Node* last) : first(first), last(last){};
    void delete_list();
    ~List();
    bool isEmpty() const;
    void addFirst(int x);
    void addLast(int val);
    int getFirst()const;
    int getLast()const;
    int delFirst();
    int delLast();
    int kol(bool(*f) (int));
    void for_each(void(*action)(int &));

    friend ostream & operator << (ostream & out, const List & y);

};
