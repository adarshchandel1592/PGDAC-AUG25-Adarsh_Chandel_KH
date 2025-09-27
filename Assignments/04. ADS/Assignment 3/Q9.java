package com.arsh.assignments.Assignment3;

public class Q9 {
    Node root;

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Q9(){
        root = null;
    }

    public static void main(String[] args) {

        Q9 tree = new Q9();
        tree.root = new Node(1);

        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);

        tree.root.left = a;
        tree.root.right = b;

        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        
        
    }
}
