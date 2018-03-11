package thirty.days.of.code;

import java.util.Scanner;

public class LinkedList {

}

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
	public static  Node insert(Node head,int data) {
        //Complete this method
        Node n = new Node(data);
        Node first = null;
        if(head==null){
            head = n;
            first = head;
        }
        else{
            first = head;
            while(head.next !=null){
                head = head.next;
            }
            head.next = n;
        }
        
        return first;
    }
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        //display(head);
        sc.close();
    }

}


