package com.example.calculator.model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.jayway.jsonpath.internal.path.PathCompiler.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setup(){
        calc = new Calculator();
    }

    @Test
    void sumTest() {
        assertEquals(10.0, calc.sum(5.0, 5.0));
    }

    @Test
    public void numbersNullSumTest() {
        try{
            calc.sum(1.0, null);
            fail("Missing Exception");
        }catch(Throwable ex){
            assertEquals(NullPointerException.class, ex.getClass());
            assertEquals("Número 1 e número 2 são obrigatórios.", ex.getMessage());
        }
    }

    @Test
    void subTest() {
        assertEquals(10.0, calc.sub(20.0, 10.0));
    }

    @Test
    void divideTest() {
        assertEquals(5.0, calc.divide(10.0, 2.0));
    }

    @Test
    public void divisionByZeroTest() {
        try{
            calc.divide(2.0, 0.0);
            fail("Missing Exception");
        }catch(Throwable ex){
            assertEquals(ArithmeticException.class, ex.getClass());
            assertEquals("Divisão por zero não é permitido.", ex.getMessage());
        }
    }

    @Test
    void factorialTest() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(1, calc.integerToBinary(1));
        assertEquals(101, calc.integerToBinary(5));
        assertEquals(10100, calc.integerToBinary(20));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("1", calc.integerToHexadecimal(1));
        assertEquals("AA", calc.integerToHexadecimal(170));
        assertEquals("3E7", calc.integerToHexadecimal(999));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate dateA = LocalDate.of(2022, 7, 1);
        LocalDate dateB = LocalDate.of(2022, 7, 11);

        assertEquals(10, calc.calculeDayBetweenDate(dateA, dateB));
    }
}
