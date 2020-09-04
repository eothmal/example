package com.mycompany.c.custom.a.intro;

public class Person {
    public enum Type{
        STUDENT,
        STAFF
    }

    @Required
    private long id;
    @Required
    private String name;
    @Required
    private Type type;

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
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", physicalAddress='" + physicalAddress + '\'' +
                '}';
    }
}
