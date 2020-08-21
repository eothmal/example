package com.mycompany.parameters.h.eighth.convention;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Employee<Integer> employee1 = new Employee<>(123, 1000, 100);

        System.out.println(employee1);

        Employee<BigInteger> employee2 = new Employee<>(
                BigInteger.valueOf(123456),
                BigInteger.valueOf(1234567),
                BigInteger.valueOf(123456) );

        System.out.println(employee2);

        Employee<Double> employee3 = new Employee<>(1230000.0, 100000.34, 10000.34);

        System.out.println(employee3);

    }
}
