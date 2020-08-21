package com.mycompany.parameters.f.sixth.error;

public class Container<T> {
    // NOTE : These two variables will not be allowed
//    private static final SomeStaticValue ;
//    private T value = "Test
// NOTE : This is wrong example of supperssWarning
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
