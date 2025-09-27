package com.arsh.assignments.Assignment3;

public class Q3 {

    static void sSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min!=i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }


    static void displayArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        int[] arr2 = {29, 10, 14, 37, 13};

        System.out.println();
        System.out.print("Original arr1 = ");
        displayArray(arr1);
        System.out.println();
        sSort(arr1);
        System.out.print("Sorted arr1 = ");
        displayArray(arr1);
        System.out.println();

        // Sorting and displaying arr2
        System.out.println();
        System.out.print("Original arr2 = ");
        displayArray(arr2);
        System.out.println();
        sSort(arr2);
        System.out.print("Sorted arr2 = ");
        displayArray(arr2);
        System.out.println();
}
}
