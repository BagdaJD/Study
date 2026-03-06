#pragma once
#include<iostream>
#define _USE_MATH_DEFINES

using namespace std;

class Circle {
protected:
    char type[10]; //название типа в иерархии
    //наследования
    double radius;
public:

    Circle() : type("Circle"), radius(1)
    {
        cout << "Конструктор по умолчанию создал Circle" << endl;
    }

    Circle(double r) : type("Circle")
    {
        radius = (r > 0) ? r : 1;
        cout << "Конструктор с параметром создал Circle"<< endl;
    }

    double square() const;
    double length() const;

    void setR(double r);
    void setType(const char* t);
    double getR() const;
    const char* getType() const;

    void showInfo() const;
};

class Cone : public Circle {
    //наследуется все кроме конструкторов, деструкторов, дружественных классов
    // конус - реализовать самостоятельно
protected:
    double height;
public:
    Cone(): height(1)
    //Circle(), hight(1) - тоже самое
    {
        setType("Cone");
        cout << "Был создан конус конструктором по умолчанию" << endl;
    }

    Cone(double r, double h) : Circle(r)
    {
        height = (h > 0) ? h : 0;
        setType("Cone");
        cout << "Был создан конус конструктором с параметрами" << endl;
    }

    double getH() const;
    double volume() const;
    void showInfo() const;
    void setH(double h);
};

class Sphere: public Circle {
    // сфера - реализовать самостоятельно
public:
    Sphere(): Circle()
    {
        setType("Sphere");
        cout << "Был создана сфера конструктором по умолчанию" << endl;
    }
    Sphere(double r): Circle(r)
    {
        setType("Sphere");
        cout << "Был создана сфера конструктором с параметрами" << endl;
    }

    void showInfo() const;
    double squre() const;
};

class Cylinder : public Cone {
    // цилиндр - реализовать самостоятельно
};