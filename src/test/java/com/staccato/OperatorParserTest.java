package com.staccato;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.staccato.TestInputData.*;

public class OperatorParserTest {

    private Parser parser;

    @Before
    public void init ()
    {
        parser = new Parser();
    }

    @Test
    public void parse_addition_operator () {
        OperatorEnum operator = parser.getOperator(ADDITION_INPUT);
        Assert.assertEquals(operator, OperatorEnum.ADDITION);
    }

    @Test
    public void parse_substraction_operator () {
        OperatorEnum operator = parser.getOperator(SUBSTRACTION_INPUT);
        Assert.assertEquals(operator, OperatorEnum.SUBSTRACTION);
    }
    @Test
    public void parse_multiplication_operator () {
        OperatorEnum operator = parser.getOperator(MULTIPLICATION_INPUT);
        Assert.assertEquals(operator, OperatorEnum.MULTIPLICATION);
    }
    @Test
    public void parse_division_operator () {
        OperatorEnum operator = parser.getOperator(DIVISION_INPUT);
        Assert.assertEquals(operator, OperatorEnum.DIVISION);
    }

    @Test
    public void parse_no_operator () {
        OperatorEnum operator = parser.getOperator(NO_OPERATOR_INPUT);
        Assert.assertEquals(operator, OperatorEnum.NOT_FOUND);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_multiple_operators() {
        OperatorEnum operator = parser.getOperator(MULTIPLE_OPERATOR_INPUT);
    }

}
