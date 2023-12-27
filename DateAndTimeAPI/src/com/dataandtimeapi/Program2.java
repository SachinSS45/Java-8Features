package com.dataandtimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

/*
 * Description : In this code we are finding the date , month and year separately & Hour , Minute and Second separately
 * by using Date and Time API for that we have to import time package .
 */


public class Program2 {
	
	public static void main(String[] args) {
		
		//.now() method will return the current date month and year at a time
		LocalDate date = LocalDate.now();
		System.out.println(date);
		//It will give Day of Month
		int dd = date.getDayOfMonth();
		//It will give Month of current year
		int mm = date.getMonthValue();
		//It will give the current Year
		int yyyy = date.getYear();
		
		System.out.println(dd+"-"+mm+"-"+yyyy);//18-12-2023
		
		LocalTime time = LocalTime.now();
		int hours = time.getHour();
		int minute= time.getMinute();
		int sec   = time.getSecond();
		int nanosec = time.getSecond();
		
		System.out.printf("%d:%d:%d:%d",hours,minute,sec,nanosec);//18:24:14:14
	}
}
