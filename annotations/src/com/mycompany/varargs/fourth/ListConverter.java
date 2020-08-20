package com.mycompany.varargs.fourth;

import java.util.Arrays;
import java.util.List;

public class ListConverter<T> {
    // NOTE: this method is not actually safe

    @SafeVarargs
    public final void performUnsafeOperation(List<String>... stringList){
        Object[] array = stringList;

        List<Integer> tmpList = Arrays.asList(42);

        // NOTE: Semantically invalid, but compiles without warning
        array[0] = tmpList;
        String s = stringList[0].get(0);

    }
}
