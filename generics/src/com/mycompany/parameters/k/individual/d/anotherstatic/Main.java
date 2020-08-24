package com.mycompany.parameters.k.individual.d.anotherstatic;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Original list: " + numberList);

        Utilities.<Integer>swap(numberList, 0, 4);

        System.out.println("\nSwapped list: " + numberList);

// NOTE : type inference, will work (implicit)
        Utilities.swap(numberList, 4, 0);
        System.out.println("\nSwapped back list: " + numberList);

        // NOTE : using Date
        Utilities.<Date>displayElement(new Date());

        // NOTE : type inference, will work too
        Utilities.displayElement(new Date());

    }
}
