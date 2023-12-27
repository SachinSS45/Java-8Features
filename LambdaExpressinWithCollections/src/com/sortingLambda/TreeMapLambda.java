package com.sortingLambda;

import java.util.TreeMap;

/*
 * In case of Map if you want sorting Order of Key you have to use TreeMap is Map implementation class.
 * By default we get according to order of keys in TreeMap in ASC order.
 * For Customize sorting order we have to use Lambda Expression
 *	
 */
public class TreeMapLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> t = new TreeMap<>();
		t.put(100,"Sachin");
		t.put(600,"Rushi");
		t.put(300,"Omkar");
		t.put(200,"Subramanyam");
		t.put(700,"Arun");
		t.put(400,"Basu");
		System.out.println(t);//{100=Sachin, 200=Subramanyam, 300=Omkar, 400=Basu, 600=Rushi, 700=Arun}
		TreeMap<Integer,String> t1 = new TreeMap<>((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);//Lambda Expression instead of implementing Comparator interface
		t1.put(100,"Sachin");
		t1.put(600,"Rushi");
		t1.put(300,"Omkar");
		t1.put(200,"Subramanyam");
		t1.put(700,"Arun");
		t1.put(400,"Basu");
		System.out.println(t1);//{700=Arun, 600=Rushi, 400=Basu, 300=Omkar, 200=Subramanyam, 100=Sachin}
		
	}

}
