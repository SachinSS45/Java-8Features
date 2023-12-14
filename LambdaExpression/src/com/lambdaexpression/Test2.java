package com.lambdaexpression;

interface Interf2{
	public int getLength(String s);
}

class Demo1 implements Interf2{
	public int getLength(String s) {
		return s.length();
	}
}
public class Test2 {

	public static void main(String[] args) {
		Interf2 i = new Demo1();
		System.out.println(i.getLength("Sachin"));//6
		System.out.println(i.getLength("Subramanayam"));//12
	}

}
