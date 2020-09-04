package com.mycompany.parameters.h.convention;

public class Employee<N> {
    // NOTE: type parameter convention uppercase (it will work with lower case too)
    //       N - for numeric K - Key  V - Value etc

    private N id;
    private N salary;
    private N bonus;

    public Employee(N id, N salary, N bonus) {
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
