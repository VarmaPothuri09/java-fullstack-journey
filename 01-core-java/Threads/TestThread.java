package com;

public class TestThread {
public static void main(String[] args) {
	
	 MyThreads1 myThread1=new MyThreads1();
	 TestThread t=new TestThread();
	 MyThreads2 myThread2=new MyThreads2();
	 myThread2.start();
	 Runnable myThread3=new MyThread3();
	 Thread t3=new Thread(myThread3);
		t3.start();
	 myThread1.start();
	 t.print();
	
}
	void print() {
		for(int i=0;i<=10;i++) {
			 System.out.println("byee");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
		
}

