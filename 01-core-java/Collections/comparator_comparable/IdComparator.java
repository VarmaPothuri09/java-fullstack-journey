package com.comparator_comparable;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {

	@Override
	public int compare(Product products1, Product products2) {
		
		return products2.getProductId()-products1.getProductId();
	}

}
