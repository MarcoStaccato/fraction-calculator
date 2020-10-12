package com.staccato.calculator;

import com.staccato.Fraction;

public interface TestCalculatorInputData {

    String ADDITION_POSITIVE_INPUT = "2_3/8 + 9/8";
    String MULTIPLICATION_POSITIVE_INPUT = "1/2 * 3_3/4";

    Fraction FRACTION_7_2 = new Fraction(7, 2);
    Fraction FRACTION_15_8 = new Fraction(15, 8);

    String INSTRUCTIONS_ADDITION_INPUT = "1/2 + 3/4";
    String INSTRUCTIONS_SUBSTRACTION_INPUT = "0 - 3/4";
    String INSTRUCTIONS_MULTIPLICATION_INPUT = "1 * 3/4";
    String INSTRUCTIONS_DIVISION_INPUT = "1/2 / 1_3/4";

    Fraction FRACTION_5_4 = new Fraction(5, 4);
    Fraction FRACTION_NEGATIVE_3_4 = new Fraction(-3, 4);
    Fraction FRACTION_3_4 = new Fraction(3, 4);
    Fraction FRACTION_2_7 = new Fraction(2, 7);


}
