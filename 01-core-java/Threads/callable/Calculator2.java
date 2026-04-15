package com.callable;

import java.util.concurrent.Callable;

public class Calculator2 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int a=20;
		int b=30;
		
		int c=a+b;
		return c;
		
	}

}
