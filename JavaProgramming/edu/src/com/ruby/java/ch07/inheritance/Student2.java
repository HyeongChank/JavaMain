package com.ruby.java.ch07.inheritance;

public class Student2 extends Person {
//	private String name;
//	private int age;
	private String major;

	public Student2(String name, int age, String major) {
		super.setName(name);
		super.setAge(age);
		this.major = major;
		System.out.println("Student(name, age, major) 생성자 실행");
	}


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
		return super.toString() + "," + major;
	}
}