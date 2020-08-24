package com.mycompany.parameters.k.individual.c.statictype;

import java.util.List;

public class Utilities {
// NOTE: this method qualify as static, not depend on other variable
    public static <T> void swap(List<T> list, int index1, int index2){
        T one = list.get(index1);
        T two = list.get(index2);

        list.set(index1, two);
        list.set(index2, one);
    }

}
