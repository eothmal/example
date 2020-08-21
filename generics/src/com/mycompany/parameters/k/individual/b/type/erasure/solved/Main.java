package com.mycompany.parameters.k.individual.b.type.erasure.solved;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("AAAA", "BBBB", "CCCC", "DDDD", "EEEE");

        System.out.println("Original list: " + nameList);

        Utilities<String> utilities = new Utilities();
        utilities.swap(nameList, 0, 4);

        System.out.println("\nSwapped list: " + nameList);

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Original list: " + numberList);

        Utilities<Integer> utilities1 = new Utilities();
        utilities1.swap(numberList, 0, 4);

        System.out.println("\nSwapped list: " + numberList);

 

    }
}
