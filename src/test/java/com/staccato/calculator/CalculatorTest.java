package com.staccato.calculator;

import com.staccato.Calculator;
import com.staccato.Fraction;
import org.junit.Assert;
import org.junit.Test;

import static com.staccato.calculator.TestCalculatorInputData.*;

public class CalculatorTest {

    Calculator calculator;


    @Test
    public void test_addition_input() {
        calculator = new Calculator(ADDITION_POSITIVE_INPUT);
        Fraction result = calculator.calculate();
        Assert.assertEquals(FRACTION_7_2, result);
    }

    @Test
    public void test_multiplication_input() {
        calculator = new Calculator(MULTIPLICATION_POSITIVE_INPUT);
        Fraction result = calculator.calculate();
        Assert.assertEquals(FRACTION_15_8, result);
    }

    @Test
    public void instruction_addition_input() {
        calculator = new Calculator(INSTRUCTIONS_ADDITION_INPUT);
        Fraction result = calculator.calculate();
        Assert.assertEquals(FRACTION_5_4, result);
    }

    @Test
    public void instruction_substraction_input() {
        calculator = new Calculator(INSTRUCTIONS_SUBSTRACTION_INPUT);
        Fraction result = calculator.calculate();
        Assert.assertEquals(FRACTION_NEGATIVE_3_4, result);
    }

    @Test
    public void instruction_multiplication_input() {
        calculator = new Calculator(INSTRUCTIONS_MULTIPLICATION_INPUT);
        Fraction result = calculator.calculate();
        Assert.assertEquals(FRACTION_3_4, result);
    }

    @Test
    public void instruction_division_input() {
        calculator = new Calculator(INSTRUCTIONS_DIVISION_INPUT);
        Fraction result = calculator.calculate();
        Assert.assertEquals(FRACTION_2_7, result);
    }
}
