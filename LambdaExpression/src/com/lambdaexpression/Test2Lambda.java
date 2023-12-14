package com.lambdaexpression;

interface Interf3{
	public int getLength(String s);
}
public class Test2Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf3 i = s -> s.length();
		System.out.println(i.getLength("Sachin"));//6
		System.out.println(i.getLength("Subramanayam"));//12
	}

}
