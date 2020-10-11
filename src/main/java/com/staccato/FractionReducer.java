package com.staccato;

import java.util.HashSet;
import java.util.Set;

public class FractionReducer {

    public static Fraction reduce(Fraction input) {
        if(input.getDenominator() == 1 || input.getNumerator() == 1) return new Fraction(input);

        Set<Integer> numeratorDividers = findDividers(input.getNumerator());
        Set<Integer> denominatorDividers = findDividers(input.getDenominator());

        Fraction result = new Fraction(input.getNumerator(), input.getDenominator());

        numeratorDividers.retainAll(denominatorDividers);

        for(Integer divider : numeratorDividers) {
            int numerator = result.getNumerator();
            int denominator = result.getDenominator();
            while (numerator % divider == 0 && denominator % divider == 0) {
                numerator = numerator/divider;
                denominator = denominator/divider;
            }
            result.setNumerator(numerator);
            result.setDenominator(denominator);
        }
        return result;
    }

    public static Set<Integer> findDividers(int number) {
        Set<Integer> dividerSet = new HashSet<>();
        for (int divider = 2; divider <= Math.sqrt(Math.abs(number)); divider++) {
            if(number % divider == 0) dividerSet.add(divider);
        }
        dividerSet.add(number);
        return dividerSet;
    }

    public static String reduceToMixed(Fraction fraction) {
        //whole number
        if(fraction.getNumerator() % fraction.getDenominator() == 0) {
            return fraction.toString();
        }
        //fraction
        if(fraction.getNumerator() < fraction.getDenominator()) {
            return reduce(fraction).toString();
        }
        //mixed
        int whole = fraction.getNumerator() / fraction.getDenominator();
        Fraction wholeFraction = new Fraction(whole, 1);
        Fraction partFraction = Operations.substraction(fraction, wholeFraction);
        return wholeFraction.toString() + "_" + partFraction.toString();
    }
}
