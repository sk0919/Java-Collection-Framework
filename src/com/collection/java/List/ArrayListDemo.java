package com.collection.java.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* Author : Sumit Mishra
*/

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new  ArrayList();
		
		list1.add(1); 
		list1.add(2); //always added in last
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		list1.remove(Integer.valueOf(5));
		
		list1.set(2, 2000);
		list1.set(3, Integer.valueOf(3000));
		
		boolean result = list1.contains(50);
		
		System.out.println("value 50 is "+result);
		
		//list1.size(); //get size of list
		
	      for (int i = 0; i < list1.size(); i++) {
		      System.out.println("the element is " + list1.get(i));
		  }
		
		  for (Integer element: list1) {
		      System.out.println("foreach element is " + element);
		  }
		
		  Iterator<Integer> it = list1.iterator();
		
		  while (it.hasNext()) {
		      System.out.println("iterator " + it.next());
		  }
		
		
		//list1.clear(); //emptying the whole list
		System.out.println(list1); //[1, 2, 3, 4, 5, 6]
		
		List<String> list2 = new  ArrayList();
		
		list2.add("ABC"); 
		list2.add("CDE"); 
		list2.add("JKL"); 
		list2.add("XYZ"); 
		list2.add("PQR"); 
		list2.add("UIO"); 
		list2.add("ERT"); 
		
		//adding at specific index
		list2.add(2,"2tyu");
		
		
		System.out.println(list2); //[ABC, CDE, 2tyu, JKL, XYZ, PQR, UIO, ERT]

		//remove by index
		list2.remove(2); 
		System.out.println(list2); //[ABC, CDE, JKL, XYZ, PQR, UIO, ERT]
		
		//remove by object
		list2.remove("PQR");
		System.out.println(list2); //[ABC, CDE, JKL, XYZ, UIO, ERT]
		
		//get by index
		System.out.println(list2.get(4)); //UIO

	}

}



