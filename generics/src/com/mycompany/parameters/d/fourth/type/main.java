package com.mycompany.parameters.d.fourth.type;

import java.util.Date;

public class main {
    public static void main(String[] args) {

        Container<Integer> intContainer = new Container<>(11);

        Container<String> strContainer = new Container<>("Test");

        Container<Date> dateContainer = new Container<>(new Date());

        System.out.println(intContainer);
        System.out.println(strContainer);
        System.out.println(dateContainer);

        intContainer.setValue(100);
        strContainer.setValue("hundred");
        dateContainer.setValue(new Date());

        System.out.println("\nUpdated values: ");

        System.out.println(intContainer);
        System.out.println(strContainer);
        System.out.println(dateContainer);

    }
}
