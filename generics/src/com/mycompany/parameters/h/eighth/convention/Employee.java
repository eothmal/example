package com.mycompany.parameters.h.eighth.convention;

public class Employee<N> {

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
