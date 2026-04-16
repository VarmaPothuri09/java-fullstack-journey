package com.comparator_comparable;

public class Product implements Comparable<Product> {
   private int productId;
   private String name;
   private int price;
	public int getProductId() {
	return productId;
}

   public void setProductId(int productId) {
	this.productId = productId;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public int getPrice() {
	return price;
   }

   public void setPrice(int price) {
	this.price = price;
   }

	public Product(int productId, String name, int price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + "]";
	}

	public Product() {
		
	}

	@Override
	public int compareTo(Product product) {
		
		return this.price-product.price;
	}
	
}
