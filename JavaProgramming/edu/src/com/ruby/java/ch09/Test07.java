package com.ruby.java.ch09;

public class Test07 {

	public static void main(String[] args) {
		String s = "한국,일본, 중국, 미국, 독일, 프랑스";
		String r = "=".repeat(20);
		String[] list = s.split(",");
		String[] list2 = s.split(",", 2);
		
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println(r);
		for(String item : list2) {
			System.out.println(item);
		}
		System.out.println(r);
		
		String email = "khc2888@naver.com";
		int i = email.indexOf("@");
		String id = email.substring(0, i);
		String company = email.substring(i +1);
		System.out.println(id);
		System.out.println(company);

		String s1 = String.valueOf(s);
		System.out.println(s1);
	}

}
