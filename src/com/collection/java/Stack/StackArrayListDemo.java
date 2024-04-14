package com.collection.java.Stack;

import java.util.ArrayList;

/**
* Author : Sumit Mishra
*/

public class StackArrayListDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackArrayList<String> stack = new StackArrayList();
		
		stack.push("lorem");
		stack.push("ipsum");
		stack.push("ipsum2");
		
		System.out.println(stack);
		
		System.out.println("Peek of stack is  : "+stack.peek());
		System.out.println("Popping out : "+stack.pop());
		System.out.println("After popping from stack "+ stack);
	}

}

class StackArrayList<T>{
	private ArrayList<T> stack = new ArrayList<>();

    public void push(T data) {
        stack.add(data);
    }
    

    public T pop() {
    	
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
        
    }

    public T peek() {
    	
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
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
