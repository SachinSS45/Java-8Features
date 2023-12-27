package com.dataandtimeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

/*
 * Date and Time API Introduction Period & Year
 */
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate birthday = LocalDate.of(2001, 10,12 );
		LocalDate today    = LocalDate.now();
		
		Period p = Period.between(birthday, today);
		System.out.printf("Your age is %d years %d months and %d Days",p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathDay = LocalDate.of(2001+60, 10, 12);
		Period p1 = Period.between(today, deathDay);
		int daysRemaining = p1.getYears()*365 + p1.getMonths()*30 + p1.getDays();
		
		System.out.printf("\nYou will be on the Earth only %d Days...Hurry up to do imp things\n",daysRemaining);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year number : ");
		int n = sc.nextInt();
		Year y = Year.of(n);
		if(y.isLeap()) {
			System.out.printf("%d Year is Leap Year\n",n);
		}else {
			System.out.printf("%d Year is not Leap year",n);
		}
	}

}
