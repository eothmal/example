package com.company.linkedlist.singly.a.intro;

import com.company.linkedlist.singly.Node;

public class Main {

    public static void main(String[] args) {
        Node<Integer> intNode1 = new Node<>(10);
        System.out.println(intNode1);
        Node<Integer> intNode2 = new Node<>(20);
        System.out.println(intNode1);
        intNode1.setNext(intNode2);
        System.out.println(intNode2);
        System.out.println("\n Two Integers LinkedList: " +  intNode1);

        Node<String> strNode1 = new Node<>("Java");
        Node<String> strNode2 = new Node<>("C++");
        strNode1.setNext(strNode2);
        System.out.println(strNode2);
        System.out.println("\n Two Strings LinkedList: " +  strNode1);

    }
}
