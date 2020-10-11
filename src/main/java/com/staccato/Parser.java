package com.staccato;

public class Parser {

    private final String OPERATOR_PLACEHOLDER = "OPERATOR";
    private final String DIVISION = "/";
    private final String UNDERSCORE = "_";

    public OperatorEnum getOperator(String input) {
        int operatorsFound = 0;
        OperatorEnum operatorEnum = OperatorEnum.NOT_FOUND;

        for (OperatorEnum op : OperatorEnum.values()) {
            if(input.contains(op.value())) {
                operatorEnum = op;
                operatorsFound++;
            }
        }
        if(operatorsFound > 1) {
            throw new IllegalArgumentException(Messages.OPERATOR_PARSE_ERROR);
        }
        return operatorEnum;
    }

    public String[] getArguments(String input, OperatorEnum operator) {
        String cleanInput = input
                .trim() //remove leading and trailing spaces
                .replace(operator.value(), OPERATOR_PLACEHOLDER); //put placeholder to split operators

        if(App.cleanSpaces) {
            cleanInput = cleanInput.replaceAll(" ", ""); //removes spaces
        }

        String[] arguments = cleanInput.split(OPERATOR_PLACEHOLDER);

        if(arguments.length != 2) { //follows [fraction, fraction]
            throw new IllegalArgumentException(Messages.ARGUMENT_PARSE_ERROR);
        }
        arguments[0] = arguments[0].trim();
        arguments[1] = arguments[1].trim();
        return arguments;
    }

    public Fraction parseArgument(String input) {
        String[] mixedArray = input.split(UNDERSCORE);

        if(mixedArray.length == 1) {
            return parseFractionArgument(mixedArray[0]);
        }else if(mixedArray.length == 2) {
            if(mixedArray[0].contains("-") && mixedArray[1].contains("-")){
                throw new IllegalArgumentException(Messages.FRACTION_SYNTAX_ERROR);
            }
            Fraction fraction = parseFractionArgument(mixedArray[1]);
            Fraction whole = FractionBuilder.build(mixedArray[0], "1");
            Fraction result = sumMixedParsed(whole, fraction);
            return result;
        }else{
            throw new IllegalArgumentException(Messages.FRACTION_PARSE_ERROR);
        }
    }

    public Fraction parseFractionArgument(String input) {
        String[] fractionArray = input.split(DIVISION);
        if(fractionArray.length >2) throw new IllegalArgumentException(Messages.FRACTION_PARSE_ERROR);
        String numerator = fractionArray[0];
        String denominator = fractionArray.length == 2 ? fractionArray[1] : "1";

        return FractionBuilder.build(numerator, denominator);
    }

    public Fraction sumMixedParsed(Fraction whole, Fraction fraction) {
        int denominator = fraction.getDenominator();
        int numerator = Math.abs(whole.getNumerator() * denominator) + Math.abs(fraction.getNumerator());

        if(whole.getNumerator() < 0 || fraction.getNumerator() < 0) {
            numerator = -numerator;
        }
        return new Fraction(numerator, denominator);
    }

}
