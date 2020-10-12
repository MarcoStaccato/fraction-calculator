package com.staccato.parser;

import com.staccato.Fraction;
import com.staccato.Parser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.staccato.parser.TestInputData.*;

public class ArgumentParserTest {

    private Parser parser;

    @Before
    public void init ()
    {
        parser = new Parser();
    }

    @Test
    public void parse_integer_input() {
        Fraction fraction = parser.parseArgument(TestInputData.INTEGER_ARG_INPUT);
        Assert.assertEquals(INTEGER_FRACTION, fraction);
    }

    @Test
    public void parse_negative_input() {
        Fraction fraction = parser.parseArgument(NEGATIVE_ARG_INPUT);
        Assert.assertEquals(NEGATIVE_FRACTION, fraction);
    }

    @Test
    public void parse_fraction_input() {
        Fraction fraction = parser.parseArgument(FRACTION_ARG_INPUT);
        Assert.assertEquals(FRACTION_FRACTION, fraction);
    }

    @Test
    public void parse_negative_numerator_input() {
        Fraction fraction = parser.parseArgument(NEGATIVE_NUMERATOR_ARG_INPUT);
        Assert.assertEquals(NEGATIVE_NUMERATOR_FRACTION, fraction);
    }

    @Test
    public void parse_negative_denominator_input() {
        Fraction fraction = parser.parseArgument(NEGATIVE_DENOMINATOR_ARG_INPUT);
        Assert.assertEquals(NEGATIVE_DENOMINATOR_FRACTION, fraction);
    }

    @Test(expected = NumberFormatException.class)
    public void parse_zero_denominator_input() {
        Fraction fraction = parser.parseArgument(ZERO_DENOMINATOR_ARG_INPUT);
    }

    @Test
    public void parse_mixed_number_input() {
        Fraction fraction = parser.parseArgument(MIXED_NUMBER_ARG_INPUT);
        Assert.assertEquals(MIXED_OUTPUT_FRACTION, fraction);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_multiple_underscore_input() {
        parser.parseArgument(MULTIPLE_UDERSCORES_INPUT);
    }

}
