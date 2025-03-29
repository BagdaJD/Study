package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarListTest {

    private CarList carList;

    @BeforeEach
    void setUp() {
        carList = new CarLinkedList();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void whenAdd100ElementsThenSizeMustBe100() {
        assertEquals(100, carList.size());
    }

    @Test
    public void whenElementRemoveByIndexThenSizeMustBeDecreased() {
        assertEquals(100, carList.size());
        assertTrue(carList.removeAt(1));
        assertEquals(99, carList.size());
    }

    @Test
    public void whenElementRemoveThenSizeMustBeDecreased() {
        Car car = new Car("Toyota", 15);
        carList.add(car);

        assertEquals(101, carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void whenNoneExistentElementRemovedThenReturnFalse() {
        Car car = new Car("Toyota", 15);
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void whenListClearedThenSizeMustBe0() {
        carList.clear();
        assertEquals(0, carList.size());
    }

    @Test
    public void whenIndexOutOfBoundsThenThrowException() {
        IndexOutOfBoundsException exception = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            carList.get(100);
        }, "Error");

        assertEquals(null, exception.getMessage());
    }

    @Test
    public void methodGetReturnedRightValue() {
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());
    }

    @Test
    public void insertIntoMiddle(){
        Car car = new Car("BMW", 1);
        carList.add(car, 50);

        Car carFromList = carList.get(50);
        assertEquals("BMW", carFromList.getBrand());
    }

    @Test
    public void insertIntoEnd(){
        Car car = new Car("BMW", 1);
        carList.add(car, 100);

        Car carFromList = carList.get(100);
        assertEquals("BMW", carFromList.getBrand());
    }

    @Test
    public void insertIntoBegining(){
        Car car = new Car("BMW", 1);
        carList.add(car, 0);

        Car carFromList = carList.get(0);
        assertEquals("BMW", carFromList.getBrand());
    }
}