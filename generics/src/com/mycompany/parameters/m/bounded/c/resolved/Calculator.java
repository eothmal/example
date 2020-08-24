package com.mycompany.parameters.m.bounded.c.resolved;

public class Calculator {

    @SafeVarargs
    public static <T extends Number> double add(T... elements){
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
    public static <T extends Number> double multiply(T... elements){
        double result = 0;
        for ( T element : elements){
            result = result * ((Number) element).doubleValue();
        }
        return result;
    }
}
