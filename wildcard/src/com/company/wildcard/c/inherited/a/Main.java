package com.company.wildcard.c.inherited.a;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(10);

        Container container = new Box(100);

        Object object = new Box(1000);

        System.out.println("Box is-a Box: " + box);
        System.out.println("Box is-a Container: " + container);
        System.out.println("Box is-a Object: " + object);
    }
}
