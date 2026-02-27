#include <iostream>
#include "point.h"

#include <cmath>

const double eps = 0.0000001;

Point::Point() { //??????????????? ???????????? ?? ?????????
    this->x = 0;
    this->y = 0;
	std::cout<<"Point created - ("<<this->x<<","<<this->y <<")"<<std::endl;
}

Point::Point(double x, double y) {
    this->x = x;
    this->y = y;
    std::cout << "Point created - (" << this->x << "," << this->y << ")" << std::endl;
}

Point::Point(const Point& point) {
    this->x = point.x;
    this->y = point.y;
    std::cout << "Point created with copy - (" << this->x << "," << this->y << ")" << std::endl;
}
//? ?????? ?? ???????? ?????? ????????????, ?????????? ??? ??? ???????????

double Point::getX() const{// ???? ????? ?????? ??? ??????(??????), ?? ????? ?? ???????? const
    return this -> x;
}

double Point::getY() const {
    return this->y;
}

void Point::setX(double new_x) {
    this->x = new_x;
}

void Point::setY(double new_y) {
    this->y = new_y;
}

void Point::set_point(double new_x, double new_y) {
    this->x = new_x;
    this->y = new_y;
}

void Point::shift_X(double dx) { x += dx; }

void Point::shift_Y(double dy) { y += dy; }
/*
bool Point::isEqual(const Point& p) const {
    return x == p.x && y == p.y;
}
*/
bool Point::isEqual(const Point& p) const { 
    return abs(this-> x - p.x) < eps && abs(this->y - p.y) < eps;
}

Point add1(Point a, Point b) {
    return Point(a.getX() + b.getX(), a.getY() + b.getY());//??? ??? ??????? ???????
}

Point add2(const Point &a, const Point &b) {
    return Point(a.getX() + b.getX(), a.getY() + b.getY());
}

void Point::print() {
    std::cout << "x = " << x << "; " << "y = " << y << ";" << std::endl;
}

double Point::distance_to(const Point& other) const {
    return sqrt((other.x - x) * (other.x - x) + (other.y - y) * (other.y - y));
}