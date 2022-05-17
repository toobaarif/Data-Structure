package com.company;

public class A5_LinearSearch {

    public static int LinearSearch(int arr[], int size, int element){
        for (int i = 0; i<size; i++){
            if (arr[i] == element){
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int arr [] = {3, 4, 7, 8, 99};
        int element = 99;
        int searchInd = LinearSearch(arr, arr.length, element);
        System.out.println("The index of "+element+" is "+searchInd);
    }
}
