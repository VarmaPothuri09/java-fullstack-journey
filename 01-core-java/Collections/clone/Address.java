package com.clone;

public class Address {
  private String pincode;
  private String city;
  
  public Address() {
	  
  }
  
  public Address(String pincode,String city) {
	  super();
	  this.pincode=pincode;
	  this.city=city;
  }
  
  public Address(Address address2) {
	  this.pincode=address2.pincode;
	  this.city=address2.city;
	 
  }
  
  public String getAddress() {
	  return pincode;
  }
  
  public String getCity() {
	  return city;
  }
  
  void setPincode(String pincode) {
	  this.pincode=pincode;
  }
  void setCity(String city) {
	  this.city=city;
  }

  @Override
  public String toString() {
	return "Address [pincode=" + pincode + ", city=" + city + "]";
  }
  
  @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
