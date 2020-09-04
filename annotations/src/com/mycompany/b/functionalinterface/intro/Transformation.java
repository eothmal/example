package com.mycompany.b.functionalinterface.intro;

public interface Transformation<T, V> {
    V performTransformation(T input);
}
