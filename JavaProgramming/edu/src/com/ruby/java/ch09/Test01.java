package com.ruby.java.ch09;

public class Test01 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		Class c = obj1.getClass();
		System.out.println(c.getName());

		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		MyObject obj4 = new MyObject(123);
//		System.out.println(obj4);
		MyObject obj5 = new MyObject(123);
		if(obj4.equals(obj5)) {
			System.out.println("동일 객체이다");
		}
		else {
			System.out.println("다른 객체이다");
		}
		if(obj4 == obj5) {
			System.out.println("동일객체이다");
			
		}
		else {
			System.out.println("다른 객체이다");
		}
	}

}
