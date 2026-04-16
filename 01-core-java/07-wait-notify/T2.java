package com.wait;

public class T2 extends Thread{
	
	
	Object obj;
	T2(Object obj){
	this.obj=obj;
	}
   @Override
   
   
public void run() {
	   synchronized (obj) {
		   System.out.println("T2 thread started.....");
			System.out.println("T2 is notifying t1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
			}
	
		
}
} 
