package com;

import java.util.ArrayList;

public class ArrayListprog {
	public static void main(String[] args) {
		
	
   ArrayList li=new ArrayList();
   li.add(1);
   li.add("pooja");
   li.add(31.12);
   li.add(23);
   li.add(true);
   System.out.println(li);
   li.remove(0);
  System.out.println(li);
  li.indexOf("pooja");
  System.out.println(li.indexOf("pooja"));
   System.out.println(li.get(2));
   li.set(1, "srivani");
   li.add(2,"poojaaa");
   
   System.out.println(li.size());
   ArrayList li2=new ArrayList();
   li2.add(li);
   System.out.println(li2);
   li2.clear();
   System.out.println(li2);
   System.out.println(li2.isEmpty());
   li2.add("pooja");
   li2.add(23);
   System.out.println(li);
   System.out.println(li2);
   System.out.println(li.contains(li2));
}
}