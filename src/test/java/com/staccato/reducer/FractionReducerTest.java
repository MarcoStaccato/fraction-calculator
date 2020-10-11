package com.staccato.reducer;

import com.staccato.Fraction;
import com.staccato.FractionReducer;
import org.junit.Assert;
import org.junit.Test;

import static com.staccato.parser.TestInputData.*;

public class FractionReducerTest {

    @Test
    public void reduce_int() {
        Fraction reduced = FractionReducer.reduce(INTEGER_ONE_FRACTION);
        Assert.assertEquals(INT_1_FRACTION, reduced);
    }

    @Test
    public void reduce_non_redusable() {
        Fraction reduced = FractionReducer.reduce(NON_REDUSABLE_FUNCTION);
        Assert.assertEquals(NON_REDUSABLE_FUNCTION, reduced);
    }

    @Test
    public void reduce_int_1() {
        Fraction reduced = FractionReducer.reduce(INT_1_FRACTION);
        Assert.assertEquals(INT_1_FRACTION, reduced);
    }

    @Test
    public void reduce_int_10() {
        Fraction reduced = FractionReducer.reduce(INT_10_FRACTION);
        Assert.assertEquals(INT_10_FRACTION, reduced);
    }

    @Test
    public void reduce_positive() {
        Fraction reduced = FractionReducer.reduce(POSITIVE_REDUCED_FRACTION);
        Assert.assertEquals(POSITIVE_1_3_FRACTION, reduced);
    }

    @Test
    public void reduce_negative() {
        Fraction reduced = FractionReducer.reduce(NEGATIVE_REDUCED_FRACTION);
        Assert.assertEquals(NEGATIVE_1_3_FRACTION, reduced);
    }

    @Test
    public void reduce_negative_denom() {
        Fraction reduced = FractionReducer.reduce(NEGATIVE_DENOMINATOR_REDUCED_FRACTION);
        Assert.assertEquals(NEGATIVE_1_3_FRACTION, reduced);
    }
}
