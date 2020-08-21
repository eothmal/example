package com.mycompany.parameters.k.individual.a.intro;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("AAAA", "BBBB", "CCCC", "DDDD", "EEEE");

        System.out.println("Original list: " + nameList);

        Utilities utilities = new Utilities();
        utilities.swap(nameList, 0, 4);

        System.out.println("\nSwapped list: " + nameList);

        List<Integer> nameList1 = Arrays.asList(1, 2, 3, 4, 5);
        // NOTE : Error - not expected Integer
//        utilities.swap(nameList1,0, 4);


    }
}
