package com.company;

import com.sun.source.tree.BreakTree;

public class A17_RemoveNthLast_LL {
      int val;
      A17_RemoveNthLast_LL next;
      A17_RemoveNthLast_LL(){
  }
     A17_RemoveNthLast_LL(int val){
          this.val = val;
     }
     A17_RemoveNthLast_LL(int val, A17_RemoveNthLast_LL next){
          this.val = val;
          this.next = next;
     }
}
class solution{
    public A17_RemoveNthLast_LL removeNthFromEnd(A17_RemoveNthLast_LL head, int n){
        if (head.next == null){
            return null;
        }
        int size = 0;
        A17_RemoveNthLast_LL current = head;
        while (current != null){
            current = current.next;
            size++;
        }

        if (n == size){
            return head.next;
        }
        int indexToSearch = size - n;
        A17_RemoveNthLast_LL previous = head;
        int i = 1;
        while (i < indexToSearch){
            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return head;

    }

    public static void main(String[] args) {

    }
}
