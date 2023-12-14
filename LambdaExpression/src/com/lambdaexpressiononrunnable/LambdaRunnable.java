package com.lambdaexpressiononrunnable;

public class LambdaRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = ()-> {
			for(int i=0;i<10;i++) {
				System.out.println("In child Thread ");
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("In main thread");
		}
	}

}
