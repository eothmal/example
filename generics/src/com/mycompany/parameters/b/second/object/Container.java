package com.mycompany.parameters.b.second.object;

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
