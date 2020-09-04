package com.company.wildcard.c.inherited.a;

public class Container {

    private Object value;

    public Container(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Container{" +
                "value=" + value +
                '}';
    }
}
