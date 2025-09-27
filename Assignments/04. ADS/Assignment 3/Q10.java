package com.arsh.assignments.Assignment3;

public class Q10 {
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

    Q10(){
        root = null;
    }


    public void insert(int data){
        root = insertIntoBST(root, data);
    }

    public Node insertIntoBST(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        else{
            if (data < root.data){
                root.left = insertIntoBST(root.left, data);
            } else if (data > root.data) {
                root.right = insertIntoBST(root.right, data);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Q10 tree = new Q10();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println();
        tree.inorderTraversal(tree.root);
        System.out.println();

        boolean found = tree.searchElement(tree.root, 90);

        if(tree.root==null){
            System.out.println("Tree does not exist. Enter elements to search.");
        }
        else {
            if (found)
                System.out.println("Found");
            else
                System.out.println("Not Found");
        }
    }

    public void inorderTraversal(Node root){
        if(root==null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public boolean searchElement(Node root, int key){
        if (root==null){
            return false;
        }
        else {
            if(root.data == key){
                return true;
            } else if (key < root.data ) {
                return searchElement(root.left, key);
            } else if (key> root.data) {
                return searchElement(root.right, key);
            }
        }
        return false;
    }
}
