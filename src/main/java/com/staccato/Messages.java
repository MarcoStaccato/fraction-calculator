package com.staccato;

public interface Messages {

    public final String OPERATOR_PARSE_ERROR = "Only one operator should be present for an operation";

    public final String ARGUMENT_PARSE_ERROR = "There must be exactly 2 arguments for any operation";

    public final String FRACTION_PARSE_ERROR = "One of your fractions is not syntactically correct";

    public final String NUMBER_PARSE_ERROR = "Numbers should contain only underscore";

    public final String DIVISION_BY_ZERO_ERROR = "Division by zero is not allowed";

    public final String FRACTION_SYNTAX_ERROR = "Mixed fractions should only contain one negative sign";
}
