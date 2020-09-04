package com.company.linkedlist.singly.d.index;


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.insert(0, 0);
        System.out.println(intLinkedList);
        intLinkedList.insertAtHead(1);
        System.out.println(intLinkedList);
        intLinkedList.insertAtHead(2);
        System.out.println("\n Integer LinkedList  nodes: " + intLinkedList + " count: " + intLinkedList.getNodeCount());
        intLinkedList.insertAtHead(3);
        intLinkedList.insertAtHead(4);
        intLinkedList.insertAtHead(5);
        intLinkedList.insert(99, 5);
        System.out.println("\n Integer LinkedList  nodes: " + intLinkedList + " count:" + intLinkedList.getNodeCount() );

        LinkedList<String> strLinkedList = new LinkedList<>();
        strLinkedList.insertAtHead("Java");
        strLinkedList.insertAtHead("C++");
        System.out.println("\n String LinkedList 2 nodes: " + strLinkedList);

    }
}
