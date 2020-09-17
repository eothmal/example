package com.sample.dstream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class AggregateOperationAIntro {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]
                {23, 24, 100, 200, 20, 100};

        Collection<Integer> collection = Arrays.asList(intArray);
        Stream<Integer> stream = collection.stream();

        //NOTE: Stream operation can return result - such operations are known as terminal
        //operation. Count is the simplest terminal operation.
        System.out.println("\nCount the elements in a stream: " + stream.count());

        //NOTE: stream already closed since count is a terminal operation
//        System.out.println("\nCount distinct element in a stream: " + stream.distinct());

        Stream<Integer> distinctStream = collection.stream().distinct();
        System.out.println("\nCount distinct element in a stream: " + distinctStream.count());

        Stream<Integer> limitStream = collection.stream().limit(5);
        System.out.println("\nCount element in a limit stream: " + limitStream.count());

        Stream<Integer> skipStream = collection.stream().skip(2);
        System.out.println("\nCount element in a skipped stream: " + skipStream.count());

        Stream<Integer> sortedStream = collection.stream().sorted();
        //NOTE : toArray is a terminal operation, it is not returning Stream
        System.out.println("\nCount element in a sorted stream: " + Arrays.toString(sortedStream.toArray()));
    }
}
