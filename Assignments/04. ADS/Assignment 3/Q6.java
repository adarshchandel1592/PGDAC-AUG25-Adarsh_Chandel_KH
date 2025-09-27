package com.arsh.assignments.Assignment3;

public class Q6 {

    public static void bSort(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j-1]) < 0){
					String temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
                }
            }
        }
    }

    public static void displayArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        String[] arr1 = {"apple", "banana", "cherry"};
        String[] arr2 = {"dog", "cat", "elephant", "bee"};
		
		System.out.println();
        System.out.print("Original array 1: ");
        displayArray(arr1);
		bSort(arr1);
        System.out.println();
        System.out.print("Sorted array 1: ");
		displayArray(arr1);
		System.out.println();

        System.out.println();
        System.out.print("Original array 2: ");
        displayArray(arr2);
		bSort(arr2);
        System.out.println();
        System.out.print("Sorted array 2: ");
		displayArray(arr2);
		System.out.println();


    }

}
