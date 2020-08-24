package com.mycompany.parameters.l.d.array;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Object[] objArray = new Object[]{"Hello", 10, 10.33f, new Date()};
        Utilities.displayElement(objArray);

        String[] strArray = new String[]{"Hello", "Ami", "Chuck"};
        Utilities.displayElement(strArray);
    }
}
