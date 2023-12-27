package com.sortingLambda;

import java.util.TreeSet;

/*
 * In case of Set if you want sorting Order you have to use TreeSet is set implementation class.
 * Description: In this program we are doing how we can sort in DSC order by using Lambda Expression
 */
public class TreeSetLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(25);
		t.add(5);
		t.add(20);
		System.out.println(t);//[0, 5, 10, 15, 20, 25] By default TreeSet giver ASC order
		TreeSet<Integer> t1 = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);//Lambda Expression
		t1.add(10);
		t1.add(0);
		t1.add(15);
		t1.add(25);
		t1.add(5);
		t1.add(20);
		System.out.println(t1);//[25, 20, 15, 10, 5, 0]
		
	}

}
