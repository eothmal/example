package com.mycompany.parameters.m.bounded.b.not.effective;

public class Calculator {

  @SafeVarargs
  public static <T extends Object> double add(T... elements){
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
  public static <T extends Object> double multiply(T... elements){
    double result = 0;
    for ( T element : elements){
      result = result * ((Number) element).doubleValue();
    }
    return result;
  }
}
