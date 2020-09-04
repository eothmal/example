package com.mycompany.parameters.e.type;

public class Container<T> {
// NOTE : These two variables will not be allowed
//    private static final SomeStaticValue ;
//    private T value = "Test";
    private T value;

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
