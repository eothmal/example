package com.mycompany.parameters.l.e;

public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(11, "AAAA");
        Pair<Integer, String> pair2 = new Pair<>(11, "AAAA");

        System.out.println("pair1 equal to pair2: " +
                Utilities.<Integer, String>pairEquals(pair1,pair2));

        System.out.println("pair1 equal to pair2 (using inference)?: " +
                Utilities.pairEquals(pair1,pair2));

        Pair<String, Integer> pair3 = new Pair<>("AAAA", 11);
        Pair<Integer, String> pair4 = new Pair<>(11, "AAAA");

        //NOTE :  error at compile time in pairEquals
//        System.out.println("pair3 equal to pair4 (using inference)?: " +
//                Utilities.pairEquals(pair3, pair4));
    }
}
