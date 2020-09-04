package com.mycompany.b.functionalinterface.second;

public class MainFunctionalInterfaceTest {

    public static void main(String[] args) {

        MyList<String> myList = new MyList<>();

        myList.add("Austin");
        myList.add("Bertie");
        myList.add("Cheryl");
        myList.add("Desmond");

    myList.performActionOnEach(new Action<String>() {
        @Override
        public void performAction(String input) {
            System.out.println(input);
        }
    });

    MyList<String> transformedList = myList.applyTransformationOnEach(new Transformation<String, String>() {
        @Override
        public String performTransformation(String input) {
            return input.toUpperCase();
        }
    });

        System.out.println();
        System.out.println(transformedList);


    }
}
