package com.mycompany.custom.intro;

public class MainNotEffectiveRequiredTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setType(Person.Type.STUDENT);
        p1.setName("John");

        Person p2 = new Person();
        p1.setType(Person.Type.STAFF);

        Person p3 = new Person();
        p3.setName("Lucy");

        System.out.println("Person1: " + p1);
        System.out.println("Person2: " + p2);
        System.out.println("Person3: " + p2);

    }
}
