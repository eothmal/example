package com.sample.cdefaultnstaticininterface;

public class Main {
    public static void main(String[] args) {

        MyConcreteClass myConcreteClass = new MyConcreteClass();

        myConcreteClass.log("log");
        myConcreteClass.method1("method");
        myConcreteClass.method2();
        
        
        int i=0, j=5, k=10;
        int test=0;
        
//        while ( (i++ < j) ) {
//        	while (  (j < --k)) {
        		while ( (i++ < j) || (j < --k)) {
        	test++;
        }
        System.out.println(test);
    }
}
