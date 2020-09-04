package com.company.linkedlist.singly.c.tail;

import java.time.Duration;
import java.time.Instant;

public class MainTestTime {
    private static void insert100000ElementAtHead(LinkedList<Integer> list){
        for (int i = 0; i < 100000; i++){
            list.insertAtHead(i);
        }
    }
    private static void insert100000ElementAtTail(LinkedList<Integer> list){
        for (int i = 0; i < 100000; i++){
            list.insertAtTail(i);
        }
    }
    public static void main(String[] args) {

        LinkedList<Integer> listsHead = new LinkedList<>();
        Instant start = Instant.now();
        insert100000ElementAtHead(listsHead);
        Instant end = Instant.now();

        System.out.println(" Add 100000 Elements to Head: " +  Duration.between(start, end));

        LinkedList<Integer> listsTail = new LinkedList<>();
        start = Instant.now();
        insert100000ElementAtTail(listsTail);
        end = Instant.now();

        System.out.println(" Add 100000 Elements to Tail: " +  Duration.between(start, end));

    }
}
