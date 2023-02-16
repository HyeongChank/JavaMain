package com.ruby.java.ch07.inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();

		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");

		p.setName("김형찬");
		p.setAge(31);
		p.setSubject("개발자");

		s.setName("김형찬");
		s.setAge(21);
		s.setMajor("학생");

		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}