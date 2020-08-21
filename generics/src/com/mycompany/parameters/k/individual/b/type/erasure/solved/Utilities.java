package com.mycompany.parameters.k.individual.b.type.erasure.solved;

import java.util.List;

public class Utilities<T> {

    public void swap(List<T> list, int index1, int index2){
        T one = list.get(index1);
        T two = list.get(index2);

        list.set(index1, two);
        list.set(index2, one);
    }
//    NOTE: the above codes solved the erasure method issue below.
//
//    public void swap(List<String> list, int index1, int index2){
//        String one = list.get(index1);
//        String two = list.get(index2);
//
//        list.set(index1, two);
//        list.set(index2, one);
//    }
//    public void swap(List<Integer> list, int index1, int index2){
//        String one = list.get(index1);
//        String two = list.get(index2);
//
//        list.set(index1, two);
//        list.set(index2, one);
//    }

}
