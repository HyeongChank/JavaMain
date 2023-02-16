package com.ruby.java.ch07.inheritance;

public class LMSTest2 {
	public static void main(String[] args) {
		Employee2 e = new Employee2("오정임", 57, "입학처");
		Professor2 p = new Professor2("오정임", 57, "빅데이터");
		Student2 s = new Student2("김형찬", 57, "컼퓨터 과학");

//		e.setName("오정임");
//		e.setAge(47);
//		e.setDept("입학처");
//
//		p.setName("김형찬");
//		p.setAge(31);
//		p.setSubject("개발자");
//
//		s.setName("김형찬");
//		s.setAge(21);
//		s.setMajor("학생");

		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}