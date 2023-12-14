package com.lambdaexpression;

interface Interf1{
	
	public void add(int a,int b);
}
public class Test1Lambda {

	public static void main(String[] args) {
		Interf1 i = (a,b)-> System.out.println(a+b);
		i.add(10, 20);//30
		i.add(100, 200);//300
	}

}
