package com.respam.algoexpert.solutions;

import java.util.HashMap;

public class RemDupLinkedList {

    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList pointer = new LinkedList(linkedList.value);
        LinkedList head = pointer;
        HashMap<Integer, Integer> storage = new HashMap<>();
        storage.put(linkedList.value, 0);

        while(linkedList.next != null) {
            linkedList = linkedList.next;

            if(storage.get(linkedList.value) == null) {
                storage.put(linkedList.value, 0);
                pointer.next = new LinkedList(linkedList.value);
                pointer = pointer.next;

            }
        }

        return head;
    }

    public static void main(String[] args) {

        RemDupLinkedList rdll = new RemDupLinkedList();

        LinkedList a = new LinkedList(1);
        LinkedList b = new LinkedList(1);
        LinkedList c = new LinkedList(3);
        LinkedList d = new LinkedList(4);
        LinkedList e = new LinkedList(4);
        LinkedList f = new LinkedList(4);
        LinkedList g = new LinkedList(5);
        LinkedList h = new LinkedList(6);
        LinkedList i = new LinkedList(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;

        LinkedList result = rdll.removeDuplicatesFromLinkedList(a);

        System.out.println(result.value);
        while(result.next != null) {
            result = result.next;
            System.out.println(result.value);
        }
    }
}
