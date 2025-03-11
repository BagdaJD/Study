package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
     void add() {
        Calculator calc = new Calculator();
        int expected = 15;
        int res = calc.add(10,5);
        assertEquals(expected, res);

        int expected2 = 150;
        int res2 = calc.add(100,50);
        assertEquals(expected2, res2);
    }

    @Test
    void minus(){
        Calculator calc = new Calculator();
        int expected = 15;
        int res = calc.minus(25, 10);
        assertEquals(expected, res);

        int expected2 = 25;
        int res2 = calc.minus(35, 10);
        assertEquals(expected2, res2);
    }

    @Test
    void mult(){
        Calculator calc = new Calculator();
        double exp = 100;
        double res = calc.mult(10, 10);
        assertEquals(exp, res, 0.0001);
    }

    @Test
    void del(){
        Calculator calc = new Calculator();
        double exp = 10;
        double res = calc.del(100, 10);
        assertEquals(exp, res, 0.0001);
    }

}