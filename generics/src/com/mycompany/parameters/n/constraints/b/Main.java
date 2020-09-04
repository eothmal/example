package com.mycompany.parameters.n.constraints.b;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Pair<String, BigInteger> pair1 = new Pair<>(
                "Aman", BigInteger.valueOf(1000000));

        Pair<Integer, BigInteger> pair2 = new Pair<>(
                11 , BigInteger.valueOf(1000000));

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
