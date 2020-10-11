package com.staccato;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.staccato.TestInputData.ZERO_LEAD_NEGATIVE_INPUT;
import static com.staccato.TestInputData.ZERO_MID_NEGATIVE_INPUT;

public class ArgumentSplitterCleanFlagTest {

    static {
        App.cleanSpaces = true;
    }

    private Parser parser;

    @Before
    public void init ()
    {
        parser = new Parser();
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
        Assert.assertEquals("-1/4", arguments[0]);
        Assert.assertEquals("3_1/-1", arguments[1]);
    }
}
