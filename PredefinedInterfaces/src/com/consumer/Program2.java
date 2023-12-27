package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
	
	String name;
	String hero;
	String heroine;
	
	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
	
}
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> list = new ArrayList<Movie>();
		populate(list);
		//this is responsible for printing the movie information to the consol
		Consumer<Movie> c = m->{
			System.out.println("Movie name : "+m.name);
			System.out.println("Movie Hero : "+m.hero);
			System.out.println("Movie Heroine : "+m.heroine);
			System.out.println();
			
		};
		//Consumer will accept the movie object 
		for(Movie m:list) {
			c.accept(m);
		}
	}

	private static void populate(ArrayList<Movie> list) {
		// TODO Auto-generated method stub
		list.add(new Movie("Bahubali","Prabhas","Anushka"));
		list.add(new Movie("Rayees","Sharukh","Sunny"));
		list.add(new Movie("Dangal","Ameer","Ritu"));
		list.add(new Movie("Sultan","Salman","Anushka"));		
	}

}
