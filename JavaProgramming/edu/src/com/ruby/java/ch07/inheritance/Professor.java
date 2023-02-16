package com.ruby.java.ch07.inheritance;

public class Professor extends Person {
	private String subject;
	private int age;
	private String name;
	
	public Professor() {
	System.out.println("Professor 클래스 생성");
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