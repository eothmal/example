package com.mycompany.parameters.l.e;

public class Utilities {

    public static <K, V> boolean pairEquals(Pair<K, V> pair1, Pair<K, V> pair2){
        if (pair1.getKey().equals(pair2.getKey()) &&
        pair1.getValue().equals(pair2.getValue())){
            return true;
        }
        return false;
    }
}
