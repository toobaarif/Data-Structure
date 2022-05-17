package com.company;

public class A11_CountSort {
    public static void displayElements(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void sorting(int arr[]){
        for (int i = 0; i< arr.length-1; i++){
            int indexOfMax= i;

            for (int j = i+1; i< arr.length; j++){
                if (arr[j] < indexOfMax){
                    indexOfMax = j;
                }
                int temp = arr[i];
                arr[i] = arr[indexOfMax];
                arr[indexOfMax] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {89, 46, 90, 22};
        displayElements(arr);

        sorting(arr);
        displayElements(arr);

    }
}
