package com.collection.java.Stack;

import java.util.LinkedList;


/**
* Author : Sumit Mishra
*/

public class StackLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackLinkedList<String> stack = new StackLinkedList();
		
		System.out.println("Inside the StackLinkedListDemo class ");
		
		stack.push("lorem");
		stack.push("ipsum");
		stack.push("ipsum2");
		
		System.out.println(stack);
		
		System.out.println("Peek of stack is  : "+stack.peek());
		System.out.println("Popping out : "+stack.pop());
		System.out.println("After popping from stack "+ stack);


	}

}



class StackLinkedList<T> {
	
    private LinkedList<T> stack = new LinkedList<>();

    public void push(T data) {
        stack.push(data);
    }

    public T pop() {
        if (!isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public T peek() {
    	
        if (!isEmpty()) {
            return stack.peek();
        }
        
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack: " + stack.toString();
    }
}
