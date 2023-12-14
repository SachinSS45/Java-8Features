package com.collectionoverview;

import java.util.HashSet;
/* Duplicate objects not allowed and order doesn't matter
 * 
 */
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h = new HashSet<String>();
		h.add("Sachin");
		h.add("Rushi");
		h.add("Subramanyam");
		h.add("Omkar");
		h.add("Rushi");
		System.out.println(h);//[Omkar, Rushi, Subramanyam, Sachin]

	}

}
