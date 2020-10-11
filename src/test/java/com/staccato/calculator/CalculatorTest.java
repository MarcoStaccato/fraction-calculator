package com.staccato.calculator;

import com.staccato.Calculator;
import com.staccato.Fraction;
import org.junit.Test;

import static com.staccato.calculator.TestCalculatorInputData.*;

public class CalculatorTest {

    Calculator calculator;


    @Test
    public void test_addition_input() {
        calculator = new Calculator(ADDITION_POSITIVE_INPUT);
        Fraction result = calculator.calculate();
        System.out.println(ADDITION_POSITIVE_INPUT);
        System.out.println(result);
    }

    @Test
    public void test_multiplication_input() {
        calculator = new Calculator(MULTIPLICATION_POSITIVE_INPUT);
        Fraction result = calculator.calculate();
        System.out.println(MULTIPLICATION_POSITIVE_INPUT);
        System.out.println(result);
    }
}
