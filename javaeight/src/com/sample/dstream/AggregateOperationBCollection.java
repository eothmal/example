package com.sample.dstream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class AggregateOperationBCollection {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]
                {23, 24, 100, 200, 20, 100};

        Collection<Integer> collection = Arrays.asList(intArray);

        for (Integer num: collection){
            if (num > 50){
            System.out.println("There is at least one number >50");
            break;
            }
        }

        boolean lessThan0 = false;

        for (Integer num : collection) {
            if (num < 0){
                lessThan0 = true;
                break;
        }

        }
        System.out.println("\nThere is at least one number <0: " + lessThan0);

    }
}
