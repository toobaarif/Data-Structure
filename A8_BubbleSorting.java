package com.company;

public class A8_BubbleSorting {
    public static void displayArray(int arr[], int size){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSorting(int arr[]){
        int swap = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1 ; j++){
                if (arr[j] > arr[j+1]){
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                }
            }
        }
    }


    public static void main(String[] args) {
        int arr [] = {45, 3, 9, 78, 97, 1, 6};

        System.out.println("Before sorting: ");
    displayArray(arr, arr.length);

        System.out.println("After sorting: ");
        bubbleSorting(arr);
      displayArray(arr, arr.length);
    }
}
