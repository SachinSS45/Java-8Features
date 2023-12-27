package com.sortingLambda;

import java.util.ArrayList;
import java.util.Collections;
/*
 * Till java 1.7 version when we have to do customize sort when have to implement Comparator interface and override compare()
 * method and we have to write logic but in 1.8 version we can do this easily by using lambda expression because Comparator is a
 * functional interface so we can use lambda expression directly.
 */
public class ArrayListSortingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
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
		
		//Printing by DSC order 
		Collections.sort(l, (I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);//By using lambda expression
		System.out.println("After Sorting: "+ l);//After Sorting: [20, 15, 10, 5, 0]
	}

}
