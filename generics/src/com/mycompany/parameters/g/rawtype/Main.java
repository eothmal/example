package com.mycompany.parameters.g.rawtype;

public class Main {
    public static void main(String[] args) {
        // NOTE : rawtype since the type is not specified
        // it worked since it is backward compatibality for legacy code
        Container rawStringContainer = new Container("Hello World");

        System.out.println(rawStringContainer);

        Object strObj = rawStringContainer.getValue();

        Container rawFloatContainer = new Container(10.5f);

        System.out.println(rawFloatContainer);

        Container<String> rawStrContainer = new Container<>("Hello");

        System.out.println(rawStrContainer);

        Object stringObj = rawStrContainer.getValue();

        rawStrContainer.setValue("Hi");

        System.out.println(rawStrContainer);

        Object floatObj = rawFloatContainer.getValue();

    }
}
