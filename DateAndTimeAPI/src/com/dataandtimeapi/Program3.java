package com.dataandtimeapi;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

/*
 * Description : In this program I want to find Date and Time at a time for that we have to use class "LocalDateTime"
 */
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);//2023-12-20T18:26:15.114133600
		
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();
		System.out.printf("%d-%d-%d",dd,mm,yy);//20-12-2023
		
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int n = dt.getNano();
		System.out.printf("\n%d:%d:%d:%d\n", h,m,s,n);//18:31:38:721178300
		//I want create local date and time of birthday
		// 10 OR Month.OCTOMBAR DayOfWeek.FRIDAY (yyyy,mm,dd,h,m,s,n)
		LocalDateTime dt1 = LocalDateTime.of(2001,10,12,12,10);
		System.out.println(dt1);//2001-10-12T12:10
		System.out.println("After 6 months : "+dt1.plusMonths(6));//After 6 months : 2002-04-12T12:10
		System.out.println("Before 6 months : "+dt1.minusMonths(6));//Before 6 months : 2001-04-12T12:10
		
	}

}
