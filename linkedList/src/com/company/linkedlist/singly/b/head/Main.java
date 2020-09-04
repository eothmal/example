package com.company.linkedlist.singly.b.head;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.insertAtHead(12);
        System.out.println(intLinkedList);
        intLinkedList.insertAtHead(13);
        System.out.println("\n Integer LinkedList 2 nodes: " + intLinkedList + " count: " + intLinkedList.getNodeCount());
        intLinkedList.insertAtHead(10);
        intLinkedList.insertAtHead(20);
        intLinkedList.insertAtHead(30);
        System.out.println("\n Integer LinkedList 5 nodes: " + intLinkedList + " count:" + intLinkedList.getNodeCount() );

        LinkedList<String> strLinkedList = new LinkedList<>();
        strLinkedList.insertAtHead("Java");
        strLinkedList.insertAtHead("C++");
        System.out.println("\n String LinkedList 2 nodes: " + strLinkedList);

    }
}
