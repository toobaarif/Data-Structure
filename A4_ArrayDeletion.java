package com.company;

public class A4_ArrayDeletion {


  static   void display(int arr[], int n) {
        // Code for Traversal
        for (int i = 0; i < n; i++) {
            System.out.print("  "+ arr[i]);
        }
        System.out.println();
    }


   static void indDeletion(int arr[], int size, int index) {
      if (size == 0){
          System.out.println("Array is empty");
      }
        // code for Deletion
        for (int i = index; i < size-1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void main(String[] args) {

        int arr [] = new int[100]; // Size of an array
        arr [0] = 10;
        arr [1] = 20;
        arr [2] = 30;
        arr [3] = 78;
        arr [4] = 50;



//        int arr[100] = {7, 8, 12, 27, 88};
        int size = 5,  index = 2;
        display(arr, size);

        indDeletion(arr, size, index);
        size -= 1;
        display(arr, size);
    }
}

