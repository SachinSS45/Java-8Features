package com.predicate;

import java.util.function.Predicate;

/*
 *  interface Predicate<T>{
 *  	public boolean test(T t);
 *  	and(){}; or(){}; negate(){}; ===>> default methods
 *  	**public static Predicate isEquals(T t){};//static methods ===> for checking the equality\
 *  }
 *  
 *  Is "Sachin" isEqual to the Predicate represented data or not.===Yes
 * 
 */
public class Program8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p = Predicate.isEqual("Sachin");
		System.out.println(p.test("Sachin"));//true
		System.out.println(p.test("Omkar"));//false
	}

}
