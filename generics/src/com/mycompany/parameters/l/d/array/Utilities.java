package com.mycompany.parameters.l.d.array;

import java.util.List;

public class Utilities {
    public static <T> void swap(List<T> list, int index1, int index2) {
        T one = list.get(index1);
        T two = list.get(index2);

        list.set(index1, two);
        list.set(index2, one);
    }

    public static <T> void displayElement(T element) {

        System.out.println("-------------------------");
        System.out.println(element);
        System.out.println("-------------------------");
    }

    public static <T> void displayElement(T[] elements) {

        System.out.println("-------------------------");
        for (T element : elements) {
            System.out.println(element);
        }
        System.out.println("-------------------------");
    }

}
