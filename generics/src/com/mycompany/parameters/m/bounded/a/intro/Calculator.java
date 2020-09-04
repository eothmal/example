package com.mycompany.parameters.m.bounded.a.intro;

public class Calculator {

    @SafeVarargs
    public static <T> double add(T... elements){
        double result = 0;
        for ( T element : elements){

            // NOTE : This cast here basically expects instance
            // of Number class but our generic type parameter
            // can be of any data type
            result = result + ((Number) element).doubleValue();
        }
        return result;
    }

    @SafeVarargs
    public static <T> double multiply(T... elements){
        double result = 0;
        for ( T element : elements){
            result = result * ((Number) element).doubleValue();
        }
        return result;
    }
}
