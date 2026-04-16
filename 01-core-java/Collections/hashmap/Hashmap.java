package com.hashmap;
import java.util.HashMap;

public class Hashmap{
     public static void main(String[] args) {
		String[] arr= {"pooja","vani","srivani","pooja"};
HashMap<String , Integer> pooja=new HashMap<>();

      for(int i=0;i<arr.length;i++) {
    	    String n=arr[i];
    	 
    	  if(pooja.containsKey(n)) {
    		  int previous=pooja.get(n);
    		  pooja.put(n, previous+100);
    	  }else {
    		  pooja.put(n, 100);
    	  }
    	 
      }
      System.out.println(pooja);
      for(String names:pooja.keySet()) {
    	  System.out.println(names+" -> "+pooja.get(names));
      }
     }
}
