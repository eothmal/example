package com.mycompany.a.varargs.d.fourth;

import java.util.ArrayList;
import java.util.List;

public class MainUnSafevargsTest {
    //NOTE: Error on runtime
//    Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//    at com.mycompany.varargs.fourth.ListConverter.performUnsafeOperation(ListConverter.java:17)
//    at com.mycompany.varargs.fourth.MainUnSafevargsTest.main(MainUnSafevargsTest.java:10)

    public static void main(String[] args) {
        ListConverter<Integer> lc = new ListConverter<Integer>();
        List<String> list1 = new ArrayList<String >();
        lc.performUnsafeOperation(list1, list1, list1);
    }
}
