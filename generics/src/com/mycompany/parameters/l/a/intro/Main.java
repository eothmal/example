package com.mycompany.parameters.l.a.intro;

public class Main {
    public static void main(String[] args) {
        Utilities.displayElement("Hello", "World");
        Utilities.displayElement(10.5f, 29.3f);

        // Even this will work
        Utilities.displayElement("Hello", 11);
        Utilities.displayElement(12.2f, "World");
    }
}
