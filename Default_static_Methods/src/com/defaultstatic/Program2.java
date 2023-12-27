package com.defaultstatic;
/*
 * In the case of default methods there may be chance of ambiguity
 * if two interfaces contain same signature default method then it will give
 * error if another class implementing both interface 
 * Description : In this program we are handling how we can overcome 
 * ambiguity in two same signature methods.
 * - In the child override this methods according to your need.
 * 
 * 
 */
interface Left{
	
	default void m1() {
		System.out.println("Left Default Method");
	}
}
interface Right{
	
	default void m1() {
		System.out.println("Right Dafault Method");
	}
}
class Test2 implements Left,Right{
	public void m1() {
		//System.out.println("My own implementation");
		Left.super.m1();
	}
}
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		t.m1();
	}
	

}
