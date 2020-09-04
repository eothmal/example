package com.company.wildcard.c.inherited.d;

public class Box extends Container<Integer> {
    public Box(Integer value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Box{} contain: " + getValue();
    }
}
