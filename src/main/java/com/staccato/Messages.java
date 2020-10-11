package com.staccato;

public interface Messages {

    String OPERATOR_PARSE_ERROR = "Only one operator should be present for an operation";

    String ARGUMENT_PARSE_ERROR = "There must be exactly 2 arguments for any operation";

    String FRACTION_PARSE_ERROR = "One of your fractions is not syntactically correct";

    String NUMBER_PARSE_ERROR = "Numbers should contain only underscore";

    String DIVISION_BY_ZERO_ERROR = "Division by zero is not allowed";

    String FRACTION_SYNTAX_ERROR = "Mixed fractions should only contain one negative sign";

    String OPERATOR_NOT_FOUND_ERROR = "Operations should have ONE operator";

    String DIVISION_BY_ZERO_ATTEMPTED = "Division by zero attempted";
}
