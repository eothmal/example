package com.mycompany.custom.e.fifth;

public class Person {
    public enum Type {
        STUDENT,
        STAFF
    }

    @Required
    private long id;
    @Required
    private String name;
    @Required
    private Type type;

    public Person() {
        this.id = Math.round(Math.random()) * 10000;
    }

    private String physicalAddress;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    @Override
    public String toString() {
        String stringRepresentation = "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", physicalAddress='" + physicalAddress + '\'' +
                '}';
        return stringRepresentation;
    }
}
