package com.mycompany.parameters.m.bounded.a.intro;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nAdd number 2, 3, 4, 5: " +
                Calculator.add(2, 3, 4, 5));

        System.out.println("\nAdd number 2.5, 3, 4.5f, 5: " +
                Calculator.add(2.5, 3, 4.5f, 5));

        System.out.println("\nAdd number 2, 3, 4, 50000000: " +
                Calculator.add(2, 3, 4, BigInteger.valueOf(50000000)));
// NOTE : Error at runtime and it is not detected by compiler
        System.out.println("\nAdd Other objects 2, ArrayList, 4, Date: " +
                Calculator.add(2, new ArrayList<String>(), 4, new Date()));
    }
}
