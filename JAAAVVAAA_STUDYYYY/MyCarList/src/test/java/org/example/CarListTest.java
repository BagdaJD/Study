package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarListTest {
    private MyCarList carList;

    @BeforeEach
    void setUp(){
        carList = new CarList();
        for (int i = 0; i < 100; i++){
            carList.add(new Car("Brand" + i, i));
        }
    }

    @Test
    void whenAdd10ElementsToArrMustBe110(){
        for(int i = 0; i < 10; i++){
            carList.add(new Car("Brand1" + i, i));
        }

        assertEquals(110, carList.size());
    }

    @Test
    void whenRemoveByElementSizeMustBeDicreased(){
        Car car = new Car("BrandLol", 10);
        carList.add(car);

        carList.remove(car);
        assertEquals(100, carList.size());
    }

    @Test
    void whenWeTryGetElementsByIndexOutOfBounds(){
        IndexOutOfBoundsException exception = Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> {
                    carList.removeAt(-1);
                });
        String error = String.format("Index %s out of bounds for length %s", carList.size(), carList.size());
        assertEquals(null, exception.getMessage());
    }

    @Test
    void methodGetReturnedRightValue(){
        Car car = carList.get(0);

        assertEquals("Brand0", car.getBrand());
    }
}