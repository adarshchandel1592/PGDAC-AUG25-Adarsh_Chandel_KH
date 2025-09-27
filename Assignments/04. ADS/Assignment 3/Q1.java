package com.arsh.assignments.Assignment3;

public class Q1 {

    static void bSort(int arr[]) {
        boolean swap;
        // Outer loop to iterate over the entire array
        for (int i = 0; i < arr.length - 1; i++) {  // We don't need to go till arr.length
            swap = false;
            // Inner loop for comparing adjacent elements
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // Swap if elements are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            // If no elements were swapped, the array is already sorted, so break out of the loop
            if (!swap) {
                break;
            }
        }
    }

    static void displayArray(int arr[]) {
        // Method to display the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 5, 6};
        int[] arr2 = {3, 2, 1};
        int[] arr3 = {1, 2, 3};

        // Sorting and displaying arr1
        System.out.println();
        System.out.print("Original arr1 = ");
        displayArray(arr1);
        System.out.println();
        bSort(arr1);
        System.out.print("Sorted arr1 = ");
        displayArray(arr1);
        System.out.println();

        // Sorting and displaying arr2
        System.out.println();
        System.out.print("Original arr2 = ");
        displayArray(arr2);
        System.out.println();
        bSort(arr2);
        System.out.print("Sorted arr2 = ");
        displayArray(arr2);
        System.out.println();

        // Sorting and displaying arr3
        System.out.println();
        System.out.print("Original arr3 = ");
        displayArray(arr3);
        System.out.println();
        bSort(arr3);
        System.out.print("Sorted arr3 = ");
        displayArray(arr3);
        System.out.println();
    }
}
