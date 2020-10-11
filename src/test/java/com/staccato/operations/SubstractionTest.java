package com.staccato.operations;

import com.staccato.Fraction;
import com.staccato.Operations;
import org.junit.Assert;
import org.junit.Test;

import static com.staccato.operations.TestOperationsData.*;
import static com.staccato.operations.TestOperationsData.FRACTION_1_2;

public class SubstractionTest {

    @Test
    public void substract_integer_fractions() {
        Fraction result = Operations.substraction(FRACTION_1_1, FRACTION_5_7);
        Assert.assertEquals(FRACTION_2_7, result);
    }

    @Test
    public void substract_integer_zero_result() {
        Fraction result = Operations.substraction(FRACTION_1_1, FRACTION_1_1);
        Assert.assertEquals(FRACTION_0_1, result);
    }

    @Test
    public void substract_new_denominator() {
        Fraction result = Operations.substraction(FRACTION_1_2, FRACTION_1_3);
        Assert.assertEquals(FRACTION_1_6, result);
    }

    @Test
    public void substract_negatives() {
        Fraction result = Operations.substraction(FRACTION_NEGATIVE_1_3, FRACTION_NEGATIVE_1_2);
        Assert.assertEquals(FRACTION_1_6, result);
    }

    @Test
    public void substract_one_negatives() {
        Fraction result = Operations.substraction(FRACTION_NEGATIVE_1_3, FRACTION_1_2);
        Assert.assertEquals(FRACTION_NEGATIVE_5_6, result);
    }

    @Test
    public void substract_zero() {
        Fraction result = Operations.substraction(FRACTION_0_1, FRACTION_1_2);
        Assert.assertEquals(FRACTION_NEGATIVE_1_2, result);
    }


}
