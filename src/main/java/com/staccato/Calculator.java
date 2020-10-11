package com.staccato;

public class Calculator {

    Parser parser;
    Fraction left;
    Fraction right;
    OperatorEnum operator;

    public Calculator(String input) {
        parser = new Parser();
        operator = parser.getOperator(input);
        if(operator == OperatorEnum.NOT_FOUND) {
            throw new IllegalArgumentException(Messages.OPERATOR_NOT_FOUND_ERROR);
        }
        initArguments(input);
        calculate();

    }

    public void initArguments (String input) {
        String[] arguments = parser.getArguments(input, operator);
        Fraction parsedLeft = parser.parseArgument(arguments[0]);
        Fraction parsedRight = parser.parseArgument(arguments[1]);

        left = FractionReducer.reduce(parsedLeft);
        right = FractionReducer.reduce(parsedRight);
    }

    public Fraction calculate () {
        Fraction result = new Fraction(1,1);
        switch (operator) {
            case ADDITION:
                result = Operations.addition(left, right);
                break;
            case SUBSTRACTION:
                result = Operations.substraction(left, right);
                break;
            case MULTIPLICATION:
                result = Operations.multiplication(left, right);
                break;
            case DIVISION:
                result = Operations.division(left, right);
                break;
        }
        return FractionReducer.reduce(result);
    }


}
