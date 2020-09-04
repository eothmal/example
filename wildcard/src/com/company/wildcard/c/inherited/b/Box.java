package com.company.wildcard.c.inherited.b;
//NOTE : raw container
public class Box extends Container{
    public Box(Object value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Box{} contain: " + getValue();
    }
}
