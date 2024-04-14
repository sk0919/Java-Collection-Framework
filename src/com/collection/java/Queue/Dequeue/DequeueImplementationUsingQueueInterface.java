package com.collection.java.Queue.Dequeue;


import java.util.LinkedList;
import java.util.Queue;



/**
* Author : Sumit Mishra
*/

public class DequeueImplementationUsingQueueInterface {

	public static void main(String[] args) {
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


 class Deque {
    Queue<Integer> queue;

    // Constructor
    public Deque() {
        queue = new LinkedList<>();
    }

    // Insert at the end
    public void insertRear(int item) {
        queue.add(item);
    }

    // Insert at the front
    public void insertFront(int item) {
        ((LinkedList<Integer>) queue).addFirst(item);
    }

    // Remove from the front
    public void removeFront() {
        ((LinkedList<Integer>) queue).removeFirst();
    }

    // Remove from the end
    public void removeRear() {
        ((LinkedList<Integer>) queue).removeLast();
    }

    // Get front element
    public int getFront() {
        return ((LinkedList<Integer>) queue).getFirst();
    }

    // Get rear element
    public int getRear() {
        return ((LinkedList<Integer>) queue).getLast();
    }

	@Override
	public String toString() {
		return "Deque [queue=" + queue + "]";
	}
    
    
}
