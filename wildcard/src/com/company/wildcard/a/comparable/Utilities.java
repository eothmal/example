package com.company.wildcard.a.comparable;

public class Utilities {

    public static <K extends Comparable<K>, V extends Comparable<V>> Pair<K, V>
    returnLarger(Pair<K, V> pair1, Pair<K, V> pair2){

        if (pair1.compareTo(pair2) > 0){
            return pair1;
        } else if (pair1.compareTo(pair2) < 0){
            return pair2;
        }

        // NOTE: if compareTo return 0 both are equal so can return any one
        return pair1;
    }
}
