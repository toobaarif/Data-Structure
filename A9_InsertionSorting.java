package com.company;

public class A9_InsertionSorting {

    public static void printArray(int arr[]){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        int key;

//         Loop for passes
        for (int i = 1; i < n; i++){
            key = array[i];
            int j = i -1;

//            Loop for each pass
           while (j > -1 && array[j] > key){
               array [j+1] = array[j];
               j--;
           }
           array[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr [] = {45, 2, 4, 1, 98, 6 , 5};

        System.out.println("before sorting:");
        printArray(arr);

        System.out.println("\nafter sorting: ");
        insertionSort(arr);
        printArray(arr);

    }

}
