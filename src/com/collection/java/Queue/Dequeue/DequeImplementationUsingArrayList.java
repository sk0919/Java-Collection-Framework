package com.collection.java.Queue.Dequeue;

/**
* Author : Sumit Mishra
*/
import java.util.ArrayList;

 class Deque {
    ArrayList<Integer> deque = new ArrayList<Integer>();

    // Insert at the end
    public void insertRear(int item) {
        deque.add(item);
    }

    // Insert at the front
    public void insertFront(int item) {
        deque.add(0, item);
    }

    // Remove from the front
    public void removeFront() {
        if(deque.isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        deque.remove(0);
    }

    // Remove from the end
    public void removeRear() {
        if(deque.isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        deque.remove(deque.size()-1);
    }

    // Get front element
    public int getFront() {
        return deque.get(0);
    }

    // Get rear element
    public int getRear() {
        return deque.get(deque.size()-1);
    }
}


public class DequeImplementationUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque dq = new Deque();
		
		dq.insertFront(1);
		dq.insertFront(2);
		dq.insertFront(3);
		dq.insertFront(4);
		dq.insertFront(5);
		dq.insertFront(6);
		dq.insertRear(9);
		
		System.out.println("Printing the "+dq); //[queue=[6, 5, 4, 3, 2, 1, 9]]
		
		dq.removeFront();
		 
		System.out.println("After Removing from front ");
		System.out.println("Printing the "+dq); //[queue=[5, 4, 3, 2, 1, 9]]

	}

}
