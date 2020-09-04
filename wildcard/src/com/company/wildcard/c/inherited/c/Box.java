package com.company.wildcard.c.inherited.c;

public class Box extends Container<Object> {
    public Box(Object value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Box{} contain: " + getValue();
    }
}
