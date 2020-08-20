package com.mycompany.custom.d.fourth.target.multiple.elementtype;

//@Required
public class Person {
//@Required
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

//    @Required
    public Person() {
        this.id = Math.round(Math.random()) * 10000;
    }

    private String physicalAddress;

//    public void setId(@Required long id) {
//        this.id = id;
//    }
    @Required
    public void setId( long id) {
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
        @Required
        String stringRepresentation = "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", physicalAddress='" + physicalAddress + '\'' +
                '}';
        return stringRepresentation;
    }
}
