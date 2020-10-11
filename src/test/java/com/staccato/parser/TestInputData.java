package com.staccato.parser;

import com.staccato.Fraction;

public interface TestInputData {

    String ADDITION_INPUT = "1/2 + 3_3/4";
    String SUBSTRACTION_INPUT = "1/2 - 3_3/4";
    String MULTIPLICATION_INPUT = "1/2 * 3_3/4";
    String DIVISION_INPUT = "1/2 / 3_3/4";

    String NO_OPERATOR_INPUT = "1/2  3_3/4";
    String MULTIPLE_OPERATOR_INPUT = "1/2 *  + 3_3/4";

    String[] DEFAULT_INPUT_ARGS = new String[] {"1/2", "3_3/4"};

    String INTEGER_INPUT = "1 + 2";
    String ZERO_LEAD_TRAIL_INPUT = "      1 + 2     ";
    String ZERO_LEAD_INPUT = "      1 + 2";
    String ZERO_LEAD_NEGATIVE_INPUT = "     -1   +   2/1 ";
    String ZERO_MID_NEGATIVE_INPUT = "  - 1/4   +   3_1 /-1 ";

    String INTEGER_ARG_INPUT = "1";
    String NEGATIVE_ARG_INPUT = "-1";
    String FRACTION_ARG_INPUT = "5/7";
    String NEGATIVE_NUMERATOR_ARG_INPUT = "-12/71";
    String NEGATIVE_DENOMINATOR_ARG_INPUT = "34/-19";
    String ZERO_DENOMINATOR_ARG_INPUT = "4/0";
    String MIXED_NUMBER_ARG_INPUT = "2_3/8";

    Fraction INTEGER_FRACTION = new Fraction(1, 1);
    Fraction NEGATIVE_FRACTION = new Fraction(-1 ,1);
    Fraction FRACTION_FRACTION = new Fraction(5, 7);
    Fraction NEGATIVE_NUMERATOR_FRACTION = new Fraction(-12, 71);
    Fraction NEGATIVE_DENOMINATOR_FRACTION = new Fraction(34, -19);
    Fraction MIXED_OUTPUT_FRACTION = new Fraction(19, 8);

    Fraction INTEGER_ONE_FRACTION = new Fraction(40, 40);
    Fraction MULTIPLE_BY_10 = new Fraction(400, 10);
    Fraction NON_REDUSABLE_FUNCTION = new Fraction(8888, 5);
    Fraction INT_1_FRACTION = new Fraction(1, 1);
    Fraction INT_10_FRACTION = new Fraction(10, 1);
    Fraction NEGATIVE_DENOMINATOR_REDUCED_FRACTION = new Fraction(12, -36);
    Fraction POSITIVE_REDUCED_FRACTION = new Fraction(-12, -36);
    Fraction NEGATIVE_REDUCED_FRACTION = new Fraction(-12, 36);

    Fraction INT_40_FRACTION = new Fraction(40,1);
    Fraction POSITIVE_1_3_FRACTION = new Fraction(1,3);
    Fraction NEGATIVE_1_3_FRACTION = new Fraction(-1,3);



}
