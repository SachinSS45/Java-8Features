package com.consumer;

import java.util.function.Consumer;

/*
 * When you want to only consume the value(Perform required operation/Accept value) and returning nothing then use consumer interface
 * It has one abstract method i.e accept(T t) method no return things .
 */

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = s->System.out.println(s);
		c.accept("Sachin");
		c.accept("Shetkar");
		
	}

}
