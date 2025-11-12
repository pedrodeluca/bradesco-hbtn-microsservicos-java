package com.example.calculator.CalculatorAPI.model;

import java.time.LocalDate;

public class Calculator {

    public Double sum(Double number1, Double number2) {
        try {
            return number1 + number2;
        } catch (Exception e) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
    }

    public Double sub(Double number1, Double number2) {
        try {
            return number1 - number2;
        } catch (Exception e) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
    }

    public Double divide (Double number1, Double number2)  {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }

        try {
            int i = Integer.divideUnsigned(number1.intValue(), number2.intValue());
            return Double.valueOf(i);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }
    }

    public Integer factorial(Integer factorial) {
        if (factorial == null)
            throw new NullPointerException("Número é obrigatório.");

        for (int i = factorial - 1; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    // Exemplos:
    // Integer = 1 -> Binary = 1
    // Integer = 5 -> Binary = 101
    // Integer = 20 -> Binary = 10100
    public Integer integerToBinary(Integer integer) {
        return Integer.parseInt(Integer.toBinaryString(integer));
    }

    // Exemplos:
    // Integer = 1 -> Hexadecimal = "1"
    // Integer = 5 -> Hexadecimal = "37"
    // Integer = 170 -> Binary = "AA"
    public String integerToHexadecimal(Integer integer) {
        return Integer.toHexString(integer).toUpperCase();
    }

    // Exemplos
    // Date 1 = LocalDate.of(2020, 3, 15);
    // Date 2 = LocalDate.of(2020, 3, 29)
    // Total de dias = 14
    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
        long daysBetween = java.time.temporal.ChronoUnit.DAYS.between(date1, date2);
        return (int) daysBetween;
    }

}
