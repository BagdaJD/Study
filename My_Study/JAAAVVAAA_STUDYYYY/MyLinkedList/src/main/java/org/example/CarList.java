package org.example;

public interface CarList {
        Car get(int index);
        void add(Car car);
        void add(Car car, int index);
        void remove(Car car);
        void removeAt(int index);
        int size();
        void clear();
}
