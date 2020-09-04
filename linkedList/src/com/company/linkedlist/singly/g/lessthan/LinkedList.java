package com.company.linkedlist.singly.g.lessthan;


import com.company.linkedlist.singly.Node;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T extends Comparable<T>> {
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

    public void insertAtTail(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(node);
        }

    }

    public void insert(T data, int i) {

        if (head == null || i <= 0) {
            insertAtHead(data);
            return;
        }
        Node<T> node = new Node<>(data);
        Node<T> curr = head;
        int curIdx = 1;
        while (curr.getNext() != null && curIdx < i) {
            curr = curr.getNext();
            curIdx++;
        }
        node.setNext(curr.getNext());
        curr.setNext(node);

    }

    public T pop() {
        if (head == null) {
            return null;
        }
        Node<T> first = head.getNext();
        head = head.getNext();
        return first.getData();
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

    public boolean contain(T data) {
        Node<T> curr = head;
        while (curr != null) {
            if (data.equals(curr.getData())) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    public void delete(T data) {
        Node<T> prev = null;
        Node<T> curr = head;

        while (curr != null) {
            if (data.equals(curr.getData())) {
                if (prev == null) {
                    head = curr.getNext();
                    break;
                } else {
                    prev.setNext(curr.getNext());
                    break;
                }
            }
            prev = curr;
            curr = curr.getNext();
        }
    }

    public List<T> findAllLessThan(T data) {
        Node<T> curr = head;
        List<T> list = new ArrayList<>();
        while (curr != null) {
            if (curr.getData().compareTo(data) < 0) {
                list.add(curr.getData());
            }
            curr = curr.getNext();
        }
        return list;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head= " + head +
                " =tail}";
    }
}
