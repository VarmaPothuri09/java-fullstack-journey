package com;

public class Test {
   public static void main(String[] args) {

	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	Counter counterObj=new Counter();
	
	Thread1 t1=new Thread1(counterObj);
	t1.start();
	Thread2 t2=new Thread2(counterObj);
	t2.start();
	
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(counterObj.count);
	
	
	
   }
}
   class Thread1 extends Thread{
	   
	   Counter counter;
	   Thread1(Counter c){
		   this.counter=c;
	   }
		    public void run() {  
		   for(int i=1;i<=50;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Thread1"+ i);
			}
			 
			   
		   }
		   counter.increment();
		  
		 
	   }
   }
		    class Thread2 extends Thread{
		    	 Counter counter;
		  	   Thread2(Counter c){
		  		   this.counter=c;
		  	   }
		    	public void run() {
		    	
		    		for(int i=1;i<=50;i++) {
		    			try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println("Thread2 "+i);
						}
		    			
		    		}
		    			    	}
		    	
		    }
   


