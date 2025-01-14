package com.example.maven.calculator;

import com.example.maven.calculator.Calculator;

public class DoubleCalculator implements Calculator<Double> {

    @Override
    public Double sum(Double summand1, Double summand2) {
        return summand1 + summand2;
    }

    @Override
    public Double difference(Double minuend, Double subtrahend) {
        return minuend - subtrahend;
    }

    @Override
    public Double product(Double multiplicand1, Double multiplicand2) {
        return multiplicand1 * multiplicand2;
    }

    @Override
    public Double quotient(Double dividend, Double divisor) {
        if (divisor == 0) {
            return 0.0;
        }
        return dividend / divisor;
    }
}
