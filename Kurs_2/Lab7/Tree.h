#pragma once
#include <iostream>
using namespace std;


class Tree {
private:
	struct TNode;
	typedef TNode* node_ptr;
	struct TNode {
		int data;
		node_ptr lt, rt;
		TNode(int val, node_ptr l = nullptr, node_ptr r = nullptr) : data(val), lt(l), rt(r) {}
	};

	node_ptr root;
	int countNodes(node_ptr t, int n = 0) const;//считаем общее кол-во элементов
	int countLeaves(node_ptr t, int n = 0) const;//считаем кол-во листов(концов) дерева
	int deepTree(node_ptr t, int n = 0) const; // глубина дерева
	bool equalTrees(node_ptr t, node_ptr other) const;
	void createWidth(node_ptr& t, int &n);
	void createBalancedTree(node_ptr& t, int n);

	void delTree(node_ptr t); 
	void add(node_ptr& t, int a); 
	void printLKR(node_ptr t, ostream& os) const; 
	void copy(node_ptr t, node_ptr &newT)  const;
	void print_tree(node_ptr t, int n = 0) const;
public:
	Tree() : root(nullptr) {}
	Tree(const Tree& t) {
		copy( t.root, root);
	}
	~Tree() {
		delTree (root);
	}
	void addNode(int a) {
		add(root, a);
	}

	Tree& operator=(const Tree& other) {
		if (this != &other) {
			delTree(root);
			copy(other.root, root);
		}
		return *this;
	}

	bool operator==(const Tree& other){
		return equalTrees(root, other.root);
	}

	bool operator!=(const Tree& other) {
		return !(*this==other);
	}

	void printTree() const;
	int count_nodes() const;
	int count_leaves() const;
	int deep_tree() const;
	void create_width(int n);
	void create_balanced_tree(int n);
	friend ostream& operator<<(ostream& os, const Tree &t) { t.printLKR(t.root,os);  return os; }
};
