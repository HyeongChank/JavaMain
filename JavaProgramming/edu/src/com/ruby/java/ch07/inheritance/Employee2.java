package com.ruby.java.ch07.inheritance;

public class Employee2 extends Person{
//		private String name;
//		private int age;
		private String dept;
		
		public Employee2(String name, int age, String dept) {
//			super(name, age);
			super.setName(name);
			super.setAge(age);
			this.dept = dept;
			
			System.out.println("Employee(name, age, dept) 생성자 실행");
		}
		
		public String toString() {
			return super.toString() + this.dept;
		}

		

		
		
//		super 는 상속받은거를 쓴다
}
