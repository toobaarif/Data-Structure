package com.company;

class Stack{
    int arr[] = new int[5];
    int top = 0;

//    push the element
   public void push(int dataAdd){
       if (top == arr.length){
           System.out.println("Overflow");
       }
       else {
           arr[top] = dataAdd;  // top = 0 index   if we push again element(data) than top increase by 1 and next data place in index 1 than repeat...
           top++;
       }
    }

    public boolean isEmpty(){
       return top <= 0;
    }

//    pop the element
    public void pop() {
        if (isEmpty()) {
            System.out.println("underflow");
        }
        else {
            top--;
            int dataRem = arr[top];  // if we want to remove any element so we call this and last added element deleted
            arr[top] = 0;
            System.out.println("Deleted element is: "+dataRem);;
        }
    }

    public int size(){
       return top;
    }
    
//    show the element
    public void show(){
       for (int i = 0; i< arr.length; i++){
           System.out.print(arr[i]+"  ");
       }
        System.out.println();
    }
}


public class A1_Stack {
    public static void main(String[] args) {
        Stack element = new Stack();
        element.push(78);
        element.push(73);
        element.push(74);
        element.push(68);
        element.push(66);

        element.pop();
        element.show();
        System.out.println("size is: "+ element.size());
        System.out.println("Empty: "+ element.isEmpty());
    }
}
