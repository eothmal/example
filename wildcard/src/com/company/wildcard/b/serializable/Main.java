package com.company.wildcard.b.serializable;


import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        Pair<String, BigInteger> julie = new Pair<>(
                "Julie", BigInteger.valueOf(100000));
        Pair<String, BigInteger> gregory = new Pair<>(
                "Gregory", BigInteger.valueOf(100000));
        Pair<String, BigInteger> nora = new Pair<>(
                "Nora", BigInteger.valueOf(5000000));
        Pair<String, BigInteger> yves = new Pair<>(
                "Yves", BigInteger.valueOf(1000000));

        Utilities.saveLarger(nora, yves);
        System.out.println(Utilities.readLarger());

        System.out.println();

        Utilities.saveLarger(julie, gregory);
        System.out.println(Utilities.readLarger());
    }
}
