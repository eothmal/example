package com.mycompany.parameters.n.constraints.c;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Pair<String, BigInteger> ganif = new Pair<>(
                "Ganif", BigInteger.valueOf(100000));
        Pair<String, BigInteger> nanna = new Pair<>(
                "Nanna", BigInteger.valueOf(5000000));
        Pair<String, BigInteger> yisha = new Pair<>(
                "Yisha", BigInteger.valueOf(1000000));

        System.out.println("\nLarger of anif and more: " + Utilities.returnLarger(ganif, nanna));
        System.out.println("\nLarger of anna and more: " + Utilities.returnLarger(nanna, yisha));
    }
}
