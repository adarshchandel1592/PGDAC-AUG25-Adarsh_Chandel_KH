package com.arsh.assignments.Assignment3;

public class Q7 {
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

    Q7(){
        root = null;
    }

    static void preorderTraversal(Node root){
        if(root==null)
            return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {

        Q7 tree = new Q7();
        tree.root = new Node(1);

        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);

        tree.root.left = a;
        tree.root.right = b;

        a.left = c;
        a.right = d;

        System.out.println();
        preorderTraversal(tree.root);
        System.out.println();
    }
}
