#include"List.h"

ostream & operator<< (ostream & out, const Node & x) {
    out <<"Data = "<< x.data << ";";
    return out;
}

List::~List() {
    while (first != nullptr) {
        Node* postFirst = first;
        first = first -> next;
        delete postFirst;
    }
}

ostream & operator << (ostream & out, const List & y) {
    Node* cur = y.first;
    while (cur) {
        out << cur << endl;
        cur = cur -> next;
    }

    return out;
}

void List::addFirst(int x) {
    first = new Node(x, first);
    if (!last) last = first;
}

void List::addLast(int x) {
    if (first) {
        last->next = new Node(x, last);
        last = last->next;
    }else {
        first=last=new Node(x, nullptr);
    }
}

int List::getLast() const {
    if (!last) throw err;
    return last->data;
}

int List::getFirst() const {
    if (!first) throw err;
    return first->data;
}

int List::delFirst() {
    if (first) {
        int x = first -> data;
        Node* cur = first;
        first = first->next;
        delete cur;

        return x;
    }
    throw err;
}

int List::delLast() {
    if (!first) throw err;
    if (first == last) return delFirst();

    Node* cur = first;
    while (cur -> next != last) cur = cur -> next;
    int x = last -> data;
    delete last;

    last = cur;
    last-> next = nullptr;
    return x;
}

int List::kol(bool (*f)(int)) {
    int cnt = 0;
    for (Node* cur = first; cur; cur = cur-> next) {
        if (f(cur-> data)) cnt++;
    }
    return cnt;
}

void List::for_each(void (*action)(int &)) {
    for (Node* cur = first; cur; cur = cur -> next) action(cur-> data);
}

List_iter List:: begin()const {
    return List_iter(this, first);
}

List_iter List::end()const {
    return List_iter(this, nullptr);
}

List_iter List::insert(List_iter it, int x) {
    if (it.collection != this) throw err;
    if (it.cur == first) {
        addFirst(x);
        return begin();
    }
    if (it.cur == nullptr) {
        addLast(x);
        return List_iter(this, last);
    }
    Node* p = first;
    while (p -> next != it.cur) p = p -> next;
    p -> next = new Node(x, it.cur);
    return List_iter(this, p-> next);
}

List_iter List::delete_(List_iter it) {
    if (it.collection != this) throw err;
    if (it.cur == first) delFirst();
    else if (it.cur == last) delLast();
    else {
        Node *p = first;
        while (p -> next != it.cur) p = p -> next;
        p-> next = p-> next -> next;
        delete it.cur;
    }
}

int sum(List_iter beg, List_iter end) {
    int s = 0;
    while (beg != end) {
        s += *beg;
        ++beg;
    }
    return s;
}

int maxL(List_iter beg, List_iter end) {
    List_iter max = beg;
    while (beg != end) {
        if (*beg > *max) max = beg;
        ++beg;
    }

    return *max;
}
