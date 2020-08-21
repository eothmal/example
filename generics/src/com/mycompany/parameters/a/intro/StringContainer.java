package com.mycompany.parameters.a.intro;

public class StringContainer {
    private String value;

    public StringContainer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StringContainer{" +
                "value='" + value + '\'' +
                '}';
    }
}
