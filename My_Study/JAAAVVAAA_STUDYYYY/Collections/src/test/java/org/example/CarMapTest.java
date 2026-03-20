package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class CarMapTest {

    private CarMap carMap;

    @BeforeEach
    void setUp() {
        for(int i = 0; i < 100; i++){
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("brand" + i, i);
            carMap.put(carOwner, car);
        }
    }

    @Test
    void put() {
        carMap.put(new CarOwner(101, "Name101", "LastName101"), new Car("brand101", 101));
        assertEquals(101, carMap.size());
        carMap.put(new CarOwner(0, "Name0", "LastName0"), new Car("brand0", 0));
        assertEquals(101, carMap.size());
    }

    @Test
    public void whenPut100ElementsWith10DifferentKeyThenSize10(){
        for (int i = 0; i < 100; i++) {
            int index = i % 10;
            CarOwner carOwner = new CarOwner(index, "Name" + index, "LastName" + index);
            Car car = new Car("Brand" + index, index);
            carMap.put(carOwner, car);
        }
        assertEquals(10, carMap.size());
    }

    @Test
    void get() {
        CarOwner key = new CarOwner(50, "Name50", "LastName50");
        Car value = carMap.get(key);

        assertEquals("brand50", value.getBrand());
    }

    @Test
    void remove() {
        carMap.remove(new CarOwner(0,"Name0", "LastName0"));
        assertEquals(100, carMap.size());
    }

}