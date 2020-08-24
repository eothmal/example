package com.mycompany.parameters.e.type;

public class Employee {
    private String name;
    private String department;
    private String title;

    public Employee(String name, String department, String title) {
        this.name = name;
        this.department = department;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
