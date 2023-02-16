package com.ruby.java.ch07.inheritance;

public class Person {
	
	private String name;
	private int age;
	
	
//	private final String ssn_ID = "123";

//	public void setSsn_ID(String ssn_ID) {
//		this.ssn_ID = ssn_ID;
//	}
	
	
	
	
	
	
	
	
	
	public Person() {
		System.out.println("person 클래스 생성");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("person 클래스 생성");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}
}