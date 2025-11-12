package com.example.calculator.CalculatorAPI.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void sumTest() {
        assertEquals(3.0, calculator.sum(1.0, 2.0));
    }

    @Test
    public void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> calculator.sum(null, 2.0));
    }

    @Test
    void subTest() {
        assertEquals("5.0", calculator.sub(10.0, 5.0).toString());
    }

    @Test
    void numbersNullSubTest() {
        assertThrows(NullPointerException.class, () -> calculator.sub(10.0, null));
    }

    @Test
    void divideTest() {
        assertEquals("4.0", calculator.divide(20.0, 5.0).toString());
    }

    @Test
    public void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10.0, 0.0));
    }

    @Test
    void factorialTest() {
        assertEquals("120", calculator.factorial(5).toString());
    }

    @Test
    void integerToBinaryTest() {
        assertEquals("1010", calculator.integerToBinary(10).toString());
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("AA", calculator.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {
        assertEquals(20, calculator.calculeDayBetweenDate(
                java.time.LocalDate.of(2020, 3, 10),
                java.time.LocalDate.of(2020, 3, 30)
        ));
    }
}