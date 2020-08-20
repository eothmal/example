package com.mycompany.c.custom.g.seventh;

public class Person {
    public enum Type {
        STUDENT,
        STAFF
    }
    private long id;
    private String name;
    private Type type;

    public Person(String name, Type type) {
        this.id = Math.round(Math.random() * 10000);

        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        String stringRepresentation = "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
        return stringRepresentation;
    }
}
