package com.mycompany.parameters.c.type;

import java.util.Date;

public class main {
    public static void main(String[] args) {

        Container<Integer> intContainer = new Container<>();
        intContainer.value = 11;
        // NOTE : compile error
//        intContainer.value = "Test";
        System.out.println(intContainer);

        Container<String> strContainer = new Container<>();
        strContainer.value = "Test";
        // NOTE: error during compile time
//        strContainer.value = 11;
        System.out.println(strContainer);

        Container<Date> dateContainer = new Container<>();
        dateContainer.value = new Date();

    }
}
