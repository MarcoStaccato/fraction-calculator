package com.staccato;

public enum OperatorEnum {

    ADDITION (" + "),
    SUBSTRACTION (" - "),
    MULTIPLICATION (" * "),
    DIVISION (" / "),
    NOT_FOUND ("NOT FOUND");

    private String value;

    OperatorEnum(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
