package com.company.wildcard.a.comparable;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pair<String, BigInteger> julie = new Pair<>(
                "Julie", BigInteger.valueOf(100000));
        Pair<String, BigInteger> gregory = new Pair<>(
                "Gregory", BigInteger.valueOf(100000));
        Pair<String, BigInteger> nora = new Pair<>(
                "Nora", BigInteger.valueOf(5000000));
        Pair<String, BigInteger> yves = new Pair<>(
                "Yves", BigInteger.valueOf(1000000));

        System.out.println("\nLarger of gregory and nora: " +
                Utilities.returnLarger(gregory,nora));

        System.out.println("\nLarger of nora and yves: " +
                Utilities.returnLarger(nora, yves));

        System.out.println("\nLarger of gregory and julie: " +
                Utilities.returnLarger(gregory,julie));

        List<Pair<String, BigInteger>> pairList = Arrays.asList(julie, gregory, nora, yves);
        System.out.println("\nOriginal list: " + pairList);

        Collections.sort(pairList);

        System.out.println("\nsorted list: " + pairList);
    }
}
