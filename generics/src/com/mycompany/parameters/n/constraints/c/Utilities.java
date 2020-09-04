package com.mycompany.parameters.n.constraints.c;

public class Utilities {
    public static <K extends Comparable<K>, V> Pair<K, V> returnLarger(
            Pair<K, V> pair1, Pair<K, V> pair2){
        if (pair1.compareTo(pair2) > 0){
            return pair1;
        }else if (pair1.compareTo(pair2) < 0){
            return pair2;
        }
        return pair1;
    }
}
