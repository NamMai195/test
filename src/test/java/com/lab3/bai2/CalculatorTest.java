package com.lab3.bai2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        int result = calculator.add(1, 1);
        Assertions.assertEquals(2, result);
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(1, 1);
        Assertions.assertEquals(1, result);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(1, 1);
        Assertions.assertEquals(1, result);
    }

    @Test
    void testDivide() {
        double result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
    @Test
    public void testNumberFormatExceptionn(){
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("abc"));
    }
    @Test
    public void testNullPointerException(){
        assertThrows(NullPointerException.class, () -> {String str = null; str.length();});
    }
}

