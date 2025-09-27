package com.arsh.assignments.Assignment3;

public class Q11 {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Q11() {
        root = null;
    }

    // Insert data into the binary search tree
    public void insert(int data) {
        root = insertIntoBST(root, data);
    }

    // Helper method to insert data recursively into the BST
    public Node insertIntoBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        } else {
            if (data < root.data) {
                root.left = insertIntoBST(root.left, data);
            } else if (data > root.data) {
                root.right = insertIntoBST(root.right, data);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Q11 tree = new Q11();

        // Inserting elements into the BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Inorder traversal to print the tree in sorted order
        System.out.println("\nInorder Traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        int max = tree.maxValue(tree.root);
        System.out.print("\nMaximum value in the BST: "+max);

        int min = tree.minValue(tree.root);
        System.out.print("\nMinimum value in the BST: "+min);
        System.out.println();
    }

    // Method to perform inorder traversal of the tree
    public void inorderTraversal(Node root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public int maxValue(Node root){
        if (root == null)
            return 0;

        int a = root.data;
        int b = maxValue(root.left);
        int c = maxValue(root.right);

        if (b > a)
            a = b;

        if (c > a)
            a = c;

        return a;
    }

    public int minValue(Node root){
        if (root == null)
            return Integer.MAX_VALUE;

        int a = root.data;
        int b = minValue(root.left);
        int c = minValue(root.right);

        if (b < a)
            a = b;

        if (c < a)
            a = c;

        return a;
    }


}
