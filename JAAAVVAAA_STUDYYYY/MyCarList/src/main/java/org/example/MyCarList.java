package org.example;

public interface MyCarList {
    void add(Car car);
    boolean remove(Car car);
    boolean removeAt(int index);
    Car get(int index);
    void clear();
    int size();
}
