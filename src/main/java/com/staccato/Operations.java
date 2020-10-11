package com.staccato;

public class Operations {

    public static Fraction addition(Fraction left, Fraction right) {
        int commonDenominator = left.getDenominator() * right.getDenominator();
        int leftNumerator = left.getNumerator() * right.getDenominator();
        int rightNumerator = right.getNumerator() * left.getDenominator();

        int numeratorResult = leftNumerator + rightNumerator;

        return new Fraction(numeratorResult, commonDenominator);
    }

    public static Fraction substraction(Fraction left, Fraction right) {
        int commonDenominator = left.getDenominator() * right.getDenominator();
        int leftNumerator = left.getNumerator() * right.getDenominator();
        int rightNumerator = right.getNumerator() * left.getDenominator();

        return new Fraction(leftNumerator - rightNumerator, commonDenominator);
    }

    public static Fraction multiplication(Fraction left, Fraction right) {
        int numerator = left.getNumerator() * right.getNumerator();
        int denominator = left.getDenominator() * right.getDenominator();
        if(numerator ==0) denominator = 1;
        return new Fraction(numerator, denominator);
    }

    public static Fraction division(Fraction left, Fraction right) {
        int numerator = left.getNumerator() * right.getDenominator();
        int denominator = right.getNumerator() * left.getDenominator();
        if(denominator == 0){
            throw new ArithmeticException("Division by zero attempted");
        }
        if(numerator == 0) denominator = 1;
        return new Fraction(numerator, denominator);
    }
}
