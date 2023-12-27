package com.predicate;

import java.util.function.Predicate;

/*
 * Description : Program to display names starts with 's' by using Predicate:
 */
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"Sachin","Omkar","Rushi","Subodh","Subramanyam"};
		Predicate<String> startsWithS = (str)->str.startsWith("S");
		
		for(String s:name) {
			if(startsWithS.test(s)) {
				System.out.println(s);
			}
		}
	}

}
