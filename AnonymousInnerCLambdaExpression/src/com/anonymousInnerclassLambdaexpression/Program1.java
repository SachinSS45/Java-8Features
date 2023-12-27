package com.anonymousInnerclassLambdaexpression;
/*
 * Description : In this program I am doing simple program of how to create anonymous inner class 
 * 				 of Runnable interface.
 */
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * We are writing a class that implement Runnable interface for that Runnable implemented class we are creating 
		 * object i.e new Runnable() it's not object of Runnable it is object it's implementation Class with a reference of Runnable 'r'
		 *  What is the name of class?No name. Such type of classes are Anonymous Inner Class
		 */
		Runnable r = new Runnable(){
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
				}	
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}
	}

}
