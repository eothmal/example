package com.mycompany.parameters.e.type;

public class main {
    public static void main(String[] args) {

        Employee e = new Employee("name","depart", "title");
        Container<Employee> empContainer = new Container<>(e);
        System.out.println(empContainer);


    }
}
