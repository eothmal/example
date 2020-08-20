package com.mycompany.functionalinterface.intro;

@FunctionalInterface
public interface Action<T> {
    void performAction(T input);
}

//NOTE: only one abstract method, can be instantiated by using anonymous inner cas or importantly,
//      by using lambda function
//      while working with stream APIs and collection in Java
