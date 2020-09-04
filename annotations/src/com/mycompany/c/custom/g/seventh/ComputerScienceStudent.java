package com.mycompany.c.custom.g.seventh;

@Major(specialization = "Programming Languages",
        advisor = "Prof Lang gosling")
public class ComputerScienceStudent extends Person {
    public ComputerScienceStudent(String name) {
        super(name, Type.STUDENT);
    }
}
