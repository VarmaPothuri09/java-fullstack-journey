package com.callable;

public class Calculator implements Runnable{
    @Override
    public void run() {
    	int a=20;
    	int b=10;
    	int c=a+b;
    	System.out.println(c);
    
    	
    }
}
