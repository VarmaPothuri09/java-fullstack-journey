package com.comparator_comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return o2.getProductId()- o1.getProductId();
	}
      
}
