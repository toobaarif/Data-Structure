
package com.company;
import java.util.ArrayList;

public class A13_ArrayList {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(); // Integer
//        ArrayList<String> list1 = new ArrayList<>(); // String
//        ArrayList<Boolean> list3 = new ArrayList<>(); // Boolean

        ArrayList<Integer> list = new ArrayList<>();
//        addition of array list elements
        list.add(3);  // index 0
        list.add(5);  // index 1
        list.add(6);  // index 2
        list.add(67); // index 3
        System.out.println(list);


//        get element with index
        int element1 = list.get(1);
        System.out.println(element1);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(3));


//        to add element in between with index
        list.add(4,6); // in index 4 add element 6
        list.add(2,90);
        System.out.println(list);


//        set elements
        list.set(3, 567);
        System.out.println(list);



    }
}
