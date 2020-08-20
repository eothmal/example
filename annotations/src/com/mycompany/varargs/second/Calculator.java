package com.mycompany.varargs.second;

public class Calculator {
    public long addNumbers(int... numbs){
        int sum = 0;
        for ( int num : numbs){
            sum +=num;
        }
        return sum;
    }
}
