package com.staccato;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.staccato.TestInputData.*;

public class ArgumentSplitterTest {

    static {
        App.cleanSpaces = false;
    }

    private Parser parser;

    @Before
    public void init ()
    {
        parser = new Parser();
    }

    @Test
    public void parse_addition_arguments () {
        String[] arguments = parser.getArguments(ADDITION_INPUT, OperatorEnum.ADDITION);
        Assert.assertEquals(arguments.length, 2);
        Assert.assertEquals(DEFAULT_INPUT_ARGS[0], arguments[0]);
        Assert.assertEquals(DEFAULT_INPUT_ARGS[1], arguments[1]);
    }

    @Test
    public void parse_substraction_arguments () {
        String[] arguments = parser.getArguments(SUBSTRACTION_INPUT, OperatorEnum.SUBSTRACTION);
        Assert.assertEquals(arguments.length, 2);
        Assert.assertEquals(DEFAULT_INPUT_ARGS[0], arguments[0]);
        Assert.assertEquals(DEFAULT_INPUT_ARGS[1], arguments[1]);
    }

    @Test
    public void parse_multiplication_arguments () {
        String[] arguments = parser.getArguments(MULTIPLICATION_INPUT, OperatorEnum.MULTIPLICATION);
        Assert.assertEquals(arguments.length, 2);
        Assert.assertEquals(DEFAULT_INPUT_ARGS[0], arguments[0]);
        Assert.assertEquals(DEFAULT_INPUT_ARGS[1], arguments[1]);
    }

    @Test
    public void parse_division_arguments () {
        String[] arguments = parser.getArguments(DIVISION_INPUT, OperatorEnum.DIVISION);
        Assert.assertEquals(arguments.length, 2);
        Assert.assertEquals(DEFAULT_INPUT_ARGS[0], arguments[0]);
        Assert.assertEquals(DEFAULT_INPUT_ARGS[1], arguments[1]);
    }

    @Test
    public void parse_integer_calc_arguments () {
        String[] arguments = parser.getArguments(INTEGER_INPUT, OperatorEnum.ADDITION);
        Assert.assertEquals(arguments.length, 2);
        Assert.assertEquals( "1", arguments[0]);
        Assert.assertEquals("2", arguments[1]);
    }

    @Test
    public void parse_zero_lead_trail_calc_arguments () {
        String[] arguments = parser.getArguments(ZERO_LEAD_TRAIL_INPUT, OperatorEnum.ADDITION);
        Assert.assertEquals(arguments.length, 2);
        Assert.assertEquals("1", arguments[0]);
        Assert.assertEquals("2", arguments[1]);
    }

    @Test
    public void parse_zero_lead_negative_arguments () {
        String[] arguments = parser.getArguments(ZERO_LEAD_NEGATIVE_INPUT, OperatorEnum.ADDITION);
        Assert.assertEquals(arguments.length, 2);
        Assert.assertEquals("-1", arguments[0]);
        Assert.assertEquals("2/1", arguments[1]);
    }

    @Test
    public void parse_zero_mid_negative_arguments () {
        String[] arguments = parser.getArguments(ZERO_MID_NEGATIVE_INPUT, OperatorEnum.ADDITION);
        Assert.assertEquals(arguments.length, 2);
        Assert.assertEquals("- 1/4", arguments[0]);
        Assert.assertEquals("3_1 /-1", arguments[1]);
    }

}
