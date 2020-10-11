package com.staccato;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        if(numerator / denominator == 1) {
            numerator = 1;
            denominator = 1;
        }
        if(numerator < 0 && denominator < 0){
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        }
        if(denominator <0) {
            numerator = -numerator;
            denominator = Math.abs(denominator);
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction f) {
        this(f.getNumerator(), f.getDenominator());
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        if(numerator % denominator == 0) return "" + numerator/denominator;
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Fraction)) return false;
        Fraction objFraction = (Fraction) obj;
        return this.numerator == objFraction.numerator && this.denominator == objFraction.denominator;
    }
}
