package com.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsProgramm {
	public static void main(String[] args) {
		
		T1 t1=new T1();
		T2 t2=new T2();
		
		ExecutorService executorService= Executors.newSingleThreadExecutor();
		executorService.execute(t1); 
		executorService.execute(t2);
	
		executorService.shutdown();
		
	
	}

}
