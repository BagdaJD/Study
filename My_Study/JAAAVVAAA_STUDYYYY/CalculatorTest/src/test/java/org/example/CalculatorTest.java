package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void whenAddTenToFiveResultFifteen(){
        int expected = 15;
        int res = calc.add(10, 5);

        assertEquals(expected, res);
    }

    @Test
    public void whenAdd10To5AsString(){
        int expected = 15;
        int res = calc.add("10", "5");

        assertEquals(expected, res);
    }

    @Test
    public void whenInputIncorrectValueThenThrowsException(){
        NumberFormatException expectedException = Assertions.assertThrows(NumberFormatException.class,
                () -> {
                    calc.add("lol", "1");
                }, "Error");
        Assertions.assertEquals("For input string: \"lol\"", expectedException.getMessage());
    }
    @Test
    public void whenMultTenToTenResult100(){
        double expected = 100.0;
        double result = calc.mult(10, 10);

        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void whenInputIncorrectValueIntoMult(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            calc.mult("100", "10dm0");
        }, "Error");
        Assertions.assertEquals("For input string: \"10dm0\"", exception.getMessage());
    }

    /*
    @Test
    public void whenDelOnZero(){
        ArithmeticException expectedException = Assertions.assertThrows(ArithmeticException.class, () -> {
           double a = calc.del(100, 0);
        }, "Error");

        Assertions.assertEquals("", expectedException.getMessage());
    }*/

    @AfterEach
    public void close(){
        calc = null;
    }
}