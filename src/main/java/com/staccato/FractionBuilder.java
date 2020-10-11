package com.staccato;

public class FractionBuilder {

    public static Fraction build (String numeratorString, String denominatorString) {
        int maxDecimalLength = Math.max(getDecimalLength(numeratorString), getDecimalLength(denominatorString));
        try {
            double numerator = Double.parseDouble(numeratorString);
            double denominator = Double.parseDouble(denominatorString);

            return build(numerator, denominator, maxDecimalLength);
        }catch (NumberFormatException e) {
            throw new NumberFormatException(Messages.NUMBER_PARSE_ERROR);
        }

    }

    public static Fraction build (double numerator, double denominator, int maxDecimalLength) {
        if(denominator == 0){
            System.out.println(Messages.DIVISION_BY_ZERO_ERROR);
            throw new NumberFormatException();
        }
        int numeratorInt = (int)(numerator * Math.pow(10, maxDecimalLength));
        int denominatorInt = (int)(denominator * Math.pow(10, maxDecimalLength));

        return new Fraction(numeratorInt, denominatorInt);
    }

    private static int getDecimalLength(String number) {
        int result = 0;
        boolean hasDecimal = false;
        for(char c : number.toCharArray()) {
            if(c == '.'){
                hasDecimal = true;
                continue;
            }
            if(hasDecimal) result++;
        }
        return result;
    }
}
