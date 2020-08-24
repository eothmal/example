package com.mycompany.parameters.i.convention;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(11, "Edwin");
        System.out.println("\n Integer String Pair: " + pair1);

        Pair<Integer, Double> pair2 = new Pair<>(11, 100000.51);
        System.out.println("\n Integer Double Pair: " + pair2);

        Pair<String, Date> pair3 = new Pair<>("Edo", new Date());
        System.out.println("\n Integer Double Pair: " + pair3);
    }
}
