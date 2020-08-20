package com.mycompany.c.custom.g.seventh;

@Major(specialization = "Network",
        advisor = "Prof Nate Claus")
public class ElectricalEngineeringStudent extends Person {
    public ElectricalEngineeringStudent(String name) {
        super(name, Type.STUDENT);
    }
}
