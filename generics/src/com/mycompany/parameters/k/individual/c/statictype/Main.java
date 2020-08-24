package com.mycompany.parameters.k.individual.c.statictype;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("AAAA", "BBBB", "CCCC", "DDDD", "EEEE");

        System.out.println("Original list: " + nameList);

        Utilities.swap(nameList, 0, 4);

        System.out.println("\nSwapped list: " + nameList);

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Original list: " + numberList);

        Utilities.swap(numberList, 0, 4);

        System.out.println("\nSwapped list: " + numberList);



    }
}
