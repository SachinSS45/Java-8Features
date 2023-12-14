package com.lambdaexpression;

interface Interf{
	
	public void add(int a,int b);
}

class Demo implements Interf{

	
	public void add(int a, int b) {
		System.out.println("The sum : "+ (a+b));
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		Interf i = new Demo();
		i.add(10,20);
		i.add(100, 200);
	}

}
