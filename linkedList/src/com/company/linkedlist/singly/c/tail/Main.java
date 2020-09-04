package com.company.linkedlist.singly.c.tail;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.insertAtTail(12);
        System.out.println(intLinkedList);
        intLinkedList.insertAtTail(13);
        System.out.println("\n Integer LinkedList 2 nodes: " + intLinkedList + " count: " + intLinkedList.getNodeCount());
        intLinkedList.insertAtTail(10);
        intLinkedList.insertAtTail(20);
        intLinkedList.insertAtTail(30);
        System.out.println("\n Integer LinkedList 5 nodes: " + intLinkedList + " count:" + intLinkedList.getNodeCount() );

        LinkedList<String> strLinkedList = new LinkedList<>();
        strLinkedList.insertAtTail("Java");
        System.out.println("\n String LinkedList 1 node: " + strLinkedList);
        strLinkedList.insertAtTail("C++");
        System.out.println("\n String LinkedList 2 nodes: " + strLinkedList);

    }
}
