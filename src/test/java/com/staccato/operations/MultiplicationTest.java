package com.staccato.operations;

import com.staccato.Fraction;
import com.staccato.Operations;
import org.junit.Assert;
import org.junit.Test;

import static com.staccato.operations.TestOperationsData.*;

public class MultiplicationTest {

    @Test
    public void multiply_integer_fractions() {
        Fraction result = Operations.multiplication(FRACTION_1_1, FRACTION_5_7);
        Assert.assertEquals(FRACTION_5_7, result);
    }

    @Test
    public void multiply_integer_zero_result() {
        Fraction result = Operations.multiplication(FRACTION_1_1, FRACTION_0_1);
        Assert.assertEquals(FRACTION_0_1, result);
    }

    @Test
    public void multiply_new_denominator() {
        Fraction result = Operations.multiplication(FRACTION_1_2, FRACTION_1_3);
        Assert.assertEquals(FRACTION_1_6, result);
    }

    @Test
    public void multiply_negatives() {
        Fraction result = Operations.multiplication(FRACTION_NEGATIVE_1_3, FRACTION_NEGATIVE_1_2);
        Assert.assertEquals(FRACTION_1_6, result);
    }

    @Test
    public void multiply_one_negatives() {
        Fraction result = Operations.multiplication(FRACTION_NEGATIVE_1_3, FRACTION_1_2);
        Assert.assertEquals(FRACTION_NEGATIVE_1_6, result);
    }

    @Test
    public void multiply_zero() {
        Fraction result = Operations.multiplication(FRACTION_0_1, FRACTION_1_2);
        Assert.assertEquals(FRACTION_0_1, result);
    }
}
