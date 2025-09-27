package com.arsh.assignments.Assignment3;

public class Q14 {
    Node root;

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }

    Q14(){
        root = null;
    }

    public static Node converttoBST(int arr[], int start, int end){
        if (start > end)
            return null;

        int mid = (start+end) / 2;

        Node root = new Node(arr[mid]);

        root.left = converttoBST(arr, start, mid-1);
        root.right = converttoBST(arr, mid+1, end);

        return root;

    }

    public static void preorderTraversal(Node root){
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int start = 0;
        int end = arr.length - 1;

        Node root = converttoBST(arr, start, end);
        System.out.println();
        preorderTraversal(root);
        System.out.println();
    }
}
