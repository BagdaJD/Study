#include "Tree.h"

void Tree::delTree(node_ptr t) {
	int c;
	if (t != nullptr) {
		delTree(t->lt);
		delTree(t->rt);
		delete t;
		t = nullptr;
	}
}

void Tree::add(node_ptr& t, int a) {
	if (t == nullptr) t = new TNode(a);
	else if (t->data > a) add(t->lt, a);
	else add(t->rt, a);
}

void Tree::printLKR(node_ptr t, ostream& os) const {
	if (t) {
		printLKR(t->lt, os);
		os << t->data << " ";
		printLKR(t->rt, os);

	}
}

void Tree::copy(node_ptr t, node_ptr &newT)  const //KLR
{
	if (t != nullptr)
	{
		newT = new TNode(t->data, 0, 0);
		copy(t->lt, newT->lt);
		copy(t->rt, newT->rt);
	}
	else newT = nullptr;
}

void Tree::print_tree(node_ptr t, int n) const {
	if (t != nullptr) {
		print_tree(t-> rt, n + 1);
		for (int i = 0; i < n; i++) cout << '\t';
		cout << t -> data << endl;
		print_tree(t-> lt, n + 1);
	}
}

int Tree::countLeaves(node_ptr t, int n) const {
	if (!t) return 0;
	return (!t -> lt && !t->rt) + countLeaves(t-> rt) + countLeaves(t-> lt);
}

int Tree::count_leaves() const {
	return countLeaves(root);
}

void Tree::printTree() const {
	print_tree(root);
}

int Tree::countNodes(node_ptr t, int n) const {
	if (!t) return 0;
	return 1 + countNodes(t-> rt) + countNodes(t-> lt);
}

int Tree::count_nodes() const {
	return countNodes(root);
}

int Tree::deepTree(node_ptr t, int n) const {
	if (!t) return 0;

	int leftT = deepTree(t->lt);
	int rightT = deepTree(t->rt);

	if (leftT > rightT) {
		return leftT + 1;
	} else {
		return rightT + 1;
	}
}

int Tree::deep_tree() const {
	return deepTree(root);
}

bool Tree::equalTrees(node_ptr t, node_ptr other) const {
	if (!t && !other) return true;
	if (!t || !other) return false;
	return (t->data == other->data) && equalTrees(t-> rt, other -> rt)
		&& equalTrees(t -> lt, other -> lt);
}

void Tree::createWidth(node_ptr& t, int &n) {
	if (t) {
		createWidth(t->lt, n);
		createWidth(t->rt, n);
	}else if (n > 0) {
		int val;
		cout << "a = ";
		cin >> val;

		t = new TNode(val);
		n--;
	}
}

void Tree::create_width(int n) {
	delTree(root);
	root = nullptr;
	while (n > 0) createWidth(root, n);
}

void Tree::createBalancedTree(node_ptr& t, int n) {
	if (n > 0) {
		int val;
		cin >> val;

		t = new TNode(val);
		int nl = n / 2;
		int nr = n - nl - 1;

		createBalancedTree(t->lt, nl);
		createBalancedTree(t->rt, nr);
	}else t = nullptr;
}

void Tree::create_balanced_tree(int n) {
	delTree(root);
	root = nullptr;
	createBalancedTree(root, n);
}