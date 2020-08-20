package com.mycompany.functionalinterface.second;

public interface Transformation<T, V> {
    V performTransformation(T input);

    @Override
    public boolean equals(Object obj);
}

//NOTE: only one abstract method, can be instantiated and also override obj method.