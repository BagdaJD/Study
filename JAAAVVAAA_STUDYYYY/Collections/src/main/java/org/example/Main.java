package org.example;

public class Main {
    public static void main(String[] args) {
        CarList arr = new CarArrayList();

        for(int i = 0; i < arr.size(); i++){
            arr.add(new Car("Brand" + i, i));
            System.out.println(arr.get(i));
        }

    }
}