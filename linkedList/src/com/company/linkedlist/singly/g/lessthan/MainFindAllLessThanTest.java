package com.company.linkedlist.singly.g.lessthan;


public class MainFindAllLessThanTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertAtTail(10);
        linkedList.insertAtTail(11);
        linkedList.insertAtTail(12);
        linkedList.insertAtTail(13);
        linkedList.insertAtTail(14);
        linkedList.insertAtTail(15);

        System.out.println(linkedList);

        System.out.println(linkedList.findAllLessThan(12));

        System.out.println(linkedList.findAllLessThan(10));

        System.out.println(linkedList.findAllLessThan(15));

        System.out.println(linkedList.findAllLessThan(16));

    }
}
