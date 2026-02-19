package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      CarCollection coll = new CarHashSet();
      for(int i = 0; i < 10; i++){
          coll.add(new Car("brand" + i, i));
      }

      for(Car car : coll){
          System.out.println(car.getBrand());
      }

      for(int i = 0; i < coll.size(); i++){

      }
    }
}