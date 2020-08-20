package com.mycompany.varargs.intro;

public class MainFixVaragsTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Adding two numbers: " + calculator.addNumber(1,2));
        System.out.println("Adding three numbers: " + calculator.addNumber(1,2,3));
        // not able to handle the following
//        System.out.println("Adding three numbers: " + calculator.addNumber(1,2,3), 4);
    }
}
