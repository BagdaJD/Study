#pragma once
#include <string>

class Empty {

private:
	std::string name;
public:
	Empty();
	Empty(std::string s);
	Empty(const Empty& other);
	Empty(const Empty&& other)noexcept;
	~Empty();
	Empty operator-();
	Empty& operator=(const Empty& other);
	Empty& operator=(const Empty&& other)noexcept;
};

void f1(Empty a);
Empty f3(Empty& a);
Empty f2();