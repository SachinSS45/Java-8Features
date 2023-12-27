package com.anonymousInnerclassLambdaexpression;
/*
 * Description : In this program we are using feature of 1.8 version i.e Lambda Expression on program1
 * wherever is Anonymous class there is a chance of using Lambda Expression
 * 				 
 */
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()->{  //Lambda Expression
			for(int i=0;i<10;i++) {
				System.out.println("In child Thread");
			}
		};
		Thread t = new Thread(r);
		/*
		  OR : Thread t = new Thread(()->{  //Lambda Expression
			for(int i=0;i<10;i++) {
				System.out.println("In child Thread");
			});
		 */
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}
	}

}
