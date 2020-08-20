package com.mycompany.functionalinterface.intro;

public interface Transformation<T, V> {
    V performTransformation(T input);
}
