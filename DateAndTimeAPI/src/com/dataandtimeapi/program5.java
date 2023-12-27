package com.dataandtimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * Date and Time API Introduction ZoneId,ZonedDateTime
 */
public class program5 {

	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);//Asia/Calcutta
		
		ZoneId lossAngelis=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(lossAngelis);
		System.out.println(zt);
	}
	

}
