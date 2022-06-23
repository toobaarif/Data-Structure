package com.company;
import java.util.*;

public class A15_LinkedListCollectionFramework {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<String>();

//         add first and last
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);

        list.addLast("list");
        list.add("sentence");
        System.out.println(list);

//        size
        System.out.println(list.size());

//        printing linked list
        for (int i = 0; i< list.size(); i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("null");


        //     delete first and last
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}




