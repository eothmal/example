package com.mycompany.b.functionalinterface.second;

@FunctionalInterface
public interface Action<T> {
    void performAction(T input);

    default void performAnotherAction(T input){
        System.out.println(input);
    }
}

//NOTE: only one abstract method, can be instantiated and default method implementation.
