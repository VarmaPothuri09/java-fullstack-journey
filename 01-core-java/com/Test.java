package com;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try{
		System.out.println("Enter number 1");
	
	 int num1=sc.nextInt();
	System.out.println("Enter number2");
	int num2=sc.nextInt();
	System.out.println("hii");
	int res=num1/num2;
	System.out.println("hello");
	System.out.println("Divible of num1 and num2 "+ res);
	}
	catch(InputMismatchException | ArithmeticException e) {
	e.printStackTrace();
	}

	
	catch(Exception e) {
		System.out.println(e);
			}
	finally {
		System.out.println("pooja");
	}
	
}
}
