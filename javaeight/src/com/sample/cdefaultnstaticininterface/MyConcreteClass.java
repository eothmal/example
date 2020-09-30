package com.sample.cdefaultnstaticininterface;

public class MyConcreteClass implements Interface1, Interface2{

    @Override
    public void method2() {
        System.out.println("MyConcreteClass::method2");
    }

    @Override
    public void method1(String str) {
        System.out.println("MyConcreteClass::method1: "+str);
    }

    //This Class won't compile without having it's own log() implementation
    @Override
    public void log(String str){
        System.out.println("MyConcreteClass logging::"+str);
        Interface1.print("abc");
    }

}

