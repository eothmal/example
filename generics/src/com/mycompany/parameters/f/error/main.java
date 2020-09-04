package com.mycompany.parameters.f.error;

public class main {
    public static void main(String[] args) {

        Container<String> strContainer = new Container<>("Hello");
        System.out.println(strContainer);

        Container<Integer> intContainer = new Container<>();
        System.out.println(intContainer);
// NOTE : this will be run time error
        Integer value = intContainer.getValue();
    }
}
