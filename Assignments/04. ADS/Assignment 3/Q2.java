package com.arsh.assignments.Assignment3;

public class Q2 {

    static void iSort(int[] arr){
        for (int curr = 1; curr < arr.length; curr++) {
            int key = arr[curr];
            int prev = curr-1;
            while (prev>=0 && key < arr[prev]){
                arr[prev+1] = arr[prev];
                prev=prev-1;
            }
            arr[prev+1] = key;
        }
    }

    static void displayArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 11, 13, 5, 6};
        int[] arr2 = {4, 3, 2, 10, 12};

        System.out.println();
        System.out.print("Original arr1 = ");
        displayArray(arr1);
        System.out.println();
        iSort(arr1);
        System.out.print("Sorted arr1 = ");
        displayArray(arr1);
        System.out.println();

        // Sorting and displaying arr2
        System.out.println();
        System.out.print("Original arr2 = ");
        displayArray(arr2);
        System.out.println();
        iSort(arr2);
        System.out.print("Sorted arr2 = ");
        displayArray(arr2);
        System.out.println();

    }
}
