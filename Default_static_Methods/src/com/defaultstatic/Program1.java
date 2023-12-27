package com.defaultstatic;
/*
 * Till 1.7 version In interface all methods are type only public abstract
 * But from 1.8 version we can define concrete methods in Interface by using default and static methods
 * 
 * Description : In this program we are doing how we can define concrete methods
 * in Interface and how we can call that.
 * step 1: We can define method in Interface by using default 
 * 		   It directly comes in it's child class 
 * 		   If you want to override you can override this method.
 * 
 */
interface Interf1{
	
	default void m1() {
		System.out.println("Default Method");
	}
}
class Test implements Interf1{
	
}
class Test1 implements Interf1{
	public void m1() {
		System.out.println("My own implementation");
	}
}
public class Program1 {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1();//Default Method
		Test1 t1 = new Test1();
		t1.m1();//My own implementation
		
	}
}
// O/p : Default Method
