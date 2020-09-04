package com.company.wildcard.c.inherited.b;

import com.company.wildcard.c.inherited.a.Box;
import com.company.wildcard.c.inherited.a.Container;

public class Main {
    public static void main(String[] args) {

        com.company.wildcard.c.inherited.a.Box box = new com.company.wildcard.c.inherited.a.Box(10);

        Container container = new com.company.wildcard.c.inherited.a.Box(100);

        Object object = new Box(1000);

        System.out.println("Box is-a Box: " + box);
        System.out.println("Box is-a Container: " + container);
        System.out.println("Box is-a Object: " + object);

        Object boxValue = box.getValue();
        Object containerValue = container.getValue();

        System.out.println("\nBox value: " + boxValue);
        System.out.println("\nContainer value: " + containerValue);
    }
}
