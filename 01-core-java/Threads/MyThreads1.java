package com;

public class MyThreads1 extends Thread{
	
	
	public void run() {
		Thread.currentThread().setName("My Thread 1");
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=10;i++) {
		System.out.println("hii...");
	}
	}

}
