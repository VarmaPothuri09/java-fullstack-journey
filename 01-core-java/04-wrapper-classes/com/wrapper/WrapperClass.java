package com.wrapper;

public class WrapperClass {
    public static void main(String[] args) {
		Integer integer = new Integer(20);
		Integer integer1 =Integer.valueOf(2);
		
		int a=20;
		
		//java
		Integer integer2=Integer.valueOf(a);
		int c=integer2.intValue();
		
		//Autoboxing and auto unboxing
		
		Integer f=c;
		int b=f;
		String num="20";
	  int num5=Integer.parseInt(num);
	  System.out.println(num5);
		System.out.println(Character.isDigit(2));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isWhitespace('$'));
		
	}
}
