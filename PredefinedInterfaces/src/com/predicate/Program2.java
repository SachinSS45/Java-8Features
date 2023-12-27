package com.predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
/*
 * 
 * Description :1) In this program We are writing a predicate to check whether the String length Greater than 5 or not.
 * 				2) Writing a Predicate for checking collection is Empty or not.
 */
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p = (str)-> str.length() > 5;
		System.out.println(p.test("Sachin"));//true
		System.out.println(p.test("Rushi"));//false
		
		Predicate<Collection> p1 = c->c.isEmpty();
		ArrayList list = new ArrayList();
		list.add("Sachin");
		System.out.println(p1.test(list));//false
		list.add("Rushi");
		System.out.println(p1.test(list));//false
		
		
	}
}
