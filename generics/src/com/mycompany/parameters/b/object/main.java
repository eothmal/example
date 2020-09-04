package com.mycompany.parameters.b.object;

public class main {
    public static void main(String[] args) {

        Container intContainer = new Container(11);
        System.out.println(intContainer);

        Container strContainer = new Container("Test");
        System.out.println(strContainer);

        // NOTE : the problem is here, only compile warning but it failed on runtime
        String string = (String) intContainer.getValue();

    }
}
