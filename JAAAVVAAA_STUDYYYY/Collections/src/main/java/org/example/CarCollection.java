package org.example;

public interface CarCollection extends Iterable<Car>{
    boolean add(Car car);
    boolean remove(Car car);
    boolean contains(Car car);
    int size();
    void clear();
}
