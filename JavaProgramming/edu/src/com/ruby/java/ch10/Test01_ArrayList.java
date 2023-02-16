package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Random;

public class Test01_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울"); list.add("북경"); list.add("상해");
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");
		list.add("런던"); list.add("도쿄"); list.add("뉴욕");
		list.add("울"); list.add("도쿄"); list.add("뉴욕");
		
		
		for(int i =0 ; i<list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println("1 :" + list.toString());		
		
		
		
		
//		int num1 =0, num2=0, num3=0;
//		Random rd = new Random();
//		num1 = rd.nextInt(5);
//		num2 = rd.nextInt(5);
//		num3 = rd.nextInt(5);
//		ArrayList list2 = new ArrayList();
//		list2.add("서울"); list2.add(num1); list2.add(num2);
//		list2.add("서울"); list2.add("도쿄"); list2.add(num3);
//		
//		for(int i =0 ; i<list2.size(); i++) {
//			System.out.println(list2.get(i));
//		}
		

	}

}
