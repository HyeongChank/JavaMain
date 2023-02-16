package com.ruby.java.ch07.inheritance;

public class Professor2 extends Person {
	private String subject;
//	private int age;
//	private String name;

	
	public Professor2() {
	System.out.println("Professor 클래스 생성");
	}
	
	public Professor2(String name, int age, String subject) {
		super.setName(name);
		super.setAge(age);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 생성자 실행");	
	}

	
	

//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}



	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String toString() {
		return super.toString() + "," + subject;
				
	}
}