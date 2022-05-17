package com.company;

public class A6_BinarySearch {

    public static int binarySearch(int arr[], int size, int element) {
           int start = 0;
           int end = size - 1;  // 6
           int mid;

//        Searching start
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] < element) {
                start = mid + 1;
            }
            else {  // arr[mid] > element
                end = mid - 1;
            }
        }
//        searching ends
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {12, 22, 34, 56, 76, 78, 81};
        int element = 22;
        System.out.println(arr.length);

        int search = binarySearch(arr, arr.length, element);
        System.out.println(search);
    }
}


