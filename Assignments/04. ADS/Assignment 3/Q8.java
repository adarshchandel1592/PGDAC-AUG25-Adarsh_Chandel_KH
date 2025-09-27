package com.arsh.assignments.Assignment3;

public class Q8 {
    Node root;

    static class Node{
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Q8(){
        root = null;
    }

    static void inorderTraversal(Node root){
        if(root==null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }

    static void preorderTraversal(Node root){
        if(root==null)
            return;

        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    static void postorderTraversal(Node root){
        if(root==null)
            return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Q8 tree = new Q8();
        tree.root = new Node(10);

        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);

        tree.root.left = a;
        tree.root.right = b;

        a.left = c;
        a.right = d;

        System.out.print("\nInorder: ");
        inorderTraversal(tree.root);
        System.out.println();

        System.out.print("\nPreorder: ");
        preorderTraversal(tree.root);
        System.out.println();

        System.out.print("\nPostorder: ");
        postorderTraversal(tree.root);
        System.out.println();
    }
}
