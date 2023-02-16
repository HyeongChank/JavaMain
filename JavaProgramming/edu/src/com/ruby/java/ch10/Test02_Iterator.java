package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02_Iterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		
//		for(int i =0 ; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		String e = "=";
		System.out.println(e.repeat(30));
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
