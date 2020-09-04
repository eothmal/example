package com.mycompany.c.custom.j.tenth;

public class Main {
    public static void main(String[] args) {

        NumericList<Integer> integers = new NumericList<>();

        integers.add(2);
        integers.add(3);

        System.out.println(integers);

        NumericList<String> strings = new NumericList<>();

        strings.add("Java");
        strings.add("golang");

        checkListDataType(strings);
        System.out.println(strings);
    }

    private static <T> void checkListDataType(NumericList<T> list) {
        for (T t: list){
            if ((t instanceof Integer)||
                    (t instanceof Float) ||
                    (t instanceof Long) ||
                    (t instanceof  Double))
                break;
        }
        throw new IllegalArgumentException();
    }
}
