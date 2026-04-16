package com.listpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class PracticeList {
   
	
	public static void main(String[] args) {
	  List<Integer> numbers=new ArrayList<Integer>();
	  numbers.add(10);
	  numbers.addLast(31);
	  numbers.add(9);
	  numbers.add(16);
	  numbers.add(22);
	  numbers.add(5);
	  numbers.add(25);
	  numbers.add(24);
	  numbers.add(1);
	  
	  Iterator<Integer> nums= numbers.iterator();
	  while(nums.hasNext()) {
		 Integer numbers1=nums.next();
		 
	  }
	  System.out.println(nums);
	  
	  
	  for(Integer nums1:numbers) {
		  if(nums1%2==0) {
			  numbers.remove(nums1);
		  }
	  }
	  
	  ListIterator<Integer>listIterator=numbers.listIterator();
	  while(listIterator.hasNext()) {
		  Integer listIterator1=listIterator.next();
		  if(listIterator1%2==0) {
			  listIterator.remove();
		  }
		  System.out.println(numbers);
	  }
	}
	
	
}
