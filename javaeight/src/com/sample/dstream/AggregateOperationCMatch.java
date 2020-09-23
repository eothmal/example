package com.sample.dstream;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class AggregateOperationCMatch {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]
                {23, 24, 100, 200, 20, 100};

        Collection<Integer> collection = Arrays.asList(intArray);

        boolean greaterThan50 = collection.stream()
                .allMatch(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer t) {
                        return t > 50;
                    }
                });

        System.out.println("Are all members > 50: " + greaterThan50);

        boolean greaterThan0 = collection.stream()
                .allMatch(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer t) {
                        return t > 0;
                    }
                });

        System.out.println("Are all members > 0: " + greaterThan0);

        boolean anyLessThan0 = collection.stream()
                .anyMatch( n -> n < 0 );

        System.out.println("Is any number < 0: " + anyLessThan0);

        boolean anyGreaterThan100 = collection.stream()
                .anyMatch( n -> n > 100 );

        System.out.println("Is any number >100: " + anyGreaterThan100);

        boolean noneLessThan0 = collection.stream()
                .noneMatch( n -> n < 100 );

        System.out.println("Are no numbers <0: " + noneLessThan0);


        boolean noneGreaterThan30 = collection.stream()
                .noneMatch( n -> n > 30 );

        System.out.println("Are no numbers >30: " + noneGreaterThan30);





    }
}
