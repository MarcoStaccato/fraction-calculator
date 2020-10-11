package com.staccato.operations;

import com.staccato.Fraction;
import com.staccato.Operations;
import org.junit.Assert;
import org.junit.Test;

import static com.staccato.operations.TestOperationsData.*;

public class DivisionTest {

    @Test
    public void divide_integer_by_fraction() {
        Fraction result = Operations.division(FRACTION_1_1, FRACTION_5_7);
        Assert.assertEquals(FRACTION_7_5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void divide_integer_by_zero() {
        Operations.division(FRACTION_1_1, FRACTION_0_1);
    }

    @Test
    public void divide_negatives() {
        Fraction result = Operations.division(FRACTION_NEGATIVE_1_3, FRACTION_NEGATIVE_1_2);
        Assert.assertEquals(FRACTION_2_3, result);
    }

    @Test
    public void divide_one_negative() {
        Fraction result = Operations.division(FRACTION_NEGATIVE_1_3, FRACTION_1_2);
        Assert.assertEquals(FRACTION_NEGATIVE_2_3, result);
    }

    @Test
    public void divide_zero() {
        Fraction result = Operations.division(FRACTION_0_1, FRACTION_1_2);
        Assert.assertEquals(FRACTION_0_1, result);
    }
}
