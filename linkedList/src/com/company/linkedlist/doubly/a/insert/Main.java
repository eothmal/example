package com.company.linkedlist.doubly.a.insert;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertAtTail(10);
        linkedList.insertAtTail(11);
        linkedList.insertAtTail(12);
        linkedList.insertAtTail(13);
        linkedList.insertAtTail(14);

        System.out.println("\nAfter Insert Tail");
        System.out.println(linkedList);
        System.out.println("Head: " + linkedList.getHead().getData() +
                " Tail: " + linkedList.getTail().getData());

        linkedList.insertAtHead(9);
        linkedList.insertAtHead(8);
        linkedList.insertAtHead(7);

        System.out.println("\nAfter Insert Head");
        System.out.println(linkedList);
        System.out.println("Head: " + linkedList.getHead().getData() +
                " Tail: " + linkedList.getTail().getData());

    }
}
