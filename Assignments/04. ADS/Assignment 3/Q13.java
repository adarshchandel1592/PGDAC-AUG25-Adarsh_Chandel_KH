package com.arsh.assignments.Assignment3;

public class Q13 {
    Node root;

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    Q13(){
        root = null;
    }

    public void insert(int data){
        root = insertintoBST(root, data);
    }

    public Node insertintoBST(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        else {
            if (data < root.data) {
                root.left = insertintoBST(root.left, data);
            } else root.right = insertintoBST(root.right, data);
        }

        return root;

    }
    public static void main(String[] args) {

        Q13 tree = new Q13();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(35);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(90);
        tree.insert(100);

        System.out.println();
        System.out.print("Inorder Traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println();

        int if_balanced = tree.checkBalance(tree.root);
        if (if_balanced>1)
            System.out.println("\nTrue");
        else
            System.out.println("\nFalse");
    }

    public int checkBalance(Node root) {
        if (root==null)
            return 0;

        int height_lst = checkBalance(root.left);
        int height_rst = checkBalance(root.right);

        if(height_lst == -1 || height_rst == -1)
            return -1;

        int difference = height_rst - height_lst;

        if(difference > 1 || difference <-1)
            return -1;

        return ((height_rst > height_lst) ? height_rst : height_lst) + 1;
    }

    public void inorderTraversal(Node root){
        if(root==null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);

    }
}
