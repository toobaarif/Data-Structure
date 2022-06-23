package com.company;

public class A14_LinkedList {

    Node head;

//    for size of linked list
    private int size;
    A14_LinkedList(){
        this.size = 0;
    }


//    Node class
    class Node{
        String data;
        Node next;

        Node(String data){  // constructor
            this.data = data;
            this.next = null;
            size ++;
        }
    }

//    add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }



//    add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

//        travel node to check the last node null
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

//    print list
    public void printList(){
        if (head == null){
            System.out.println("list is empty");
        }
        Node currentNod = head;
        while (currentNod != null){
            System.out.print(currentNod.data + " -> ");
            currentNod = currentNod.next;
        }
        System.out.println("NULL");
    }

//    delete
//    delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty");
        }
        size--;
        head = head.next;
    }


//    delete last
    public void deleteLast(){
        if (head == null){
            System.out.println("This list is empty");
            return;
        }
        size--;

        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }
        secondLast = null;
    }



//    get size
    public int getSize(){
        return size;
    }







//      important question
//  reverse iteration of liked list

    public void revIterate(){
//        if linked list is empty... || if there is only one node in liked list so there is no next node and reverse is not making sense
        if (head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

//            update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }




    public static void main(String[] args) {
          A14_LinkedList list = new A14_LinkedList();
          list.addFirst("a");
          list.addFirst("is");

          list.printList();

          list.addLast("list");
          list.printList();

          list.addFirst("This");
          list.printList();


//          delete
        list.deleteFirst();
        list.printList();

        list.deleteFirst();
        list.printList();


        System.out.println(list.getSize());
        list.addFirst("This");
        list.printList();



//        iterate reverse
        list.revIterate();
        list.printList();
    }
}


