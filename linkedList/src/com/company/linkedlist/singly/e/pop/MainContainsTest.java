package com.company.linkedlist.singly.e.pop;

public class MainContainsTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertAtTail(10);
        linkedList.insertAtTail(11);
        linkedList.insertAtTail(12);
        linkedList.insertAtTail(13);
        linkedList.insertAtTail(14);
        linkedList.insertAtTail(15);

        System.out.println(linkedList);

        System.out.println("\nList contains 12 " + linkedList.contain(12));
        System.out.println("\nList contains 10 " + linkedList.contain(10));
        System.out.println("\nList contains 15 " + linkedList.contain(15));
        System.out.println("\nList contains 16 " + linkedList.contain(16));

    }
}
