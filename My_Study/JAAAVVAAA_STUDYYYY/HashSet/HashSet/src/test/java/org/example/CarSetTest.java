package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarSetTest {

    private CarSet carSet;

    @BeforeEach
    void setUp() {
        carSet = new CarHashSet();
        for(int i = 0; i < 100; i++){
            carSet.add(new Car("brand" + i, i));
        }
    }

    @Test
    public void checkAdd(){
        int expected = 101;
        carSet.add(new Car("brand101", 101));
        assertEquals(expected, carSet.size());
    }

    @Test
    public void checkRemove(){
        int expected = 100;
        carSet.remove(new Car("brand101", 101));

        assertEquals(expected, carSet.size());
    }

    @Test
    public void checkWhenAddSameElement(){
        int expected = 100;
        carSet.add(new Car("brand78", 78));

        assertEquals(expected, carSet.size());
    }

    @Test
    public void testClear(){
        int expected = 0;
        carSet.clear();

        assertEquals(expected, 0);
    }

    @BeforeEach
    public void close(){
        carSet = null;
    }
}