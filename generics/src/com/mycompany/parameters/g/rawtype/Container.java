package com.mycompany.parameters.g.rawtype;

public class Container<T> {
    @SuppressWarnings("unchecked")
    private T value = (T) "Test";

    public Container() {
    }

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Container{" +
                "value=" + value +
                '}';
    }
}
