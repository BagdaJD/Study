package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    private CarSet carHashSet;

    @BeforeEach
    void setUp() {
        //init
        carHashSet = new CarHashSet();
        for(int i = 0; i < 100; i++){
            carHashSet.add(new Car("Brand" + i, i));
        }
    }

    @Test
    void whenAdd100ElementsThenSizeMustBe100(){
        assertEquals(100, carHashSet.size());
    }

    @Test
    void whenAddSeemsElementsThenSizeMustBe100(){
        assertFalse(carHashSet.add(new Car("Brand1", 1)));
        assertEquals(100, carHashSet.size());
    }

    @Test
    void whenAddSeemsElementsThenSizeMustBe101(){
        assertTrue(carHashSet.add(new Car("Brand101", 1019)));
        assertEquals(101, carHashSet.size());
    }

    @Test
    void whenWeRemoveElementSizeMustBeDeacreased(){
        assertTrue(carHashSet.remove(new Car("Brand2", 2)));
        assertEquals(99, carHashSet.size());
    }

    @Test
    void whenRemoveNullElementsMustBeFalse(){
        assertFalse(carHashSet.remove(new Car("Branfdg", 738)));
    }
    @Test
    void size() {
        assertEquals(100, carHashSet.size());
    }

    @Test
    void clear(){
        carHashSet.clear();
        assertEquals(0, carHashSet.size());
    }
}