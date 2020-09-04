package com.mycompany.parameters.j.multiple;

import java.util.Arrays;
import java.util.List;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Triplet<Integer, String, String> t1 = new Triplet<>(11, "AAAA", "BBBB");
        Triplet<Integer, String, String> t2 = new Triplet<>(12, "CCCC", "DDDD");
        Triplet<Integer, String, String> t3 = new Triplet<>(13, "EEEEE", "FFFFF");

        List<Triplet<Integer, String, String>> list = Arrays.asList(t1, t2, t3);

        System.out.println("\nInteger-String-String triplets: ");

        for (Triplet<Integer, String, String> triplet : list){
            System.out.println(triplet);
        }

        Calendar calendar = new GregorianCalendar(2014, 2, 11);
        Date date = calendar.getTime();

        Triplet<Integer, String, Date> t4 = new Triplet<>(11, "AAAA", date);
        Triplet<Integer, String, Date> t5 = new Triplet<>(12, "CCCC", date);
        Triplet<Integer, String, Date> t6 = new Triplet<>(13, "EEEEE", date);

        List<Triplet<Integer, String, Date>> list1 = Arrays.asList(t4, t5, t6);

        System.out.println("\nInteger-String-Date triplets: ");

        for (Triplet<Integer, String, Date> triplet : list1){
            System.out.println(triplet);
        }

    }
}
