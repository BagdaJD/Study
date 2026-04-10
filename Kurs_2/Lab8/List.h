#pragma once
#include <iostream>
using namespace std;

struct Node
{
	int data;
	Node* next;

	Node(int data, Node* next) {
		this->data = data;
		this->next = next;
	}

	friend 	ostream & operator<< (ostream & out, const Node & x);
};

class Error {};
class List_iter;

class List {
private:
	Node* first;
	Node* last;
	Error err;
public:
	List() : first(nullptr), last(nullptr) {}
	List(Node* first, Node* last) : first(first), last(last){};
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
	List_iter begin()const;
	List_iter insert(List_iter it, int x);
	List_iter end()const; 
	List_iter delete_(List_iter it);
	friend ostream & operator << (ostream & out, const List & y);

};

inline bool odd(int x)
{
	return x % 2 != 0;
}

inline void mult2(int & x) {
	x *= 2;
}

 class List_iter {
 private:
 	const List *collection;
 	Node *cur;
	friend class List;
 public:
 	List_iter(const List *s, Node *e) : collection(s), cur(e) {}
 	 int& operator *() {
 		if (cur) return cur->data;
 		else throw Error();
 	}
 	List_iter operator++() {
 		if (cur) {
 			cur = cur->next;
 			return *this;
 		}
 		else throw Error();
 	}

 	void addFirst(int x);
 	void addLast(int x);

 	bool operator == (const List_iter &ri) const {
 		return ((collection == ri.collection) && (cur == ri.cur));
 	}
 	bool operator != (const List_iter &ri) const {
 		return !(*this == ri);
 	}
 };

int sum(List_iter beg, List_iter end);
int maxL(List_iter beg, List_iter end);
