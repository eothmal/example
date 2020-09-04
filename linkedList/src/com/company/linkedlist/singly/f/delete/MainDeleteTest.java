package com.company.linkedlist.singly.f.delete;

public class MainDeleteTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertAtTail(10);
        linkedList.insertAtTail(11);
        linkedList.insertAtTail(12);
        linkedList.insertAtTail(13);
        linkedList.insertAtTail(14);
        linkedList.insertAtTail(15);

        System.out.println(linkedList);

        linkedList.delete(12);
        System.out.println(linkedList);

        linkedList.delete(10);
        System.out.println(linkedList);

        linkedList.delete(15);
        System.out.println(linkedList);

        linkedList.delete(16);
        System.out.println(linkedList);

    }
}
