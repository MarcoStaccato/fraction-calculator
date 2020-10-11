package com.staccato.operations;

import com.staccato.Fraction;
import com.staccato.Operations;
import org.junit.Assert;
import org.junit.Test;

import static com.staccato.operations.TestOperationsData.*;

public class AdditionTest {

    @Test
    public void sum_integer_fractions() {
        Fraction result = Operations.addition(FRACTION_1_1, FRACTION_5_7);
        Assert.assertEquals(FRACTION_12_7, result);
    }

    @Test
    public void sum_integer_zero_result() {
        Fraction result = Operations.addition(FRACTION_1_1, FRACTION_MINUS_1_1);
        Assert.assertEquals(FRACTION_0_1, result);
    }

    @Test
    public void sum_new_denominator() {
        Fraction result = Operations.addition(FRACTION_1_2, FRACTION_1_3);
        Assert.assertEquals(FRACTION_5_6, result);
    }

    @Test
    public void sum_negatives() {
        Fraction result = Operations.addition(FRACTION_NEGATIVE_1_3, FRACTION_NEGATIVE_1_2);
        Assert.assertEquals(FRACTION_NEGATIVE_5_6, result);
    }

    @Test
    public void sum_one_negatives() {
        Fraction result = Operations.addition(FRACTION_NEGATIVE_1_3, FRACTION_1_2);
        Assert.assertEquals(FRACTION_1_6, result);
    }

    @Test
    public void sum_zero() {
        Fraction result = Operations.addition(FRACTION_0_1, FRACTION_1_2);
        Assert.assertEquals(FRACTION_1_2, result);
    }


}
