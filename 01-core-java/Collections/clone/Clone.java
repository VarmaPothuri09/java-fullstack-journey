package com.clone;

public class Clone {
   
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address=new Address("311203","Vizag");
	   User user=new User(1, "varma", address);
	   
	   System.out.println(user);
	   
	   User clonedUser=(User) user.clone();
	   System.out.println(clonedUser);
	   
	   user.setId(2);
	   System.out.println(user);
	   System.out.println(clonedUser );
	   
	   user.getAddress().setCity("Banglore");
	   
	 
	   user.getAddress().setCity("hyd");
	   System.out.println(user);
	   System.out.println(clonedUser);
	}
}
