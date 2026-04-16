package com.comparator_comparable;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product products1, Product products2) {
		
		return products1.getPrice()-products2.getPrice();
	}

}
