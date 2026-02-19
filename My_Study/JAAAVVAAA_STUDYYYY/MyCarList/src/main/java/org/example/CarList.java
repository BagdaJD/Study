package org.example;

import java.util.Arrays;

public class CarList implements MyCarList {
    private Car[] array = new Car[10];
    private int size = 0;

    @Override
    public void add(Car car) {
        if(size >= array.length){
            /*
            Car[] newArray = new Car[array.length * 2];
            for(int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
             */
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = car;
        size++;
    }

    @Override
    public boolean remove(Car car) {;
        for(int i = 0; i < array.length; i++){
            if(car.equals(array[i])){
               return removeAt(i);
            }
        }

        return false;
    }

    @Override
    public boolean removeAt(int index) {
        checkIndexOutOfBounds(index);
        for(int i = index; i < size - 1; i++){
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public Car get(int index) {
        checkIndexOutOfBounds(index);
        return array[index];
    }

    @Override
    public void clear() {
        array = new Car[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void checkIndexOutOfBounds(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }
}
