package com.sortingLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 * Default Natural Sorting for number is Ascending : Smaller to largest
 * 						   for String : Alphabetical Order
 * for DSC(If you want your own sorting order) you have to pass object of Comparator (for customize sorting)
 * Description : In this code we firstly created ArrayList and Sorted by using Collections.sort() method by default
 * 				 it will give Ascending order. 
 * 				 But We also want our own sorting order that's why we implemented our own logic by implementing Compertor 
 * 				 interface we override compare method and detail logic in that for sorting in Descending order
 * 				 if I1>I2 (first number is greater than second) then don't do nothing
 * 				 if I1<I2 (then shift I1 to I2 and I2 to I1)
 * 				 if I1==I2 (then don't do shifting)
 */
class MyComparator implements Comparator<Integer>{

	@Override //Overriding compare method of Comparator interface
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1>o2) {
			return -1;
		}else if(o1 < o2){
			return +1;
		}
		return 0;
		
		//return (I1>I2)?-1:(I1<I2)?+1:0; // Ternary Operator
	}
	
	
}
public class SortingWithoutLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created a ArrayList
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		
		System.out.println("Before Sorting: "+ l);//Before Sorting: [10, 0, 15, 5, 20]
		//Sorting in ASC order
		Collections.sort(l);
		//Printing the sorted order
		System.out.println("After Sorting: "+ l);//After Sorting : [0, 5, 10, 15, 20]
		//Sorting by using comparator interface my own sorting order
		Collections.sort(l,new MyComparator());
		System.out.println("After Sorting: "+ l);//After Sorting: [20, 15, 10, 5, 0]

	}

}
