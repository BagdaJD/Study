#include "Circle.h"
#include<cstring>
#include <math.h>

void Circle::setR(double r)
{
    radius = (r > 0) ? r : radius;
}

double Circle::getR() const
{
    return radius;
}

const char* Circle::getType() const {
    return type;
}

void Circle::setType(const char* t)
{
    if (t == nullptr) {
        type[0] = '\0';
        return;
    }
    std::strncpy(this->type, t, 9);
    this->type[9] = '\0';
}

double Circle::square() const
{
    return M_PI * radius * radius;
}

double Circle::length() const
{
    return 2 * M_PI * radius;
}

void Circle::showInfo() const
{
    cout << "Фигура с названием: " << type << ", " << "с радиусом : "<< radius << ";" << endl;
    cout << "Площадь фигуры равна: " << square() << ";" << endl;
    cout << "Длина окружности: "<< length() << ";" << endl;
}

//Cone

double Cone::getH() const
{
    return height;
}

void Cone::setH(double h)
{
    height = (h > 0) ? h : height;
}

double Cone::volume() const
{
    return M_PI * radius * radius * height / 3;
}

void Cone::showInfo() const
{
    Circle::showInfo();
    cout << "Высота равна: " << height << ";" << endl;
    cout << "Объем равен: " << volume() << ";" << endl;
}


//Sphere
double Sphere::squre() const
{
    return 4 * M_PI * radius;
}

void Sphere::showInfo() const
{
    Circle::showInfo();
    cout << "Площадь равна: " << square() << ";" << endl;
}
