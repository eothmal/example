package com.mycompany.varargs.three;

import java.util.List;

public class MainSafeVarargsTest {
    public static void main(String[] args) {
        ListConverter<Integer> lc = new ListConverter<>();

        List<Integer> numList = lc.collect(1,2,3);

        System.out.println("List of integer: " + numList);
    }
}
