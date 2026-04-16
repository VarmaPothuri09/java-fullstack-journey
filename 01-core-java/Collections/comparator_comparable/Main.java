package com.comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
public static void main(String[] args) {
	Product product1=new Product(4,"Laptop",31000);
	Product product2=new Product(3,"Mobile",29000);
	Product product3=new Product(1,"Watch",16000);
	Product product4=new Product(2,"Shirt",1000);
	
	List<Product> products =new ArrayList<Product>();
	products.add(product1);
	products.add(product2);
	products.add(product3);
	products.add(product4);
	
	Collections.sort(products,new IdComparator());
	System.out.println(products);
	   
	for(Product p:products) {
		System.out.println(p);
	}
	
	System.out.println(".................");
	
	
	Collections.sort(products,new IdComparator());
	System.out.println(products);
	for(Product p:products) {
		System.out.println(p);
	}
	
System.out.println(".................");
	
	
	Collections.sort(products,new NameComparator());
	System.out.println(products);
	for(Product p:products) {
		System.out.println(p);
	}
}
}
