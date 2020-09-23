package com.sample.dstream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class AggregateOperationDfilter {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]
                {23, 24, 100, 200, 20, 100};

        Collection<Integer> collection = Arrays.asList(intArray);

        Stream<Integer> lessThank100Stream = collection.stream()
                .filter(n -> n < 100);

        System.out.println("\nElements less than 100: " +
                Arrays.toString(lessThank100Stream.toArray()));

        long lessThan100DistinctCount = collection.stream()
                .filter( n -> n < 100)
                .distinct()
                .count();

        System.out.println("\nDistinct element less than 100: " + lessThan100DistinctCount);

    }
}
