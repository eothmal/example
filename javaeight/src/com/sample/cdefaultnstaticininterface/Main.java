package com.sample.cdefaultnstaticininterface;

public class Main {
    public static void main(String[] args) {

        MyConcreteClass myConcreteClass = new MyConcreteClass();

        myConcreteClass.log("log");
        myConcreteClass.method1("method");
        myConcreteClass.method2();
    }
}
