package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
 * Description : In this program we are using Predicate to remove null values and Empty String from the Given List.
 */
public class Program5 {

	public static void main(String[] args) {
		String[] names = {"Sachin","",null,"Rushi","","Subramanyam",null};
		Predicate<String> p=s->s!=null && s.length()!=0;
		ArrayList<String> list = new ArrayList<String>();
		for(String s: names) {
			if(p.test(s)) {
				list.add(s);
			}
		}
		System.out.println("This list of valid names : ");
		System.out.println(list);
		
		
	}

}
