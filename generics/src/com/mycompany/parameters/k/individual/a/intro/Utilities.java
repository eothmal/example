package com.mycompany.parameters.k.individual.a.intro;

import java.util.List;

public class Utilities {

    public void swap(List<String> list, int index1, int index2){
        String one = list.get(index1);
        String two = list.get(index2);

        list.set(index1, two);
        list.set(index2, one);
    }
}
