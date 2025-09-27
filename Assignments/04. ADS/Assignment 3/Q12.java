package com.arsh.assignments.Assignment3;

public class Q12 {
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

    Q12() {
        root = null;
    }

    // Insert data into the BST
    public void insert(int data) {
        root = insertIntoBST(root, data);
    }

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
        Q12 tree = new Q12();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(75);
        tree.insert(60);
        tree.insert(80);

        System.out.println();
        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        int height = tree.treeHeight(tree.root);
        System.out.print("\nHeight of the tree is: "+height);
        System.out.println();
    }

    public int treeHeight(Node root){
        if (root==null)
            return 0;

        int height_lst = treeHeight(root.left);
        int height_rst = treeHeight(root.right);

        if(height_rst > height_lst)
            return 1 + height_rst;
        else
            return 1 + height_lst;
    }

    public void inorderTraversal(Node root) {
        if (root == null) return;

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }


}
