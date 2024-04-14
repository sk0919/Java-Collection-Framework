package com.collection.java.Queue;

import java.util.LinkedList;

/**
* Author : Sumit Mishra
*/

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueLinkedList<String> queue = new QueueLinkedList();
		
		System.out.println("From inside the QueueLinkedList class");
		
		queue.enqueue("abc1");
		queue.enqueue("abc2");
		queue.enqueue("abc3");
		queue.enqueue("abc4");
		queue.enqueue("abc5");
		queue.enqueue("abc6");
		queue.enqueue("abc7");  
		
		System.out.println("Removing from queue : "+queue.dequeue()); //removed first 
		
		System.out.println("Printing "+queue);
		System.out.println("Get First - "+queue.getFirst()); 
		System.out.println("Get Last - "+queue.getLast());

	}

}





 class QueueLinkedList<T> {
    
	 	private LinkedList<T> queue = new LinkedList<T>();
		
		public void enqueue(T item) {
		    queue.addLast(item);
		}
		
		public T dequeue() {
		    if (queue.isEmpty()) {
		        return null;
		    }
		    return queue.removeFirst();
		}
		
		public boolean isEmpty() {
		    return queue.isEmpty();
		}
		
		public T getFirst() {
	    	if (queue.isEmpty()) {
	            return null;
	        }
	        return queue.get(0);
	    }
		
		public T peek() {
	    	if (queue.isEmpty()) {
	            return null;
	        }
	        return queue.get(0);
	    }
		
	    
	    public T getLast() {
	    	if (queue.isEmpty()) {
	            return null;
	        }
	        return queue.get(queue.size() - 1);
	    }
		
		@Override
		public String toString() {
		    return "Queue: " + queue.toString();
		}
		
		
}

