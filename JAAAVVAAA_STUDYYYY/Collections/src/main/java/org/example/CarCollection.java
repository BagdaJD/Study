package org.example;

public interface CarCollection {
    boolean add(Car car);
    boolean remove(Car car);
    boolean contains(Car car);
    int size();
    void clear();
}
