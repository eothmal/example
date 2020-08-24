package com.mycompany.parameters.l.c.vargs;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Utilities.displayElement("Hello", 10, 10.33f, new Date());
        Utilities.displayElement("Hello", "World");
        Utilities.displayElement(10.5f, 29.3f);
        Utilities.displayElement("Hello", 11);
        Utilities.displayElement(12.2f, "World");
    }
}
