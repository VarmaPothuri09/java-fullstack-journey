package com.clone;

public class User implements Cloneable {

private int id;
private String name;

private Address address;
public User(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public User() {
	
}
public User(User user2) {
	this.id=user2.id;
	this.name=user2.name;
	this.address=new Address();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}



public User(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
}

public void setName(String name) {
	this.name = name;
}
@Override
	public User clone() throws CloneNotSupportedException {
		
		return new User(this);
	}
}
