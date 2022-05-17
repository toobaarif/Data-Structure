package com.company;

public class A7_1_SelectionSort {

    public static void displayArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +"  ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]){
//        00, 01, 02, 03, 04    (indexes)
//        83, 44, 32, 13, 15   (elements)

        for (int i =0; i<arr.length-1; i++){
            int indexOfMin = i;

            for (int j = i+1; j < arr.length; j++){

                if (arr[j] < arr[indexOfMin]){
                    indexOfMin = j;
                }
            }
//            swap arr[i] and arr[indexOfMin]
            int temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
    }
    public static void main(String[] args) {
        int arr [] = {83, 44, 32, 13, 15};
        displayArray(arr);

        selectionSort(arr);
        displayArray(arr);

    }
}
