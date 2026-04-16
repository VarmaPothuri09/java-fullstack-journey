package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Lists {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(3);
	list.add(5);
	list.add(9);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
    Iterator<Integer> iterator= list.iterator();
    while(iterator.hasNext()) {
    	Integer num=iterator.next();
    	System.out.println(iterator);
    }
        ListIterator<Integer> iterator1=  list.listIterator();
        while(iterator1.hasNext()) {
        	Integer num=iterator1.next();
        	System.out.print(iterator1);
        	System.out.println(iterator1.hasPrevious());
        }
}
}
