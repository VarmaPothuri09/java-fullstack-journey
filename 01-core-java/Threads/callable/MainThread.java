package com.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainThread {
 public static void main(String[] args) throws InterruptedException, ExecutionException {
	 Calculator cal=new Calculator();
	    ExecutorService exe= Executors.newFixedThreadPool(2);
	    exe.execute(cal);
	    
	    Calculator2 calc=new Calculator2();
	   Future<Integer> future= exe.submit(calc);
	   Integer val=future.get();
	   System.out.println(future.isDone());
	   System.out.println(val/10);
	   System.out.println(val+5);
	   
	   

	   
}
	
}