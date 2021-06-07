package com.respam.algoexpert.solutions;

public class RemDupLinkedListSol2 {

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
        LinkedList head = linkedList;

        while(linkedList != null) {
            int temp = linkedList.value;

            while(linkedList.next != null && linkedList.next.value == temp) {
                linkedList.next = linkedList.next.next;
            }

            linkedList = linkedList.next;
        }

        return head;
    }

    public static void main(String[] args) {

        RemDupLinkedListSol2 rdll = new RemDupLinkedListSol2();

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
