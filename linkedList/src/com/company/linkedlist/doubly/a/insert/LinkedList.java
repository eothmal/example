package com.company.linkedlist.doubly.a.insert;

import com.company.linkedlist.doubly.Node;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void insertAtHead(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        head.setPrevious(node);
        node.setNext(head);
        head = node;
    }

    public void insertAtTail(T data){
        Node<T> node = new Node<>(data);

        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;

    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        if (head == null){
            return "";
        }
        return head.toString();
    }
}
