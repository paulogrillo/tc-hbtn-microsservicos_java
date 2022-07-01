package com.example.calculator.model;

import java.time.LocalDate;
import java.time.Period;

public class Calculator {

public Double sum(Double number1, Double number2){
    // TODO
    if(number1 == null || number2 == null){
        throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
    }else {
        return  number1 + number2;
    }
}

public Double sub(Double number1, Double number2) {
    // TODO
    if(number1 == null || number2 == null){
        throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
    }else {
        return  number1 - number2;
    }
}

public Double divide (Double number1, Double number2)  {
    // TODO
    if(number1 == null || number2 == null){
        throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
    }else if(number1 == 0 || number2 == 0){
        throw new ArithmeticException("Divisão por zero não é permitido.");
    }else {
        return  number1 / number2;
    }
}

public Integer factorial(Integer factorial) {
    // TODO
    int calc = 1;
    if(factorial != null) {
        for (int i = 1; i <= factorial; ++i){
            calc = calc * i;
        }
    }else {
        throw new NullPointerException("Número é obrigatório.");
    }
    return calc;
}

// Exemplos:
// Integer = 1 -> Binary = 1
// Integer = 5 -> Binary = 101
// Integer = 20 -> Binary = 10100
public Integer integerToBinary(Integer integer) {
    // TODO
    Integer calc = Integer.valueOf(Integer.toBinaryString(integer));
    return calc;
}
// Exemplos:
// Integer = 1 -> Hexadecimal = "1"
// Integer = 5 -> Hexadecimal = "37"
// Integer = 170 -> Binary = "AA"
public String integerToHexadecimal(Integer integer) {
    // TODO
    String calc = Integer.toHexString(integer).toUpperCase();
    return calc;
}

// Exemplos
// Date 1 = LocalDate.of(2020, 3, 15);
// Date 2 = LocalDate.of(2020, 3, 29)
// Total de dias = 14
public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
    // TODO
    Period periodDate = Period.between(date1, date2);
    return periodDate.getDays();
}

}
