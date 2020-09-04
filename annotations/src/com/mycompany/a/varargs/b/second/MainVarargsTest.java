package com.mycompany.a.varargs.b.second;

public class MainVarargsTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Adding two numbers: " + calculator.addNumbers(1,2));
        System.out.println("Adding three numbers: " + calculator.addNumbers(1,2,3));
        System.out.println("Adding four numbers: " + calculator.addNumbers(1,2,3,4));
    }
}
