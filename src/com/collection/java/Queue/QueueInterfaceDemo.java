package com.collection.java.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
* Author : Sumit Mishra
*/

public class QueueInterfaceDemo {
	
	public static void main(String[] args) {
		
        Queue<String> queue = new LinkedList<>();
        
        // Add elements to the queue
        queue.add("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");
        queue.offer("Element 4");
        
        // Remove elements from the queue
        String removedElement = queue.remove();
        String polledElement = queue.poll();
        
        // Get elements from the queue
        String element = queue.element();
        String peekedElement = queue.peek();
        
    }
}


/*
 * 
 *  - add(element): This method adds an element to the rear of the queue. If the queue is full, it throws an exception.
	
	- offer(element): This method also adds an element to the rear of the queue. If the queue is full, it returns false instead of throwing an exception.
	
	- remove(): This method removes and returns the element at the front of the queue. If the queue is empty, it throws an exception.
	
	- poll(): This method removes and returns the element at the front of the queue. If the queue is empty, it returns null.
	
	- element(): This method returns the element at the front of the queue without removing it. If the queue is empty, it throws an exception.
	
	- peek(): This method returns the element at the front of the queue without removing it. If the queue is empty, it returns null.
 */


