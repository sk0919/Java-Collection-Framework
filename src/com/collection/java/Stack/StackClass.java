package com.collection.java.Stack;

import java.util.Stack;

/**
* Author : Sumit Mishra
*/

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> cars = new Stack();
		
		cars.push("tata");
		cars.push("maruti");
		cars.push("mahindra");
		cars.push("honda");
		
		System.out.println("Stack : "+ cars);
		
		System.out.println("Peek of stack is : "+cars.peek());
		System.out.println("Popping object from stack : "+cars.pop());
		
		System.out.println("Stack : "+ cars);
		

	}

}
