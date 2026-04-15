package com;

public class MyThreads2 extends Thread{
      
	public void run() {
		Thread.currentThread().setName("My Thread 2");
	System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=10;i++) {
		System.out.println("hello");
	}
}
}
