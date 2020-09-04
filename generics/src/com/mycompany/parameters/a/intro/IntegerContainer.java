package com.mycompany.parameters.a.intro;

public class IntegerContainer {
    private  Integer value;

    public IntegerContainer(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "IntegerContainer{" +
                "value=" + value +
                '}';
    }
}
