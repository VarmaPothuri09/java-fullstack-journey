package com;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			System.out.println("enter age");
			int age=sc.nextInt();
			if(age>18) {
				System.out.println("eligible to vote");
			}else {
				throw new InvalidAgeException("Not eligible");
			}
		}catch(Exception e){
				System.out.println(e);
			}finally {
				sc.close();
		}
	
}
}