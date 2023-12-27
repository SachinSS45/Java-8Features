package com.dataandtimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

/*
 * 
 * 1)Till 1.7 version we don't have data and time api that version we were using 
 * classes like Date,Calendar ,TimeStamp ..it's not up to the mark
 * 2)So in 1.8 version new feature introduced that's Date and Time API
 * Description : In this code we are finding the how to know the current Time and Date
 * in the System by using Date and Time API
 */
public class Program1 {
	
	public static void main(String[] args) {
		//It will show the how to find the current date
		LocalDate date = LocalDate.now();
		System.out.println(date);//for ex:2023-12-18 
		
		//It will show the how to find the current Time
		LocalTime time = LocalTime.now();
		System.out.println(time);//for ex : 19:32:33.495838800
		
		
	}
}
