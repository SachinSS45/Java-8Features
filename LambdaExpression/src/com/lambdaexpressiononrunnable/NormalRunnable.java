package com.lambdaexpressiononrunnable;

class MyRunnable implements Runnable{
		
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("In child thread");
		}
	}	
}
public class NormalRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("In main thread");
		}
	}

}
