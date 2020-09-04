package com.company.linkedlist.singly.b.head;

import com.company.linkedlist.singly.Node;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
    }

    public void insertAtHead(T data) {
        Node<T> node = new Node<>(data);
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    public int getNodeCount() {
        if (head == null)
            return 0;

        int count = 1;
        Node<T> next = head.getNext();
        while (next != null) {
            count++;
            next = next.getNext();
        }
        return count;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
