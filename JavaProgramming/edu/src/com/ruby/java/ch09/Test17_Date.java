package com.ruby.java.ch09;

import java.util.Calendar;
import java.util.Date;

public class Test17_Date {

	public static void main(String[] args) throws InterruptedException {
		Date d = new Date();
		System.out.println(d);
		
//		Calendar c = Calendar.getInstance();
//		
//		System.out.println(c.get(Calendar.YEAR));
//		System.out.println(c.get(Calendar.MONTH)+1);
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));
//		System.out.println(c.get(Calendar.HOUR));
//		System.out.println(c.get(Calendar.MINUTE));
//		
//		int year = c.get(Calendar.YEAR);
//		int month = c.get(Calendar.MONTH+1);
//		int day = c.get(Calendar.DAY_OF_MONTH);
//		int hour = c.get(Calendar.HOUR);
//		int minute = c.get(Calendar.MINUTE);
		
			
		for(int i=0; i<10 ; i++) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH+1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year + "년" + month + "월" + day +"일" + hour+"시" + minute + "분" + second +"초");
		
		Thread.sleep(3000);
		}
		
		
		
		
	}
}
