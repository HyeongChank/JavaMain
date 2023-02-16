package com.ruby.java.ch07.inheritance;

public class Employee extends Person{
		private String name;
		private int age;
		private String dept;
		
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		
//		public Employee() {
//			super();   자동으로 생성됨
//			System.out.println("Employee 클래스 생성");
//	}
//		public int getAge() {
//			return age;
//		}
//		public void setAge(int age) {
//			this.age = age;
//		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
//		public String toString() {
//			return   super.toString() + "," + this.dept	;
//			
//		}
		
		
//		super 는 상속받은거를 쓴다
}
