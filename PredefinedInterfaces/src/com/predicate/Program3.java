package com.predicate;

import java.util.function.Predicate;

/*
 * Predicate Joining : Ex: I have one predicate check whether the number is greater than 10 or not 
 * 						   and Second Predicate is Is number is Even or not?
 * 					for both combination : p1.and(p2);
 *                  for atleast one conditin should satisfy : p1.or(p2)
 * 				But Requirement is I want to check negation of that i.e number is not greater than or not
 * 						  p1.negate();
 * 				we can combine multiple predicates and join
 *              This methods are default methods in Predicate
 */
public class Program3 {
	public static void m1(Predicate<Integer> p,int[] arr) {
		for(int ele:arr) {
			if(p.test(ele)) {
				System.out.print(ele + " ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
			//Creation of array 
			int[] arr = {0,5,10,15,20,25,30};
			
			//Defined Two Predicates p1 and p2
			Predicate<Integer> p1 = i->i>10;
			Predicate<Integer> p2 = i->i%2==0;
			
			System.out.println("The numbers greater than 10 Are : ");
			m1(p1, arr);
			
			System.out.println("The even numbers are : ");
			m1(p2, arr);
			
			System.out.println("The numbers not greater than 10");
			m1(p1.negate(), arr);
			
			System.out.println("The numbers gereater than 10 and even are : ");
			m1(p1.and(p2),arr);
			
			System.out.println("The numbers gereater than 10 or even are :");
			m1(p1.or(p2),arr);
	}

}
