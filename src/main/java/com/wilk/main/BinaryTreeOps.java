package com.wilk.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BinaryTreeOps {

    static Node head;

    private class Node {
        private int data;
        private Node left;
        private Node right;
        Node(int num) {
            data = num;
            left = null;
            right = null;
        }
    }
    BinaryTreeOps() {
        head = null;
    }
    public Node add(Node root, int d) {
        if (root == null) {
            root = new Node(d);
            return root;
        }
            if (d < root.data)   root.left = add(root.left,d);
            else {
                if (d > root.data) root.right = add(root.right, d);
            }
         return root;
    }
    public int findHeight(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(findHeight(root.left),findHeight(root.right));
    }
    public void printInOrder(Node root) {

        if (root == null) return;
        Node node = root;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);

    }
    public static int findMax(Node node) {

        if (node.right == null) return node.data;
        else return findMax(node.right);

    }
    public static int findMin(Node node) {
        if (node.left == null) return node.data;
        else return findMin(node.left);
        //return node.data;
    }
    public static void printDFS(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");

            if (curr.left!=null) {
                queue.add(curr.left);
            }
            if (curr.right!=null) {
                queue.add(curr.right);
            }
        }
    }
    public static void main(String[] argv) {
        Random ran = new Random();
        BinaryTreeOps bt = new BinaryTreeOps();
        for (int i = 0; i < 20; i++) {

            int d = ran.nextInt(100);
            System.out.println(d);
            head = bt.add(head, d);
        }
        bt.printInOrder(head);
        System.out.println("the tree size is " + bt.findHeight(head));
        System.out.println("Max value of tree is "+findMax(head));
        System.out.println("Min value of tree is "+findMin(head));
        System.out.println("DFS traversel");
        printDFS(head);
    }
}
