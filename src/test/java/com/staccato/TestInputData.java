package com.staccato;

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

}
