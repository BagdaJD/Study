package org.example;

public interface CarList {
    void add(Car car);
    void add(Car car, int index);
    void remove(Car car);
    void removeAt(int index);
    Car get(int index);
    int size();
    void clear();
}
