package com.company;

import java.util.Arrays;

public class A3_ArrayInsertion {

//  1:  traversal of an array elements
    public static void display( int []arr ,int arrLen){
        for (int i = 0; i<arrLen; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }


//   2: insertion of an element in array
//    In index 2 insert element 99
    public static int IndexInsertion(int arr[], int resSize, int arrayCapacity, int element, int index){
        if (resSize >= arrayCapacity){
            return -1;
        }

        for (int i = resSize-1; i >= index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = element;
        return 1;
    }


    public static void main(String[] args) {
        int [] arr = new int[100];
        arr [0] = 7;
        arr [1] = 8;
        arr [2] = 12;
        arr [3] = 27;
        arr [4] = 88;

//    1:    array traversal
         display(arr, 5);


//    2:   array insertion
        int resSize = 5;
        int elementWhichAdd = 79;
        int eleIndex = 5;
        resSize += 1;
        IndexInsertion(arr, resSize, arr.length, elementWhichAdd, eleIndex);
        display(arr, resSize);

    }
}

