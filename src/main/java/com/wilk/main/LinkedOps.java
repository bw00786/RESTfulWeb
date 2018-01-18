package com.wilk.main;

import java.util.HashSet;
import java.util.Random;

public class LinkedOps {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }


    }

    LinkedOps() {
        head = null;
    }

    public static Node add(Node node, int d) {

        if (node == null) {
            node = new Node(d);
            return node;
        }
             node.next = add(node.next, d);

        return node;

    }

    public static void printinOrder(Node node) {
        Node curr = node;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static Node reverse(Node curr) {

        if (curr == null) return null;
        if (curr.next == null) return curr;
        Node nextNode = curr.next;
        curr.next = null;
        Node rest = reverse(nextNode);
        nextNode.next = curr;
        return rest;
    }

    public static Node findNth(Node node, int n) {

        Node fast = node;
        Node slow = node;
        for (int i = 0; i < n; i++) {

            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;

        }
        return slow;


    }

    public static Node findMid(Node node) {

        Node fast = node;
        Node slow = node;
        while (slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static boolean findLoops(Node node) {

        Node fast = node;
        Node slow = node;
        while (slow != null && fast != null && fast.next != null) {

            fast = fast.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    public static Node deDup(Node node) {
        if (node == null) return null;
        HashSet<Integer> set = new HashSet<>();
        Node prev = null;
        while (node!=null) {
            if (set.contains(node.data)) {
                prev.next = node.next;
            }else {
                set.add(node.data);
                prev = node;
            }
            node = node.next;
        }
        return prev;
        }



    public static void main(String[] argv) {

        Random ran = new Random();

        for (int i = 1; i <= 20; i++) {
            head = add(head, ran.nextInt(100));
        }
        printinOrder(head);
        System.out.println("The middle valie is "+findMid(head).data);
        //head = deDup(head);
        System.out.println("The 3rd value from rear is "+findNth(head,3).data);
        head = reverse(head);
        System.out.println("Reverse Order is ");
        printinOrder(head);
    }
}

