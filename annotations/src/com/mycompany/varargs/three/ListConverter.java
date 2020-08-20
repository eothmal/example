package com.mycompany.varargs.three;

import java.util.ArrayList;
import java.util.List;

public class ListConverter<T> {
    //SafeVarags are applied to varargs and final/static method
    //SafeVarags are not applied to fix arrity  collect( T item1, T, item2)
    @SafeVarargs
    public final List<T> collect(T... items){
        List<T> list = new ArrayList<>();

        for (T item: items){
            list.add(item);
        }
        return list;
    }
}
